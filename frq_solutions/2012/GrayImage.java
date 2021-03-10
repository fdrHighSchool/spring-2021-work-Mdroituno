public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    // The 2D representation of this image
    private int[][] pixelValues;

    // return the total number of white pixels in this image
    public int countWhitePixels(){
        int countWhite = 0;
        for(int row : pixelValues){
            for(int col : pixelValues[i]){
                if(pixelValues[row][col] == WHITE)
                    countWhite++;
            }//for col
        }//for row
        return countWhite;
    }//end method

    public void processImage(){
        for(int row : pixelValues){
            for(int col : pixelValues[i]){
                if((row+2 < pixelValues.length) && (col+2 < pixelValues[row].length)){
                    pixelValues[row][col] -= pixelValues[row+2][col+2];
                    if(pixelValues[row][col] < BLACK){
                        pixelValues[row][col] = BLACK;
                    }// if < BLACK
                }// if (row+2, col+2) exists
            }//for col
        }//for row
    }//end method
}
