package lk.ijse.dep11.edupanel.api;

import lk.ijse.dep11.edupanel.to.request.LecturerRequestTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/lecturers")
@CrossOrigin

public class LecturerHttpController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data",produces = "application/json")
    public void createNewLecturer(@ModelAttribute @Valid LecturerRequestTO lecturer){
        System.out.println(lecturer);
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
