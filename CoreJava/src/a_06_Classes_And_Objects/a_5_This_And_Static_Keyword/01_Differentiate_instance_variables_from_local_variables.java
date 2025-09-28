package a_06_Classes_And_Objects.a_5_This_And_Static_Keyword;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // left: instance variable, right: constructor parameter
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Nini", 24);
        s1.display();
    }
}
