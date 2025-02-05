import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class AppTest {

    @BeforeAll
        static void setUpBeforeClass() throws Exception {
            System.out.println("Empezando tests");
        } 
    @AfterAll
        static void tearDownAfterClass() throws Exception {
            System.out.println("Terminando tests");
        }       
    

    @Test
    public void testMain() {
        // Arrange
       // ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       // System.setOut(new PrintStream(outContent));

        // Act
        

        // Assert
        assertEquals(15, App.multiplicar(3, 5));
        assertEquals(2, App.dividir(10, 5));
        assertEquals(8, App.sumar(3, 5));
        assertEquals(2, App.restar(5, 3));  
        assertEquals(0, App.calculadora(0, 4, 4));
        assertEquals(7, App.calculadora(7, 1, 4)); 
        assertEquals(0, App.calculadora(1, 2, 4));
        assertThrows(ArithmeticException.class, () -> App.dividir(5, 0)); 
       // System.out.println("Terminando tests 2");

       // Igual pero con arrays
       int [] valoresp = {15, 2, 8, 2, 0, 7, 0};
       int [] vecnum1 = {3, 10, 3, 5, 0, 7, 1};
       int [] vecnum2 = {5, 5, 5, 3, 4, 1, 2};
       int [] vecop = { 4, 4, 4};

         for (int i = 0; i < vecop.length; i++) {
              assertEquals(valoresp[i+4], App.calculadora(vecnum1[i+4], vecnum2[i+4], vecop[i]));
         }  



    }
}