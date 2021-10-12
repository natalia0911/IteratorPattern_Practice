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
public class Por_Columna implements IIterator<Por_Columna>{

    private int column;
    private Estructure matrix;

    public Por_Columna(Estructure matrix) {
        this.matrix = matrix;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Por_Columna next() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

 
    
}
