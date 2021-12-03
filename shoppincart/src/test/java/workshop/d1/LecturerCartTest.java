package workshop.d1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LecturerCartTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
        Cart cart = new Cart();
        cart.addItem("durian");
        cart.addItem("mango");
        assertTrue(cart.numberOfItemsInCart() == 2);
        System.out.println("Assertion size = 2");
    }
    @Test
    public void testDelete(){
        Cart cart = new Cart();
        cart.addItem("durian");
        cart.addItem("mango");
        cart.deleteItem(1);
        assertTrue(cart.numberOfItemsInCart() == 1);
        System.out.println("Assertion size = 1 after delete");
    }
    @Test
    
}