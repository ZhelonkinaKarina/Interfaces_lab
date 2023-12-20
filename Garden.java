package interfaces_lab;

public class Garden {
    public static void main(String[] args) {
        //Створення об'єкта дерева
        Tree appleTree = new Tree("Яблуня");

        //По поливу дерево росте та вирощує фрукти
        appleTree.water();
        appleTree.displayInfo();

        //Повторний полив та вивід інформації
        appleTree.water();
        appleTree.displayInfo();
    }
}
