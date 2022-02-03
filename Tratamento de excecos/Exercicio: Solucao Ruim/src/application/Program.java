package application;

public class Program {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Romm number: ");
		int number = vogin.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(vogin.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(vogin.next());

		if (!checkOut.after(checkIn)) {

			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter date to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(vogin.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(vogin.next());
			
			Date now =new Date();
			
			if(checkIn.before(now) || checkOut.before(now)) {
				
				System.out.println("Error in reservation: Reservation dates for update must be future");
			}
			else if(!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		}

		vogin.close();

	}

}
