package Ex5;

public class Java910 {

	public static void main(String[] args) {
		QuadraticEquation t = new QuadraticEquation(1,2,3);
		if(t.getDiscriminant() > 0) {
			System.out.println(t.getRoot1() + " and " + t.getRoot2());
		}
		else if(t.getDiscriminant() == 0) {
			if(t.getRoot1() == 0) {
				System.out.println(t.getRoot2());
			}
			else {
				System.out.println(t.getRoot1());
			}
		}
		else {
			System.out.println("The equation has on roots");
		}
	}
}

class QuadraticEquation{
	private float a,b,c;
	QuadraticEquation(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	float getA() {
		return this.a;
	}
	
	float getB() {
		return this.b;
	}
	
	float getC() {
		return this.c;
	}
	
	float getDiscriminant() {
		return (float) (Math.pow(this.b,2) - 4 * this.a * this.c);
	}
	
	float getRoot1() {
		return (float) ((Math.pow(this.b,2) - 4 * this.a * this.c) - this.b) / (2 * a) > 0?(float) ((Math.pow(this.b,2) - 4 * this.a * this.c) - this.b) / (2 * a):0;
	}
	
	float getRoot2() {
		return (float) ((-Math.pow(this.b,2) - 4 * this.a * this.c) - this.b) / (2 * a) > 0?(float) ((-Math.pow(this.b,2) - 4 * this.a * this.c) - this.b) / (2 * a):0;
	}
}
