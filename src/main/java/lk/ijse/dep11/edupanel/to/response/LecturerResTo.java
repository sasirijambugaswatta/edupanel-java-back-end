package lk.ijse.dep11.edupanel.to.response;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerResTo {
    private Integer id;
    private String name;
    private String designation;
    private String qualification;
    private String type;
    private String pictureUrl;
    private String linkedIn;
}
