import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a hash map
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));

	      // Show all balances in hash table.
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
		
	}

}
