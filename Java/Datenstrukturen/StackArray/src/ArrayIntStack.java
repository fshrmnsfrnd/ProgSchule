import java.lang.reflect.Array;
import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayIntStack implements IntegerStack {
    private int[] legacyStack = new int[1];

    @Override
    public boolean isEmpty(){
        if (legacyStack == null) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int peek() {
        return legacyStack[0];
    }

    @Override
    public int pop() {
        if(isEmpty()) return -1;
        int lastValue = legacyStack[legacyStack.length - 1];
        int[] arr_new = new int[legacyStack.length-1];
        for(int i=0; i < legacyStack.length; i++){
            arr_new[i] = legacyStack[i];
        }
        legacyStack = arr_new;
        return lastValue;
    }

    @Override
    public void push(int item) {
        int[] arr_new = new int[legacyStack.length];
        for(int i=0; i < legacyStack.length-1; i++){
            arr_new[i] = legacyStack[i];
        }
        arr_new[arr_new.length-1] = item;
        legacyStack = arr_new;
    }
}
