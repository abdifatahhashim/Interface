package Interface;

public interface animal {
    public interface Animal {
        
    }
    public class Dog implements Animal {


        public void bark() {
            System.out.println("Dog is barking!");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.bark();
        }
    }

}

