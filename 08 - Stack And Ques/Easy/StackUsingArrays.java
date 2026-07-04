import java.util.ArrayList;
import java.util.List;

public class StackUsingArrays {
    public static void main(String[] args) {
        Stack<Integer> stc = new Stack(10) ;

      for (int i = 0; i < 10; i++) {
        stc.push(i*12);
      }

      stc.pop();
      stc.pop();
      stc.pop();
      stc.pop();

      System.out.println(stc.peek());
    }
}

class Stack<T> {
    private Object[] arr;
    private int k = -1;

    Stack(int capacity) {
        arr = new Object[capacity];
    }

    public void push(T value) {
        if (k == arr.length - 1) {
            throw new RuntimeException("Stack overflow");
        }

        arr[++k] = value;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (k == -1) {
            throw new RuntimeException("Stack underflow");
        }

        T value = (T) arr[k];
        arr[k] = null; // helps garbage collection
        k--;

        return value;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (k == -1) {
            throw new RuntimeException("Stack is empty");
        }

        return (T) arr[k];
    }

    public boolean isEmpty() {
        return k == -1;
    }
}