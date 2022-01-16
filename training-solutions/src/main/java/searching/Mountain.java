package searching;

import java.util.Arrays;
import java.util.Collections;

public class Mountain {
    private int[] pikeHeights;

    public Mountain(int[] pikeHeights) {
        this.pikeHeights = pikeHeights;
    }

    public int[] getPikeHeights() {
        return pikeHeights;
    }

    public boolean searchPike(Pike pike){
        return Arrays.binarySearch(pikeHeights,pike.getHeight())>0;

    }

}
