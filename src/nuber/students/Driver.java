package nuber.students;

public class Driver extends Person {
	private Passenger curPax;
	
	public Driver(String driverName, int maxSleep)
	{
		super(Name, maxSleep);
	}
	
	/**
	 * Stores the provided passenger as the driver's current passenger and then
	 * sleeps the thread for between 0-maxDelay milliseconds.
	 * 
	 * @param newPassenger Passenger to collect
	 * @throws InterruptedException
	 */
	public void pickUpPassenger(Passenger newPassenger)
	{
		curPax = newPassenger;
		int pickUpTime = (int)(Math.random() * maxSleep);
		Thread.sleep(pickUpTime);
	}

	/**
	 * Sleeps the thread for the amount of time returned by the current 
	 * passenger's getTravelTime() function
	 * 
	 * @throws InterruptedException
	 */
	public void driveToDestination() {
		Thread.sleep(curPax.getTravelTime());
	}
	
}
