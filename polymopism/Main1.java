// date: 17/1/2024
// polymorphism - practice overloading 

class Learn { //superclass
    public void display() {
        System.out.println("Learn is fun!");
    }
}

class Dynamic extends Learn { 
    public void display() {
        super.display();
        System.out.println("Dynamic Learning");
        
    }
}

class Passive extends Dynamic { 
    public void print() {
        System.out.println("Passive Learning");
        
    }
}

class Interactive extends Passive { 
    public void print() {
        Passive p = new Passive();
        p.print();
        System.out.println("Interactive Learning");
        
    }
}

public class Main1 {
    public static void main (String [] args) {
        Interactive i = new Interactive();
        i.display();
        i.print();
    }
}