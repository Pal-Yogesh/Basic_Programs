import java.util.Scanner;
public class Vowels_5 {
    public static void main(String[] args) {
            int ctr = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name :");
            String name = sc.nextLine();

            name = name.toLowerCase();

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                    ctr++;
                }
            }
            System.out.println("There are " + ctr + "Vowels");
        }
    }

