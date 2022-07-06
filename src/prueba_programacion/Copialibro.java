/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_programacion;

/**
 *
 * @author Lab5
 */
public class Copialibro extends libros {
    private int id;
      private String Estado;

    public Copialibro() {
    }

    public Copialibro(int id, String Estado) {
        this.id = id;
        this.Estado = Estado;
    }

    public Copialibro(int id, String Estado, String nombre, String Autor, String Genero) {
        super(nombre, Autor, Genero);
        this.id = id;
        this.Estado = Estado;
    }
      
     
}
