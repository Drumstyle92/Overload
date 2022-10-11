/**
 * @author Drumstyle92
 * Class containing two variables and constructors with variables and parameters to indicate geometric shapes.
 */
public class Shape {
    /**
     * variable indicating the shape.
     */
    public String shapeName;
    /**
     * variable that indicates how many edges the shape has.
     */
    public int numberOfEdges;

    /**
     * constructor for an indefinite form.
     */
    public Shape(){
        System.out.println("Creating a shape ");
        this.shapeName = "Undefined shape ";
    }

    /**
     *
     * @param radius parameter indicating the radius of the shape.
     * constructor for the circle shape.
     */
    public Shape(double radius){
        System.out.printf("Creating a shape with a radius of %f radiant. %n", radius);
        this.shapeName = " Circle ";
    }

    /**
     *
     * @param edges parameter that indicates the edges of the shape.
     * @param edgeLength edge length parameter.
     * constructor for the square shape.
     */
    public Shape(int edges,double edgeLength) {
        System.out.printf("Creation of a shape with the edge length of %f cm. %n", edgeLength);
        this.numberOfEdges = edges;
        this.shapeName = " Square ";
    }

    /**
     *
     * @param e1 parameter with the length of the base.
     * @param e2 parameter with the length of the height.
     * constructor for the rectangular shape.
     */
    public Shape(double e1,double e2){
        System.out.printf("Creation of a shape with the length of %n" +
                          "the first edge of %f cm and of the second of %f cm. %n",e1,e2);
        this.shapeName = " Rectangle ";
        this.numberOfEdges = 4;
    }

    /**
     *
     * @param e1 parameter indicating the length of the border 1.
     * @param e2 parameter indicating the length of the border 2.
     * @param e3 parameter indicating the length of the border 3.
     * constructor for the triangular shape.
     */
    public Shape(double e1,double e2,double e3){
        System.out.printf("Creation of a shape with %n" +
                          "the length of the first border of %f cm %n" +
                          "and of the second of %f cm and of the third of %f cm. %n", e1,e2,e3);
        this.shapeName = " Triangle ";
        this.numberOfEdges = 3;
    }

    /**
     * method that displays both the name of the shape and the number of edges it has.
     */
    public void getShapeDetails(){
        System.out.printf(" - The form in question is " + this.shapeName + " and has "+ this.numberOfEdges + " edges.\n");
    }
}
