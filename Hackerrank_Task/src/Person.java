import java.io.*;
import java.util.Scanner;

public class Person {
	private int age;
	
	public Person(int initialAge ) {
		if(initialAge <0){
			System.out.println("Age is not valid, setting age to 0");
			this.age=0;
			// Add some more code to run some checks on initialAge
		}
		else {
			this.age = initialAge;
		}
		
	}
	
	public void amIOld() {
		
		String result = "";
		if(age >=18) {
			result = "You are old.";
		}
		else if(age >=13) {
			result ="You are a teenager.";
		}
		else {
			result = "Your are young.";
	}
		//Write code determining if this person's age is old and print the
	//	correct statement:
		System.out.println(result);
		/*Insert correct print statement here */
	}
	
	public void yearPasses() {
		this.age++;
		// Increment this person's age.
			}

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				for (int i = 0; i < T; i++) {
					int age = sc.nextInt();
					Person p = new Person(age);
					p.amIOld();
					for (int j = 0; j < 3; j++) {
						p.yearPasses();
					}
					p.amIOld();
					System.out.println();
		        }
				sc.close();
		    }
		}
