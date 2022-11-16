package unitTesting.intro.src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import unitTesting.intro.src.main.Main;

public class checkoutTest {
    
    @Test
    public void subtotalIsValid(){
        assertEquals(19.2, Main.getSubtotal());
    }
}
