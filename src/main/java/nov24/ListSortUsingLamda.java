package nov24;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListSortUsingLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentList = Arrays.asList(new Student(1, "ABVC", 45555.00), new Student(2, "BVCA", 45555.00),
				new Student(3, "VCAB", 45555.00), new Student(4, "CABF", 45555.00), new Student(5, "PARA", 45555.00),
				new Student(6, "MNOP", 45555.00), new Student(7, "XUZA", 45555.00), new Student(8, "RASA", 45555.00),
				new Student(9, "IJKL", 45555.00), new Student(10, "KTRA", 45555.00)

		);

		studentList.sort(Comparator.comparing(Student::getName));
		studentList.stream().forEach(System.out::println);

		System.out.println("--------------------------------------");

		int n = 2;
		Optional.ofNullable(studentList).map(m -> m.stream().distinct()
				.sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).skip(n - 1).findFirst())
				.ifPresent(student -> System.out.println(student.get()));

		System.out.println("--------------------------------------");
		Optional.ofNullable(studentList).map(m -> m.stream().distinct()
				.sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).skip(n - 2).findFirst())
				.ifPresent(student -> System.out.println(student.get()));

		System.out.println("--------------------------------------");
	
		Optional.ofNullable(studentList).map(m -> m.stream().distinct()
				.sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).skip(n-0).findFirst())
		.ifPresent(s -> System.out.println(s.get()));
		
	}

}
