import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseUtility {
    private static final String DB-URL="jdbc:mysql://localhost:3306/hostel";
    private static final String USER = "root";Private
    static final string PASS = "password";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void adduser(USer user) throws Exception {
        Connection conn = getConnection();
        String query = "INSERT INT Users (Name, MObile, Email, Education, DOB, WOrking, EmergencyContact) VALUES (?, ?, ?, ?, ?, ?, ?)";
        preparedStatement pstmt = conn.prepareStatment(query);
        pstmt.setString(1, user.getName());
        pstmt.setString(2, user.getMobile());
        pstmt.setString(3, user.getEmail());
        pstmt.setString(4, user.getEducation());
        pstmt.setString(5, user.getDob());
        pstmt.setBoolean(6, user.isWorking());
        pstmt.setString(7, user.getEmergencyContact());
        pstmt.exeuteUpdate();
        conn.close();
    }

    public static void addAddress(address address throws Exception {
        Connection conn = getConnection();
        String query = "INSERT INTO Addreews (USerId, AddressLine1, AddressLine2, city state, pincode)VAULES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.preparedStatement(query);
        pstmt.setInt(1, address.getUserId());
        pstmt.setString(2, address.getAddressLine1());
        pstmt.setString(3, address.getAddressLine2());
        pstmt.setString(4, address.getCity());
        pstmt.setString(5, address.getState());
        pstmt.setString(6, address.getPincode());
        pstmt.executeUpdate();
        conn.close();
    }

    // Add room
    public static void addRoom(Room room) throws Exception {
        Connection conn = getConnection();
        String query = "INSERT INTO Rooms(UserId,RoomNo, NoOFGuests)VALUES(?, ?, ?)";
        preparesStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, room.getUserId());
        pstmt.setString(2, room.getRoom());
        pstmt.setInt(3, room.getNoOfGuests());
        pstmt.executeUpdate();
        conn.close();

    }

    // Retrieve all users
    public static void getAllUsers()
            throws Exception {
        Connection conn = getConnection();
        String query = "SELECT*FROM Users";
        preparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.excecuteQuery();
        while (rs.next()) {
            System.out.println("Name:" + rs.getString("Name"));
            System.out.println("Mobile:" + rs.getString("mobile"));
            System.out.println("Email:" + rs.getString("Email"));
            System.out.println("Education:" + rs.getString("Education"));
            System.out.println("DOB:" + rs.getString("DOB"));
            System.out.println("Working:" + rs.getBoolean("Working"));
            System.out.println("Emergency contact:" + rs.getString("EmergencyContact"));
            System.out.println("---------");
        }
        conn.close();
    }
}
