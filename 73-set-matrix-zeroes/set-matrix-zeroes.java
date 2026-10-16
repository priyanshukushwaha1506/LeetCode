class Solution {
    public void setZeroes(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    boolean firstColHasZero=false;

    //Step1.:Mark indicators in forst row and first column
    for(int i=0;i<row;i++){
        if(matrix[i][0]==0){
            firstColHasZero=true;
        }
        for(int j=1;j<col;j++){
           if(matrix[i][j]==0){
            matrix[i][0]=0;
            matrix[0][j]=0;
           }
        }
    }
    //step2//fill zeroes for inner matrix based on the indicators
    for(int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            if(matrix[i][0]==0||matrix[0][j]==0){
                matrix[i][j]=0;
            }
        }
    }
    //Ste3:Handle First row
    if(matrix[0][0]==0){
        for(int j=0;j<col;j++){
            matrix[0][j]=0;
        }
    }
    //Step 4: Hadle First Column
    if( firstColHasZero==true){
        for(int i=0;i<row;i++){
            matrix[i][0]=0;
        }
    }
    }
}