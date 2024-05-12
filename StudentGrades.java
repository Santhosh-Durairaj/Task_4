package Task_4;

import java.util.HashMap;

class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("No grade found for " + name);
        }
    }
}

