
public class Calculate {
	//square the input
		public static int square (int operand) {
			int square = operand * operand;
			return square;
		}
		public static int cube (int alpha) {
			int cube = alpha * alpha * alpha;
			return cube;
		}
		public static double average (double beta1, double beta2) {
			double Totalvalue = beta1 + beta2;
			double Total = Totalvalue / 2;
					return Total;
		}
		public static double average (double kappa1, double kappa2, double kappa3) {
			double Sum = kappa1 + kappa2 + kappa3;
			double allSum = Sum / 3;
			return allSum;
		}
		public static double toRadians (double degree) {
			double radian = ((degree * 3.14159) / 180);
			return radian;
		}
		public static double toDegrees (double radian) {
			double degree = ((radian * 180) / 3.14159);
			return degree;
		}
		public static double discriminant (double a, double b, double c) {
			return b * b - 4 * a * c;
		}
		public static double toImproperFrac (int a, int b, int c) {
			return ((a * c) + b) / c;
		}
		public static double discriminant (double a, double b, double c) {
			return b * b - 4 * a * c;
		}
		public static String toImproperFrac (int a, int b, int c) {
			String data = a * c + b + "/" + c;
			return data;
		}
		public static String toMixedNum (int a, int b) {
			String answer = a / b + "_" + a % b + "/" + 2;
			return answer;
		}
		public static String foil (int a, int b, int c, int d) {
			int first = a * c;
			int outside = a * d;
			int inside = b *c;
			int last = a * d;
			return (first + "n^2 " + outside + inside + "n" + last);
			{

	public static boolean isDivisibleBy (int numerator, int denominator) {
			if (numerator % denominator == 0) {
				return true;
			} else {
				return false;
			}
		}
	public static double absValue (double a) {
			if (a > 0) {
				return a;
			} else {
				return a * -1;
			}
		}

	public static double max (double a, double b) {
			if (a > b) {
				return a;
			} else {
				return b;
			}
	public static double max (double a, double b, double c) {
			if (a > b && a > c) {
				return a;
			} else if (b > a && b > c){
				return b;
			} else {
				return c;
			}
		}
			public static int min (int a, int b) {
				if (a < b) {
					return a;
				} else {
					return b;
				}
			}

	public static double round2 (double a) {
				double var = a % 0.01;
				double got = a - var;
				if (a < 0) {
					return a * absValue;
				} else if (var >= .005) {
					return got + .01;
		     	} else {
		     		return got;
		     	}

}
	}
