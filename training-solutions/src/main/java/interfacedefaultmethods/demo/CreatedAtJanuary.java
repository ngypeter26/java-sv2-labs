package interfacedefaultmethods.demo;

import java.time.LocalDateTime;

public interface CreatedAtJanuary {
    LocalDateTime getCreatedAt();


    default boolean createdAfter(LocalDateTime dateTime){
        return getCreatedAt().isAfter(dateTime);
    } // így default

   // boolean createdAfter(LocalDateTime dateTime); // így public abstract

//        boolean createdAfter(LocalDateTime dateTime){
//        return getCreatedAt().isAfter(dateTime);
//    }; // így default
}
