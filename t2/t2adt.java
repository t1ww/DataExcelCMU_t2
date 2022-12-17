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
        Vector<Student> myStudents = new Vector<Student>();
        File f = new File("D:/Camt/araimairu/t2/student_list_65.csv");
        Scanner scan = new Scanner(f);
        //read csv line by line
            while(scan.hasNextLine()){
                String dataLine = scan.nextLine();
                StringTokenizer token = new StringTokenizer(dataLine, ",");
                int index = Integer.parseInt(token.nextToken());
                String SID = token.nextToken();
                String firstName = token.nextToken();
                String lastName = "";
                Student myStudent;
                double gpa = 1.1;
                if(token.hasMoreTokens()){
                    lastName = token.nextToken();
                    myStudent = new Student(index,SID,firstName,lastName,gpa);
                }else{
                    lastName = "";
                    myStudent = new Student(index,SID,firstName,gpa);
                }
                myStudents.add(myStudent);
            }

            //program end
            System.out.println("\n//////////////////////////////");
            System.out.println("/////////End of THE PROGRAM");
            System.out.println("//////////////////////////////");
    }
    //methods
    private Student linearSearch(Vector<Student> v, String sid){
        
    }
}
