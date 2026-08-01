public class ValidAnagram {
    public boolean validAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int [] ledger=new int[26];

        for(int i=0;i<s.length();i++){
            ledger[s.charAt(i)-'0']++;
            ledger[t.charAt(i)-'0']--;
        }
        for(int count:ledger){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

}
