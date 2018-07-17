public class Rectangle {
    double width = 1;
    double height = 1;
//    Rectangle rectangle = new Rectangle(width,height);

    public Rectangle() {
    }


    public Rectangle(double width , double height ) {
        this.width = width;
        this.height = height;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width ) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }




    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) / 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
