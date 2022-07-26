package regex;

import java.util.Scanner;

class MyRegex{
    String num="(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern=num + "\\." + num + "\\." + num + "\\." + num;
}

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the valid IP:");
        while(in.hasNext())
        {
            String IP= in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

	}

}
