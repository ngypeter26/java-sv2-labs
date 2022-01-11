package exceptionclass.course;

public class Course {
    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        isNameValid(name);
        isBeginValid(begin);
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return begin.toString() + ": " + name ;
    }

    private void isNameValid(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is null!");
        }
    }
    private void isBeginValid(SimpleTime begin){
        if(begin == null){
            throw new IllegalArgumentException("Begin is null!");
        }
    }
}
