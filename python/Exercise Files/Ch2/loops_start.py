#
# Example file for working with loops
#

def main():
  x = 0
  print("-----------While Loop----------")
  # define a while loop
  while(x<5):
    print(x)
    x += 1
  print("-----------For Loop----------")
  # define a for loop
  for x in range(5,10):
    print(x)

  print("-----------Loop over Collection----------")
  # use a for loop over a collection
  Names = ["James","Thao","Raymond","Jayden"]
  for name in Names:
    print("First Name: " + name)
  
  print("-----------Break and Continue Loop----------")
  # use the break and continue statements
    # break means when get to that if condition the loop will end
  print("-----------Break means out of the loop right the condition point----------")
  for x in range(5,15):
    if (x==8): break
    print(x)
    # continue means when get to that condition the loop will skip that condition and continue to the next one
  print("-----------Continue means skip the condition point and continue Loop----------")
  for x in range(5,15):
    if (x%2 == 0): continue
    print(x)

  #using the enumerate() function to get index ( just like for loop in java with index)
  Names = ["James","Thao","Raymond","Jayden"]
  for index,name in enumerate(Names):
    print( "index:",index  ,"with first name: " + name)


if __name__ == "__main__":
  main()
