package codeFights.arcade;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 461967 on 6/20/17.
 */
public class ReverseParanthesis {
//    public String reverseParentheses(String s) {
//        char[] arr = s.toCharArray();
//        char[] output = arr.clone();
//        List<String> list = new ArrayList<>();
//        int openIndex = -1;
//        int closeIndex = -1;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]=='('){
//                openIndex = i+1;
//            }else if(arr[i]==')'){
//                closeIndex=i-1;
//            }
//            if(openIndex>0 && closeIndex>0){
//                int k = closeIndex;
//                for(int j=openIndex;j<=closeIndex;j++){
//                    output[j] = arr[k];
//                    k--;
//                }
//                openIndex=-1;
//                closeIndex=-1;
//            }
//        }
//        String ret = String.valueOf(output);
//        ret = ret.replace("(","").replace(")","");
//        return ret;
//    }

//    public String reverseParentheses(String s) {
//        char[] arr = s.toCharArray();
//        Stack<Character> st = new Stack<>();
//        Queue<Character> queue = new LinkedList();
//        ArrayList<Character> list = new ArrayList<>();
//        int openBraacketCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '(') {
//                openBraacketCount += 1;
//            } else if (arr[i] == ')') {
//                openBraacketCount -= 1;
//            }
//            if (!(arr[i] == '(' || arr[i] == ')')) {
//                if (openBraacketCount % 2 == 0) {
//                    queue.add(arr[i]);
//                } else {
//                    st.push(arr[i]);
//                }
//            }
//        }
//        int n = arr.length;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == ')') {
//                openBraacketCount += 1;
//            } else if (arr[i] == '(') {
//                openBraacketCount -= 1;
//            } else {
//                if (openBraacketCount % 2 == 0) {
//                    list.add(queue.remove());
//                } else {
//                    list.add(st.pop());
//                }
//            }
//        }
//
//        StringBuilder builder = new StringBuilder(list.size());
//        for (
//                Character ch : list)
//
//        {
//            builder.append(ch);
//        }
//
//        String ret = builder.toString();
//        return ret;
//    }

    public String reverseParentheses(String s) {
        String[] arr = s.split("\\(");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        for (String str:arr){
            if(str.contains(")")){
                for(String s2 : str.split("\\)")){
                    list.add(s2);
                    list.remove(str);
                }
            }
        }


        return "";
    }

}
