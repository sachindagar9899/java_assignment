package whapper;
public class doubleconversion {
    public static void main(String[] args) {
     
        Double doubleObj = 45.67;

     
        double primitiveDouble = doubleObj.doubleValue();

        
        int intValue = (int) primitiveDouble;

   
        System.out.println("Double object value: " + doubleObj);
        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Primitive int value (casted): " + intValue);
    }
}



