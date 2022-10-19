package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExamples {
  public static void main(String... args) throws SQLException {
   try (var conn = DriverManager.getConnection("jdbc:derby:zoo;territory=en_US")) {
    runSelect(conn);
    runInsert(conn);
    runSelect(conn);
    runDelete(conn);
    runSelect(conn);
   }
  }

  private static void runSelect(Connection conn) throws SQLException {
    System.out.println("Running a SELECT statement.");
    var sql = "SELECT * FROM names WHERE species_id = ?";
    try (var ps = conn.prepareStatement(sql)) {
      ps.setInt(1, 2);

      try(var rs = ps.executeQuery()) {
        while(rs.next()) {
          System.out.printf("Name: %s\n", rs.getString("name"));
        }
      }
    }
  }

  private static void runInsert(Connection conn) throws SQLException {
    System.out.println("Running an INSERT statement.");
    var sql = "INSERT INTO names VALUES(?, ?, ?)";

    try (var ps = conn.prepareStatement(sql)) {
      ps.setInt(1, 6);
      ps.setInt(2, 2);
      ps.setString(3, "Fiona");

      int rows = ps.executeUpdate();
      System.out.printf("Added %d rows.\n", rows);
    }
  }

  private static void runDelete(Connection conn) throws SQLException {
    System.out.println("Running a DELETE statement.");
    var sql = "DELETE FROM names WHERE  id = ?";
    
    try (var ps = conn.prepareStatement(sql)) {
      ps.setInt(1, 6);
      
      boolean hasResult = ps.execute();

      if (hasResult) {
        System.out.println("The query produced a result.");
      } else {
        System.out.printf("Deleted %s rows.\n", ps.getUpdateCount());
      }
    }
  }
}

