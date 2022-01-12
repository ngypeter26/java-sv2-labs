package collectionsequalshash.trainer;

import java.util.Objects;

public class Trainer {

    private String id;

    private String name;

    // Konstruktorok és getterek


    public Trainer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Trainer(String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Trainer trainer = (Trainer) o;
//        return Objects.equals(id, trainer.id);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(id, trainer.id) && Objects.equals(name, trainer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


//    @Override
//    public boolean equals(Object obj) {
//        if(obj ==null ){
//            return false;
//        }
//        if (obj.getClass() != Trainer.class){
//            return false;
//        }
//        if(this.name == null){
//            return false;
//        }
//        return this.name.equals(((Trainer) obj).name) &&
//                this.id.equals(((Trainer) obj).id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name,id);
//    }
}