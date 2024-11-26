public interface studentSystem {
    void createStudent(String name, String id, int year, String section);

    void readStudents();

    void updateStudents(String name, String id, int year, String section);

    void deleteStudent(String id);

}