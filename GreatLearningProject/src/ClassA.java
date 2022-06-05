
public class ClassA {

	public ClassA() {
        System.out.println("default constructor");
    }

    public ClassA(int a){
        System.out.println("Parameterized constructor with int argument "+a);
    }

    public ClassA(char a){
        System.out.println("Parameterized constructor with char argument "+a);
    }

    public static void main(String args[]){
        ClassA classA = new ClassA('1');
        classA = new ClassA(1);
    }
}
