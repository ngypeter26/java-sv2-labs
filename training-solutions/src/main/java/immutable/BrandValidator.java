package immutable;

public class BrandValidator {
    public boolean isBrandValid(String brand) {
        if (brand!=null && brand.trim().length()>0) {
            return true;
        }else{
            throw new IllegalArgumentException("Invalid name");
        }
    }
}
