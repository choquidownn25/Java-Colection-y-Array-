/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolleciontreeset;

import datos.Producto;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import view.jFrameTreesetColection;

/**
 *
 * @author choqu_000
 */
public class JavaCollecionTreeset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancias de clase de producto              
        jFrameTreesetColection objJFrameTreeCollecion=new jFrameTreesetColection();
        objJFrameTreeCollecion.show();
    }
    
    //Metodo mostrar
    public static void mostrarLista(Collection lista){
        System.out.println("Lista del producto " + lista.size() + " " + "Productos ");
        
        //interacion
        for(Iterator it = lista.iterator(); it.hasNext();){
            Producto producto = (Producto)it.next();
            System.out.println(producto);
        }
    }
    
}
