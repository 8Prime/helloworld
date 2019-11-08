package helloworld;

public class lottoZahlen {

	public static void main(String[] args) {
		boolean[] lottoZahlen = new boolean[49];
		int ziehung;

		for (int i = 0; i < 6; i++) {
			do {
				ziehung = (int) (Math.random() * 48) + 1;

			} while (lottoZahlen[ziehung]);

			lottoZahlen[ziehung] = true;
		}
		for (int i = 0; i < lottoZahlen.length; i++) {

			if (lottoZahlen[i]) {
				System.out.print(i + " ");
			}
		}

	}
}
