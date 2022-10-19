import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Curd {

	public void select() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver"); //

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc", "root", "root");

		Statement stmt = con.createStatement();
		System.out.println("--------------Second Project--------------");
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1:Display");
			System.out.println("2:Insert");
			System.out.println("3:Update");
			System.out.println("4:Delete");

			System.out.println("Enter your choice");

			ch = sc.nextInt();

			try {
				if (ch != 1 || ch != 2 || ch != 3 || ch != 4 || ch != 0) {
					throw new InvalidInput(" ");
				}
				
			} catch (InvalidInput e) {
				System.out.println(e.getMessage());
			}

			switch (ch) {
			case 1:
				ResultSet rs = stmt.executeQuery("SELECT * FROM student");

				while (rs.next()) {
					String studentId = rs.getString(1);
					String studentName = rs.getString(2);
					String Rollno = rs.getString(3);
					System.out.println(studentId + " " + studentName + " " + Rollno);

				}
				System.out.println("--------------Display Successfully--------------");

				break;
			case 2:
				try {
					PreparedStatement ps = con
							.prepareStatement("insert into student(studentId,studentName,Rollno)values(?,?,?)");
					ps.setString(1, "41");
					ps.setString(2, "smita");
					ps.setString(3, "76");
					int i = ps.executeUpdate();

					System.out.println("Record is inserted" + i);
					Statement statement = con.createStatement();

				} catch (SQLException e) {
					if (e instanceof SQLIntegrityConstraintViolationException) {
						// Duplicate entry
						System.out.println("--------------You Inserted Duplicate Entry!!!!--------------");
						System.out.println("----Enter 2 For Add New Entry----");
					} else {
						System.out.println("--------------Inserted Successfully!!!!--------------");
					}
				}
				break;

			case 3:
				PreparedStatement ps1 = con
						.prepareStatement("update student set studentName=?, Rollno=? where studentId=?");
				ps1.setString(1, "1016125");
				ps1.setString(2, "om");
				ps1.setString(3, "1");
				int j = ps1.executeUpdate();
				System.out.println("Record updated." + j);
				System.out.println("--------------Updated Successfully!!!!--------------");
				break;
			case 4:
				PreparedStatement ps2 = con.prepareStatement("delete from student where id=?");
				ps2.setInt(1, 10);
				int k = ps2.executeUpdate();
				System.out.println("Record deleted" + k);
				System.out.println("--------------Deleted Successfully!!!!--------------");

			}

		} while (ch != 0);
	}

}
