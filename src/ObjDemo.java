import java.util.Scanner;

public class ObjDemo {
    int arr[];
    public ObjDemo(){
        arr = new int[5];
    }
    public static void main(String[] args) {
     ObjDemo obj1 = new ObjDemo();
        Scanner sc =new Scanner(System.in);

        for(int i =0 ; i<obj1.arr.length;i++)
        {
           obj1.arr[i]= sc.nextInt();
        }
        for(int i = 0 ;i <obj1.arr.length;i++){
            System.out.println(obj1.arr[i]);
        }
    }
}
