package dynamicArrays;

public class DynamicArrayRunner {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(1);
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getCapacity());
        dynamicArray.pushback(1);
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getCapacity());
        dynamicArray.pushback(2);
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getCapacity());
        System.out.println(dynamicArray.get(1));
        dynamicArray.set(1, 3);
        System.out.println(dynamicArray.get(1));
        System.out.println(dynamicArray.popback());
        System.out.println(dynamicArray.getSize());
        System.out.println(dynamicArray.getCapacity());
    }
}
