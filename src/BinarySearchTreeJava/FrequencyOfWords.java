package BinarySearchTreeJava;

import java.util.Map;
import java.util.TreeMap;

/*
 * @author Mohammad Fatha
 * Purpose to create mothod to calculate the frequency of words in sentence
 */
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
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	public static void main(String[] args) {
//        String str = "To be or not to be";
//        countFreq(str);
		String paraString = "To be or not to be";
		countFreq(paraString);

	}
}
