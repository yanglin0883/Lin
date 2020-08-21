public class Solution {
    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public int[][] multiSort(int[][] array) {
        // Write your code here
        int max=0;
        int len = array.length;
        for(int i=0;i<len;i++){
            max = i;
            for(int j=i+1;j<len;j++)
                if(bigger(array[j],array[max])) max = j;
            int[] temp=array[i];
            array[i] = array[max];
            array[max]= temp;
        }
        return array;
    }
    
    private boolean bigger(int[] a, int[] b){
        if(a[1]==b[1]) return a[0]<b[0];
        else return a[1]>b[1];
    }
}