package labproblems.lab18;

import java.util.ArrayList;
import java.util.List;

import labsolutions.lab18.Project.Component;
import labsolutions.lab18.Project.ComponentType;

public class Project {
	private String projectName;
	private List<Component> components = new ArrayList<Component>();
	
	public Project(String name) {
		projectName = name;
	}
	
	public void addComponent(ComponentType type) {
		components.add(new Component(type, type.manufacture()));
	}
	
	public int getNumComponents() {
		return components.size();
	}
	
	public Component getComponent(int num) {
		return components.get(num);
	}
	
	public double getTotalPrice() {
		double price = 0;
		for(Component component : components) {
			price += component.type.price;
		}
		return price;
	}
	public static class ComponentType{
		
		/* TODO 
		 * Write a static nested class called ComponentType 
		 * (this class is static since the same type of component 
		 * can be used on multiple projects). 
		 * 
		 * ComponentType has the fields 
		 * 		componentName, 
		 * 		numManufactured, 
		 * 		price
		 * 
		 * A public constructor 
		 * 
		 * Methods getName() and getPrice()
		 * 
		 * A private method manufacture() that increments and 
		 * then returns numManufactured.
		 * 
		 */
		
	}
	
	public class Component{
		
		/* TODO
		 * Write an inner class called Component. 
		 * 
		 * Component has the fields 
		 * 		type (a ComponentType),
		 * 		manufactureNum, 
		 * 
		 * A private constructor, 
		 * 
		 * A toString method including the project name, 
		 * component name, manufacture number, and price.
		 * 
		 * 
		 * */
		
	}

}