public class employee_wage
{
	public static void main(String[] args)
	{
		//isPresent = 1;
		//isFullTime = 1;
		int wagePerHr = 20;
		int fullTimeWorkingHrs = 8;
		int partTimeWorkingHrs = 4;
		int workingDaysInMonth = 20;
		int dayOfMonth = 0;
		int empDailyWage = 0;
		int empMonthlyWage = 0;
		while(dayOfMonth < workingDaysInMonth)
		{
			int checkPresence = (int) (Math.random()*10%2);
			int checkWorkingTime = (int) (Math.random()*10%2);
			switch(checkPresence)
			{
				case 1:
					switch(checkWorkingTime)
					{
						case 1:
							empDailyWage = fullTimeWorkingHrs * wagePerHr;
							break;
						default:
							empDailyWage = partTimeWorkingHrs * wagePerHr;
					}
					empMonthlyWage += empDailyWage;
					break;
				default:
			}
			dayOfMonth++;
		}
		System.out.println("Employee monthly wage is: "+empMonthlyWage);
	}
}
