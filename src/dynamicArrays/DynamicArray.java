package dynamicArrays;

public class DynamicArray {

    private int[] array;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.length = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity){
            resize();
        }
        array[length] = n;
        length ++;

    }

    public int popback() {
        //assume that the array is populated
        if (length > 0) {
            length--;
        }
        return array[length];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] resizedArray = new int[capacity];
        for (int i = 0; i < length; i++) {
            resizedArray[i] = array[i];
        }
        array = resizedArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
