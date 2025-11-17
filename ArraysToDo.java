package OOP.Collections.ArrayList.ToDoList;

import java.util.ArrayList;


public class ArraysToDo implements List<Case> {
    private ArrayList<Case> toDoList = new ArrayList<>();

    @Override
    public void add(Case cas) {
        toDoList.add(cas);
    }

    @Override
    public Case get(int index) {
        if (index < 0 || index >= toDoList.size()) {
            throw new IndexOutOfBoundsException();
        }
        return toDoList.get(index);
    }


    @Override
    public void remove(int index) {
        if (toDoList.isEmpty()) {
            System.out.println("Дела по такому номеру в списке нет!");
            return;
        }
        toDoList.remove(index);
        System.out.println("Удалено!");
    }

    @Override
    public void removeAt(String text) {
        boolean searchElement = false;
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).getText().equals(text)) {
                remove(i);
                searchElement = true;
                break;
            }
        }
            if (!searchElement) {
                System.out.println("Дела по такому тексту не найдено!");
            }
    }

    @Override
    public void printAll() {
        if (toDoList.isEmpty()) {
            System.out.println("Список дел пуст!");
        }
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i).getText());
        }
    }

    @Override
    public void removeAll(String text) {
        String search = text.toLowerCase();
        for (int i = toDoList.size() - 1; i >= 0; i--) { //идем с конца списка, потому что в обычном варианте i++ список сдвигает вправо и можно пропустить задачу
            if (toDoList.get(i).getText().toLowerCase().contains(search)) {
                remove(i);
            }
        }
    }
}

