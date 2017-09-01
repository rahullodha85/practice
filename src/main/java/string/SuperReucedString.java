package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by 461967 on 6/18/17.
 */
public class SuperReucedString {
    public String super_reduced_string(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        char temp='\0';
        for(int i =0; i<arr.length;i++){
            if(i==0){
                temp=arr[i];
            }else{
                if(arr[i]==temp){
                    if(map.containsKey(arr[i])){
                        map.put(arr[i], map.get(arr[i])+1);
                    }else {
                        map.put(arr[i], 1);
                    }
                }
            }
        }
        String ret = "";
        for (char key : list
                ) {
                ret = ret + String.valueOf(key);
        }
        if (ret.length() == 0)
            ret = "Empty String";
        return ret;
    }
}
