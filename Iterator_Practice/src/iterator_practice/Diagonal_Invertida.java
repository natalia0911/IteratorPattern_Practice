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
public class Diagonal_Invertida implements IIterator<Integer>{
    
    private int matrix[][];
    private int i;
    private int j;

    public Diagonal_Invertida(Estructure matrix) {
        this.matrix = matrix.getMatriz();
        this.i = 0;
        this.j = matrix.getDimesion()-1;
    }
    
    @Override
    public boolean hasNext() {
        if (this.i<= this.matrix.length-1 && this.j >= 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Integer next() {
        int value = this.matrix[i][j];
        this.i = i+1;
        this.j = j-1;
        return value;
    }
    
}
