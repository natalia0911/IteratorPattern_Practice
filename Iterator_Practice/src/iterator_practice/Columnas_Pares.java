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
public class Columnas_Pares implements IIterator<Integer>{

    private Estructure matrix;
    private int i;
    private int j;

    
    public Columnas_Pares(Estructure matrix) {
        this.matrix = matrix;
        i = 0;
        j = 0;
    }
    
    @Override
    public boolean hasNext() {
        int dim = matrix.getDimesion();
        return ( (i > dim && j >= dim) ||  j >= dim)? false:true;
    }

    @Override
    public Integer next() {
        int data =  matrix.get(i, j);
        i++;
        if(i == matrix.getDimesion()){
            i = 0 ;
            j+=2;
        }
        return data;
    }
    
}
