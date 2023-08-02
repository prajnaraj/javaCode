package OOps_Coltn;
import java.util.ArrayList;
import java.util.Collections;


public class DemoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		  list.add("YYYY ");
		  list.add("VFFF");
		  list.add("ZZZZ");
		  list.add("VFFF");
		  list.add("ZZZZ");

		  list.remove(0);
		  
		  Collections.sort(list);
		       System.out.println(list);

	}

}
