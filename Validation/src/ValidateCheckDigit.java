import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ValidateCheckDigit {

	public static void main(String[] args)  throws IOException
	{

		File fs = new File("AccountNumbers");
		Scanner sc = new Scanner(fs);
		while(sc.hasNextLine())
		{
			int sum = 0;
			String val = sc.nextLine();
			var accNum = val.toCharArray();
			for(int i = 0; i <= accNum.length-2; i++  )
			{
				sum +=Integer.parseInt(String.valueOf(accNum[i]));
			}
			
			if(sum % 10 == Integer.parseInt(String.valueOf(accNum[accNum.length-1])))
			{
				System.out.println(val + " is valid input.");
			}
			else 
			{
				System.out.println(val + " is not valid input.");
			}
		}
		sc.close();
	}

	
}
