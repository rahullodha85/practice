package implementation;

/**
 * Created by 461967 on 6/23/17.
 */
public class BreakingTheRecords {
    public int[] getRecord(int[] s){
        int high = 0;
        int low = 0;
        int highDeviation=0;
        int lowDeviation=0;
        for(int i = 0; i<s.length;i++){
            if(i==0){
                high = s[i];
                low=s[i];
            }else{
                if(s[i]>high) {
                    high = s[i];
                    highDeviation += 1;
                }
                else if(s[i]<low){
                    low = s[i];
                    lowDeviation+=1;
                }
            }
        }
        return new int[]{highDeviation,lowDeviation};
    }
}
