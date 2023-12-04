package lk.ijse.dep11.edupanel.to.request;

import lk.ijse.dep11.edupanel.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LecturerRequestTO implements Serializable{
    @NotBlank(message = "name cannot be empty")
    @Pattern(regexp = "^[A-Za-z]+$",message = "Invalid name")
    private String name;
    @NotBlank(message = "Designation cant'be empty")
    @Length(min = 2,message = "Invalid designation")
    private String designation;
    @NotBlank(message = "Designation cant's empty")
    @Length(min = 2,message = "Invalid Qualification")
    private String qualification;
    @NotBlank(message = "Type cant's empty")
    @Pattern(regexp = "^(full-time|part-time)$",flags = Pattern.Flag.CASE_INSENSITIVE,message = "Invalid type")
    private String type;
    @LecturerImage
    private MultipartFile picture;
    @Pattern(regexp = "^http[s]?://.+$",message = "Invalid linkedin url")
    private String linkedin;
}
