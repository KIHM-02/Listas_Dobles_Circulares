package ldc;

/**
 *
 * @author Kevin Huerta 22310411
 */

public class Main 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        lista.begin(1);
        lista.begin(2);
        lista.begin(3);
        
        lista.begin_to_Last();
       
        
        lista.last(0);
        lista.last(-1);
        
        lista.begin_to_Last();
        
        lista.deleteBegin();
        lista.deleteLast();
        
        lista.begin_to_Last();
        lista.deleteLast();
        lista.deleteLast();
        lista.deleteLast();
        lista.deleteLast();
        
        lista.begin(0);
    }
    
    
}
