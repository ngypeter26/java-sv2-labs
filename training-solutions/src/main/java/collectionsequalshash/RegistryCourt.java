package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies= new ArrayList<>();

        Company company1 = new Company("Kiss Bt","123456");
        Company company2 = new Company("Nagy Bt","5417651615");
        Company company3 = new Company("Közepes Kft","541554");
        Company company4 = new Company("Senki EV","541465");




        companies.add(company1);
        companies.add(company2);
        companies.add(company3);
        companies.add(company4);

        System.out.println(companies.contains(new Company("Nagy Bt", "5417651615")));



    }
}
