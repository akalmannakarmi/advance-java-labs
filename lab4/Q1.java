import java.sql.*;

public class Q1 {
    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "user";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            Statement stmt = conn.createStatement();

            // INSERT 10 rows using PreparedStatement
            String insertSQL = "INSERT INTO student (id, name, age, grade) VALUES (?, ?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(insertSQL);
            for (int i = 1; i <= 10; i++) {
                psInsert.setInt(1, i);
                psInsert.setString(2, "Student " + i);
                psInsert.setInt(3, 18 + (i % 5));   // Ages 18-22
                psInsert.setString(4, "Grade " + (char)('A' + (i % 4)));
                psInsert.executeUpdate();
            }
            System.out.println("Inserted 10 students.\n");

            // RETRIEVE students age > 20 using ResultSet
            String selectSQL = "SELECT * FROM student WHERE age > 20";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("Students with age > 20:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") +
                        " | Age: " + rs.getInt("age") + " | Grade: " + rs.getString("grade"));
            }
            System.out.println();

            // UPDATE grade for a student with specific id
            String updateSQL = "UPDATE student SET grade = ? WHERE id = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateSQL);
            psUpdate.setString(1, "Grade X");
            psUpdate.setInt(2, 5);
            int rowsUpdated = psUpdate.executeUpdate();
            System.out.println("Updated " + rowsUpdated + " row(s).\n");

            // DELETE student with age < 19
            String deleteSQL = "DELETE FROM student WHERE age < ?";
            PreparedStatement psDelete = conn.prepareStatement(deleteSQL);
            psDelete.setInt(1, 19);
            int rowsDeleted = psDelete.executeUpdate();
            System.out.println("Deleted " + rowsDeleted + " student(s).\n");

            // FINAL LIST
            rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("Final list of students:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") +
                        " | Age: " + rs.getInt("age") + " | Grade: " + rs.getString("grade"));
            }

        } catch (Exception e) {
            System.out.println("Out Erro:");
            e.printStackTrace();
        }
    }
}
