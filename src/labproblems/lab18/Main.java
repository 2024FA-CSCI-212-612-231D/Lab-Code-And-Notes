package labproblems.lab18;

import labsolutions.lab18.Project;

public class Main {
    public static void main(String[] args) {
        // Create a Project
        Project project = new Project("Space Exploration");

        // Create ComponentTypes (Static Nested Class)
        Project.ComponentType engine = new Project.ComponentType("Rocket Engine", 1_000_000); // In Java, underscores (_) in numeric literals are a formatting feature introduced in Java 7 to improve code readability. They serve no functional purpose and are ignored by the compiler
        Project.ComponentType fuelTank = new Project.ComponentType("Fuel Tank", 500_000);
        Project.ComponentType navigationSystem = new Project.ComponentType("Navigation System", 200_000);

        // Add components to the Project
        project.addComponent(engine);
        project.addComponent(fuelTank);
        project.addComponent(navigationSystem);
        project.addComponent(fuelTank); // Adding a second fuel tank

        // Display Project Information
        System.out.println("Project Name: " + project.getComponent(0).toString().split(":")[0]); // Gets the first component added, uses the : as a substring delimiter, and gets the first substring which is the name of the project
        System.out.println("Number of Components: " + project.getNumComponents());
        System.out.println("Total Price: $" + project.getTotalPrice());

        // Display Individual Components
        System.out.println("\nComponents List:");
        for (int i = 0; i < project.getNumComponents(); i++) {
            System.out.println("  " + project.getComponent(i).toString());
        }
    }
}
