package vardhan.javaprograms;
/*To create a custom immutable class in Java to store configurations, you need to follow these basic principles:
Declare the class as final so it cannot be subclassed.
Declare all fields as private and final to prevent modification after initialization.
Do not provide setter methods.
Ensure deep copying of mutable fields if the class contains references to mutable objects.*/

public final class Configurations {
    private final String appName;
    private final int maxUsers;
    private final boolean isFeatureEnabled;
    private final String[] supportedLanguages;

    // Constructor to initialize all fields
    public Configurations(String appName, int maxUsers, boolean isFeatureEnabled, String[] supportedLanguages) {
        this.appName = appName;
        this.maxUsers = maxUsers;
        this.isFeatureEnabled = isFeatureEnabled;
        
        // Creating a deep copy of the array to ensure immutability
        this.supportedLanguages = supportedLanguages.clone();
    }

    // Getter methods to access field values
    public String getAppName() {
        return appName;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public boolean isFeatureEnabled() {
        return isFeatureEnabled;
    }

    public String[] getSupportedLanguages() {
        // Returning a copy of the array to maintain immutability
        return supportedLanguages.clone();
    }

    @Override
    public String toString() {
        return "Configurations{" +
                "appName='" + appName + '\'' +
                ", maxUsers=" + maxUsers +
                ", isFeatureEnabled=" + isFeatureEnabled +
                ", supportedLanguages=" + String.join(", ", supportedLanguages) +
                '}';
    }
    public static void main(String[] args) {
        String[] languages = {"English", "Spanish", "French"};
        
        // Creating an immutable configuration object
        Configurations config = new Configurations("MyApp", 1000, true, languages);

        // Accessing values using getter methods
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Max Users: " + config.getMaxUsers());
        System.out.println("Feature Enabled: " + config.isFeatureEnabled());
        System.out.println("Supported Languages: " + String.join(", ", config.getSupportedLanguages()));
        
        // Ensuring immutability
        languages[0] = "German";  // Modify the original array
        System.out.println("\nModified original languages array:");
        System.out.println("Supported Languages (from config): " + String.join(", ", config.getSupportedLanguages()));
    }
}
