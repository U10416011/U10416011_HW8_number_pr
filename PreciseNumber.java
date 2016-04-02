
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


			}
		}
}