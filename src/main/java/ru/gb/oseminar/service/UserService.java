package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }


    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentId()) {
                    id = ((Student) item).getStudentId();
                }

            }

        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }

    public Teacher createUser(String firstName, String lastName, String patronymic, Long teacherId) {
        return new Teacher(firstName, lastName, patronymic, teacherId);
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentId())) {
                    this.users.remove(item);
                }
            }
        }
    }
    public List<Student> getAllStudents(){
        List <Student> listStudents = new ArrayList<>();
        for (User user:this.getAll()
        ) {
            if(user instanceof Student){
                listStudents.add((Student) user);

            }

        }

        return listStudents;
    }

}
