package interfacedefaultmethods.demo;

import java.time.LocalDateTime;

public class Account implements Audited, CreatedAtJanuary{

    // , CreatedAtJanuary így névütközés van, nem tudja, melyik kell -> override
    private LocalDateTime localDateTime;

    public Account(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return localDateTime;
    }
    // nem implementáltuk a createdAfter-t de mégis meg tudom hívni


    @Override
    public boolean createdAfter(LocalDateTime dateTime) {
        return Audited.super.createdAfter(dateTime);
    }
}
