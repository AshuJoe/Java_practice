package Day4.core;

public class Box {
	private double length;
    private double width;
    private double depth;

    public Box(double l,double w,double d){
    length=l;
    width=w;
    depth=d;
    System.out.println("BOX CONST'R CALLING");
    }
    public void setWidth() {
    	this.width=2*this.width;
    }

   public String getDetails(){
   return "Box length = "+length+" width = "+width+" depth = "+depth;
   }
   public double getBoxVolume() {
	   return length*width*depth;
   }
}


