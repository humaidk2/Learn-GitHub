import java.util.Scanner;
import java.io.*;
 
public class ExpenseCalculator {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter outFile = new PrintWriter ("README.txt");
		
		outFile.println("Dear User,\n"
				+ "Welcome to our Expense Calculator.\n"
				+ "This program was developed by Arsha Shaju (5941611) and Aaditya Raghuprasad (5994330) in the Eclipse IDE."
				+ "\n" + "Hope you enjoy using our program :).");
		
		outFile.close();
		
		//INITIALIZING VARIABLES
		
		//Currency
		String currency;
		
		//Choice
		int choice;
		
		//Access Menus
		String menuAccess;
		
		//SENTINEL
		final String SENTINEL = "//";
		String inputWord;
		
		//Weekly Expenses
			float transportation = 0;
			float parking = 0;
			float foodAndBeverages = 0;
			float phoneCredit = 0;
		
			//Transport
			float metro = 0;
			float bus = 0;
			float taxi = 0;
			float car = 0; float petrol = 0; float salik = 0;
		
			//Parking
			float publicParking = 0;
			float universityParkingWeekly = 0; int userReply = -1;
			
			//additional weekly expenses
			int desiredWeeklyInputs;
			
			//1
			String additionalWeeklyExpense1_Name = "";
			float additionalWeeklyExpense1_Cost = 0;
			
			//2
			String additionalWeeklyExpense2_Name = "";
			float additionalWeeklyExpense2_Cost = 0;
			
			//3
			String additionalWeeklyExpense3_Name = "";
			float additionalWeeklyExpense3_Cost = 0;
			
			float totalWeeklyExpense = 0;
			
		//Monthly Expenses
			
			int reEnter;
			int desiredMonthlyInputs;
			
			//1
			String monthlyExpense1_Name = "";
			float monthlyExpense1_Cost = 0;
			
			//2
			String monthlyExpense2_Name = "";
			float monthlyExpense2_Cost = 0;
			
			//3
			String monthlyExpense3_Name = "";
			float monthlyExpense3_Cost = 0;
			
			//4
			String monthlyExpense4_Name = "";
			float monthlyExpense4_Cost = 0;
			
			//5
			String monthlyExpense5_Name = "";
			float monthlyExpense5_Cost = 0;
			
			float totalMonthlyOnlyExpense = 0;
			float totalMonthlyExpense = 0;
			
		//Semesterly Expenses
			
			int semestersPerYear = 0; 
			
			//semester 1
			String semesterOneName = "";
			float semesterOneFees = 0;
			int semesterOneWeeks = 0;
			
			//semester 2
			String semesterTwoName = "";
			float semesterTwoFees = 0;
			int semesterTwoWeeks = 0;
			
			//semester 3
			String semesterThreeName = "";
			float semesterThreeFees = 0;
			int semesterThreeWeeks = 0;
			
			//additional semesterly expenses
			int desiredSemesterlyInputs;
			
			//1
			String additionalSemesterlyExpense1_Name = "";
			float additionalSemesterlyExpense1_Cost = 0;
			
			//2
			String additionalSemesterlyExpense2_Name = "";
			float additionalSemesterlyExpense2_Cost = 0;
			
			//3
			String additionalSemesterlyExpense3_Name = "";
			float additionalSemesterlyExpense3_Cost = 0;
			
			float totalSemesterlyOnlyExpenseSem1 = 0;
			float totalSemesterlyOnlyExpenseSem2 = 0;
			float totalSemesterlyOnlyExpenseSem3 = 0;
			
			float totalSemesterlyExpenseSem1 = 0;
			float totalSemesterlyExpenseSem2 = 0;
			float totalSemesterlyExpenseSem3 = 0;
			
		//Yearly Expenses
			
			//additional semesterly expenses
			int desiredYearlyInputs;
			
			//1
			String additionalYearlyExpense1_Name = "";
			float additionalYearlyExpense1_Cost = 0;
			
			//2
			String additionalYearlyExpense2_Name = "";
			float additionalYearlyExpense2_Cost = 0;
			
			//3
			String additionalYearlyExpense3_Name = "";
			float additionalYearlyExpense3_Cost = 0;
			
			float totalYearlyExpense = 0;
			
		//Entire Degree Expense

			int yearsForDegreeCompletion = 0;
			float totalDegreeExpense = 0;
		
		
//---------------------------------------------------------------------------------------------------//
		
