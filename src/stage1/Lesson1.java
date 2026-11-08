package stage1;
import java.util.*;
public class Lesson1 {
    public static void main(String []args) {
        System.out.println("==============Student Registration===========");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your department: ");
        String dep=sc.nextLine();
        System.out.print("Enter your id: ");
        String id=sc.nextLine();
        int score = 0;
        System.out.print("Enter your score[0-100]: ");
        score = sc.nextInt();

    if( score<0 || score> 100){
        System.out.println("invalid score!");

    };
        String grade;

    if (score >= 90) {
       grade="A";

    }
    else if (score >= 80) {
        grade="B";

    }
    else if (score >= 70) {
        grade="C";

    }
    else if (score >= 60) {
        grade="D";

    }
    else if (score >= 50) {
        grade="E";

    } else {
        grade="F";
    }
        System.out.println("===========Student Information=============");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("department: "+dep);
        System.out.println("id: "+id);
        System.out.println("score :"+score);
        System.out.println("garde: "+grade);
sc.close();



    }
}
