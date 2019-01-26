#
# Example file for working with classes
#

class myClass():
  def method1(self):
    print("myClass has method1")
  def method2(self, someString):
    print("myClass has method2",someString)
class anotherClass(myClass):
  def method1(self):
    myClass.method1(self)
    print("anotherClass has method1")
  def method2(self, someString):
    print("anotherClass hs method2", someString)

def main():
  #instantiate class:
  c = myClass()
  c.method1()
  c.method2("my name is James Tran")
  
  c2 = anotherClass()
  c2.method1()
  c2.method2("Hello Jay")

  
if __name__ == "__main__":
  main()
