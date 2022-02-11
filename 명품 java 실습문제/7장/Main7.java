import java.util.*;

class HV{
	public static Vector<String> hashToVector(HashMap<String,String> h){
		Vector<String> temp = new Vector<String>();
		Set<String> keys = h.keySet();
		for(String s : keys) {
			temp.add(h.get(s));
		}
		return temp;
	}
}
public class Main7 {
	
	public static void main(String[] args)
	{
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = HV.hashToVector(h);
		for(int n = 0;n<v.size();n++) {
			System.out.println(v.get(n));
		}
	}
}