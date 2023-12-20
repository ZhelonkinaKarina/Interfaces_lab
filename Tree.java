package interfaces_lab;

//Реалізація інтерфейсу в класі Tree
public class Tree implements Plant {
 private String name;
 private int age;
 private int fruitCount;

 //Конструктор
 public Tree(String name) {
     this.name = name;
     this.age = 0;
     this.fruitCount = 0;
 }

 //Реалізація методу для відображення інформації про дерево
 
 public void displayInfo() {
     System.out.println("Дерево: " + name + ", Вік: " + age + " рік/роки/років, Кількість фруктів: " + fruitCount);
 }

 //Реалізація методу для поливу дерева
 public void water() {
     System.out.println("Полив дерева " + name);
     age++; // з кожним поливом дерево росте на рік
     growFruits(); // росте фрукти після поливу
 }

 //Реалізація методу для вирощування фруктів
 public void growFruits() {
     if (age >= 2) {
         fruitCount += 5; //За два роки дерево починає ростити фрукти
         System.out.println("Дерево виростило 5 фруктів!");
     }
 }
}
