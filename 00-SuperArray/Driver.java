import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray arr1 = new SuperArray(5);
        arr1.add(3);
        arr1.add(5);
        arr1.add(5,2);
        arr1.add(4,4);
        arr1.set(2,7);
        arr1.set(3,1);
        System.out.println(arr1);
        arr1.remove(0);
        System.out.println(arr1);
    }
    
}