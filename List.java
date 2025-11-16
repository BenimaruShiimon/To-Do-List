package OOP.Collections.ArrayList.ToDoList;

public interface List {
    void add(Case cas);

    Case get(int index);

    void remove(int index);

    void removeAt(String s);

    void printAll();

    void removeAll(String s);
}