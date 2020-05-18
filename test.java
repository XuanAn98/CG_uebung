
public class test {

	public static void main(String[] args) {
		
		//6 normale multiplikation
		Normal3 normalmul = new Normal3(1,2,3);
		System.out.println(normalmul.mul(0.5));
		
		//nor add
		System.out.println(normalmul.add(new Normal3(3,2,1)));
		
		//skalar
		Vector3 norma = new Vector3(1,0,0);
		System.out.println(norma.dot(new Normal3(0,1,0)));
		//Fehler muss 1 -------
		System.out.println(norma.dot(new Vector3(1,0,0)));
		
		//punkt
		Point3 poi = new Point3(1,1,1);
		System.out.println(poi.sub(new Point3(2,2,0)));

		//punkt vector
		System.out.println(poi.sub(new Vector3(4,3,2)));
		
		//
		System.out.println(poi.add(new Vector3(4,3,2)));
		
		//magnitude wurzel 3
		Vector3 magni = new Vector3(1,1,1);
		System.out.println(magni);
		
		
		//add
		Vector3 normal = new Vector3(1,0,0);
		System.out.println(normal.add(new Normal3(4,3,2)));
		
		//sub
		System.out.println(normal.sub(new Normal3(4,3,2)));
		
		//mul
		System.out.println(normal.mul(new Vector3(4,3,2)));
		
		
		//reflected
		Vector3 nya = new Vector3(-0.707,0.707,0);
		Normal3 nor = new Normal3(0,1,0);
		Vector3 nyaq = nya.reflectedOn(nor);
		System.out.println(nyaq);
		
		//reflected2
		Vector3 nya1 = new Vector3(0.707,0.707,0);
		Normal3 nor1= new Normal3(1,0,0);
		Vector3 nyaq1 = nya1.reflectedOn(nor1);
		System.out.println(nyaq1);
		
		//mul mat vec poi
		Mat3x3 mat = new Mat3x3 (1, 0, 0, 0, 1, 0, 0, 0, 1);
		System.out.println(mat.mul(new Point3(3,2,1)));
		System.out.println(mat.mul(new Vector3(3,2,1)));
		
		//mat mul
		Mat3x3 mat1 = new Mat3x3 (1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(mat1.mul(new Mat3x3 (1, 0, 0, 0, 1, 0, 0, 0, 1)));
		System.out.println(mat1.mul(new Mat3x3 (0, 0, 1, 0, 1, 0, 1, 0, 0)));
		
		//
		System.out.println(mat1.changeCol1(new Vector3 (8,8,8)));
		System.out.println(mat1.changeCol2(new Vector3 (8,8,8)));
		System.out.println(mat1.changeCol3(new Vector3 (8,8,8)));
		
		

	}

}
