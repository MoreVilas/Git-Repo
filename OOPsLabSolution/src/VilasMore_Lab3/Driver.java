package VilasMore_Lab3;

public class Driver {
	
	public static void main(String[] args) {
		
		String bracketExpression = "([[{}]])";
		
		boolean isBalanced = BalancingBrackets.checkBalancingBrackets(bracketExpression);
		if(isBalanced) {
			System.out.println("Balanced bracakets");
		}else {
			System.out.println("Unbalanced brackets");
		}
	}

}
