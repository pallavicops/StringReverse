import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! How many stars would you like :");
		Scanner Scan =new Scanner(System.in);
		int num = Scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =num-1;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}


