package practice03;
import java.util.Scanner;
public class problem05 {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int MinsuHeight = sc.nextInt();
        int MinsuWeight = sc.nextInt();
        int KiyoungHeight = sc.nextInt();
        int KiyoungWeight = sc.nextInt();
        System.out.println(MinsuHeight > KiyoungHeight && MinsuWeight > KiyoungWeight ? 1:0);
    }

}
