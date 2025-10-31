package whapper;
public class data_logger {
    // Method accepting Double object (wrapper)
    public static void storeTemperature(Double temp) {
        if (temp == null) {
            System.out.println("No temperature data available.");
        } else {
            // Auto-unboxing happens here when printing
            System.out.println("Stored temperature: " + temp);
        }
    }

    public static void main(String[] args) {
        // Primitive double temperature
        double tempPrimitive = 23.5;

        // Wrapper Double temperature
        Double tempWrapper = 27.8;

        // Auto-boxing primitive double to Double object when passing to method
        storeTemperature(tempPrimitive);

        // Passing Double object directly
        storeTemperature(tempWrapper);

        // Passing null
        storeTemperature(null);
    }
}



