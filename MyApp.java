public class MyApp {

	// comment
	/*
	comment
	comment
	comment
	*/

	public static void main(String[] args) {
		// char a = 'a';
		// // byte short int long
		// int x = 10;
		// long y = 5555555L;
		// // float double
		// double d = 23423.344;
		// float f = 32.33F;

		// boolean flag = true; //false

		//String msg;
		//msg = "Hello World Again!";
		// String msg = "Hello Wo\nrld Again\t!";

		// System.out.println(msg);

		// double d = 52423.231;
		// int i = (int)d;
		// System.out.println(i);

		int i = 10;
		double d = (double)i / 4;
		System.out.println(d);

		int score = 45;
		// if (score > 80) {
		// 	System.out.println("Great!");			
		// } else if (score > 60) {
		// 	System.out.println("Good!");
		// } else {
		// 	System.out.println("so so ...!");
		// }
		String msg = score > 80 ? "Great!" : "so so ... !";
    	System.out.println(msg);

    	String signal = "green";
    	switch (signal) {
    		case "red":
    			System.out.println("stop!");
    			break;
    		case "blue":
    		case "green":
    			System.out.println("go!");
    			break;
    		case "yellow":
    			System.out.println("caution!");
    			break;
    		default:
    			System.out.println("wrong signal!");
    			break;
    		}
	}


}