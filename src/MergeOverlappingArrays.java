import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingArrays {
    public int[][] mergeOverlap(int [][] intervals){
        if(intervals.length<=1) return intervals;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        int [] currentInterval=intervals[0];
        list.add(currentInterval);

        for(int i=0;i<intervals.length;i++){
            int currentEnd=currentInterval[1];
            int nextStart=intervals[i][0];
            int nextEnd=intervals[i][1];

            if(nextStart<=currentEnd){
                currentInterval[1]=Math.max(currentEnd,nextEnd);
            }else{
                currentInterval=intervals[i];
                list.add(currentInterval);
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}
