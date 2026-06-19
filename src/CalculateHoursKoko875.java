import java.util.Arrays;

public class CalculateHoursKoko875{
    public long calculateHours(int [] piles,int k){
        long totalHours = 0;
        for(int pile:piles){
            totalHours +=Math.ceil((double)pile/k);
        }
        return totalHours;
    }
    public int minEatingSpeed(int [] piles, int h){
        int left = 1;
        int right =1;
       for(int pile:piles){
           right = Math.max(right,pile);
       }
        int bestSpeed = -1;
        while(left<=right){
            int middle= left+(right-left)/2;
            long hoursTaken = calculateHours(piles, middle);
            if(hoursTaken<=h){
                bestSpeed=middle;
                right=middle-1;
            }
            else{
                left=middle+1;
            }

        }
        return bestSpeed;
    }
}