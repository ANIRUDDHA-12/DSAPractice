import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public List<Character> frequencySort(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a,b)->{
            int freqScore=Integer.compare(b.getValue(),a.getValue());
            if(freqScore==0){
                return Integer.compare(a.getKey(),b.getKey());
            }
            return freqScore;
        });
        List<Character> extract=list.stream()
                .map(Map.Entry::getKey)
                .toList();
        extract.forEach(System.out::println);
        return extract;
    }
    public static void main(String [] args){
        SortCharacterByFrequency s=new SortCharacterByFrequency();

        String test="tree";
        List<Character> check=s.frequencySort(test);
        System.out.println(check);
    }
}
