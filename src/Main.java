import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float x1, y1, z1;
		float x2, y2, z2;
		float x3, y3, z3;
		float x4, y4, z4;
		double[] b = new double[3];

		System.out.println("Ilk Noktanin x, y ve z degerlerini girin.");
		System.out.print("x1 = ");
		x1 = input.nextFloat();
		System.out.print("y1 = ");
		y1 = input.nextFloat();
		System.out.print("z1 = ");
		z1 = input.nextFloat();

		Point3D p = new Point3D(x1, y1, z1);
		
		System.out.println("p noktasi = " + p.PointYaz(p));

		System.out.println("Ikinci Noktanin x, y ve z degerlerini girin.");
		System.out.print("x2 = ");
		x2 = input.nextFloat();
		System.out.print("y2 = ");
		y2 = input.nextFloat();
		System.out.print("z2 = ");
		z2 = input.nextFloat();

		Point3D q = new Point3D(x2, y2, z2);
		
		System.out.println("q noktasi = " + p.PointYaz(q));
		

		System.out.println("Vectorun x, y ve z degerlerini girin.");
		System.out.print("x3 = ");
		x3 = input.nextFloat();
		System.out.print("y3 = ");
		y3 = input.nextFloat();
		System.out.print("z3 = ");
		z3 = input.nextFloat();

		Vector3D u = new Vector3D(x3, y3, z3);
		
		System.out.println("u vektoru = " + u.VectorYaz(u));

		System.out.println("Lutfen ikinci vektorun x,y ve z degerlerini giriniz.");
		System.out.print("x4 = ");
		x4 = input.nextFloat();
		System.out.print("y4 = ");
		y4 = input.nextFloat();
		System.out.print("z4 = ");
		z4 = input.nextFloat();

		Vector3D v = new Vector3D(x4, y4, z4);
		
		System.out.println("v vektoru = " + v.VectorYaz(v));
		

		System.out.println("Barycentric koornidatlar :" + p.Barycentric(p, q, u, v, b) + " dir.");

	}

}
