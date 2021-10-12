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
public class Por_Fila implements IIterator<Por_Fila>{
    
    private int row;
    private Estructure matrix;

    public Por_Fila(Estructure matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Por_Fila next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
