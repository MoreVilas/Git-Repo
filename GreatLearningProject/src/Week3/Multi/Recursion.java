package Week3.Multi;

class Recursion{
    int function(int num)
       {
         int result;
         result = function (num - 1);
         return result;
       }
 }
class RecursionImplementation{
    public static void main(String args[]){
        Recursion obj = new Recursion() ;
        System.out.print(obj.function(20));
      }
}
