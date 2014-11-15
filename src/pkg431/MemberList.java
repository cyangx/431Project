package pkg431;

import java.util.*;
import java.io.*;

/**
 *
 * @author Cha
 */
public class MemberList implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Member> members = new LinkedList<>();
    private static MemberList memberList;

    private MemberList() {
        
    }

    public static MemberList instance() {
        if (memberList == null) {
            return (memberList = new MemberList());
        } else {
            return memberList;
        }
    }

    public boolean addMember(Member member) {
        members.add(member);
        return true;
    }


    // returns the member if found
    public Member getMember(int ID) {
        for (Member member : members) {
            if(ID == member.getID()){
                return member;
            }
        }
        return null;
    }
    
    public Iterator<Member> getMembers() {
        return this.members.iterator();
    }

    public boolean validate(int ID){
        for (Member member : members) {
            if(ID == member.getID()){
                return true;
            }
        }
        return false;
    }
    
    public void delete(int ID)
    {
        this.members.remove(this.getMember(ID));
    }
    
    public void updateMember(int ID,String Name, String Address, String City, String State, String ZipCode)
    {
        Member member = this.getMember(ID);
        if(null != member)
        {
            member.update(Name, Address, City, State, ZipCode);
        }
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
   
}