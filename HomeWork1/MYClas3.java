import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class third {

	
public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		double c1 = 1.59;
		double c2 = 2.13;
		double c3 = 3.95;

		System.out.println("enter minutes in first country?");
		double t1 = Double.parseDouble(reader.readLine());
		System.out.println("enter minutes in second country?");
		double t2 = Double.parseDouble(reader.readLine());
		System.out.println("enter minutesin third country?");
		double t3 = Double.parseDouble(reader.readLine());

		double p1 = c1 * t1;
		double p2 = c2 * t2;
		double p3 = c3 * t3;
		double pm = p1 + p2 + p3;

		System.out.println("In first country you paid:" + p1);
		System.out.println("In second country you paid:" + p2);
		System.out.println("In third country you paid:" + p3);
		System.out.println("In common you paid:" + pm);
		
		
	}
}