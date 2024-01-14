// package array;
// hierachical inheritence

/**
 * Cat
 */
interface Cat { // abstract method
    public void sound();
}

/**
 * Rabbit
 */
interface Rabbit {
    public void weep();
}

class Animal implements Cat, Rabbit
{
    public void sound() {System.out.println("Meow");}
    public void weep() {System.out.println("Weep");}
    public void eat() {System.out.println("eating");}
}

class HierachicalInheritence {
    public static void main(String[] args) {
        Animal a= new Animal();

        a.eat();
        a.sound();
        a.weep();
    }
}
