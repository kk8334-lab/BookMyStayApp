import java.util.*;

// Booking class (ADD THIS ABOVE main class)
class Booking {
    String customerName;
    String roomType;
    int numberOfNights;

    Booking(String customerName, String roomType, int numberOfNights) {
        this.customerName = customerName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    void displayBooking() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + numberOfNights);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Booking> bookingList = new ArrayList<>();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String room = sc.nextLine();

        System.out.print("Enter Nights: ");
        int nights = sc.nextInt();

        Booking booking = new Booking(name, room, nights);
        bookingList.add(booking);

        System.out.println("Booking Added Successfully!");

        for (Booking b : bookingList) {
            b.displayBooking();
        }

        sc.close();
    }
}