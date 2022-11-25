package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public List<StudyGroup> fillingOfStudyGroup(List<Student> students, Teacher teacher){
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(new StudyGroup(students, teacher));
        return studyGroupList;
    }
}
