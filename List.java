package OOP.Collections.ArrayList.ToDoList;

public interface List <Case>{
    void add(Case cas);

    Case get(int index);

    void remove(int index);

    void removeAt(String text);

    void printAll();

    void removeAll(String text);
}