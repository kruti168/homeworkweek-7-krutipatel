package homeworkweek7;

/**
 * 15. Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg  constructor). The second constructor has parameters width and height of type double and it needs to  initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the  height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field. * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the  height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall. TEST EXAMPLE
 **/

public class Programme15WallArea {
    double width;
    double height;

    public Programme15WallArea() {

    }

    public Programme15WallArea(double width, double height) {//calling no parameter constructor
        this.width = width;
        this.height = height;
        if (width < 0 || height < 0) {
            width = 0;
            height = 0;
        }
    }

    public double getWidth() {//calling instance method without parameter
        return width;
    }

    public double getHeight() {//calling instance method without parameter
        return height;
    }

    public double setWidth(double width) {
        if (this.width < 0) {
            this.width = width;
        }
        else{
            this.width=0;
        }
        return this.width;
    }

    public double setHeight(double height) {
        if (this.height < 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
        return this.height;
    }

    public double getArea () {//calling instance method without parameter
        double area = width * height;
        return area;
    }


    public static void main (String[]args){
        Programme15WallArea wall = new Programme15WallArea(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


    }
}
