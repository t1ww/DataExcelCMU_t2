package t2;
/*
 * @author Narongchai Rongthong
 * 652115013
 * written on 16/12/2022
 * https://github.com/t1ww
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class t2adt {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n//////////////new run////////////////\n");//buffer new run
        Vector<Student> myStudents = new Vector<Student>();
        File f = new File("E:/java2/t2/student_list_65.csv");
        Scanner scan = new Scanner(f);
        //with every lines in the csv, seperate tokens into different datas and put into student object
        //read csv line by line
            while(scan.hasNextLine()){
                String dataLine = scan.nextLine();
                StringTokenizer token = new StringTokenizer(dataLine, ",");
                int index = Integer.parseInt(token.nextToken());
                String SID = token.nextToken();
                String firstName = token.nextToken();
                String lastName = "";
                Student myStudent;
                //put tokens into temporary object
                if(token.hasMoreTokens()){ //if has last name
                    lastName = token.nextToken();
                    myStudent = new Student(index,SID,firstName,lastName);
                }else{// dont have last name
                    lastName = "";
                    myStudent = new Student(index,SID,firstName);
                }
                //add temp object into dynamic array
                myStudents.add(myStudent);
            }
            ///output
            System.out.println("Total Students = " + myStudents.size());
            //all students
            for(int i = 0; i < myStudents.size(); i++) {
                System.out.println(myStudents.get(i).toString());
            }
            
            //search
            System.out.println("\n//////////////////////////////");
            System.out.println("linear search\n");
            Student thisStudent = linearSearch(myStudents, "652115013");
            System.out.println("me = " + thisStudent.toString());
            //myStudents >> [STUDENT1, STUDENT2(object id)]
            //program end
            scan.close();//clean up
            System.out.println("\n//////////////////////////////");
            System.out.println("/////////End of THE PROGRAM");
            System.out.println("//////////////////////////////");
    }
    //methods
    private static Student linearSearch(Vector<Student> v, String sid){
        //v.get()<< get object's id check if equal to string and the return
        for(int i = 0; i < v.size(); i++) {
            if(sid.equals(v.get(i).getSID())){
                return v.get(i);
            }
        }
        return v.get(-1);
    }
}
