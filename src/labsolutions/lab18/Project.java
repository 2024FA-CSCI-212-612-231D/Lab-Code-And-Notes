package labsolutions.lab18;

import java.util.ArrayList;
import java.util.List;

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
		
		private final String componentName;
		private int numberManufactured;
		private final double price;
		
		public ComponentType(String componentName, double price) {
			this.componentName = componentName;
			this.price = price;
		}
		
		public String getName() {
			return componentName;
		}
		
		public double getPrice() {
			return price;
		}
		
		private int manufacture() {
			numberManufactured++;
			return numberManufactured;
		}
		
	}
	
	public class Component{
		
		private final ComponentType type;
		private final int manufactureNum;
		
		public Component(ComponentType type, int num) {
			this.type = type;
			manufactureNum = num;
		}
		
		public String toString() {
			return projectName + ": " + type.getName() + " #" + manufactureNum + ", $" + type.getPrice();
		}
		
	}

}