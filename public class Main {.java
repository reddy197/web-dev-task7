public class Main {
    public static void main(String[] args) {
        try {
            // Add new user
            User user = new User();
            user.setName("John Doe");
            user.setMobile("1234567890");
            user.setEmail("john.doe@example.com");
            user.setEducation("B.Tech");
            user.setDob("1990-01-01");
            user.setWorking(true);
            user.setEmergencyContact("0987654321");
            DatabaseUtility.addUser(user);

            // Add address for the user
            Address address = new Address();
            address.setUserId(1); // Assume user with id 1
            address.setAddressLine1("Ameerpet Main Road");
            address.setAddressLine2("Beside Super Market");
            address.setCity("Hyderabad");
            address.setState("Telangana");
            address.setPincode("560011");
            DatabaseUtility.addAddress(address);

            // Add room for the user
            Room room = new Room();
            room.setUserId(1); // Assume user with id 1
            room.setRoomNo("A1");
            room.setNoOfGuests(3);
            DatabaseUtility.addRoom(room);

            // Retrieve all users
            DatabaseUtility.getAllUsers();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}