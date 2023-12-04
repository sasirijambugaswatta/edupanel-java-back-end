package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void arrangePartTimeLecturerOrder(){
        System.out.println("arrangePartTimeLecturerOrder");
    }
    @GetMapping()
    public void getAllPartTimeLecturers(){
        System.out.println("getAllPartTimeLecturers");

    }
}
