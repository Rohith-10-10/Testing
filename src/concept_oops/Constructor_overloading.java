package concept_oops;
class box{
	double width, height, depth;
	 box(){
	    width = 0; height = 0; depth = 0;	 
	    }
	 box(double w, double h, double d){
		 width = w; height = h; depth = d;
	 }
     box(double len){
    	 width = height = depth = len;
     }
     
    double volume() {
    return	(width*height*depth);
    }

}
public class Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        box b = new box(10,2,3);
        System.out.println(b.volume());
        
	}

}
