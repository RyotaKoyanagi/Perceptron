package perceptron;

/*
計算結果
Correct! : input(1.0,1.0) to output(1.0)
Correct! : input(1.0,0.0) to output(0.0)
Correct! : input(0.0,1.0) to output(0.0)
Correct! : input(0.0,0.0) to output(0.0)
Check : nu = 0.35, 0.2

*/
public class Perceptron_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nu[] = {0.35, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);

		//学習データ
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};

		//学習
		int index;
		for(int i = 0; i < 100; i++){
			index = (int)(Math.random()*4);//0~3の乱数発生
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}

		//結果確認
		for(int i = 0; i < output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
	}
}