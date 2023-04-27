package ch17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Kosa");

		Iterator<String> listIter = list.iterator();
		while (listIter.hasNext()) {
			String data = listIter.next();
			System.out.println(data);
		}

		// 1.5 Enhanced for loop
		for (String data : list) {
			System.out.println(data);
		}

		// 1.8
		Stream<String> stream = list.stream();
		stream.forEach(item -> System.out.println(item));

		// 길이가 4보다 큰 list의 문자열의 길이 총 합은
		int sum = 0;
		for (String data : list) {
			if (data.length() > 4) {
				sum = sum + data.length();
			}
		}
		System.out.println(sum);
		Stream<String> stream2 = list.stream();
		Stream<String> filterStream = stream2.filter(item -> item.length() > 4);
		IntStream mapStream = filterStream.mapToInt(item -> item.length());
		int result = mapStream.sum();
		System.out.println(result);

		int result2 = list.stream().filter(item -> item.length() > 4).mapToInt(item -> item.length()).sum();
		System.out.println(result2);
	}

}
