package ldc;

/**
 *
 * @author kevin Huerta 2P
 */
public class Lista 
{
    private Nodo inicio;
    private Nodo ultimo;
    
    public Lista()
    {
        inicio = null;
        ultimo = null;
    }
    
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        
        return false;
    }
    
    //Seccion de insertar al inicio
    
    public void begin(int dato)
    {
        Nodo nuevo;
        
        if(isEmpty())
        {
            nuevo = new Nodo(null, dato, null);
            inicio = nuevo;
            ultimo = inicio;                                                    //De esta manera nuevo, inicio y ultimo son el mismo y se enlazan a si mismos
            inicio.setSiguiente(ultimo);
            inicio.setPrevio(ultimo);
            System.out.println("Se agrego el dato "+dato+" al nuevo inicio");
        }
        else
        {
            nuevo = new Nodo(ultimo, dato, inicio);
            inicio.setPrevio(nuevo);
            ultimo.setSiguiente(nuevo);
            inicio = nuevo;
            System.out.println("Se agrego el dato "+dato+" al inicio");
        }
    }
    
    public void deleteBegin()
    {
        int counter;
        
        if(isEmpty())
        {
            System.out.println("\nLa lista esta vacia");
        }
        else
        {
            counter = objects_in_list();
            
            if(counter == 1)                                                    //Ahora ya podemos borrar todos los objetos de la lista
            {
                lastDelete();
            }
            else
            {
                inicio = inicio.getSiguiente();
                inicio.setPrevio(ultimo);
                ultimo.setSiguiente(inicio);
                System.out.println("Se ha eliminado el primer dato");
            }
        }
    }
      
    // Seccion de insertar al final
    
    public void last(int dato)
    {
        Nodo nuevo;
        
        if(isEmpty())
        {
            firstAdd(dato);
        }
        else
        {
            nuevo = new Nodo(ultimo, dato, inicio);
            inicio.setPrevio(nuevo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            System.out.println("Se agrego el dato "+dato+" al final");
        }
    }
    
    public void deleteLast()
    {
        int counter;
        
        if(isEmpty())
        {
            System.out.println("\nLa lista esta vacia");
        }
        else
        {
            counter = objects_in_list();
            
            if(counter == 1)
            {
                lastDelete();
            }
            else
            {
                ultimo = ultimo.getPrevio();
                ultimo.setSiguiente(inicio);
                inicio.setPrevio(ultimo);
                System.out.println("\nSe elimino el ultimo dato");
            }
        }
    }
    
    // Seccion de agregar al medio
    
    public void middle(int dato)
    {
        Nodo walker, nuevo;
        int counter;
        
        counter = objects_in_list();
        
        if(counter < 3)
        {
            System.out.println("\nNecesitas al menos "+(3 - counter)+" para agregar al medio\n");
        }
        else
        {
            counter = counter /2;
            walker = inicio;
            
            for(int i = 1; i< counter; i++)
            {
                walker = walker.getSiguiente();
            }
            
            nuevo = new Nodo(walker, dato, walker.getSiguiente());
            walker.setSiguiente(nuevo);
            nuevo.setPrevio(nuevo.getSiguiente());
            System.out.println("\nSe agrego el dato "+dato+ " al medio");
        }
    }
    
    public void deleteMiddle()
    {
        Nodo walker_prev, walker_next;
        int counter;
        
        counter = objects_in_list();
        
        if(counter < 3)
        {
            System.out.println("\nNecesitas al menos "+(3 - counter)+" para borrar al medio\n");
        }
        else
        {
            counter = counter /2;
            walker_prev = inicio;                                               // posicion = a
            walker_next = walker_prev.getSiguiente();                           // posicion = b
            
            for(int i = 1; i< counter; i++)
            {
                walker_prev = walker_prev.getSiguiente(); 
                walker_next = walker_prev.getSiguiente(); 
            }
            
            walker_prev.setSiguiente(walker_next.getSiguiente());
            walker_next = walker_next.getSiguiente();
            walker_next.setPrevio(walker_prev);
            System.out.println("\nSe ha eliminado el dato de en medio");
            
        }
    }
    
    //Metodos que permiten el funcionamiento de las listas
    
    public void firstAdd(int dato)
    {
        Nodo nuevo = new Nodo(null, dato, null);
        inicio = nuevo;
        ultimo = inicio;                                                    //De esta manera nuevo, inicio y ultimo son el mismo y se enlazan a si mismos
        inicio.setSiguiente(ultimo);
        inicio.setPrevio(ultimo);
        System.out.println("Se agrego el dato "+dato+" al nuevo inicio");
    }
    
    public void lastDelete()
    {
        inicio = null;
        ultimo = null;
        System.out.println("Se elimino el ultimo dato de la lista");
    }
    
    public void begin_to_Last()
    {
        Nodo temporal;
        
        if(isEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            temporal = inicio;
            while(temporal != ultimo)
            {
                System.out.print(" "+temporal.getDato());
                temporal = temporal.getSiguiente();
            }
            System.out.print(" "+temporal.getDato()+"\n");
        }
    }
    
    public int objects_in_list()                                                //este metodo me permite evaluar cuantos objetos hay en mi lista
    {
        Nodo temporal;
        int counter = 0;
            
        if(isEmpty())
        {
            return counter;
        }
        else
        {
            temporal = inicio;
            counter = 1;
            while(temporal != ultimo)
            {
                counter++;
                temporal = temporal.getSiguiente();
            }
            
            return counter;
        }
    }
}