import java.util.*;
class stack<T> {
    ArrayList<T> A;
    int top = -1;
    int size;
    stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }
    void push(T X)
    {
        if (top + 1 == size) {
            System.out.println("Stack day");
        }
        else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }
    T top()
    {
        if (top == -1) {
            System.out.println("Stack trong");
            return null;
        }
        else
            return A.get(top);
    }
    void pop()
    {
        if (top == -1) {
            System.out.println("Stack trong");
        }
        else
            top--;
    }
    boolean empty() { return top == -1; }
    @Override
    public String toString()
    {
        String element = "";
        for (int i = 0; i < top; i++) {
            element += String.valueOf(A.get(i)) + "->";
        }
        element += String.valueOf(A.get(top));
        return element;
    }
}
