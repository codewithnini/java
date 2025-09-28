package a_06_Classes_And_Objects.a_5_This_And_Static_Keyword;


class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // method that accepts a Animal object
    void printDetails(Animal s) {
        System.out.println("Animal Name: " + s.name);
    }

    // method that passes current object
    void display() {
        printDetails(this);  // passing current object
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal s1 = new Animal("Tiger");
        s1.display();
    }
}

