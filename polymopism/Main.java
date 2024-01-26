// date: 17/1/2024
// polymorphism - practice overloading 

class Data { //superclass
    public void data1() {
        System.out.println("No parameter method");
    }
}

class Data2 extends Data { //Data2 subclass
    public void data1() {
        super.data1();
        System.out.println("Single parameter");
        
    }
}

public class Main {
    public static void main (String [] args) {
        Data2 d2 = new Data2();
        d2.data1();
    }
}

