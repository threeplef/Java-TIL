package ch18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MemberIOExample {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<>();
		FileInputStream reader = null;
		DataInputStream in = null;
		try {
			reader = new FileInputStream("member.data");
			in = new DataInputStream(reader);
			while (true) {
				String name = in.readUTF();
				if (name == null || name.trim().length() == 0) {
					break;
				}
				int age = in.readInt();
				double salary = in.readDouble();
				String email = in.readUTF();
				memberList.add(new Member(name, age, salary, email));
			}
			System.out.println(memberList.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}
//		memberList.add(new Member("홍길동", 20, 30000, "hong@hong.com"));
//		memberList.add(new Member("홍길서", 22, 20000, "hong@hong.com"));
//		memberList.add(new Member("홍길남", 28, 35000.2, "hong@hong.com"));
//		FileOutputStream fos = null;
//		DataOutputStream out = null;
//		try {
//			fos = new FileOutputStream("member.data");
//			out = new DataOutputStream(fos);
//			for (Member m : memberList) {
//				out.writeUTF(m.getName());
//				out.writeInt(m.getAge());
//				out.writeDouble(m.getSalary());
//				out.writeUTF(m.getEmail());
//			}
//			System.out.println("File saved");
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				out.close();
//			} catch (Exception e) {
//			}
//		}
	}

}

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
class Member {
	private String name;
	private int age;
	private double salary;
	private String email;

	public String toCSV() {
		return name + ", " + age + ", " + salary + ", " + email;
	}
}
