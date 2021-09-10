import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpsTest {
    @Test
    public void testSuma(){
        Ops operaciones = new Ops();
        assertEquals(2, operaciones.add(1,1));
    }

    @Test
    public void testProducto(){
        Ops op= new Ops();
        assertEquals(9, op.product(4.5F,2));
    }
    @Test
    public void testDiv(){
        Ops op = new Ops();
        assertEquals(9, op.divide(18,2));
    }
}
