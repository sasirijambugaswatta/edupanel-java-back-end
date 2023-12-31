package lk.ijse.dep11.edupanel.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LecturerImageConstraintsValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LecturerImage {
    long maxFileSize() default (1024*512);
    String message() default ":Invalid image or file size exceed more than {maximumFileSize}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
