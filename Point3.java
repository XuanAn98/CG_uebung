
public class Point3 {
	public double x;
	public double y;
	public double z;
	
	public Point3 (double x, double y , double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Vector3 sub(Point3 p) {
		Vector3 sub = new Vector3(x - p.x, y - p.y , z - p.z);
		return sub;
		
	}
	
	public Point3 sub(Vector3 v) {
		Point3 sub = new Point3(x - v.x, y - v.y , z - v.z);
		return sub;
		
	}
	
	public Point3 add(Vector3 v) {
		Point3 add = new Point3(x + v.x, y + v.y , z + v.z);
		return add;
		
	}
	
	public String toString() {
		return " "+x+" "+y+" "+z;
	}

}
