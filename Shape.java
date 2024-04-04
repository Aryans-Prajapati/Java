public  abstract class Shape {
   float base,height;
   double length,breadth;
   Shape(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
   }
   Shape(float base,float height) {
    this.base=base;
    this.height=height;
   }  
    abstract double disparea();
      
}




