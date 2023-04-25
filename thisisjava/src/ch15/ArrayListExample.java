package ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(100);
		list.add(new Board("1", "2", "3"));
		for (Object obj : list) {
			System.out.println(obj);
		}

		list.remove(1);
		for (Object obj : list) {
			System.out.println(obj);
		}

		List<Board> boardList = new ArrayList<>();
//		boardList.add("Hello");
		boardList.add(new Board("1", "1", "1"));
		boardList.add(new Board("2", "2", "2"));
		boardList.add(new Board("3", "3", "3"));
		boardList.add(new Board("4", "4", "4"));
		for (Board board : boardList) {
			System.out.println(board);
		}

	}

}
