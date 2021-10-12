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
public class Diagonal implements IIterator<Diagonal>{

    private Estructure matrix;

    public Diagonal(Estructure matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Diagonal next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
