public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    public int width, height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    Rectangle(int a, int b){
        width = a ;
        height = b;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    int getArea(){
        return width * height;
    }
}
