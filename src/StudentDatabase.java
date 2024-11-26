import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;

public class StudentDatabase implements studentSystem {
    private MongoCollection<Document> studentCollection;

    public StudentDatabase() {
        MongoClient mongoClient = MongoClients.create(
                "get your own mongodb");
        MongoDatabase database = mongoClient.getDatabase("student_db");
        studentCollection = database.getCollection("students");
    }

    public void createStudent(String name, String id, int year, String section) {
        Document student = new Document("name", name)
                .append("id", id)
                .append("year", year)
                .append("section", section);
        studentCollection.insertOne(student);
        System.out.println("Successfully added new student to the database.");
    }

    public void readStudents() {
        FindIterable<Document> students = studentCollection.find();

        if (!students.iterator().hasNext()) {
            System.out.println("No students found in the database.");
            return;
        }

        System.out.println("\n---List of Students---");
        for (Document student : students) {
            System.out.println("Name: " + student.getString("name"));
            System.out.println("ID: " + student.getString("id"));
            System.out.println("Year: " + student.getInteger("year"));
            System.out.println("Section: " + student.getString("section"));
            System.out.println("--------------------");
        }
    }

    public void updateStudents(String name, String id, int year, String section) {
        Bson filter = Filters.eq("id", id);

        Document updateFields = new Document();
        if (name != null && !name.isEmpty())
            updateFields.append("name", name);
        if (year > 0)
            updateFields.append("year", year);
        if (section != null && !section.isEmpty())
            updateFields.append("section", section);

        Bson updateOperation = new Document("$set", updateFields);
        studentCollection.updateOne(filter, updateOperation);

        System.out.println("Successfully updated student info.");
    }

    public void deleteStudent(String id) {
        Bson filter = Filters.eq("id", id);
        DeleteResult result = studentCollection.deleteOne(filter);

        if (result.getDeletedCount() > 0) {
            System.out.println("Successfully deleted student with ID: " + id);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
