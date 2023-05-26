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
        
        lista.deleteBegin();
        lista.deleteBegin();
        lista.deleteBegin();
        lista.deleteBegin();
        
        lista.begin(5);
        
        lista.begin_to_Last();
        
    }
    
    
}
