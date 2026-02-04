class MetroTicket {
    String passengerName;
    String source;
    String destination;
    boolean roundTrip;
    String seatClass;
    String discountCode;
    double fare;

    MetroTicket(String passengerName, String source, String destination) {
        this(passengerName, source, destination, false, "Regular", "");
    }

    MetroTicket(String passengerName, String source, String destination, boolean roundTrip) {
        this(passengerName, source, destination, roundTrip, "Regular", "");
    }

    MetroTicket(String passengerName, String source, String destination,
                boolean roundTrip, String seatClass) {
        this(passengerName, source, destination, roundTrip, seatClass, "");
    }

    MetroTicket(String passengerName, String source, String destination,
                boolean roundTrip, String seatClass, String discountCode) {

        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;

        if (seatClass.equalsIgnoreCase("Regular") ||
                seatClass.equalsIgnoreCase("Premium")) {
            this.seatClass = seatClass;
        } else {
            this.seatClass = "Regular";
        }

        this.discountCode = discountCode;
        calculateFare();
    }

    void calculateFare() {
        if (!roundTrip) {
            fare = seatClass.equalsIgnoreCase("Premium") ? 150 : 100;
        } else {
            fare = seatClass.equalsIgnoreCase("Premium") ? 270 : 180;
        }

        if (discountCode.equalsIgnoreCase("DIS10")) {
            fare = fare * 0.90;
        }
    }

    void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Trip Type: " + (roundTrip ? "Round Trip" : "One Way"));
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Discount Code: " +
                (discountCode.isEmpty() ? "None" : discountCode));
        System.out.println("Total Fare: " + fare);
        System.out.println("-------------------------");
    }
}

class MetroTicketDemo {
    public static void main(String[] args) {

        MetroTicket t1 = new MetroTicket("OPI", "Uttara", "Mirput-2");
        MetroTicket t2 = new MetroTicket("Apurbo", "Dhaka", "Mirpur", true);
        MetroTicket t3 = new MetroTicket("Ripon", "Banani", "Motijheel", true, "Premium");
        MetroTicket t4 = new MetroTicket("Oishe", "Farmgate", "Gulshan",
                true, "Premium", "DIS10");

        t1.displayTicketDetails();
        t2.displayTicketDetails();
        t3.displayTicketDetails();
        t4.displayTicketDetails();
    }
}
