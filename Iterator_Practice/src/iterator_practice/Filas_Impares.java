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
public class Filas_Impares implements IIterator<Integer>{
    
    private Estructure matrix;
    private int i;
    private int j;

    public Filas_Impares(Estructure matrix) {
        this.matrix = matrix;
        i = 1;
        j = 0;
    }
    
    @Override
    public boolean hasNext() {
        int dim = matrix.getDimesion();
        return ( (i > dim && j >= dim) ||  i >= dim)? false:true;
    }

    @Override
    public Integer next() {
        
        int data =  matrix.get(i, j);
        j++;
        if(j == matrix.getDimesion()){
            j = 0;
            i += 2;
        }
        return data;
    }
    
}
