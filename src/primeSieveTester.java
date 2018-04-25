import java.util.Scanner;
public class primeSieveTester{
	static boolean quit = false;
	static String cmd;
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Prime Sieve Frontend v0.1");
		while(!quit){
			System.out.print(">> ");
			cmd = in.next();
			if(cmd.equals("s")){
				primeSieve.sieve(in.nextInt());
			}
			else if(cmd.equals("q")){
				quit = true;
			}
			else if(cmd.equals("h")){
				System.out.println("s [NUMBER]\tget all primes up to NUMBER");
				System.out.println("q\texit the program");
				System.out.println("h\tdisplay list of commands (this)");
			}
			else{
				System.out.println("Unrecognized command '"+cmd+"'");
				System.out.println("Type h for a list of commands");
			}
			in.nextLine();
		}
	}
}

