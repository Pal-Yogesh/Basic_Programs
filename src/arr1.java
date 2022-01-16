import java.util.ArrayList;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[20];
        ArrayList<Integer> obj = new ArrayList<>();
        Scanner sc  =  new Scanner(System.in);
        obj.add(sc.nextInt());
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(3,100);   // ADD IN A SPECIFIC INDEX
        obj.remove(2);           // REMOVE A SPECIFIC GIVEN INDEX

        System.out.println(obj.size());
        for(Integer res:obj){
            System.out.println(res+"  ");
        }
    }
}
