import java.util.Arrays;

public class CarFleet853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        if (n == 0) return 0;
        double [] [] cars = new double[n][2];
        for(int i=0;i<n-1;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double) (target-position[i])/speed[i];
        }
        Arrays.sort(cars, (double[] a, double[] b) -> Double.compare(a[0], b[0]));
        int fleets = 0;
        double slowestTimeAhead = 0.0;
        for(int i=n-1;i>=0;i--){
            double currentTime= cars[i][1];
            if(currentTime>slowestTimeAhead){
                fleets++;
                slowestTimeAhead=currentTime;
            }
        }
return fleets;

    }
}
