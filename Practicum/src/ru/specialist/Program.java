package ru.specialist;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Сергей", 38));
		persons.add(new Person("Дарья", 7));
		persons.add(new Person("Глафира", 3));
		persons.add(new Person("Александр", 6));
		persons.add(new Person("Анна", 18));
		
		int summa=0;
		int adult =0;
		for(Person p:persons)
			if (p.getAge()>=18) {
				summa += p.getAge();
				adult++;
			}
		double  average = (double)summa/adult;
		System.out.println("Imperative= "+average);
		average = persons.stream().
		filter(p->p.getAge()>=18).
		mapToInt(p->p.getAge()).average().getAsDouble();
		System.out.println("Declarative= "+average);
		
//	for(Person p:persons )
//		System.out.println(p);
		persons.stream().
		filter(p -> p.getAge() >= 18).
		sorted( (p1,p2)->p1.getName().compareTo(p2.getName())).
		map(p->p.getName()).
		forEach(
				(String name) -> System.out.println(name)
				//System.out::println
				);

	}
}
