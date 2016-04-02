
import java.math.BigDecimal;

public class PreciseNumber {
		void Precise(String s,String n1,String n2){//calculate numbers precisely
		
			BigDecimal a = new BigDecimal(n1);
			BigDecimal b = new BigDecimal(n2);
		
			switch(s){
				case "add":
					System.out.println(a.add(b));
					break;
				case "sub":
					System.out.println(a.subtract(b));
					break;
				case "mul":
					System.out.println(a.multiply(b));
					break;
				case "div":
					System.out.println(a.divide(b,100,BigDecimal.ROUND_HALF_UP));//after decimal point 100
					break;
				default:
					System.out.println("ERROR");
					break;

			}
		}
}