package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers;// = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title is empty!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("List of performers is empty!");
        }
        if(length<0){
            throw new IllegalArgumentException("Length is negative!");
        }

        this.length = length;
        this.performers = performers;
        this.title = title;
    }
    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title is empty!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("List of performers is empty!");
        }
        if(Validators.isEmpty(composer)){
            throw new IllegalArgumentException("List of composer is empty!");
        }
        if(length<0){
            throw new IllegalArgumentException("Length is negative!");
        }
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>(composer);
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


}
