package interfacejava8;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import practice.Department;

public class FunctinalInterfaceDemo {

	public static void main(String[] args) {

		Supplier<Department> supplier = Department::new;
		Department dept = supplier.get();
		dept.setDeptId(1);
		dept.setDeptName("Finance");

		System.out.println("Department Id =" + dept.getDeptId() + " Name = " + dept.getDeptName());

		Consumer<String> consumer = System.out::println;
		consumer.accept(dept.getDeptName());

		BiConsumer<Integer, String> biconsumer = (id, name) -> {
			System.out.print(id);
			System.out.println(name);

		};
		biconsumer.accept(dept.getDeptId(), dept.getDeptName());

		Predicate<String> predicate = (name) -> name.startsWith("n");

		boolean predicateVal = predicate.test(dept.getDeptName());
		System.out.println(predicateVal);

		BiPredicate<String, Integer> bipredicate = (name, len) -> name.length() == len;
		boolean bipredicateVal = bipredicate.test(dept.getDeptName(), 7);
		System.out.println(bipredicateVal);

		Function<String, Integer> func = name->name.length();
		int len = func.apply(dept.getDeptName());
		System.out.println(len);
		
		BinaryOperator<Integer> bi=(a,b)->a+b;
		System.out.println(bi.apply(4, 3));
		
		UnaryOperator<Integer> un=(a)->a+1;
		System.out.println(un.apply(5));

	}

}
