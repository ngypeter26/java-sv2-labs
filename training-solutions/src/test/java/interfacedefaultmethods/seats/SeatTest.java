package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatTest {

    @Test
    void testSeats(){
        Seat seat1 = new FamilyCar();
        Seat seat2 = new SportsCar();
        Seat seat3 = new Car("Opel",4);

        FamilyCar car1 = new FamilyCar();
        SportsCar car2 = new SportsCar();
        Car car3 = new Car("Opel",4);

        assertEquals(5,seat1.getNumberOfSeats());
        assertEquals(2,seat2.getNumberOfSeats());
        assertEquals(4,seat3.getNumberOfSeats());

        assertEquals(5,car1.getNumberOfSeats());
        assertEquals(2,car2.getNumberOfSeats());
        assertEquals(4,car3.getNumberOfSeats());

    }
}
