package OOP.Collections.ArrayList.ToDoList;

public class ArraysToDo implements List {
    private static int size = 0;
    private final Case[] array = new Case[10];

    @Override
    public void add(Case cas) {
        array[size] = cas;
        size++;
    }

    @Override
    public Case get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }


    @Override
    public void remove(int index) {
        if (array[index] == null) {
            System.out.println("Дела по такому номеру в списке нет!");
            return;
        }
        for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        System.out.println("Удалено!");
        size--;
    }

    @Override
    public void removeAt(String s) {
        boolean searchElement = true;
        if (!searchElement) {
            System.out.println("Дела по такому тексту не найдено!");
        }
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i].getText())) {
                remove(i);
            }
        }
    }

    @Override
    public void printAll() {
        if (size == 0) {
            System.out.println("Список дел пуст!");
        }
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + array[i].getText());
        }
    }

    @Override
    public void removeAll(String s) {
        String search = s.toLowerCase();
        for (int i = size - 1; i >= 0; i--) { //идем с конца списка, потому что в обычном варианте i++ список сдвигает вправо и можно пропустить задачу
            if (array[i].getText().toLowerCase().contains(search)) {
                remove(i);
            }
        }
    }
}

