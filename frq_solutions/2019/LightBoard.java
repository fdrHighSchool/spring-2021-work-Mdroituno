public class LightBoard {
    private boolean[][] lights;

    // constructs a LightBoard
    public LightBoard(int numRows, int numCols){
        this.lights = new boolean[numRows][numCols];
        for(int row = 0; row < numRows; row++ ){
            for(int col = 0; col < numCols; col++){
                this.lights[row][col] = (Math.random() <= 0.4); 
            }//end for col
        }//end for row
    }//end contructor method

    // Evaluates a light in row index row and column index col and returns a status    
    public boolean evaluateLight(int row, int col){
        if(lights[row][col] == true){
            int countT = 0;
            for(int i = 0; i < lights.length; i++){
                if(lights[i][col])
                    countT++;
            }
            if(countT%2 == 0){
                return false;
            }
        }

        if(lights[row][col] == false){
            int countT = 0;
            for(int i = 0; i < lights.length; i++){
                if(lights[i][col])
                    countT++;
            }
            if(countT%3 == 0){
                return true;
            }
        }

        return lights[row][col];
    }   
}//end class
