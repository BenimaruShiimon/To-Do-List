package OOP.Collections.ArrayList.ToDoList;

import java.util.Objects;

public class Case {
    String text;

    public Case(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false; //переопределил equals для корректного сравнивания по тексту далее
        Case aCase = (Case) o;
        return Objects.equals(text, aCase.text);
    }
}
