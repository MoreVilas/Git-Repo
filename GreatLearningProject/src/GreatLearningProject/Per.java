package GreatLearningProject;

import java.util.Scanner;

public class Per {
private int age;
	
	public Per(int initialAge ) {
		 if (initialAge > 0) {
             age = initialAge;
         } else {
             System.out.println("Age is not valid, setting age to 0.");
             age = 0;
         }
		
	}
	
	public void amIOld() {
		
		if(age <13) 
			System.out.println("You are young.");
		
		else if(age <18) 
			System.out.println("You are a teenager.");
		
		else 
			System.out.println("Your are old.");
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
					Per p = new Per (age);
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
