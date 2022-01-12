package nestedclasses.query;

import java.util.List;

public class TrainerQuery {

    private List<Trainer> trainers;
    private String name;



    public TrainerQuery(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Trainer findFirst(Criteria criteria){
        for (Trainer trainer: trainers){
            if(criteria.test(trainer)){
                return trainer;
            }
        }
        throw new IllegalArgumentException("Cannot find trainer");
    }

    public interface Criteria{
        boolean test(Trainer trainer);
    }

//    //    Member inner class de ez mehet metóduson belül is
//    public Trainer findFirstByName(String name){
//        this.name = name;
//        return findFirst(new NameCriteria());
//    }
//    public class NameCriteria implements Criteria {
//        @Override
//        public boolean test(Trainer trainer) {
//            return trainer.getName().equals(name);
//        }
//    }


    // local inner class
//    public Trainer findFirstByName(String name){
//        this.name = name;
//        //local inner class
//        class NameCriteria implements Criteria {
//            @Override
//            public boolean test(Trainer trainer) {
//                return trainer.getName().equals(name);
//            }
//        }
//        return findFirst(new NameCriteria());
//    }

    // anonymus inner class, a fordító generál neki nevet
//    public Trainer findFirstByName(String name){
//        // anonymus inner class, a fordító generál neki nevet
//        return findFirst(new Criteria() {
//            @Override
//            public boolean test (Trainer trainer){
//                return trainer.getName().equals(name);
//            }
//        });
//    }

    //    //   Static nested class: így újrafelhasználható
    public Trainer findFirstByName(String name){
        this.name = name;
        return findFirst(new NameCriteria(name));
    }
    // static, így nem fér hozzá a name attributumhoz, így konstuktorral adom meg
    public static class NameCriteria implements Criteria {
        private String name;

        public NameCriteria(String name) {
            this.name = name;
        }

        @Override
        public boolean test(Trainer trainer) {
            return trainer.getName().equals(name);
        }
    }

    public static class SalaryCriteria implements Criteria {
        private int minSalary;

        public SalaryCriteria(int minSalary) {
            this.minSalary = minSalary;
        }

        @Override
        public boolean test(Trainer trainer) {
            return trainer.getSalary() > minSalary;
        }
    }

    public Trainer findFirstBySalary(int minSalary){
        return findFirst(new SalaryCriteria(minSalary));
    }







}
