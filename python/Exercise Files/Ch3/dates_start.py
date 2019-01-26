#
# Example file for working with date information
#
from datetime import date
from datetime import time
from datetime import datetime

def main():
  ## DATE OBJECTS
  # Get today's date from the simple today() method from the date class
  today = date.today()
  print("Today is :" , today)
  # print out the date's individual components
  
  print("Date Components: ",today.day ,today.month ,today.year)

  
  # retrieve today's weekday (0=Monday, 6=Sunday)
  print ("Today of weekday is: " , today.weekday())
  days = ["mon","tue","wed","thur","fri","sat","sun"]
  print("today's day is : ", days[today.weekday()])
  ## DATETIME OBJECTS
  # Get today's date from the datetime class
  today = datetime.now()
  print("Today current time is ", today)

  # Get the current time
  d = date.today()
  t = datetime.date(datetime.now())
  print(d,t)


  
if __name__ == "__main__":
  main();
  