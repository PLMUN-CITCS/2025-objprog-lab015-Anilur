public class VariableScope {  
    static int globalCount = 100;

    // Main method
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        int localCount = 50; // Local variable
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }

} // End of class
