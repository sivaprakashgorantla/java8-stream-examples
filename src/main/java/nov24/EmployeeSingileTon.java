package nov24;

import java.util.Collections;
import java.util.List;

final class Employee {
    private final String name;
    private final int id;
    private final List<String> skillset;
    
 // Constructor to initialize all fields
    public Employee(String name, int id, List<String> skillset) {
        this.name = name;
        this.id = id;
        // Creating an unmodifiable copy of the list to ensure immutability
        this.skillset = Collections.unmodifiableList(skillset);
    }

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public List<String> getSkillset() {
		return skillset;
	}
    
    
}
public class EmployeeSingileTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
