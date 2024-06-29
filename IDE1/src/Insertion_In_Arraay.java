
import java.util.Scanner;
public class Insertion_In_Arraay {
    public static void main(String[] args) {
        {

            {
                int i = 0;
                int a;
                int[] arr = new int[6];
                Scanner input = new Scanner(System.in);

                System.out.print("Enter 5 Elements: ");

                while (i < 5) {
                    arr[i] = input.nextInt();
                    i++;
                }

                System.out.print("Enter the number to Insert: ");
                a = input.nextInt();
                arr[1] = a;

                System.out.println("The array after insertion : ");

                int j = 0;
                while (j < 6) {
                    System.out.print(arr[j] + " ");
                    j++;
                }
            }
        }
    }
}

