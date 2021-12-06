package defaultconstructor.date;

public class SimpleDateFormatter {
    public static final String SEPARATOR = "-";
    private CountryCode defaultCountry;

    public SimpleDateFormatter(){
        this.defaultCountry = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(CountryCode.HU,simpleDate);
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        switch (countryCode) {
            case HU:
                return simpleDate.getYear() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getDay();
            case EN:
                return simpleDate.getDay() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getYear();
            default:
                return simpleDate.getMonth() + SEPARATOR + simpleDate.getDay() + SEPARATOR + simpleDate.getYear();
        }
    }
}
