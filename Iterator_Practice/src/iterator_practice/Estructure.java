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
public class Estructure implements Aggregate<Estructure>{

    private int matriz[][];
    private int dimesion;

    public Estructure(int dimesion) {
        this.dimesion = dimesion;
        this.matriz =  new int[dimesion][dimesion];
    }

    public int getDimesion() {
        return dimesion;
    }

    public void setDimesion(int dimesion) {
        this.dimesion = dimesion;
    }
    
    public void constructMatrix(){
        for (int i=0; i<this.dimesion; i++){
            for (int j=0; j<this.dimesion; j++){
                this.matriz[i][j] = i;
            }
        }
    }
    
    public void printMatrix(){
        for (int i=0; i<this.dimesion; i++){
            String fila = "";
            for (int j=0; j<this.dimesion; j++){
                 fila += this.matriz[i][j] + "\t";
            }
            System.out.println(fila);
        }
    }
    
    @Override
    public IIterator getIterator(EnumIterator ed) {
        return IteratorFactory.getIterator(ed, this);
    }
    
    public int get(int linea, int columna){
        return matriz[linea][columna];
    }
}
