
public class Vector3D {

	float x;
	float y;
	float z;

	public Vector3D(float x, float y, float z) {

		super();
		this.x = x;
		this.y = y;
		this.z = z;

	}
	
	public String VectorYaz(Vector3D Vector1){
		
		return "(" + Vector1.x + ", " + Vector1.y  + ", " + Vector1.z + ")";
	}

	
}
