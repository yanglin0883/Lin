public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if(A == null ||A.length ==0)
            return 0;
        int numOfElem = 0;
        int len = A.length;
        for(int i=0;i<len;i++)
        {
            if(A[i] == elem)
                numOfElem ++;
        }
        int res = len - numOfElem;
        int i=0;
        int j=len-1;
        while(i<res && j>-1)
        {
            while(i<len && A[i]!=elem) i++;
            while( j>-1 && A[j] == elem)j--;
            System.out.println("i= "+i+" j= "+j+" res= "+res);
            if(i<len && j>-1&&i<res)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                System.out.println("run");
            }
        }
        
        return len - numOfElem;
    }
}