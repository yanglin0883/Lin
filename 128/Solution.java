public class Solution {
    /**
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        long sum=0;
        int len = key.length;
        for(int i=0;i<len;i++)
        {
            sum *=33;
            sum += key[i];
            sum %= HASH_SIZE;
            
        }
        return (int)sum;
    }
}