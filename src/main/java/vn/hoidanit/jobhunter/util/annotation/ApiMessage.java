package vn.hoidanit.jobhunter.util.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // phạm vị method
public @interface ApiMessage {
    String value(); // truyền thêm giá trị cho annotation
}
