
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Searchingnumber :");
        int key = sc.nextInt();

        for( int i=0; i<10; i++ ) {
            if(arr[i] == key){
                System.out.println("the index of searching element is : " + (key + 1));
            }
        }

    }
}
