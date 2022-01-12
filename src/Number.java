public class Number {
    public static void main(String[] args) {

        for(int i=1;i<51;i++){
            if(i%3==0){
                System.out.println("buzz");
            }
            else if(i%5==0){
                System.out.println("fuzz");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("buzzfuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
