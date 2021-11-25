package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map){
        int longestOcean = 0;
        int actualOcean = 0;

        char[] mapChar = map.toCharArray();

        for (char i : mapChar){
            if (i=='0'){
                actualOcean++;
            }else{
                actualOcean = 0;
            }
            if (actualOcean>longestOcean){
                longestOcean = actualOcean;
            }
        }
        return longestOcean;
    }
}
