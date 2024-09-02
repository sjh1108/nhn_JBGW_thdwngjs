import java.lang.annotation.*;

//
// To-do: add Annotations here
//
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeviceInformation {
    String type() default "device";
    String model();   
}