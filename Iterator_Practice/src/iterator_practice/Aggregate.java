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

public interface Aggregate<T> {       
    public IIterator<T> getIterator(EnumIterator ed);   
}
