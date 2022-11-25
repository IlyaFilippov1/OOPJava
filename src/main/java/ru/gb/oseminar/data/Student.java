package ru.gb.oseminar.data;

public class Student extends User {
    private Long studentId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, String patronymic, Long studentId) {
        super(firstName, lastName, patronymic);
        this.studentId = studentId;

    }
}
