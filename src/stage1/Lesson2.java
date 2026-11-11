package stage1;

import java.util.*;

public class Lesson2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students you want to calculate score: ");
        int number=sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter at least one student.");
            return;
        }

        double sum=0;

        for(int i=1;i<=number;i++){
            System.out.print("Enter score for student "+i+":");
            double score=sc.nextDouble();
            sum=sum+score;
        }
        System.out.println("The total mark is: "+sum);
        double average=sum/number;
        System.out.println("average: "+average);
    }
}
