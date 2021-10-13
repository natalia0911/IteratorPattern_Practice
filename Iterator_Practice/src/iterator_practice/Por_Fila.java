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
public class Por_Fila implements IIterator<Integer>{
    
    private int column;
    private int row;
    private int matrix[][];

    public Por_Fila(Estructure matrix) {
        this.matrix = matrix.getMatriz();
        this.column = 0;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    @Override
    public boolean hasNext() {
        if (this.column <= this.matrix.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Integer next() {
        int value = this.matrix[this.row][this.column];
        this.column = column+1;
        return value;
    }
    
}
