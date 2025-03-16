package com.clientTest;

import java.util.Scanner;

import com.controller.IPlPlayerController;

public class IPLClient {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IPlPlayerController controller = new IPlPlayerController();

		while (true) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Get All Players");
			System.out.println("2. Get CSK Players");
			System.out.println("3. Get MI Players");
			System.out.println("4. Get RCB Players");
			System.out.println("5. Get Most Run Players");
			System.out.println("6. Get Least Run Players");
			System.out.println("7. Get Most Wickets Players");
			System.out.println("8. Get Least Wickets Players");
			System.out.println("9. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("All Players Data ->>");
				System.out.println(controller.getAllPlayersController());
				break;
			case 2:
				System.out.println("CSK Players ->>");
				System.out.println(controller.getCSKPlayersController());
				break;
			case 3:
				System.out.println("MI Players ->>");
				System.out.println(controller.getMIPlayersController());
				break;
			case 4:
				System.out.println("RCB Players ->>");
				System.out.println(controller.getRCBPlayersController());
				break;
			case 5:
				System.out.println("Most Runs Players ->>");
				System.out.println(controller.getMostRunsPlayer());
				break;
			case 6:
				System.out.println("Least Runs Players ->>");
				System.out.println(controller.getLeastRunsPlayer());
				break;
			case 7:
				System.out.println("Most Wickets Players ->>");
				System.out.println(controller.getMostWicketsPlayer());
				break;
			case 8:
				System.out.println("Least Wickets Players ->>");
				System.out.println(controller.getLessWicketsPlayer());
				break;
			case 9:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		}
	}
}
