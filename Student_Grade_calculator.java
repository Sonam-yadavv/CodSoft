import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println(" ");
        System.out.println("Enter the number of subjects");
        int no_of_sub=sc.nextInt();
        int total=0;
        for(int i=1;i<=no_of_sub;i++)
        {
            System.out.println("Enter marks of subject "+i+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double avg=(double)total/no_of_sub;
        char grade;

        if(avg>90)
        grade='A';
        else if(avg>80)
        grade='B';
        else if(avg>70)
        grade='C';
        else if(avg>60)
        grade='D';
        else if(avg>=50)
        grade='E';
        else
        grade='F';

        System.out.println(" ");
        System.out.println("Total marks obtained is :"+total);
        System.out.println("Average percentage gained is :"+avg);
        System.out.println("Grade :"+grade);
    }
}
