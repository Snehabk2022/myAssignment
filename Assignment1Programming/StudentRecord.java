
import java.util.Scanner;
public class StudentRecord
{
    static double numbers[]= new double [6],x,mean, dev,sum=0,sum2=0;
    public static void main(String []args){
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
        for(int i = 0; i< numbers.length; i++){
            x = sc.nextDouble();
            numbers[i] = x;
            sum += numbers[i];
        }
        mean = sum/ numbers.length;
        for(int i=0; i<numbers.length; i++){
            sum2 += Math.pow(numbers[i]-mean,2);
            dev = Math.sqrt(sum2/(numbers.length-1));
        }
        System.out.println ("StudentID: " + studentid);
        System.out.println (" Name: " + student1);
        System.out.println (" Unit Name : " + unitname);
        System.out.println("Mean = "+mean+"\nStandard deviation = "+dev);
    }
        
    
}

