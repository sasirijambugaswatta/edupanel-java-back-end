package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @PostMapping()
    public void createNewLecturer(){
        System.out.println("create Lecturer");
    }

    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("UpdateLectureDetails");
    }

    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("DeleteLcture");
    }

    @GetMapping
    public void getAllLecturers(){
        System.out.println("getAllLEctures");
    }

}
