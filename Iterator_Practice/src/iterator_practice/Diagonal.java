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
public class Diagonal implements IIterator<Integer>{

    private Estructure matrix;
    int i = 0;

    public Diagonal(Estructure matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public boolean hasNext() {
       return (matrix.getDimesion() > i )? true:false;
    }

    @Override
    public Integer next() {
        int data = matrix.get(i, i);
        i++;
        return data;
    }
    
}
