
public class Vector3 {
	public double x;
	public double y;
	public double z;
	public double magnitude;
	
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		this.magnitude= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)  + Math.pow(x, 2) );
	}
	
	public Vector3 add(Vector3 v) {
		
		Vector3 add = new Vector3(x + v.x, y + v.y , z + v.z);
		
		return add;
		
	}
	
	public Vector3 add(Normal3 n) {
		Vector3 add = new Vector3(x + n.x, y + n.y , z + n.z);
		
		return add;
		
	}
	
	public Vector3 sub(Normal3 n) {
		Vector3 sub = new Vector3(x - n.x, y - n.y , z - n.z);
		
		return sub;
		
	}
	
	public Vector3 mul(Vector3 c) {
		Vector3 mul = new Vector3(x * c.x, y * c.y , z * c.z);

		return mul;
		
	}
	
	public double dot(Vector3 v) {
		
		double dot =x * v.x + y* v.y + z * v.z; 
		
		return dot ;
		
	}
	
	public double dot(Normal3 n) {
		double a = x * n.x + y * n.y + z * n.z;
		return a;
		
	}
	
	public void normalized() {		
		this.x =magnitude * x; 
		this.y =magnitude * y; 
		this.z =magnitude * z; 
		
	}
	
	public Normal3 asNormal() {
		
		Normal3 nor = new Normal3(x,y,z);
		
		return nor;
		
	}
	
	public Vector3 reflectedOn(Normal3 n) {
		Vector3 ref = new Vector3(2.0 * n.x* dot(n) - x, 2.0 * n.y * dot(n) - y,2.0 * n.z * dot(n) - z);
		return ref;
		
	}
	
	public Vector3 x(Vector3 v) {
		Vector3 kreuz = new Vector3(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
		return kreuz;
		
	}
	
	public String toString() {
		return " "+x+" "+y+" "+z+" "+ "  mangnitude: "+magnitude;
	}
}
