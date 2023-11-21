/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proveedor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pablo Rod
 */
public class ListaProveedores {
    private ArrayList<Proveedor> lista ;
    
    public void agregar (Proveedor prov){
    lista.add(prov);
    
    }
    /**
     * metodo que permite buscarun proveedores en el Arraylist
     * @param codigo coigo del proveedor a buscar
     * @return retorna el proveedor que conincide con el codigo o null
     */
    public Proveedor buscar(int codigo){
        for (Proveedor prov : lista) {
            if (prov.getCodigo()== codigo) {
                return prov;
            }
            
        }
        return null;
    }

    public ArrayList<Proveedor> getLista() {
        return lista;
    }

   
    
}
