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
    
    public boolean inicioIsEmpty()
    {
        if(inicio == null)
            return true;
        
        return false;
    }
    
    public boolean ultimoIsEmpty()
    {
        if(ultimo == null)
            return true;
        return false;
    }
    
    //Seccion de insertar al inicio
    
    public void begin(int dato)
    {
        Nodo nuevo;
        
        if(inicioIsEmpty())
        {
            nuevo = new Nodo(null, dato, null);
            inicio = nuevo;
            inicio.setSiguiente(inicio);
            nuevo.setPrevio(inicio);
            System.out.println("Se agrego el dato "+dato+" al inicio");
        }
        else
        {
            if(ultimoIsEmpty())
            {
                nuevo = new Nodo(inicio, dato, inicio);
                ultimo = nuevo;
                inicio.setSiguiente(ultimo);
                inicio.setPrevio(ultimo);
                System.out.println("Se ha agregado el dato "+dato);
            }
            else
            {
                
            }
        }
    }
    
    
    
    
    
}
