package org.jsp.Pizza_Order;

import java.util.Scanner;
	
public class FoodOrder1 {
	public static Scanner sc = new Scanner(System.in);
	public static int choice, Qauntity = 1;
	public static String again;
	public static double total = 0, Pay;

	public static void menu() {
		System.out.println("\tWelcome Our Resturant");
		System.out.println("\tResturant Menu");
		System.out.println("\t1. Barger Rs :- 40.00 ");
		System.out.println("\t2. Pizza Rs :- 90.00 ");
		System.out.println("\t3. Cofee Rs :- 60.00 ");
		System.out.println("\t4. Tea Rs:- 20");
		System.out.println("\t5. Pepsi Rs :- 45");
		System.out.println("\t6. SandWich Rs :-65");
		System.out.println("\t7. MilkShake Rs:- 75");
		System.out.println("\t8. Cencel ");
	}

	public static void order() {
		System.out.println("1 To Berger || 2 To Pizaa || 3 To Cofee ");
		System.out.println("4 To Tea || 5 To Pepsi || 6 To SandWich || 7 To MilkShake");
		System.out.println("\tPress You Want You Order");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("You Choice Berger");
			System.out.println("How Many Berger You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 40);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No, Need More ");
				else {
					System.out.println("total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}
		} else if (choice == 2) {
			System.out.println("You Choice Pizza");
			System.out.println("How Many Pizza  You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 90);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No, Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}
		} else if (choice == 3) {
			System.out.println("You Choice Coffe");
			System.out.println("How Many Cofee You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 60);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}

		} else if (choice == 4) {
			System.out.println("You Choice Tea");
			System.out.println("How Many Tea You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 40);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}

		} else if (choice == 5) {
			System.out.println("You Choice Pepsi");
			System.out.println("How Many Pepsi You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 45);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}
		} else if (choice == 6) {
			System.out.println("You Choice SandWich");
			System.out.println("How Many SandWich You To Want: ");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 65);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}

		}

		else if (choice == 7) {
			System.out.println("You Choice Milkshake");
			System.out.println("How Many Milkshake You Want :-");
			Qauntity = sc.nextInt();
			total = total + (Qauntity * 75);
			System.out.println("You Want To Buy Again : ");
			System.out.println("Press Y For [Yes] and N For [No]");
			again = sc.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter Payment");
				Pay = sc.nextDouble();
				if (Pay < total)
					System.out.println("No Need More ");
				else {
					System.out.println("Total=" + total);
					total = Pay - total;
					System.out.println("Costomers Returns " + total + "Rupya");
				}
			}

		} else if (choice == 8) {
			System.exit(0);
		} else {
			System.out.println("Choose a Food In This Items : ");
			order();
		}
	}

	public static void main(String[] args) {
		menu();
		order();
		System.out.println("Thank You Sir");
	}

}
