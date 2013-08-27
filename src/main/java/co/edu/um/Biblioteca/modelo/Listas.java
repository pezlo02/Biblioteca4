package co.edu.um.Biblioteca.modelo;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 26/08/13
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */

public class Listas {



    public Nodo cab;

    public Listas(){

        cab = new Nodo("programacion");

    }
    public String recorrido(Nodo p){
        String dato = "";
        //String dato_retornado = "";
        while(p != null){

            dato = dato+p.valor+" - ";
            p=p.sig;
        }
        //dato_retornado = dato.substring(0, dato.length()-2);
        return dato;
    }
    public int AdicionarNodoDespues(Nodo p,  String valor){

        try{
            Nodo nuevo = new Nodo(valor);
            nuevo.sig = p.sig;
            p.sig = nuevo;

            return 1;
        }
        catch(Exception e){
            return -1;
        }

    }

    public int AdicionarNodoAntes(Nodo p, String valor){

        try{
            Nodo nuevo = new Nodo(valor);
            nuevo.valor = p.valor;
            nuevo.sig = p.sig;
            p.valor = valor;
            p.sig = nuevo;
            return 1;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
}



