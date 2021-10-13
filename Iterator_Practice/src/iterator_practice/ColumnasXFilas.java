/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_practice;

/**
 *
 * @author lalem
 */
public class ColumnasXFilas implements IIterator<Integer>{

    private Estructure matrix;
    private int i;
    private int j;


    public ColumnasXFilas(Estructure matrix) {
        this.matrix = matrix;
        i = 0;
        j = 0;
    }

    @Override
    public boolean hasNext() {
        return (i >= matrix.getDimesion())? false:true;
    }

    @Override
    public Integer next() {
        
        int data =  matrix.get(i, j);
        j++;
        if(j == matrix.getDimesion()){
            j = 0 ;
            i++;
        }
        return data;
    }


    
}
