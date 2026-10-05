package practice03;
import java.util.Scanner;
public class problem01 {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    System.out.printf("sum %d\n",a+b+c+d);
    System.out.printf("avg %d",(a+b+c+d)/4);

}
}