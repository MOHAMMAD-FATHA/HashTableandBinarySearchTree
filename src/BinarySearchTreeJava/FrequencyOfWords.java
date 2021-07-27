package BinarySearchTreeJava;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWords {

	static void countFreq(String str) {

		Map<String, Integer> map = new TreeMap<>();
		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// Remove avoidable word from the phrase
			if(entry.getKey().equals("avoidable"))
				continue;
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	public static void main(String[] args) {
//        String str = "To be or not to be";
//        countFreq(str);
		String paraString = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations ";
		countFreq(paraString);

	}

}
