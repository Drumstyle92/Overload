/**
 * @author Drumstyle92
 * Class containing the heart of the program.
 */
public class Tester {
    /**
     *
     * @param args fundamental parameter for main.
     * The main contains objects and shows through methods the description of some geometric shapes.
     */
    public static void main(String[] args){
    System.out.println("---------------------------shape1--------------------------");
    Shape shape1 = new Shape();
    shape1.getShapeDetails();
    System.out.println("---------------------------shape2--------------------------");
    Shape shapeCircle2 = new Shape(3.44);
    shapeCircle2.getShapeDetails();
    System.out.println("---------------------------shape3--------------------------");
    Shape shapeSquare3 = new Shape(4,2.37);
    shapeSquare3.getShapeDetails();
    System.out.println("---------------------------shape4--------------------------");
    Shape shapeRectangle4 = new Shape(3.54,5.77);
    shapeRectangle4.getShapeDetails();
    System.out.println("---------------------------shape5--------------------------");
    Shape shapeTriangle5 = new Shape(2.32,3.61,4.29);
    shapeTriangle5.getShapeDetails();
    }
}
