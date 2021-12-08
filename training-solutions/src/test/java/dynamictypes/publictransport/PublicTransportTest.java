package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicTransportTest {

    @Test
    void testVehicle() {
        PublicVehicle bus = new Bus(7, 25.2, "Volvo");
        PublicVehicle tram = new Tram(41, 35.2, 2);
        PublicVehicle metro = new Metro(4, 56.4, 12);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3,publicTransport.getPublicVehicles().size());
    }

}
