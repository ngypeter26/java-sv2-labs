package junit5;

public class Gentleman {
    public String sayHello(String name){
        StringBuilder sb = new StringBuilder("Hello ");
//        sb.append(name);
      //  return sb.append(name).toString();
        return name== null ? sb.append("Anonymus").toString() : sb.append(name).toString();
    }
}
