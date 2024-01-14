package array;
// hybrid inheritence

class C {
    public void display()
    {
        System.out.println("C");
    }
}

class A extends C
{
    public void display()
    {
        System.out.println("A");
    }
}

class B extends C
{
    public void display()
    {
        System.out.println("B");
    }
}

class D extends A
{
    public void display()
    {
        System.out.println("D");
    }

    public static void main(String[] args) {
        D obj= new D();
        obj.display(); // output will shown D taking the latest overriding input
    }
}

