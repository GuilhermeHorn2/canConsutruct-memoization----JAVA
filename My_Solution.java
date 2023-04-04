package misc;

import java.util.HashMap;

public class main_misc {
	//private static long[][] cache = new long[999][999];//
    //private static String[] cache = new String[999]; 
	private static HashMap<String,Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		
		//
     String a =  "skateboard";
     String[]v = {"bo","rd","ate","t","ska","sk","boar"};
     System.out.println(canConstruct(a,v));
   

		
	}
	
	private static int canConstruct(String t,String[]v) {
		//
		if(t.equals("")) {
			return 1;
		}
		if(cache.containsKey(t)) {
			return cache.get(t);
		}
		for(int i = 0;i < v.length;i++) {
			//
			String s = t.replaceFirst(v[i],"");
			if(s.length() < t.length() && canConstruct(s,v) == 1) {
				//if you found something in t that can be replaced,we can continue to see if we can form the word
				//true
				cache.put(t, 1);
				return 1;
			}
			if(s.length() == t.length()) {
				//you found no substring v[i] substring in t,so this path is "bad"
				//false
				cache.put(t, -1);
				return -1;
			}
		}
		//false
		cache.put(t, -1);
		return -1;
	}
	
	}
	


	
