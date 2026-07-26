public class MinimizeMaxDistance {
    int numberOfGasStations(double distance,int [] arr){
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            double gap=arr[i]-arr[i-1];
            int numberInBetween =(int) (gap/distance);
            if(gap == numberInBetween*distance){
                numberInBetween--;
            }
            cnt+=numberInBetween;
        }
        return cnt;
    }
    public int minimiseMaxDistance(int [] arr,int k){
        int n=arr.length;
        double low=0;
        double high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(high,(double)arr[i+1]-arr[i]);
        }
        double diff=1e-6;
        while(high-low>diff){
            double mid=low+(high-low)/2.0;
            int gas=numberOfGasStations(mid,arr);
            if(gas<k){
                low=mid;
            }else{
                high=mid;
            }

        }
        return (int) high;
    }
    public static void main(String [] args){
        MinimizeMaxDistance distance=new MinimizeMaxDistance();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k1 = 9;
        double ans1=distance.minimiseMaxDistance(arr1,k1);

        int[] arr2 = {3, 6, 12, 19, 33, 44, 67};
        int k2 = 2;
        double ans2 = distance.minimiseMaxDistance(arr2, k2);

        System.out.println("The answer for array 1 is"+ans1);
        System.out.println("The answer for array 2 is"+ans2);
    }
}
