package main.lesson7;

public class MultilevelInheritanceExample {
    public void main(String[] args) {
        C obj = new C();
        obj.display();
    }

    class A {
        void display() {
            System.out.println("A class");
        }
    }

    class B extends A {
        @Override
        void display() {
            super.display();
            System.out.println("B class");
        }
    }

    class C extends B {
        @Override
        void display() {
            super.display();
            System.out.println("C class");
        }
    }

}