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
public class Columnas_Impares implements IIterator<Columnas_Impares>{

    private Estructure matrix;

    public Columnas_Impares(Estructure matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Columnas_Impares next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
