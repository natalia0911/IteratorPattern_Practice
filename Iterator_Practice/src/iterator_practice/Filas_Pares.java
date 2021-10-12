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
public class Filas_Pares implements IIterator<Filas_Pares>{
    
    private Estructure matrix;

    public Filas_Pares(Estructure matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Filas_Pares next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
