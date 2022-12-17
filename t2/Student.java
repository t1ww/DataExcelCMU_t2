package t2;
/*
 * @author Narongchai Rongthong
 * 652115013
 * written on 16/12/2022
 * https://github.com/t1ww
 */

public class Student {
    //initiailise variables zone
    private int index;
    private String SID;
    private String firstName;
    private String lastName;
    //constructor
    public Student(){
        this.index = -1;
        this.SID = "";
        this.firstName = "";
        this.lastName = "";
    }
    //overload
    public Student(String SID, String firstName){
        this.SID = SID;
        this.firstName = firstName;
    }
    public Student(String SID, String firstName, String lastName){
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(int index, String SID, String firstName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
    }
    public Student(int index, String SID, String firstName, String lastName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //end overload
    //set/
    public void setIndex(int index){
        this.index = index;
    }
    public void setSID(String SID){
        this.SID =SID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //end set/
    //get/
    public int getIndex(){
        return this.index;
    }
    public String getSID(){
        return this.SID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //end get/
    //toString template to show student's all available info
    public String toString(){
        return "[ " + this.index + " | " + this.SID + " | " + this.firstName + " " + this.lastName + " ]";
    }
}
