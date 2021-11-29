package immutable;

public class Car {
    private final String brand;
    private final String type;
    private final int manufactureYear;

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public Car(String brand, String type, int manufactureYear) {
        if (new BrandValidator().isBrandValid(brand) ) {
            this.brand = brand;
        }else{
            throw new IllegalArgumentException("Invalid name");
        }
        this.type = type;
        if (new YearValidator().isYearValid(manufactureYear)) {
            this.manufactureYear = manufactureYear;
        }else{
            throw new IllegalArgumentException("Invalid year");
        }
    }
}
