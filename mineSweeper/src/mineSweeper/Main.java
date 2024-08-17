package mineSweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Mine Sweeper");
		System.out.println("Please enter the row and column numbers ");
		
		System.out.print("Row number : ");
		int row = scan.nextInt();
		
		System.out.print("Column number : ");
		int column = scan.nextInt();
		
		mineSweeper mine = new mineSweeper(row,column);
		mine.run();
	}
}