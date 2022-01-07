package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableClothTest {

    @Test
    void testTableCloth(){
        double a = 3;
        Square sqr = new TableCloth(a);
        assertEquals(a,sqr.getSide());
        assertEquals(a*a,sqr.getArea());
        assertEquals(4*a,sqr.getPerimeter());
        assertEquals(1.41421356237*a,sqr.getLengthOfDiagonal(),0.00001);
        assertEquals(4,sqr.getNumberOfSides());

        TableCloth tbl = new TableCloth(a);
        assertEquals(a,tbl.getSide());
        assertEquals(a*a,tbl.getArea());
        assertEquals(4*a,tbl.getPerimeter());
        assertEquals(1.41421356237*a,tbl.getLengthOfDiagonal(),0.00001);
        assertEquals(4,tbl.getNumberOfSides());
    }
}
