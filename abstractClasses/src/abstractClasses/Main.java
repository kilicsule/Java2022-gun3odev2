package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanCalculator = new WomanGameCalculator();
		womanCalculator.hesapla();
		womanCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
