package interfacedefaultmethods.demo;

import java.time.LocalDateTime;

public interface Audited {
    LocalDateTime getCreatedAt();

//    boolean createdAfter(LocalDateTime dateTime); // így jó
//    boolean createdAfter(LocalDateTime dateTime){}; // így nem jó

//    default boolean createdAfter(LocalDateTime dateTime); // így nem jó
    default boolean createdAfter(LocalDateTime dateTime){
        return getCreatedAt().isAfter(dateTime);
    } // így  jó
}
