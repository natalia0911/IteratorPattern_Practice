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
public class Columnas_Pares implements IIterator<Columnas_Pares>{

    private Estructure matrix;

    public Columnas_Pares(Estructure matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Columnas_Pares next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
