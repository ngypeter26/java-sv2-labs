package introjunit;

public class Gentleman {
    public String sayHello(String name){
     //   return "Hello " + name; //kontanetációval
//        StringBuilder sb = new StringBuilder("Hello ");
//        sb.append(name);
//        return sb.toString();


        StringBuilder sb = new StringBuilder("Hello ");
        if (name == null){
            sb.append("Anonymus");
        }else{
            sb.append(name);
        }
        return sb.toString();
    }
}
