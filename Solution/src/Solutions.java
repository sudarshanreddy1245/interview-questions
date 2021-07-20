import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

class Result {

    /*
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
    
    List<String> result = repository.stream().filter(x -> x.startsWith(customerQuery)).collect(Collectors.toList());
    List<String> result1 = result.stream().sorted().limit(3l).collect(Collectors.toList());
    return new ArrayList(result1);

    }

}

public class Solutions {
	public static void main(String[] args) {
		/*
		 * String[] repository = {"mobile", "mouse", "moneypot", "mousepad", "monitor"};
		 * List<List<String>> result =
		 * Result.searchSuggestions(Arrays.asList(repository), "mous");
		 * 
		 * Stream<String> test =
		 * result.stream().map(r->r.stream().collect(Collectors.joining(" ")) );
		 */
	//test.map(r -> r + "\n").forEach(e -> System.out.println(e));
		
		/*
		 * result.stream() .map( r -> r.stream() .collect(joining(" ")) ) .map(r -> r +
		 * "\n") .collect(toList()) .forEach(e -> { try { bufferedWriter.write(e); }
		 * catch (IOException ex) { throw new RuntimeException(ex); } });
		 */
		Employee e1 = new Employee(1, "Sudharshan");
		Employee e2 = new Employee(2, "Reddy");
		Employee e3 = new Employee(2, "Rani");
		
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(e1);l1.add(e2);
		
		List<Employee> l2 = new ArrayList<Employee>();
		l2.add(e1);l2.add(e3);
		
		l1.retainAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		
		
		
	}
}

class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}