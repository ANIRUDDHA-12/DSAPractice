public class ShipCapacity1011{
    public int calculateDays(int [] weights,int capacity){
        int daysNeeded=1;
        int currentLoad=0;
        for(int box:weights){
            int currentWeight= box+currentLoad;
            if(currentWeight>capacity){
                daysNeeded++;
                currentLoad=box;
            }
            else{
                currentLoad+=box;
            }
        }
        return daysNeeded;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left =0;
        int right=0;
        int bestWeight=-1;

        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }

        while(left<=right){
            int mid=left+(right-left)/2;
            int daysTaken= calculateDays(weights,mid);

            if(daysTaken<=days){
                bestWeight=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return bestWeight;
    }
}