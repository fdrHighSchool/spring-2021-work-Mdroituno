public class ArrayTester {
    private int[] result;
    
    public ArrayTester(int[][] arr2D){
        this.result = new int[arr2D.length];
    }

    //Returns an array containing the elements of column c of arr2D in the same order as they appear in arr2D
    public int[] getColumn(int[][] arr2D, int c){
        for(int arr = 0; arr < arr2D.length; arr++){
            System.out.println(arr);
            this.result[arr] = arr2D[arr][c];
        }
        return result;
    }

    // Returns true if and only if every value in arr1 appears in arr2
    public boolean hasAllValues(int[] arr1, int[] arr2){}

    //Returns true if arr contains any duplicate values
    public boolean containsDuplicates(int[] arr){}

    //Returns true if square is a Latin square; false otherwise
    public boolean isLatin(int[][] square){
        if(containsDuplicates(square[0]))
            return false;
        
        for(int i = 0; i < square.length; i++){
            if(!(hasAllValues(square[0], square[i])))
                return false;

            if(!(hasAllValues(square[0], getColumn(square, i))))
                return false;
        }
        return true;
        
    }
    
}
