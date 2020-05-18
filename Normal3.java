
public class Normal3 {

	double x;
	double y;
	double z;
	
	public Normal3 (double x, double y, double z ) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	public Normal3 mul(double n){
		Normal3 mu = new Normal3(x * n, y*n,z*n);
		return mu;
		
	}
	
	public Normal3 add(Normal3 n){
		Normal3 add = new Normal3(x + n.x, y + n.y, z+ n.z);
		return add;
		
	}
	
	public double dot(Vector3 v){
		double magnitude= Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)  + Math.pow(this.x, 2) );
		return magnitude;
		
	}
	
	public String toString() {
		return " "+x+" "+y+" "+z;
		 
	}
}
