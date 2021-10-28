package compositionlist.demo;

import com.sun.jdi.request.ClassUnloadRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainerMain {
    public static void main(String[] args) {
//        Trainer trainer = new Trainer("John Doe");
//        System.out.println(trainer.getAddresses());
//
////        List<Address> addresses = Arrays.asList(
////                new Address("BP","frfaewfaewf"),
////                new Address("Pécs","frfaewfaewf")
////        );          // ez a lista módosíthatatlan
//
//         List<Address> addresses = new ArrayList<>(Arrays.asList(
//                new Address("BP","frfaewfaewf"),
//                new Address("Pécs","frfaewfaewf")
//        ));          // ez a lista módosíthatatlan
//
//        trainer.setAddresses(addresses);
//
//        System.out.println(trainer.getAddresses().get(1).getCity());
//
//        trainer.getAddresses().add(new Address("Szeged","Kárász 10")); // nem működik, mert a lista mmódosíthatatlan
//        System.out.println(trainer.getAddresses().size());
//        System.out.println(trainer.getAddresses().get(2).getCity());

        Trainer trainer = new Trainer("John doe");
       System.out.println(trainer.getAddresses().size());
        System.out.println(trainer.getAddresses());

        trainer.getAddresses().add(new Address("BP","Váci"));  // Így is lehet hozzáadni
        System.out.println(trainer.getAddresses().size());
        System.out.println(trainer.getAddresses().toString());

        trainer.addAddress(new Address("BP2","Váci2"));  // Ez elegánsabb
        System.out.println(trainer.getAddresses().size());
        System.out.println(trainer.getAddresses().toString());


    }
}
