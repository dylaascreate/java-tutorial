package array;
// multilevel inheritence

class animal {
    void eat() {System.out.println("eating");}
}

class Cat extends animal {
    void sound() {System.out.println("Meow");}
}
class Kitten extends Cat {
    void weep() {System.out.println("Weep");}
}

class MultilevelInheritence 
{
    public static void main(String[] args) {
        Kitten k= new Kitten();

        k.eat();
        k.sound();
        k.weep();
    }
}
