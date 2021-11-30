package methodchain;

public class Trainer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    // java beans szereint voidnak kell lennie, így ennek a szabványnak nem felel meg
//    public Trainer setName(String name) {
//        this.name = name;
//        return this; // így lácolható
//    }
//    public Trainer setAge(int age) {
//        this.age = age;
//        return this; // így lácolható
//    }

    // builder


    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
