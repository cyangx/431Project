package pkg431;

import java.util.*;
import java.io.*;

/**
 *
 * @author Cha
 */
public class MemberList implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String FILE_PATH = "./SaveFiles/MemberList";
    private List<Member> members = new LinkedList<>();
    private static MemberList memberList;

    private MemberList() {

    }

    public static MemberList instance() {
        if (memberList == null) {
            MemberList.load(); //try loading
            if (memberList == null) {
                return (memberList = new MemberList());
            }
        }
        return memberList;
    }

    public boolean addMember(Member member) {
        members.add(member);
        MemberList.save();
        return true;
    }

    // returns the member if found
    public Member getMember(int ID) {
        for (Member member : members) {
            if (ID == member.getID()) {
                return member;
            }
        }
        return null;
    }

    public Iterator<Member> getMembers() {
        return this.members.iterator();
    }

    public boolean validate(int ID) {
        for (Member member : members) {
            if (ID == member.getID()) {
                return true;
            }
        }
        return false;
    }

    public void delete(int ID) {
        this.members.remove(this.getMember(ID));
        MemberList.save();
    }

    public void updateMember(int ID, String Name, String Address, String City, String State, String ZipCode) {
        Member member = this.getMember(ID);
        if (null != member) {
            member.update(Name, Address, City, State, ZipCode);
        }
        MemberList.save();
    }

    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(memberList);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (memberList != null) {
                return;
            } else {
                input.defaultReadObject();
                if (memberList == null) {
                    memberList = (MemberList) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in MemberList readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    /**
     * Save the systemData object structure to a file, for later deserialization
     *
     * @return True if the serialization completed successfully
     */
    private static boolean save() {
        try {
            // First off, create the stream used for writing bytes
            FileOutputStream file = new FileOutputStream(FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Then write the instance out to the file
            out.writeObject(memberList);
            out.close();

            // Can return true if this has happened
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();

            // An exception occuring means something was not successful
            return false;
        }
    }

    /**
     * Load (deserialize) the saved systemData and related objects from the
     * saved data file
     *
     * @return The instance that was created from loading, null if errored
     */
    private static MemberList load() {
        File f = new File(FILE_PATH);
        if (f.exists() && !f.isDirectory()) { /* do something */

            try {

                // Create a reference to the file to read in
                FileInputStream file = new FileInputStream(FILE_PATH);
                ObjectInputStream in = new ObjectInputStream(file);

                // DO IT!!!!
                in.readObject();
                in.close();

                // And return the instance to the memberList
                return memberList;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }

}
