class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {

        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketDemo {

    public static void main(String[] args) {

        // Create one object
        HallTicket priya =
                new HallTicket("Priya", 0);

        // Copy reference
        HallTicket copy = priya;

        // Modify using copy
        copy.seatNumber = 45;

        System.out.println(
                "Priya's seatNumber (via first variable): "
                + priya.seatNumber
        );

        System.out.println(
                "copy == priya: "
                + (copy == priya)
        );

        // Create separate object
        HallTicket separate =
                new HallTicket("Priya", 45);

        System.out.println(
                "separate == priya: "
                + (separate == priya)
        );
    }
}
