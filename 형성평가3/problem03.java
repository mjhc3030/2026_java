package practice03;
import java.util.Scanner;
public class problem03 {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+5;
        b = b*2;
        System.out.printf("width = %d\n", a);
        System.out.printf("length = %d\n", b);
        System.out.printf("area = %d",a*b);
        
    }

}
