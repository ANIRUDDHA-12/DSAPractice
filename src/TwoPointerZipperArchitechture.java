//public class TwoPointerZipperArchitechture {
//    public static void main(String args[]){
//        int[] userA = {10, 15, 22, 30, 45};
//        int[] userB = {12, 15, 20, 22, 50};
//
//         int ptrA=0;
//        int ptrB= 0;
//
//        while(ptrA<userA.length && ptrB<userB.length){
//            if(userA[ptrA]==userB[ptrB]){
//                System.out.println("Match found at "+userA[ptrA]+" "+userB[ptrB]);
//                ptrA++;
//                ptrB++;
//            }
//            else if(userA[ptrA]<userB[ptrB]){
//                ptrA++;
//            }
//            else {
//                ptrB++;
//            }
//        }
//    }
//}

public class TwoPointerZipperArchitechture {
    public static void main(String args[]){
        int[] invited = {2, 5, 8, 10, 15, 20};
        int[] arrived = {5, 8, 15};

        int ptrA= 0;
        int ptrB = 0;

        while(ptrA<invited.length && ptrB<arrived.length){
            if(invited[ptrA] == arrived[ptrB]){
//                System.out.println(("Invited Guests Were"+invited[ptrA]));
                ptrA++;
                ptrB++;
            }
            else if(invited[ptrA]<arrived[ptrB]){
                System.out.println("No-Show"+" " +invited[ptrA]);
                ptrA++;
            }
            else{
//                System.out.println("Unrecognized Arrival "+arrived[ptrB]);
                ptrB++;
            }
        }
        while(ptrA<invited.length){
            System.out.println("No -Show"+" " +invited[ptrA]);
            ptrA++;
        }
    }
}
