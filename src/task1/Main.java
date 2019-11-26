package task1;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class a = Car.class;
        System.out.println("Name of class: "+a.getName());
        System.out.println("Simple name of class: "+a.getSimpleName());
        System.out.println("Package of class: "+a.getPackage());
        System.out.println("Superclass: "+a.getSuperclass());
        Class [] interfaces = a.getInterfaces();
        System.out.println("Interfaces: "+interfaces[0]);
        Field [] fields = a.getFields();
        System.out.print("Public fields: ");
        for (int i = 0; i <fields.length ; i++) {
            System.out.print(fields[i]+"; ");
        }
        System.out.println();
        Field[] allFields = a.getDeclaredFields();
        System.out.print("All fields: ");
        for (int i = 0; i <allFields.length ; i++) {
            System.out.print(allFields[i]+"; ");
        }
        System.out.println();
        Method [] methods = a.getMethods();
        System.out.print("Methods of class: ");
        for (int i = 0; i <methods.length ; i++) {
            System.out.print(methods[i]+"; ");
        }
        System.out.println();
        Constructor [] constructors = a.getConstructors();
        System.out.print("Constructors of class: ");
        for (int i = 0; i <constructors.length ; i++) {
            System.out.print(constructors[i]+"; ");
        }
        System.out.println();
        int modifier = a.getModifiers();
        String stringModifier = Modifier.toString(modifier);
        System.out.println("Modifiers of class: "+stringModifier);



        System.out.println();
        System.out.println("task 2");
        Car car = new Car();
        Field field = null;
        try {
            field = a.getField("model");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            field.set(car, "Tesla");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(car.model);



        System.out.println();
        System.out.println("task 3");
        Method method = a.getMethod("myMethod", String.class);
        method.invoke(car, "someString");
        Method method1 = a.getMethod("myMethod", String.class, int.class);
        method1.invoke(car, "someString", 5 );
    }

}
