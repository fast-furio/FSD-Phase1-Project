package files;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectRunner {
	FileCreationRunner fileCreationRunner;
	int selection;
	public static void main(String[] args) {
		ProjectRunner projectRunner = new ProjectRunner();
		projectRunner.mainMenu();
	}

	public void mainMenu() {
		System.out.println("Main Menu");
		fileCreationRunner = new FileCreationRunner();
		this.fileCreationRunner.createDirectory();


		Scanner input = new Scanner(System.in);
		int mainSelection;

		System.out.println("*****************************************");
		System.out.println("******* Welcome to the Simplilearn FSD Phase 1 Assignment ********");
		System.out.println("*****************************************");
	

		System.out.println("*****************************************");
		System.out.println("******* Developer : SUMA  ***********");
		System.out.println();


		do {
			System.out.println("Choose from these options");
			System.out.println("1. Display all file names in ascending order");
			System.out.println("2. Go to user interface menu");
			System.out.println("3. Quit");


			mainSelection = input.nextInt();



			switch(mainSelection) {
			case 1:
				fileCreationRunner.listAllFilesAscending();
				break;
			case 2:
				System.out.println("Option 2 selected");
				userInterfaceMenu();
				break;
			case 3: 
				System.out.println("Thanks for using our Application");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong option");
			}
		}while(mainSelection!=3);		


	}

	public void userInterfaceMenu() {
		

		Scanner input = new Scanner(System.in);
		


		do {
			System.out.println("******* User Interface Menu ***********");
			System.out.println("Choose from these options");
			System.out.println("1. Add a user specified file");
			System.out.println("2. Delete a user specified file");
			System.out.println("3. Search a user specified file");
			System.out.println("4. Back to Main Menu");

            try {
			selection = input.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.print("Invalid input,Enter  proper integer value ");
                input.nextLine(); // clears the buffer
            }
           

			switch(selection) {
			case 1:
				this.fileCreationRunner.createFile();
				break;
			case 2:
				System.out.println("Option 2 selected");
				this.fileCreationRunner.deleteFile();
				break;
			case 3: 
				System.out.println("Option 3 selected");
				this.fileCreationRunner.searchFile();
				break;
			case 4:
				mainMenu();
				break;
			default:
				System.out.println("Wrong option");
			}


		}while(selection!=4);
	}

}


