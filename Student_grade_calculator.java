import java.util.Scanner;
public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int total_subject;
        double marks,average_percentage,sum=0;
        String grade;
        System.out.println("Welcome to Student Grade Calculator !!!");
        System.out.println("Enter total number of subjects");
        total_subject=sc.nextInt();
        for (int i = 1; i <= total_subject; i++) {
            System.out.println("Enter marks of subject "+i+" out of 100");
            marks=sc.nextDouble();
            sum=sum+marks;
        }
        average_percentage=sum/total_subject;
        if (average_percentage>=90){
            grade="A+";
        }
        else if(average_percentage>=80){
            grade="A";
        }
        else if(average_percentage>=70){
            grade="B";

    }
    else if(average_percentage>=60){
            grade="C";

    }
    else if(average_percentage>=50){
            grade="D";

    }
    else if(average_percentage>=40){
            grade="E";

    }
    else{
        grade="F(Fail)";
    }
    System.out.println("Total Marks = "+ sum);
    System.out.println("Average Percentage = "+ average_percentage+"%");
    System.out.println("Grade : "+grade);
}
}
