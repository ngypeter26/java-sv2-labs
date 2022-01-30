package clone;

import java.time.LocalDateTime;

//public class AuctionClonable implements Cloneable{
public class AuctionClonable {

    private int price;

    public AuctionClonable(int price) {
        this.price = price;
    }

    public AuctionClonable(AuctionClonable auction) {
        this.price = auction.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}