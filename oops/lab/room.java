class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    void setData(int rno, String rtype, double rarea, boolean ac) {
        roomno = rno;
        roomtype = rtype;
        roomarea = rarea;
        ACmachine = ac;
    }

    void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq.ft");
        System.out.println("AC Available: " + ACmachine);
    }
}
public class room {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setData(101, "Deluxe", 300.5, true);
        r1.displayData();
    }
    
}
