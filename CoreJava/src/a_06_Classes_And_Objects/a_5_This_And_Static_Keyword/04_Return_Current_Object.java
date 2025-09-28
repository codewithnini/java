package a_06_Classes_And_Objects.a_5_This_And_Static_Keyword;

  class Car {
   String name;

   Car setName(String name) {
    this.name = name;
    return this;  // returning current object
   }

   Car printName() {
    System.out.println("Car name: " + name);
    return this;  // returning current object
   }
  }

   class Test {
   public static void main(String[] args) {
    Car s = new Car();
    s.setName("BMW").printName();  // method chaining
   }
  }
