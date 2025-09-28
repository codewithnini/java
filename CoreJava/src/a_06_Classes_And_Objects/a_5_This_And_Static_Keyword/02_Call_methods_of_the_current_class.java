package a_06_Classes_And_Objects.a_5_This_And_Static_Keyword;
class Students {

 void display() {
  System.out.println("Display method called");
 }

 void show() {
  System.out.println("Show method called");

  // calling current class method
  this.display();  // calls display()

  // can also call directly without this
  display();
 }
}

 class StudentsTest {
 public static void main(String[] args) {
  Students s = new Students();
  s.show();
 }
}