		//PROGRAM CALCULATIONS & OUTPUTS
		
		//Welcome Message
		System.out.println("EXPENSE CALCULATOR v1.0 \n"
				+ "Welcome to the expense calculator! \n");
		
		//Currency
		System.out.println("Please enter the currency (symbol / shortform) that you will be using: "); 
		currency = console.next();                                                
		
	//-------------------------------------------------------------------------------------------------------------------------------------//
		
		//WEEKLY EXPENSES
		menuAccess = ("Weekly Expenses");
		while (menuAccess.equals("Weekly Expenses")) {
			
			System.out.println("\nWEEKLY EXPENSES\n");
			
			System.out.println("Categories of costs: \n\n"
				+ "1.Transport \n"
				+ "2.Parking \n"
				+ "3.Food and Beverages \n"
				+ "4.Phone Bill \n"
				+ "5.Additional Expenses \n"
				+ "6.Go to next menu \n");
		
			do {
				System.out.println("Select one of the above categories (1-6): ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				choice = console.nextInt();
			} while (choice < 0 || choice > 6);
			
			switch (choice) {
		
				//TRANSPORT
				case (1):
					menuAccess = ("Modes of Transport");
					while (menuAccess.equals("Modes of Transport")) { 
						System.out.println("\nTransport Costs: \n"
							+ "1.Metro \n"
							+ "2.Bus \n"
							+ "3.Taxi \n"
							+ "4.Car \n"
							+ "0.Go to previous menu \n");
			
						do {
							System.out.println("Select an option (0-4): ");
							while (!console.hasNextInt()) {
								System.out.println("Please enter a number: ");
								console.next();
							}
							choice = console.nextInt();
						} while (choice < 0 || choice > 4);
			
						switch (choice) {
			
							//METRO
							case(1):
								
								do {
									System.out.println("\nMetro Travel Cost per Week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									metro = console.nextFloat();
								} while (metro < 0);
								
								break;
						
							//BUS
							case(2):

								do {
									System.out.println("\nBus Travel Cost per Week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									bus = console.nextFloat();
								} while (bus < 0);
								
								break;
					
							//TAXI
							case(3):
								do {
									System.out.println("\nTaxi Travel Cost per Week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									taxi = console.nextFloat();
								} while (taxi < 0);
								
								break;
					
							//CAR
							case(4):
								menuAccess = ("Car-Related Costs");
								while (menuAccess == "Car-Related Costs") {
									System.out.println("\nCar-Related Costs: \n"
										+ "1.Petrol \n"
										+ "2.Salik \n"
										+ "0.Go to previous menu \n");
						
									do {
										System.out.println("Select an option (0-2): ");
										while (!console.hasNextInt()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										choice = console.nextInt();
									} while (choice < 0 || choice > 2);
						
									switch (choice) {
							
										//PETROL
										case(1):
											
											do {
												System.out.println("\nPetrol Cost per Week: ");
												while (!console.hasNextInt()) {
													System.out.println("Please enter a number: ");
													console.next();
												}
												petrol = console.nextFloat();
											} while (petrol < 0);
											
											break;
								
										//SALIK
										case(2):

											do {
												System.out.println("Salik Cost per Week: ");
												while (!console.hasNextInt()) {
													System.out.println("Please enter a number: ");
													console.next();
												}
												salik = console.nextFloat();
											} while (salik < 0);
											
											break;
										
										case(0):
											menuAccess = ("Modes of Transport"); //Exits this menu and goes to modes of transport menu
											break;
										
										default:
											System.out.println("Please enter valid number");
											break;
								
									} //car-related costs switch
							
								}//car-related costs while
						
								car = (petrol + salik);
								
								break; //breaking out of TRANSPORT > [case(4) (CAR)]                 
						
							case(0):
								menuAccess = ("Weekly Expenses"); //Exits current menu and goes to Weekly Expense menu
								break;
								
							default:
								System.out.println("Please enter valid number");
								break;
						
						}//modes of transport switch
					
					}//modes of transport while
					
					transportation = (metro + bus + taxi + car);
					
					menuAccess = ("Weekly Expenses");
					
					break;
					
				//PARKING
				case (2):
					
					menuAccess = "Types of Parking";
					while (menuAccess.equals("Types of Parking")) {
						System.out.println("\nParking Costs: \n"
								+ "1.Public Parking \n"
								+ "2.University Parking \n"
								+ "0.Go to previous menu \n");
						
						do {
							System.out.println("Select an option (0-2): ");
							while (!console.hasNextInt()) {
								System.out.println("Please enter a number");
								console.next();
							}
							choice = console.nextInt();
						} while (choice < 0 || choice > 2);
						
						switch (choice) {
						
							case(1):

								do {
									System.out.println("Public Parking Expense per Week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									publicParking = console.nextFloat();
								} while (publicParking < 0);
								
								break;
								
							case(2):
								
								userReply = -1;
								while (userReply < 0) {
									System.out.println("Do you pay weekly for univerisity parking? \n");
									do {
										System.out.println("Enter 1 for yes and 0 for no: ");
										while (!console.hasNextInt()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										userReply = console.nextInt();
									} while (userReply < 1 || userReply > 2);
									
									if (userReply == 1) {
										System.out.println("University Parking Cost per Week: ");
										universityParkingWeekly = console.nextFloat();
									} else if (userReply == 0) {
										System.out.println("You are only required to enter weekly expenses in this menu.");
										userReply = 0;
									} else {
										System.out.println("Invalid Response.");
									}
									
								}//university parking while	
								break;
								
							case(0):
								
								menuAccess = ("Weekly Expenses");
								break;
								
							default: 
								
								System.out.println("Please enter a valid number.");
								break;
								
						}//types of parking switch
						
					}//types of parking while
					parking = (publicParking + universityParkingWeekly);
					System.out.println("\n" + currency + parking + " is "		//DELETE in final code
							+ "the total amount spent on parking per week.");
					break;
				
				//FOOD & BEVERAGES
				case (3):
					
					menuAccess = "FnB";
					while (menuAccess.equals("FnB")) {
						System.out.println("\nFood and Beverages: \n"
								+ "1.Average cost \n"
								+ "0.Go to previous menu \n");
						
						do {
							System.out.println("Select an option (0-1): ");
							while (!console.hasNextInt()) {
								System.out.println("Please enter a number: ");
								console.next();
							}
							choice = console.nextInt();
						} while (choice < 0 || choice > 1);
						
						switch (choice) {
						
							case(1):

								do {
									System.out.println("Average expense on food and beverages per week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									foodAndBeverages = console.nextFloat();
								} while (foodAndBeverages < 0);
								
								break;
								
							case(0):
								
								menuAccess = ("Weekly Expenses");
								break;
								
							default:
								
								System.out.println("Please enter a valid number.");
								break;
							
						}//FnB switch 
						
					}//FnB while
					System.out.println("\n" + currency + foodAndBeverages + " is "		//DELETE in final code
							+ "the average amount spent on food and beverages per week.");
					break;
				
				//PHONE CREDIT
				case (4):
					
					menuAccess = "Phone Credit";
					while (menuAccess == ("Phone Credit")) {
						System.out.println("\nPhone Credit: \n"
								+ "1.Average phone credit expense \n"
								+ "0.Go to previous menu \n");
						
						do {
							System.out.println("Select an option: ");
							while (!console.hasNextInt()) {
								System.out.println("Please enter a number: ");
								console.next();
							}
							choice = console.nextInt();
						} while (choice < 0 || choice > 1);
						
						switch (choice) {
						
							case(1):

								do {
									System.out.println("Average expense on phone credit per week: ");
									while (!console.hasNextInt()) {
										System.out.println("Please enter a number: ");
										console.next();
									}
									phoneCredit = console.nextFloat();
								} while (phoneCredit < 0);
								
								break;
								
							case(0):
								menuAccess = ("Weekly Expenses");
								break;
								
							default:
								System.out.println("Please enter a valid number.");
								break;
							
						}//phone bill switch
						
					}//phone bill while
					System.out.println("\n" + currency + phoneCredit + " is "		//DELETE in final code
							+ "the average amount spent on phone credit per week.");
					break;
					
				
				//Additional Expenses
				case(5):
					menuAccess.equals("Additional Expenses"); 
					//Additional Yearly Expenses
					System.out.println("Do you have any additional weekly expenses?");
					do {
						System.out.println("Enter 1 for yes and 0 for no: ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						choice = console.nextInt();
					} while (choice < 0 || choice > 1);
				
					do {
						
						if (choice == 0) {
							System.out.println("Are you sure that you have no additional weekly expenses? \n");
							do {
								System.out.println("Enter 1 to add weekly expenses and 0 to skip weekly expenses: ");
								while (!console.hasNextInt()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								choice = console.nextInt();
							} while (choice < 0 || choice > 1);
						
							if (choice == 1) {
								reEnter = 1;
							} else {
								reEnter = 0;
							}
						
						} else {
							//provide user inputs
							reEnter = 0;
						
							do {
								System.out.println("\n" + "How many weekly expenses do you want to add? \n"
										+ "You can add up to three additional weekly expenses.");
								while (!console.hasNextInt()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								desiredWeeklyInputs = console.nextInt();
							} while (desiredWeeklyInputs < 0 || desiredWeeklyInputs > 3);
						
							switch (desiredWeeklyInputs) {
						
								case (1):
								
									//1
										//using a sentinel-controlled while loop in order to allow the user to enter
										//multiple words as define as expense 1 name.
									System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense1_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense1_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense1_Cost = console.nextFloat();
									} while (additionalWeeklyExpense1_Cost < 0);
								
									reEnter = 0;
									break;
							
								case (2):
								
									//1
									System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense1_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense1_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense1_Cost = console.nextFloat();
									} while (additionalWeeklyExpense1_Cost < 0);
							
									//2
									System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense2_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense2_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense2_Cost = console.nextFloat();
									} while (additionalWeeklyExpense2_Cost < 0);
								
									reEnter = 0;
									break;
								
								case (3):
								
									//1
									System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense1_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense1_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense1_Cost = console.nextFloat();
									} while (additionalWeeklyExpense1_Cost < 0);
							
									//2
									System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense2_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense2_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense2_Cost = console.nextFloat();
									} while (additionalWeeklyExpense2_Cost < 0);
								
									//3
									System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
									inputWord = console.next();
									//Code to add multiple words as the input
									while (!inputWord.equals(SENTINEL)) {
										additionalWeeklyExpense3_Name += (inputWord + " ");
										inputWord = console.next();
									}
								
									do {
										System.out.println("Please enter the Weekly expense for " + additionalWeeklyExpense3_Name
												+ ": ");
										while (!console.hasNextFloat()) {
											System.out.println("Please enter a number: ");
											console.next();
										}
										additionalWeeklyExpense3_Cost = console.nextFloat();
									} while (additionalWeeklyExpense3_Cost < 0);
								
									reEnter = 0;
									
									break;
								
								default:
								
									System.out.println("Invalid Input");
									break;
							
							} //weekly additional expenses switch
							
							
						
						} //else statement with additional weekly expense inputs
					
					} while (reEnter == 1);
				
				//Move to next menu
				case (6):
					
					System.out.println("Have you entered all you weekly expenses? You will not be able to"
							+ " return to this menu if you proceed. \n"
							+ "Do you still wish to proceed to next menu? \n"
							+ "1:Yes 0:No \n");
					do {
						System.out.println("Your choice: ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						choice = console.nextInt();
					} while (choice < 0 || choice >1);
					
					if (choice == 1) {
						menuAccess = ("Monthly Expenses");
					} else {
						menuAccess = "Weekly Expenses";
					}
					
					break;
				
				default:
					System.out.println("Invalid input.");
					break;
					
			}//weekly expenses switch
			
			
		
		}//weekly expense while
		
	//-------------------------------------------------------------------------------------------------------------------------------------//
		
		//MONTHLY EXPENSES
		
		while (menuAccess.equals("Monthly Expenses")) {
			System.out.println("\n");
			System.out.println("MONTHLY EXPENSES \n");
			
			System.out.println("Do you have any monthly expenses?");
			do {
				System.out.println("Enter 1 for yes and 0 for no: ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				choice = console.nextInt();
			} while (choice < 0 || choice > 1);
			
			do {
				if (choice == 0) {
					System.out.println("Are you sure that you have no monthly expenses? \n"
							+ "You will not be able to add any monthly expenses later on.");
					do {
						System.out.println("Enter 1 to add monthly expenses and 0 to skip monthly expenses: ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						choice = console.nextInt();
					} while (choice < 0 || choice > 1);
					
					if (choice == 1) {
						reEnter = 1;
					} else {
						reEnter = 0;
					}
					
				} else {
					//provide user inputs
					reEnter = 0;
					
					do {
						System.out.println("\n" + "How many monthly expenses do you want to add? \n"
								+ "You can add up to five monthly expenses.");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						desiredMonthlyInputs = console.nextInt();
					} while (desiredMonthlyInputs < 0 || desiredMonthlyInputs > 5);
					
					switch (desiredMonthlyInputs) {
					
						case (1):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense1_Cost = console.nextFloat();
							} while (monthlyExpense1_Cost < 0);
							
							reEnter = 0;
							break;
						
						case (2):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
						
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense1_Cost = console.nextFloat();
							} while (monthlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense2_Cost = console.nextFloat();
							} while (monthlyExpense2_Cost < 0);
							
							reEnter = 0;
							break;
							
						case (3):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
						
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense1_Cost = console.nextFloat();
							} while (monthlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense2_Cost = console.nextFloat();
							} while (monthlyExpense2_Cost < 0);
							
							//3
							System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense3_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense3_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense3_Cost = console.nextFloat();
							} while (monthlyExpense3_Cost < 0);
							
							reEnter = 0;
							break;
							
						case (4):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
						
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense1_Cost = console.nextFloat();
							} while (monthlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense2_Cost = console.nextFloat();
							} while (monthlyExpense2_Cost < 0);
							
							//3
							System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense3_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense3_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense3_Cost = console.nextFloat();
							} while (monthlyExpense3_Cost < 0);
							
							//4
							System.out.println("Please enter expense 4 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense4_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense4_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense4_Cost = console.nextFloat();
							} while (monthlyExpense4_Cost < 0);
							
							reEnter = 0;
							break;
							
						case (5):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
						
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense1_Cost = console.nextFloat();
							} while (monthlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense2_Cost = console.nextFloat();
							} while (monthlyExpense2_Cost < 0);
							
							//3
							System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense3_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense3_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense3_Cost = console.nextFloat();
							} while (monthlyExpense3_Cost < 0);
							
							//4
							System.out.println("Please enter expense 4 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense4_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense4_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense4_Cost = console.nextFloat();
							} while (monthlyExpense4_Cost < 0);
							
							//5
							System.out.println("Please enter expense 5 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								monthlyExpense5_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the monthly expense for " + monthlyExpense5_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								monthlyExpense5_Cost = console.nextFloat();
							} while (monthlyExpense5_Cost < 0);
							
							reEnter = 0;
							break;
							
						default:
							
							System.out.println("Invalid Input");
							break;
						
					} //monthly inputs switch
					
				} //else statement with monthly expense inputs
				
			} while (reEnter == 1);
			totalMonthlyOnlyExpense = (monthlyExpense1_Cost + monthlyExpense2_Cost + monthlyExpense3_Cost 
					+ monthlyExpense4_Cost + monthlyExpense5_Cost);
			
			menuAccess = "Semesterly Expenses" ;
			
		} //monthly expenses while
		
	//-------------------------------------------------------------------------------------------------------------------------------------//
		
		//SEMESTERLY EXPENSES
		
		while (menuAccess.equals("Semesterly Expenses")) {
			System.out.println("\nExpenses per Semester \n");
			System.out.println("How many semesters do you have in university per year?");
			
			do {
				System.out.println("Minimum 1 semester, maximum 3 semesters: ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				semestersPerYear = console.nextInt();
			} while (semestersPerYear < 0 || semestersPerYear > 3);
			
			System.out.println("Enter the names of your semesters: ");
			
			switch (semestersPerYear) {
				
				case (2) :
					
					System.out.println("Enter semester 1 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterOneName += (inputWord + " ");
						inputWord = console.next();
					}
					
					System.out.println("Enter semester 2 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterTwoName += (inputWord + " ");
						inputWord = console.next();
					}
					
					break;
					
				case (3) :
					
					System.out.println("Enter semester 1 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterOneName += (inputWord + " ");
						inputWord = console.next();
					}
				
					System.out.println("Enter semester 2 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterTwoName += (inputWord + " ");
						inputWord = console.next();
					}
					
					System.out.println("Enter semester 3 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterThreeName += (inputWord + " ");
						inputWord = console.next();
					}
				
					break;
					
				case (1) :
					
					System.out.println("Enter semester 1 name followed by " + SENTINEL + ": ");
					inputWord = console.next();
					//Code to add multiple words as the input
					while (!inputWord.equals(SENTINEL)) {
						semesterOneName += (inputWord + " ");
						inputWord = console.next();
					}
				
					break;
					
				default:
					
					System.out.println("Please enter valid input.");
					
					break;
			
			}//semester naming switch
			
			System.out.println("Enter your tuition fees per semester: ");
			
			switch (semestersPerYear) {
			
				case (2) :
				
					// semester 1 fees
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneFees = console.nextFloat();
					} while (semesterOneFees < 0);
				
					// semester 2 fees
					do {
						System.out.println(semesterTwoName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterTwoFees = console.nextFloat();
					} while (semesterTwoFees < 0);
				
					break;
				
				case (3) :
				
					// semester 1 fees
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneFees = console.nextFloat();
					} while (semesterOneFees < 0);
				
					// semester 2 fees
					do {
						System.out.println(semesterTwoName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterTwoFees = console.nextFloat();
					} while (semesterTwoFees < 0);
					
					// semester 3 fees
					do {
						System.out.println(semesterThreeName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterThreeFees = console.nextFloat();
					} while (semesterThreeFees < 0);
			
					break;
				
				case (1) :
				
					// semester 1 fees
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextFloat()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneFees = console.nextFloat();
					} while (semesterOneFees < 0);
			
					break;
				
				default:
				
					System.out.println("Please enter valid input.");
				
					break;
				
			} //semester fees switch
			
			System.out.println("Do you have any additional expenses paid per semester?");
			do {
				System.out.println("Enter 1 for yes and 0 for no: ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				choice = console.nextInt();
			} while (choice < 0 || choice > 1);
			
			do {
				if (choice == 0) {
					System.out.println("Are you sure that you have no additional expenses per semester? \n"
							+ "You will not be able to add any expenses later on.");
					do {
						System.out.println("Enter 1 to add 'per semester' expenses and 0 to skip 'per semester' expenses: ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						choice = console.nextInt();
					} while (choice < 0 || choice > 1);
					
					if (choice == 1) {
						reEnter = 1;
					} else {
						reEnter = 0;
					}
					
				} else {
					//provide user inputs
					reEnter = 0;
					
					do {
						System.out.println("\n" + "How many semesterly expenses do you want to add? \n"
								+ "You can add up to three additional semesterly expenses.");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						desiredSemesterlyInputs = console.nextInt();
					} while (desiredSemesterlyInputs < 0 || desiredSemesterlyInputs > 3);
					
					switch (desiredSemesterlyInputs) {
					
						case (1):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense1_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense1_Cost < 0);
							
							reEnter = 0;
							break;
						
						case (2):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense1_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense2_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense2_Cost < 0);
							
							reEnter = 0;
							break;
							
						case (3):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense1_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense2_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense2_Cost < 0);
							
							//3
							System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalSemesterlyExpense3_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the per-semester expense for " + additionalSemesterlyExpense3_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalSemesterlyExpense3_Cost = console.nextFloat();
							} while (additionalSemesterlyExpense3_Cost < 0);
							
							reEnter = 0;
							break;
							
						default:
							
							System.out.println("Invalid Input");
							break;
						
					} //semesterly additional expenses switch
					
				} //else statement with additional semesterly expense inputs
				
			} while (reEnter == 1);
			
			//Semester-Only Expenses Total
			totalSemesterlyOnlyExpenseSem1 = (additionalSemesterlyExpense1_Cost + additionalSemesterlyExpense2_Cost 
					+ additionalSemesterlyExpense3_Cost + semesterOneFees );
			totalSemesterlyOnlyExpenseSem2 = (additionalSemesterlyExpense1_Cost + additionalSemesterlyExpense2_Cost 
					+ additionalSemesterlyExpense3_Cost + semesterTwoFees );
			totalSemesterlyOnlyExpenseSem3 = (additionalSemesterlyExpense1_Cost + additionalSemesterlyExpense2_Cost 
					+ additionalSemesterlyExpense3_Cost + semesterThreeFees );
			
			//Weeks of university attended per semester
			System.out.println("\n" + "Enter the number of weeks you go to university for each of these semesters: ");
			
			switch (semestersPerYear) {
			
				case (2) :
				
					// semester 1 weeks
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneWeeks = console.nextInt();
					} while (semesterOneWeeks < 0);
				
					// semester 2 weeks
					do {
						System.out.println(semesterTwoName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterTwoWeeks = console.nextInt();
					} while (semesterTwoWeeks < 0);
				
					break;
				
				case (3) :
				
					// semester 1 weeks
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneWeeks = console.nextInt();
					} while (semesterOneWeeks < 0);
				
					// semester 2 weeks
					do {
						System.out.println(semesterTwoName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterTwoWeeks = console.nextInt();
					} while (semesterTwoWeeks < 0);
					
					// semester 3 weeks
					do {
						System.out.println(semesterThreeName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterThreeWeeks = console.nextInt();
					} while (semesterThreeWeeks < 0);
			
					break;
				
				case (1) :
				
					// semester 1 weeks
					do {
						System.out.println(semesterOneName + ": ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						semesterOneWeeks = console.nextInt();
					} while (semesterOneWeeks < 0);
			
					break;
				
				default:
				
					System.out.println("Please enter valid input.");
				
					break;
				
			} //semester fees switch
			
			menuAccess = ("Yearly Expenses");
			
		} //semesterly expenses while
		
	//-------------------------------------------------------------------------------------------------------------------------------------//
		
		//YEARLY EXPENSES
		
		while (menuAccess.equals("Yearly Expenses")) {
			
			//Get number of year for degree completion
			System.out.println("\nYearly Expenses \n");
			do {
				System.out.println("Enter the number of years it takes to complete your degree: ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				yearsForDegreeCompletion = console.nextInt();
			} while (yearsForDegreeCompletion < 0);
			
			//Additional Yearly Expenses
			System.out.println("Do you have any additional expenses paid per year?");
			do {
				System.out.println("Enter 1 for yes and 0 for no: ");
				while (!console.hasNextInt()) {
					System.out.println("Please enter a number: ");
					console.next();
				}
				choice = console.nextInt();
			} while (choice < 0 || choice > 1);
			
			do {
				if (choice == 0) {
					System.out.println("Are you sure that you have no additional yearly expenses? \n"
							+ "You will not be able to add any expenses later on.");
					do {
						System.out.println("Enter 1 to add yearly expenses and 0 to skip yearly expenses: ");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						choice = console.nextInt();
					} while (choice < 0 || choice > 1);
					
					if (choice == 1) {
						reEnter = 1;
					} else {
						reEnter = 0;
					}
					
				} else {
					//provide user inputs
					reEnter = 0;
					
					do {
						System.out.println("\n" + "How many yearly expenses do you want to add? \n"
								+ "You can add up to three additional yearly expenses.");
						while (!console.hasNextInt()) {
							System.out.println("Please enter a number: ");
							console.next();
						}
						desiredYearlyInputs = console.nextInt();
					} while (desiredYearlyInputs < 0 || desiredYearlyInputs > 3);
					
					switch (desiredYearlyInputs) {
					
						case (1):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense1_Cost = console.nextFloat();
							} while (additionalYearlyExpense1_Cost < 0);
							
							reEnter = 0;
							break;
						
						case (2):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense1_Cost = console.nextFloat();
							} while (additionalYearlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense2_Cost = console.nextFloat();
							} while (additionalYearlyExpense2_Cost < 0);
							
							reEnter = 0;
							break;
							
						case (3):
							
							//1
							System.out.println("Please enter expense 1 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense1_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense1_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense1_Cost = console.nextFloat();
							} while (additionalYearlyExpense1_Cost < 0);
						
							//2
							System.out.println("Please enter expense 2 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense2_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense2_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense2_Cost = console.nextFloat();
							} while (additionalYearlyExpense2_Cost < 0);
							
							//3
							System.out.println("Please enter expense 3 name followed by " + SENTINEL + ": ");
							inputWord = console.next();
							//Code to add multiple words as the input
							while (!inputWord.equals(SENTINEL)) {
								additionalYearlyExpense3_Name += (inputWord + " ");
								inputWord = console.next();
							}
							
							do {
								System.out.println("Please enter the yearly expense for " + additionalYearlyExpense3_Name
										+ ": ");
								while (!console.hasNextFloat()) {
									System.out.println("Please enter a number: ");
									console.next();
								}
								additionalYearlyExpense3_Cost = console.nextFloat();
							} while (additionalYearlyExpense3_Cost < 0);
							
							reEnter = 0;
							break;
							
						default:
							
							System.out.println("Invalid Input");
							break;
						
					} //yearly additional expenses switch
					
				} //else statement with additional yearly expense inputs
				
			} while (reEnter == 1);
			
			menuAccess = "Outputs";
			
		} //yearly expenses while
		
//-------------------------------------------------------------------------------------------------------------------------------------//
		
		//OUTPUTS
		
		while (menuAccess.equals("Outputs")) {
			totalWeeklyExpense = (transportation + parking + foodAndBeverages + phoneCredit);
			System.out.println("Your average expense per week is " + currency 
					+ " " + totalWeeklyExpense + ". \n");
			
			totalMonthlyExpense = ((totalWeeklyExpense * 4) + totalMonthlyOnlyExpense);
			System.out.println("The total expense per month is " + currency + totalMonthlyExpense);
			
			
			if (semestersPerYear == 1) {
				
				totalSemesterlyExpenseSem1 = ((totalWeeklyExpense * semesterOneWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterOneWeeks) + totalSemesterlyOnlyExpenseSem1);
				System.out.println("The total expense for " + semesterOneName + " is " + currency + totalSemesterlyOnlyExpenseSem1);
				
				totalYearlyExpense = (totalSemesterlyExpenseSem1);
				System.out.println("The total yearly expense is " + currency + totalYearlyExpense);
				
				totalDegreeExpense = (totalSemesterlyExpenseSem1 * yearsForDegreeCompletion);
				System.out.println("The total expense for the entire degree is " + currency + totalDegreeExpense);
			
			} else if (semestersPerYear == 2) {
				
				totalSemesterlyExpenseSem1 = ((totalWeeklyExpense * semesterOneWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterOneWeeks) + totalSemesterlyOnlyExpenseSem2);
				System.out.println("The total expense for " + semesterOneName + " is " + currency + totalSemesterlyExpenseSem1);
				
				totalSemesterlyExpenseSem2 = ((totalWeeklyExpense * semesterTwoWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterTwoWeeks) + totalSemesterlyOnlyExpenseSem2);
				System.out.println("The total expense for " + semesterTwoName + " is " + currency + totalSemesterlyExpenseSem2);
				
				totalYearlyExpense = (totalSemesterlyExpenseSem1 + totalSemesterlyExpenseSem2);
				System.out.println("The total yearly expense is " + currency + totalYearlyExpense);
				
				totalDegreeExpense = ((totalSemesterlyExpenseSem1 + totalSemesterlyExpenseSem2) * yearsForDegreeCompletion);
				System.out.println("The total expense for the entire degree is " + currency + totalDegreeExpense);
			
			} else {
				
				totalSemesterlyExpenseSem1 = ((totalWeeklyExpense * semesterOneWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterOneWeeks) + totalSemesterlyOnlyExpenseSem1);
				System.out.println("The total expense for " + semesterOneName + " is " + currency + totalSemesterlyExpenseSem1);
				
				totalSemesterlyExpenseSem2 = ((totalWeeklyExpense * semesterTwoWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterTwoWeeks) + totalSemesterlyOnlyExpenseSem2);
				System.out.println("The total expense for " + semesterTwoName + " is " + currency + totalSemesterlyExpenseSem2);
				
				totalSemesterlyExpenseSem3 = ((totalWeeklyExpense * semesterThreeWeeks) 
						+ ((totalMonthlyOnlyExpense / 4 ) * semesterThreeWeeks) + totalSemesterlyOnlyExpenseSem3);
				System.out.println("The total expense for " + semesterThreeName + " is " + currency + totalSemesterlyExpenseSem3);
				
				totalYearlyExpense = (totalSemesterlyExpenseSem1 + totalSemesterlyExpenseSem2 + totalSemesterlyExpenseSem3);
				System.out.println("The total yearly expense is " + currency + totalYearlyExpense);
				
				totalDegreeExpense = ((totalSemesterlyExpenseSem1 + totalSemesterlyExpenseSem2 + totalSemesterlyExpenseSem3) * yearsForDegreeCompletion);
				System.out.println("The total expense for the entire degree is " + currency + totalDegreeExpense);
			}
			
			menuAccess = "Finish";
			System.out.println("\n" + "You have reached the end of the program.");
			
		}	
		
	}//MAIN FUNCTION (public static void main)

}//CLASS

