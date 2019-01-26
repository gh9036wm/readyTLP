#
# Example file for formatting time and date output
#

from datetime import datetime

def main():
  # Times and dates can be formatted using a set of predefined string
  # control codes 
 now = datetime.now()
 print(now)
  #### Date Formatting ####
  
  # %y/%Y - Year, %a/%A - weekday, %b/%B - month, %d - day of month
 print(now.strftime("the current year is: %Y"))
 print(now.strftime("the current day is :%A")) # %a is sat and %A is saturday
 print(now.strftime("the current date is :%d")) #date
 print(now.strftime("the current month is :%b"))
 #combination of all:
 print(now.strftime("the current day is :%a, %d %B,%Y"))


  # %c - locale's date and time, %x - locale's date, %X - locale's time
 print(now.strftime("the locale's date and time: %c"))
 print(now.strftime("the locale's date : %x"))
 print(now.strftime("the locale's  time: %X"))

  #### Time Formatting ####
  
  # %I/%H - 12/24 Hour, %M - minute, %S - second, %p - locale's AM/PM
 print(now.strftime("the current time : %I:%M:%S %p"))
 print(now.strftime("the current 24H time : %H:%M:%S "))


if __name__ == "__main__":
  main();
