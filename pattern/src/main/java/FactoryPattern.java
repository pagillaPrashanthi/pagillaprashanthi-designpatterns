import factory.Rectangle;
import factory.Shape;
import factory.ShapeFactory;
import factory.Circle;
import factory.Square;

public class FactoryPattern {


	   public static void main(String[] args) {
	      ShapeFactory shapeFactory= new ShapeFactory();

	      
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();

	     
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      
	      shape3.draw();
	   }
	}

