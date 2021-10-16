package noteApp;

public class Note {
    private String note;
    private String name;
    private String topic;

    public String getNote(){
        return note;
    }
    public void setNote(String note){
        this.note = note;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getTopic(){
        return topic;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }

    public String getNoteText(){
        return name + " : " + topic;
    }

}
