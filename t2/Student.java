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
    private double gpa;

    //constructor
    public Student(){
        this.index = -1;
        this.SID = "";
        this.firstName = "";
        this.lastName = "";
        this.gpa = 0.;
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
    public Student(String SID, String firstName, double gpa){
        this.SID = SID;
        this.firstName = firstName;
        this.gpa = gpa;
    }
    public Student(int index, String SID, String firstName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
    }
    public Student(int index, String SID, String firstName, double gpa){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.gpa = gpa;
    }
    public Student(int index, String SID, String firstName, String lastName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(int index, String SID, String firstName, String lastName, double gpa){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = 0.;
    }
    //end overload
    //set/
    public void setIndex(int index){
        this.index = index;
    }
    public void setIndex(String SID){
        this.SID =SID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    //end set/

    //inherited
    public String toString(){
        return "[ " + this.index + " | " + this.SID + " | " + this.firstName + " " + this.lastName + " { GPA  | " + this.gpa + " } ]";
    }
}
