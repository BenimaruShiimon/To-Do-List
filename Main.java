package OOP.Collections.ArrayList;

import OOP.Collections.ArrayList.ToDoList.ArraysToDo;
import OOP.Collections.ArrayList.ToDoList.Case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraysToDo arraysToDo = new ArraysToDo();
        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.println("5. Удалить дела по ключевому слову");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 0:
                    System.out.println("Выход из программы!");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("Ваш выбор: " + userChoice);
                    String message = scanner.nextLine();
                    arraysToDo.add(new Case(message));
                    System.out.println("Добавлено!" + "\nВаш список дел: ");
                    arraysToDo.printAll();
                    break;
                case 2:
                    System.out.println("Ваш выбор: " + userChoice);
                    arraysToDo.printAll();
                    break;
                case 3:
                    System.out.println("Ваш выбор: " + userChoice + "\nВведите номер для удаления: ");
                    int number = scanner.nextInt();
                    arraysToDo.remove(number - 1);
                    System.out.println("Ваш список дел: ");
                    arraysToDo.printAll();
                    break;
                case 4:
                    System.out.println("Ваш выбор: " + userChoice + "\nВведите задачу для удаления: ");
                    String nameAffair = scanner.nextLine();
                    arraysToDo.removeAt(nameAffair);
                    System.out.println("\nВаш список дел: ");
                    arraysToDo.printAll();
                    break;
                case 5:
                    System.out.println("Ваш выбор: " + userChoice + "\nВведите задачу для удаления: ");
                    String targetString = scanner.nextLine();
                    arraysToDo.removeAll(targetString);
                    System.out.println("\nВаш список дел: ");
                    arraysToDo.printAll();
            }
        }
    }
}
