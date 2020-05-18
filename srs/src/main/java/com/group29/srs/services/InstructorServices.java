package com.group29.srs.services;

import com.group29.srs.model.*;
import com.group29.srs.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServices {
    @Autowired
    InstructorRepository instructorRepository;

    public List<InstructorGivenCourses> getTakenCourses(Long id, String semester, int year ){
        return instructorRepository.getInstructorGivenCourses(id, semester , year);
    }

    public List<Ta_InstructorInfo> getInstructorInfoById(Long id){
        return instructorRepository.getInstructorInfoById(id);
    }

    public void insertInstructor(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String phone_number, String dept_code){
        instructorRepository.insertInstructor(id, firstname, lastname, mail, password, office_no, office_hours,phone_number,dept_code);
    }

    public List<WeeklySchedule> getInstructorWeeklySchedule(Long id, String semester, int year ){
        return instructorRepository.getInstructorWeeklySchedule(id, semester , year);
    }

    //section_id girmen gerek ona dikkat et.Birde bu section_id yi buttona tıkladıktan sonra elde edersin.Onu da mapliyom
    public List<LetterGrades> getGrades(long section_id,long course_id, String semester, int year){
        return instructorRepository.getGrades( section_id,course_id, semester, year);
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return instructorRepository.getButtonNames(id,semester,year);
    }

    public void setLetterGrades(long section_id, String letter_grade, long student_id,String semester,int year){
        instructorRepository.setLetterGrades(section_id,letter_grade, student_id, semester,year);
    }

    public List<TeachingAssistantList> getTeachingAssistants(long course_id, long instructor_id){
        return instructorRepository.getTeachingAssistants(course_id,instructor_id);
    }

    public void assignTask(long task_id, String task_type, long instructor_id, long ta_id){
        instructorRepository.assignTask(task_id, task_type,instructor_id,ta_id);
    }
}
