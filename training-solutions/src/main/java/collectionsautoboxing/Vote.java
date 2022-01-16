package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> rawResults){
        Map<VoteResult, Integer> result = new HashMap<>();
        result.put(VoteResult.YES,0);
        result.put(VoteResult.NO,0);
        result.put(VoteResult.ABSTAIN ,0);

        VoteResult actaulVote;
        int actualVoteNumber;


        for (String name : rawResults.keySet()){
            actaulVote = rawResults.get(name);
//            if (!result.containsKey(actaulVote)) {
//                result.put(actaulVote, 1);
//            }else {
                actualVoteNumber = result.get(actaulVote);
                result.put(actaulVote, actualVoteNumber + 1);
//            }
        }
        return result;
    }
}
