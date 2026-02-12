import java.util.Scanner;

public class CWG_11SolOfExersize1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number in Math subject : ");
        int M = sc.nextInt();
        System.out.println("Enter number in Chemistry subject : ");
        int C = sc.nextInt();
        System.out.println("Enter number in Physics subject : ");
        int P = sc.nextInt();
        System.out.println("Enter number in Hindi subject : ");
        int H = sc.nextInt();
        System.out.println("Enter number in English subject : ");
        int E = sc.nextInt();

        int ScoreMark = (M+C+P+H+E);
        int MaximumMark = 500;

        System.out.println("The percentage of This Student is :" + ((ScoreMark*100)/MaximumMark));

    }
}
