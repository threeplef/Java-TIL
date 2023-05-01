package ch19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class GsonExample {
	public static void main(String[] args) {
		List<Member> membersList = new ArrayList<>();
		membersList.add(new Member("홍길동", 20, 3000.0, "hong@hong.com"));
		membersList.add(new Member("홍길서", 22, 6000.0, "kil@hong.com"));
		membersList.add(new Member("홍길남", 21, 4000.0, "south@hong.com"));
		Gson gson = new Gson();
		String json = gson.toJson(membersList);
		System.out.println(json);
		System.out.println(gson.toJson(membersList.get(0)));
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "a1");
		map.put("b", "a2");
		System.out.println(gson.toJson(map));
	}

}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Member {
	private String name;
	private int age;
	private double salary;
	private String email;

}