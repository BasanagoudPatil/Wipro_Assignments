package Day_4to5;


public class Task2 {
	public static void main(String args[])
	{
		circle c=new circle(5);
		rectangle r=new rectangle(5,3);
		System.out.println("Area of circle: "+c.area());
		System.out.println("Area of rectangle: "+r.area());
	}
}

class shape {
	public double area() {
		return 0.0;
		
	}
}
class circle extends shape {
	double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	public double area()
	{
		return 3.141*radius*radius;
		
	}
}
class rectangle extends shape {
    double width;
    double height;
     public rectangle(double width,double height)
     {
   	  this.width=width;
   	  this.height=height;
     }
     public double area()
     {
   	  return width*height;
     }
}

