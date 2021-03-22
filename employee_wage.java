public class employee_wage
{
	public static void main(String[] args)
	{
		//isPresent = 1;
		//isFullTime = 1;
		int wagePerHr = 20;
		int fullTimeWorkingHrs = 8;
		int partTimeWorkingHrs = 4;
		int empWage = 0;
		int checkPresence = (int) (Math.random()*10%2);
		int checkWorkingTime = (int) (Math.random()*10%2);
		switch(checkPresence)
		{
			case 1:
				System.out.println("Employee is present");
				switch(checkWorkingTime)
				{
					case 1:
						System.out.println("Employee is full timer");
						empWage = fullTimeWorkingHrs * wagePerHr;
						break;
					default:
						System.out.println("Employee is part timer");
						empWage = partTimeWorkingHrs * wagePerHr;
				}
				break;
			default:
				System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}
