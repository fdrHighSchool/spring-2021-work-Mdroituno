public class Driver {
    public static void main(String[] args) {
        SuperArray arr1 = new SuperArray(5);
        arr1.add(3);
        arr1.add(5);
        arr1.add(5,2);
        arr1.add(4,4);
        arr1.set(2,7);
        arr1.set(3,1);
        arr1.add(6);
        System.out.println(arr1);
        arr1.remove(2);
        System.out.println(arr1);

        SuperArray arr2 = new SuperArray();
        arr2.grow(3);
        System.out.println(arr2);
        System.out.println(arr2.isEmpty());;
        arr2.set(8, 9);
        System.out.println(arr2.isEmpty());
        System.out.println(arr2);
    }
    
}
