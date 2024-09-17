public class User {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String education;
    private String dob;
    private boolean working;
    private String emergencyContact;

}

public class Address {
    private int id;
    private int userId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country = "India";
    private String pincode;

}

public class Room {
    private int id;
    private int userId;
    private String roomNo;
    private int noOfGuests;

}