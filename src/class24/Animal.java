package class24;

public class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak eat methods
     */
    void speak() {
        System.out.println("Animal is speaking");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

    class Cat extends Animal{
        @Override
        void speak() {
            System.out.println("meow meow");
        }

        @Override
        void eat() {
            System.out.println(" cat food");
        }
    }
    class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("Gav Gav");
        }

        @Override
        void eat() {
            System.out.println("Dog food");
        }
    }
    class Bird extends Animal{
        @Override
        void speak() {
            System.out.println("Kry Kry");
        }

        @Override
        void eat() {
            System.out.println("Bird food");
        }
    }

