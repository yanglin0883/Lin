public class Solution {
    /*
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // write your code here
        if(a==0)
        {
            if(b==0)
            {
                double res[]= new double[0];
                if(c==0) throw new RuntimeException("All real number.");
                return res;
            }
            else
            {    
                double res[]= new double[1];
                res[0]=-c/b;
                return res;
            }
        }
        double delta = b*b - 4 * a*c;
        if(delta<0)
        {
            double res[]= new double[0];
            return res;
        }
        if(delta==0)
        {
            double res[]= new double[1];
            res[0]=-b/2/a;
            return res;
        }
        double res[] = new double[2];
        delta = Math.sqrt(delta);
        res[0]= (-b-delta)/2/a;
        res[1]= (-b+delta)/2/a;
        if(res[0]>res[1])
        {
            double temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        return res;
    }
}