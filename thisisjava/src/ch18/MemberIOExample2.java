package ch18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MemberIOExample2 {
	public static void main(String[] args) {
		List<Member1> memberList = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("member.ser");
			ois = new ObjectInputStream(fis);
			memberList = (List<Member1>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
			}
		}
//		memberList.add(new Member1("홍길동", 20, 30000, "hong@hong.com"));
//		memberList.add(new Member1("홍길서", 22, 20000, "hong@hong.com"));
//		memberList.add(new Member1("홍길남", 28, 35000.2, "hong@hong.com"));
//		ObjectOutputStream oos = null;
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("member.ser");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(memberList);
//			System.out.println("data saved");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
class Member1 implements Serializable {
	private String name;
	private int age;
	private double salary;
	private String email;

	public String toCSV() {
		return name + ", " + age + ", " + salary + ", " + email;
	}
}
