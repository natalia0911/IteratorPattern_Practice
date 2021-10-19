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
public class Iterator_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estructure ed = new Estructure(5);
        ed.constructMatrix();
        ed.printMatrix();
        IIterator it = ed.getIterator(EnumIterator.COLUMNAS_POR_FILAS);
        while (it.hasNext()){
            System.out.println(it.next());
        //ed.printMatrix();
        /*
        IIterator i = ed.getIterator(EnumIterator.DIAGONAL_INVERTIDA);
        while(i.hasNext()){
            System.out.println(i.next());
        }
        */
        Por_Fila i = (Por_Fila) ed.getIterator(EnumIterator.POR_FILA);
        i.setRow(2);
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}
}
