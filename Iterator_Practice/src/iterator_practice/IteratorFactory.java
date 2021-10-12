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
public class IteratorFactory {
    
    public static IIterator getIterator(EnumIterator enumI,Estructure ed){
        
        switch(enumI){
            case DIAGONAL:
                return new Diagonal(ed);
            case DIAGONAL_INVERTIDA:
                return new Diagonal_Invertida(ed);
            case POR_FILA:
                return new Por_Fila(ed);
            case POR_COLUMNA:
                return new Por_Columna(ed);
            case FILAS_PARES:
                return new Filas_Pares(ed);
            case FILAS_IMPARES:
                return new Filas_Impares(ed);
            case COLUMNAS_PARES:
                return new Columnas_Pares(ed);
            case COLUMNAS_IMPARES:
                return new Columnas_Impares(ed);
            default:  
                throw new IllegalArgumentException("EnumIterator do not exist");
        }
    }
}
