package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudyGroup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Ilia", "Filippov", "Stanislavovich");
        controller.createUser("Igor", "Redkin", "Viktorovich");
        controller.createUser("Anna", "Ivanova", "Alexandrovna");
        // controller.showAllStudents();
        List<StudyGroup> studyGroup = controller.createTimeTable(controller.getOnlyStudents(),
                controller.createTeacher("Viktor", "Big", "Nikitich", 111L));
        controller.showStudyGroups(studyGroup);
    }

}
