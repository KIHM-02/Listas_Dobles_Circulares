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
        
        lista.last(1);
        lista.last(2);
        //lista.last(3);
        
        lista.begin_to_Last();
        
        lista.middle(0);
        
        lista.begin_to_Last();
        
        lista.deleteMiddle();
        
        lista.begin_to_Last();
    }
    
    
}
