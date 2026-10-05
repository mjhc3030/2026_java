package practice04;
import java.util.Scanner;
public class problem04 {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number? ");
        int a = sc.nextInt();
        if (a==1){
            System.out.print("dog");
        }else if(a==2){
            System.out.print("cat");
        }else if(a==3){
            System.out.print("chick");
        }else{
            System.out.print("I don't know.");
        }
    }

}
