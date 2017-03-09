
public class Point3D {

	float x;
	float y;
	float z;
	double[] b = new double[3];

	public Point3D(float x, float y, float z) {

		super();
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public Vector3D Cross(Vector3D Vector1, Vector3D Vector2) {
		Vector3D cross = new Vector3D(x, y, z);

		cross.x = Vector1.y * Vector2.z - Vector1.z * Vector2.y;
		cross.y = Vector1.z * Vector2.x - Vector1.x * Vector2.z;
		cross.z = Vector1.x * Vector2.y - Vector1.y * Vector2.x;

		return cross;

	}

	public float Dot(Vector3D Vector1, Vector3D Vector2) {

		float a;
		a = Vector1.x * Vector2.x + Vector1.y * Vector2.y + Vector1.z * Vector2.z;

		return a;
	}

	public Vector3D Fark(Point3D Point1, Point3D Point2) {
		Vector3D fark = new Vector3D(x, y, z);

		fark.x = Point2.x - Point1.x;
		fark.y = Point2.y - Point1.y;
		fark.z = Point2.z - Point1.z;

		return fark;

	}

	public String PointYaz(Point3D Point1) {

		return "(" + Point1.x + ", " + Point1.y + ", " + Point1.z + ", 1)";
	}

	public String Barycentric(Point3D p, Point3D q, Vector3D u, Vector3D v, double[] b) {

		Vector3D w = new Vector3D(x, y, z);
		Vector3D n = new Vector3D(x, y, z);

		n = Cross(u, v);

		double oneOver4ASquared = 1 / Dot(n, n);

		w = Fark(p, q);

		b[2] = Dot(Cross(u, w), n) * oneOver4ASquared;
		b[1] = Dot(Cross(w, v), n) * oneOver4ASquared;
		b[0] = 1.0 - b[1] - b[2];

		return "(" + b[0] + ", " + b[1] + ", " + b[2] + ")";

	}
}
