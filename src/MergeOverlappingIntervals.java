import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingIntervals {
    public List<List<Integer>> mergeIntervals(List<List<Integer>> intervals){
        if(intervals== null || intervals.isEmpty()){
            return new ArrayList<>();
        }
        Collections.sort(intervals,(a,b)->Integer.compare(a.get(0),b.get(0)));
        List<List<Integer>> list=new ArrayList<>();

        for(List<Integer> interval:intervals){
            if(!list.isEmpty() && list.get(list.size()-1).get(1)<=interval.get(0)){
                list.add(new ArrayList<>(interval));
            }
            else{
                List<Integer> mergedLast=list.get(list.size()-1);
                mergedLast.set(1,Math.max(mergedLast.get(1),interval.get(1)));
            }
        }
        return list;
    }
}
