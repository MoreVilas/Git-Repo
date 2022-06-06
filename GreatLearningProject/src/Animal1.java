class Animal1{
 private int age;
 
 public int getAge(){
 return age;
 }
 public void setAge(int age){
 this.age = age;
 }
 }
 class main{
 public static void Main(String args[]){
 
 Animal1 a1= new Animal1();
 a1.setAge(12);
 System.out.println("Animal age is"+a1.getAge());
 }
 }
