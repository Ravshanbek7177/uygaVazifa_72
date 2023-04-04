package com.example.uygavazifa_72.controller;

import com.example.uygavazifa_72.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
@Autowired
   private Stu;
@PostMapping("/create")
private ResponseEntity<?> create(@RequestBody StudentDto studentDto){

}


}
