class Solution2187 {
    public long minimumTime(int[] time, int totalTrips) {
        long low=Long.MAX_VALUE;
        long high=0;
        long min=Long.MAX_VALUE;
        for(int it:time){
            low=Math.min(low,it);
            min=Math.min(min,it);
        }
        high=totalTrips*min;
        while(low<high){
            long mid=low+(high-low)/2;
            if(blackbox(mid,totalTrips,time)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean blackbox(long isValidtime,int totalTrips,int [] time){
        long trip=0;
        for(int it:time){
            trip+=isValidtime/it;
        }
        if(trip>=totalTrips) return true;

        return false;
    }
}