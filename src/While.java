import java.util.Scanner;

public class While{
//    public static void main(String[] args) {
//        int a =0;
//        while(a<20){
//            System.out.println(a);
//            a++;
//        }
//    }
public static void main(String[] args) {
    Scanner count = new Scanner(System.in);
    int i = 0;
    while(i<=5){
        int some = count.nextInt();
        System.out.println("Num is : " + some);
        i++;


    }

}
}
