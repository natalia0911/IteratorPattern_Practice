/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_practice;

/**
 *
 * @author Natalia
 */
public class Por_Columna implements IIterator<Integer>{

    private int column;
    private int row;
    private int matrix[][];

    public Por_Columna(Estructure matrix) {
        this.matrix = matrix.getMatriz();
        this.row = 0;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public boolean hasNext() {
        if (this.row <= this.matrix.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Integer next() {
        int value = this.matrix[this.row][this.column];
        this.row = row+1;
        return value;
    }

 
    
}
