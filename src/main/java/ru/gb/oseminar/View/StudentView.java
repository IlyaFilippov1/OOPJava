package ru.gb.oseminar.View;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendToConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users) {
            logger.info(user.toString());

        }
    }


    public void showStudents(List<Student> students) {
        Logger logger = Logger.getLogger(StudentView.class.getName());

        for (User user : students) {
            logger.info(user.toString());

        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }


}
