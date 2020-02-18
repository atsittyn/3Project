
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1                                       //1b
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 10};
		
		//1a Subtract last element from the first element of the array
		System.out.println(ages[ages.length - 1] - ages[0]);
	
		//1c
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		
		double average = sum / ages.length;
				
		System.out.println("Average age is: " + average);
	
       //2
       String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
       
       //2a
       double totalLetters = 0;
      
       for (int i=0; i< names.length; i++) {
    	   totalLetters += names[i].length();
    	   }
       
       double averageLetters = totalLetters / names.length;
       System.out.println("2a: " + averageLetters);
       
       //2b print inside for loop
       //for (int i=0; i< names.length; i++) {
       //   System.out.print(names[i] + " ");
       //}
       
       //2b print outside for loop
       String combinedNames = "";
       
       for (int i=0; i< names.length; i++) {
    	   combinedNames += names[i] + " ";
       }
       
       System.out.println(combinedNames);
       
       //3  To access the LAST element: arrayName[arrayName - 1];
       //4  To access the FIRST element: arrayName[0]; 
       
       //5
       int[] nameLengths = new int[names.length];
       
       for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
            System.out.print(nameLengths[i] + " ");
                     
       }

       System.out.println();
       
       //6
       int nameLengthsSum = 0;
       
       for (int i = 0; i < nameLengths.length; i++) {
    	   nameLengthsSum += nameLengths[i];
       }
       
       System.out.println("Sum of the name lengths: " + nameLengthsSum);
    	
       //7 output
       String result7 = multiplyString("Hello", 3);
       System.out.println(result7);
       
       //8 output
       System.out.println(createFullName("Bob", "Jones"));
       
       // 9 output
       int[] testNumbers = {50, 50, 50};
       System.out.println(isGreaterThan100(testNumbers));
       
       //10 output
       double[] testAverage = {20, 40, 25.50, 100};
       System.out.println(calcAverage(testAverage));
       
       //11 output
       double[] testAverage2 = {100.25, 300.50};
       System.out.println(isArrayAverageGreater(testAverage, testAverage2));
       System.out.println(isArrayAverageGreater(testAverage2, testAverage));
       
       //12 output
       System.out.println(willBuyDrink(true, 30)); //true
       System.out.println(willBuyDrink(false, 20)); //false
       
       //13 output
       int[] testReverse = {10, 20, 30};
       System.out.println(reverseArray(testReverse));
     
	}
	
	//7
	public static String multiplyString(String word, int n){
		String result = "";
		
		for (int i = 0; i < n; i++) {
			result += word;
		}
		
		return result; 
	}

	//8
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9
	public static boolean isGreaterThan100(int[] numbers) {
		int sum = 0; 
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
	 
	return sum > 100;
	}
	
	//10
	public static double calcAverage(double[] numbers) {
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
		    sum += numbers[i];			
		}
	
		return sum / numbers.length;		
	}
	
	//11
	public static boolean isArrayAverageGreater(double[] a1, double[] a2) {
		
		return calcAverage(a1) > calcAverage(a2);				
		}
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	
	}
	
	//13 
	//Create a method that takes an array of in and returns the numbers in reverse order
	public static int reverseArray(int[] numbers) {
		int sum = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
	    System.out.print(numbers[i] + " ");
		}
		
	    return sum; 
	}
}
