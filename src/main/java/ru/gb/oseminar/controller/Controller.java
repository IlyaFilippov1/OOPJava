package ru.gb.oseminar.controller;

import ru.gb.oseminar.View.StudentView;
import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
        return userService.createUser(firstName, lastName, patronymic, teacherId);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendToConsole(students);
    }

    public List<Student> getOnlyStudents() {
        return userService.getAllStudents();
    }

    public void showTeacher(Teacher teacher) {
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendToConsole(teachers);
    }

    public List<StudyGroup> createTimeTable(List<Student> studentList, Teacher teacher) {
        return studyGroupService.fillingOfStudyGroup(studentList, teacher);

    }
    public void showStudyGroups(List<StudyGroup> studyGroups){
        studentView.showStudyGroups(studyGroups);
    }

    public void showSortedGroup(List<Student> studentList) {
        Collections.sort(studentList, new StudyGroupComparator());
        studentView.showStudents(studentList);
    }





}
