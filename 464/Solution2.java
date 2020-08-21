public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    private int len;
    private int[] array;
    public void sortIntegers2(int[] A) {
        // write your code here
        if(A==null||A.length <2) return;
        this.array = A;
        len = A.length;
        quick(0,len-1);
    }
    
    private void quick(int left, int right){
        int i=left;
        int j = right;
        int mid = array[(left + right)/2]; // ������Ҫ��ס�̶���ֵ�� ������ĳ��λ��
        while(i<=j)//���ڲ�֪��ԭ�򣬲�д�������Ⱥţ���ջ���
        {
            while(array[i]<mid) i++;
            while(array[j]> mid) j--;
            if(i<=j){//��������
                swap(i,j);
                i++;
                j--;
            }
        }
        if(j>left)quick(left, j);
        if(i<right)quick(i,right);
    }
    
    private void swap(int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}