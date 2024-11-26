public class Student {
    int year;

    String id;
    String name;
    String section;

    Student(String name, String id, String section, int year) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.year = year;
    }

    void display() {
        String output = String.format("%-10s: %-20s%n" +
                "%-10s: %-20s%n" +
                "%-10s: %-20s%n" +
                "%-10s: %-20s%n",
                "Name", name,
                "Id", id,
                "Section", section,
                "Year", year);
        System.out.println(output);
    }

}