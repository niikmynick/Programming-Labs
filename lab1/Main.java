import static java.lang.Math.*;


public class Main {

	public static void main(String[] args) {

		short[] a = new short[13];
		short temp = 16;

		for (int i = 0; i < 13; i ++) {

			a[i] = temp;
			temp--;

		}


		double[] x = new double[15];
		double min = -5.0;
		double max = 11.0;

		for (int i = 0; i < 15; i++) {

			x[i] = (random() * ((max - min) + 1)) + min;

		}


		double[][] arr = new double[13][15];

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 15; j++) {
				if (a[i] == 8) {

					double exp = cos(x[j]);
					exp = exp / 3;
					exp = pow(exp, (3 / 4) / x[j]);
					exp = pow(exp, x[j]);

					arr[i][j] = (1 / 4) * exp;

				} else if ((i >= 4 & i <= 7) | (i == 13) | (i == 15)) {

					double exp = pow(tan(x[j]), 2);
					exp = (PI / 2) + exp;

					arr[i][j] = log(exp / 3);

				} else {

					double exp = (pow((x[j] - 4), 2) + 1) / 4;
					exp = pow(exp, 3) + 2;
					exp = exp / 12;

					arr[i][j] = cos(pow(exp, 3));
				}

				System.out.printf("%.4f", arr[i][j]);
				System.out.print("  ");

			}

			System.out.println();
		}

	}

}