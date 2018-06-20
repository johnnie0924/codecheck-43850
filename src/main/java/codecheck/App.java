package codecheck;

import java.util.LinkedHashMap;

public class App {
	public static void main(String[] args) {
		LinkedHashMap checkMap = new LinkedHashMap();
		long target = 0;
		for (int i = 0, l = args.length; i < l; i++) {
			if (args[i].contains(":")) {
				String[] ar = args[i].split(":");
				checkMap.put(Long.parseLong(ar[0]), ar[1]);
			}else {
				target = Long.parseLong(args[i]);
			}
		}
		String output = "";

		for (Object key : checkMap.keySet()) {
			if(target % (long)key == 0) {
				output = output + checkMap.get(key);
			}
		}
//		for(int i = 0, l = checkMap.size(); i < l; i++) {
//			if(target % checkMap.get(key))
//		}
	}
}
