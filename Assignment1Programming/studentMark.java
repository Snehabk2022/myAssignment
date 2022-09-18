/* Online Java Compiler and Editor */
import java.util.Scanner;
import java.util.*;
public class studentMark
{   
    public static void main(String []args){
        double score2 = 15;
        String student2 = " ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Students");
        int numOfStudents= sc.nextInt();
        System.out.println("Enter StudentID");
        int studentid= sc.nextInt(); 
        System.out.println("Enter Student Name");
        String student1=sc.next();
        System.out.println("Enter your Unit Name");
        String unitname =sc.next();
        System.out.println("Enter Student Marks");
        double score1= sc.nextInt();
        for(int i=0; i<numOfStudents-1; i++){
            System.out.println("Enter StudentID");
            int id= sc.nextInt();
            System.out.print("Enter student name: ");
            String student = sc.next();
            System.out.println("Enter your Unit Name: ");
            String unit =sc.next();
            System.out.print("Enter student score:");
            double score = sc.nextDouble();
            if(score>score1){
               student1 = student;
               score1 = score;
            }
            if(score<score2){
                student2 = student;
                score2 = score;
            }
        }
        
        System.out.println ("StudentID: " + studentid);
        System.out.println (" Name: " + student1);
        System.out.println (" Unit Name : " + unitname);
        System.out.println (" Marks: " + score1);
        System.out.println((new StringBuilder("Highest student")).append("'s scores is ").append(score1).toString());
        System.out.println((new StringBuilder("Lowest student")).append("'s scores is ").append(score2).toString());
    }
}
