import java.util.Scanner;

public class Index_sum {
    public static void main(String[] args) {
        int i,sum = 0;
        Scanner sc =  new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the values : ");
        for(i = 0 ; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (i=0;i<arr.length;i++) {
            if (i % 2!= 0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}