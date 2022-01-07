package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces){
            return price * pieces * 0.8;
        }
    },
    BLACK_FRIDAY_OFFER{
        @Override
        public double getAmountToPay(int price, int pieces){
            if (0<pieces &&pieces<=2){
                return price * pieces * 0.75;
            } else if (3<=pieces){
                return price * (pieces-1) * 0.75 + price * 0.5;
            }else {
                return 0;
            }
        }
    };


    public abstract double  getAmountToPay(int price, int pieces);
}
