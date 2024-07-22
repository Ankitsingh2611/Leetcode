// package basics;

// import encapsulation.Encapsulation;

// public class mainClass {

// public static void main(String[] args) {
// System.out.println("Hello World");

// Person p1 = new Person();
// p1.age = 26;
// p1.name = "Ankit";
//
// Person p2 = new Person(31, "Arpita");
// p2.age = 16;
// p2.name = "Arpit";

// System.out.println(p1.age +" "+ p1.name);
// System.out.println(p2.age +" "+ p2.name);

// p1.eat();
// p2.walk(500);
// System.out.println(Person.count);

// Developer d1 = new Developer(23, "Ankit");
// Person p1 = d1;
// d1.walk();

// Encapsulation obj = new Encapsulation();
// obj.doWork();

// }
// }

// class Developer extends Person {
// public Developer (int age, String name) {
// super(age, name);
// }
// }

// class Person {
// // String name;
// protected String name;

// int age;

// static int count;

// public Person() {
// count ++;
// System.out.println("creaing an object");
// }

// public Person(int age, String name) {
// //this();
// this.name = name;
// this.age = age;
// }

// void walk() {
// System.out.println(name + " is walking");
// }
// void eat() {
// System.out.println(name + " is eating");
// }
// void walk(int steps) {
// System.out.println(name +" walked "+ steps +" steps");
// }

// void doWork() {
// System.out.println("Person is working");
// }
// }