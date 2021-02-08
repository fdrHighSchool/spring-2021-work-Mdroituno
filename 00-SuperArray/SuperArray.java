import java.util.Arrays;

public class SuperArray {
    //instance variables
    private int[] array;

    //constructors
    public SuperArray(int size){
        this.array = new int[size];
    }//end constructor method

    public SuperArray(){
        this.array = new int[10];
    }//end constructor method

    //other methods

    public void add(int value){
       int size = this.array.length;

       for(int i = 0; i < size; i++){
           if(this.array[i] == 0){
               this.array[i] = value;
               return;   
            }   
        }

       grow(1);
       this.array[size] = value;
       return;
    }//end add method

    public void add(int index, int value){
        int size = this.array.length;

        if((size - index) < 1)
            grow(1);

        this.array[index] = value;
    }//end add method

    public void grow(int n){
        int size = this.array.length;

        int[] array2 = new int[size+n];
        for(int i = 0; i < this.array.length; i++){
            array2[i] = this.array[i];
        }//end for
        this.array = array2;
    }//end grow method

    public void set(int i, int val){
        this.array[i] = val;
    }//end set method

    public boolean isEmpty(){
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i] != 0)
                return false;
        }
        return true;
    }//end isEmpty method

    public void remove(int index){
        int size = this.array.length;
        int[] temp = new int[size - 1];

        for(int i = 0; i < (size - 1); i++){
            if(i == index){
                for(int j = i; j < size-1; j++)
                    temp[j] = this.array[j + 1];
                break;
            }//end if

            temp[i] = this.array[i];
        }//end for(i)
        this.array = temp;
    }//end remove method

    public int getLength(){
        return this.array.length;
    }//end getLength method

    public int getInt(int i){
        return this.array[i];
    }//end getInt method
    
    public String toString(){
        return Arrays.toString(this.array);
    }//end toString method
}
