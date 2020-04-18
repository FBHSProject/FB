package chejian;

public class Date implements Comparable<Date> {
	private int month;
	private int day;
	private int year;

	/**
	 * integer constructor
	 * @throws IllegalArgumentException when it has invalid date info
	 * @param month month
	 * @param day   day
	 * @param year  year
	 * receive help from TA at 11/14
	 */
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		if (!isValidDate(month, day, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
	}

	/**
	 * String constructor
	 * @throws IllegalArgumentException when it has invalid date info
	 * @param date check valid date
	 */
	public Date(String date) {
		date = date.trim();
//		String[] dateInfo = new String[4];
		String[] dateInfo = date.split("/");
//		dateInfo = new String[3];
		if (dateInfo.length == 3) {
			this.month = Integer.parseInt(dateInfo[0]);
			this.day = Integer.parseInt(dateInfo[1]);
			this.year = Integer.parseInt(dateInfo[2]); 
		}
		if (!isValidDate(date)) {
			throw new IllegalArgumentException("Invalid date");
		}
	}

	/**
	 * get the month
	 * 
	 * @return number of month
	 */ 
	public int getMonth() {
		return this.month;
	}

	/**
	 * get the day
	 * 
	 * @return number of day
	 */
	public int getDay() {
		return this.day;
	}

	/**
	 * get the year
	 * 
	 * @return number of year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * would check whether a string date is valid
	 * 
	 * @param date given date
	 * @return whether is valid
	 */
	public static boolean isValidDate(String date) {
		String[] dateInfo = date.split("/");
		if (dateInfo.length == 3) {
			int monthI = Integer.parseInt(dateInfo[0]);
			int dayI = Integer.parseInt(dateInfo[1]);
			int yearI = Integer.parseInt(dateInfo[2]);
			
			if (yearI % 4 != 0 && monthI == 2 && (dayI > 28 || dayI < 1)) {

						return false;
					
				
			}
			if (yearI % 4 == 0 && monthI == 2 && (dayI > 29 || dayI < 1)) {
				
				
						return false;
					
				
			}
				if (monthI > 12 || monthI < 1) {
					return false;
				}
				if (yearI > 2050 || yearI < 2000) {
					return false;
				}
				
				if (monthI == 1 || monthI == 3 || monthI == 5 || monthI == 7 || monthI == 8 || monthI == 10
						|| monthI == 12) {
					if (dayI > 31 || dayI < 1) {
						return false;
					}
					return true;
				}
				if (monthI == 4 || monthI == 6 || monthI == 9 || monthI == 11) {
					if (dayI > 30 || dayI < 1) {
						return false;
					}
					return true;
				}
				
			return true;
		}

		return false;

	}

	/**
	 * check if the date is valid for given integers
	 * 
	 * @param month month
	 * @param day   day
	 * @param year  year
	 * @return whether is valid
	 */
	public static boolean isValidDate(int month, int day, int year) {
		if (month > 12 || month < 1) {
			return false;
		}
		if (day < 1 || day > 31) {
			return false;
		}
		if (year > 2050 || year < 2000) {
			return false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				return false;
			}
			return true;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				return false;
			}
			return true;
		}
		if (year % 4 != 0 && month == 2) {

				if (day > 28) {
					return false; 
				}
				return true;
			
		}
		if (year % 4 == 0 && month == 2) {
			
				if (day > 29) {
					return false;
				}
				return true;
			
		}
		return true;
	}

	/**
	 * If this is greater than the parameter object, return a positive int
	 * 
	 * If this is equal to the parameter object, return 0
	 * 
	 * If this is less than the parameter object, return a negative int
	 */
	@Override
	public int compareTo(Date o) {
		int oDay = o.getDay();
		int oMonth = o.getMonth();
		int oYear = o.getYear();

		if (this.year > oYear) {
			return 1;
		}
		if (this.year < oYear) {
			return -1;
		}
		if (this.year == oYear) {
			if (this.month > oMonth) {
				return 1;
			}
			if (this.month < oMonth) {
				return -1;
			}
			if (this.month == oMonth) {
				if (this.day > oDay) {
					return 1;
				}
				if (this.day < oDay) {
					return -1;
				}

			}
		}
		return 0;

	}

	/**
	 * use of knowledge from math class by using Inclusion–exclusion principle
	 * @param other date other
	 * @return number of days
	 */
	public int daysTo(Date other) {
		int otherDay = other.getDay();
		int otherMonth = other.getMonth();
		int otherYear = other.getYear(); 

		
		    if (this.month < 3) { 
		    	this.year -= 1;
		    	this.month += 12;
		    	}
		    int thisValue =   365 * this.year + this.year / 4 - this.year / 100 + this.year / 400 + (153 * this.month - 457) / 5 + this.day - 306;
		    
		    if (otherMonth < 3) {
		    	otherYear -= 1;
		    	otherMonth += 12;
		    	}
		    int otherValue =   365 * otherYear + otherYear / 4 - otherYear / 100 + otherYear / 400 + (153 * otherMonth - 457) / 5 + otherDay - 306;
		    int returnDays = otherValue - thisValue;
		return returnDays;
	}

	/**
	 * the number of years between this date and other
	 * 
	 * @param other date other
	 * @return number of years
	 */
	public int yearsTo(Date other) {
		int otherDay = other.getDay();
		int otherMonth = other.getMonth();
		int otherYear = other.getYear();
		int returnVal = otherYear - this.year;
		//2018/5/6 2017/4/6
		if (returnVal > 0) {
//		if(this.year != otherYear) {
			if (this.month == otherMonth && this.day > otherDay) {
					return returnVal - 1;
			}
			if (this.month > otherMonth) {
				return returnVal - 1;
			}
//		} 2017/1/5   2018/5/6
			return returnVal;
		}
		if (returnVal < 0) {
			if (this.month == otherMonth && this.day < otherDay) {
				
					return returnVal + 1;
				
			}
			if (this.month < otherMonth) {
				return returnVal + 1;
			}
		}

		return returnVal;
	}

	/**
	 * toString method to make sure out put approproate
	 * 
	 * @return valid format date
	 */
	public String toString() {
//		if(month<10 && day < 10) {
		return month + "/" + day + "/" + year;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
