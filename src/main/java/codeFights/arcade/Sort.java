package codeFights.arcade;

/**
 * Created by 461967 on 6/20/17.
 */
public class Sort {
    public void sort(int[] a){
        for(int i =0; i<a.length;i++){
            if(a[i]!=-1) {
                for (int j = i + 1; j < a.length; j++) {
                    if(a[j]!=-1) {
                        if (a[i] > a[j]) {
                            int temp = a[j];
                            a[j] = a[i];
                            a[i] = temp;
                        }
                    }
                }
            }
        }

        for (int i:a
             ) {
            System.out.print(i + " ");
        }
    }
}
