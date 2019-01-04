package Home01;

public class study02 {
	public static void Hap(int a, int b) {
		int Hap = a + b;
		System.out.printf("%d + %d = %d \n", a, b, Hap);
	}

	public static void Sup(int a, int b) {
		int Sup = a - b;
		System.out.printf("%d - %d = %d \n", a, b, Sup);
	}

	public static void Mul(int a, int b) {
		int Mul = a * b;
		System.out.printf("%d * %d = %d \n", a, b, Mul);
	}

	public static void Div(int a, int b) {
		double Div = (double) a / b;
		System.out.printf("%d / %d = %f \n", a, b, Div);
	}

	public static void main(String[] args) {
		Hap(3, 5);
		Sup(22, 5);
		Mul(123, 25);
		Div(32, 15);
	}
}
