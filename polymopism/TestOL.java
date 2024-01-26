// date: 17/1/2024
// polymorphism - practice overloading 

class Added {
    static int add(int a, int b) {
       return a+b;
    }

    static double add(double a, double b) {
       return a+b;
    }

}
 
class TestOL {
   public static void main (String [] args) {
       System.out.println(Added.add(11,11)); // proses di atas
       System.out.println(Added.add(2.5,2.6));
   }
}
