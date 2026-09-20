package ShapesDrawing;

abstract public class Shapes {
    abstract void draw();

}

class Rectangle extends Shapes
{
    void draw(){
        System.out.println("drawing a Rectangle");
    }
}
class Circle extends Shapes
{
    void draw(){
        System.out.println("drawing a Circle");
    }
}
class Triangle extends Shapes
{
    void draw(){
        System.out.println("drawing a Triangle");
    }
}