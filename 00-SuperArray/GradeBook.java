public class GradeBook {
    SuperArray exams;
    //constructors
    public GradeBook(){
        this.exams = new SuperArray();
    }//end constructor method

    public GradeBook(int size){
        this.exams = new SuperArray(size);
    }//end constructor method

    public int average(){
        int size = this.exams.getLength();
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += exams.getInt(i);
        }//end for loop
        return sum/size;  
    } //end average method

    public void enterGrade(int grade){
        exams.add(grade);
    }//end enterGrade method

    public void dropLowest(){
        int size = this.exams.getLength();
        int lowestIndex = 0; 
        for(int i = 0; i<size; i++){
            if(this.exams.getInt(i) < this.exams.getInt(lowestIndex)){
                lowestIndex = i;
            }
        }
        this.exams.remove(lowestIndex);
    }//end dropLowest method
    
    public void showGrades(){
        System.out.println(this.exams);
    }//end showGrades method
}
