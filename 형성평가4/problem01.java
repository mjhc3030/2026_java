package practice04;
import java.util.Scanner;
public class problem01 {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        
        int b = sc.nextInt();
        if(a > b){
            System.out.printf("%d",a-b);
            }else{
                System.out.printf("%d",b-a);
            }
        


    }

}
