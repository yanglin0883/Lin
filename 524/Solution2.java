public class StringUtils {
	/**
     * @param originalStr: the string we want to append to with spaces
     * @param size: the target length of the string
     * @return: A string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr,size,' ');
    }

    /*
     * @param originalStr: the string we want to append to
     * @param size: the target length of the string
     * @param padChar: the character to pad to the left side of the string
     * @return: A string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // write your code here
        int len = originalStr.length();
        int num = size-len;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<num;i++) res.append(padChar);
        res.append(originalStr);
        return res.toString();
    }
}