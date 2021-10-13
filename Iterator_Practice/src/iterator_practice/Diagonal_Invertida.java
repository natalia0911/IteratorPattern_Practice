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
    
    private Estructure matrix;
    int i = 0;
    int j = 0;

    public Diagonal_Invertida(Estructure matrix) {
        this.matrix = matrix;
        i = matrix.getDimesion() - 1 ;
    }
    
    @Override
    public boolean hasNext() {
        return ( i>=0  )? true:false;
    }

    @Override
    public Integer next() {
        int data = matrix.get(i, i);
        i--;
        return data;
    }
    
}
