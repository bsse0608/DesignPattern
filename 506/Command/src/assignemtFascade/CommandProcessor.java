package assignemtFascade;

import java.util.Scanner;

import AssignmentFactory.MethodSelector;

public class CommandProcessor {
	
	private Scanner scanner;
	private MethodSelector methodSelector;
	
	public CommandProcessor() {
		scanner = new Scanner(System.in);
		methodSelector = new MethodSelector();
	}
	
	
	public void proceed() {
		
		while(true) {
		
			System.out.print("Please Enter your command$: ");
			String command = scanner.nextLine();
			//System.out.println(command);
			methodSelector.getCommandMethod(command).proceedCommand();
			
		}
		
	}
	
	
	
	
	

}
