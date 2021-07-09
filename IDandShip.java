package ComprinnoSolutions;

import java.util.Scanner;

class IDandShip
{
	public static void main(String args[])
	{
		char ch;
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Charater : ");
		ch=xyz.next().charAt(0);
		switch(ch)
		{
			case 'B':
			System.out.println("BattleShip");
			break;
				
			case 'b':
			System.out.println("BattleShip");
			break;

			case 'C':
			System.out.println("Cruiser");
			break;

			case 'c':
			System.out.println("Cruiser");
			break;

			case 'D':
			System.out.println("Destroyer");
			break;

			case 'd':
			System.out.println("Destroyer");
			break;

			case 'F':
			System.out.println("Frigate");
			break;

			case 'f':
			System.out.println("Frigate");
			break;

			default: System.out.println("Enter the valid charater");	
			break;
		}	
	}
}

