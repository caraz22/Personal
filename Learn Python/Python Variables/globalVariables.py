# Global variables
# Variables that are created outside of a function (as in all of the examples in the previous pages) are known as global variables.
# Global variables can be used by everyone, both inside of functions and outside.
x = "awesome"
def myFunc():
    print("Python is " + x)

myFunc()

# If you create a variable with the same name inside a function, this variable will be local, and can only be used inside the function. The global variable with the same name will remain as it was, global and with the original value.
x = "awesome"
def myFunc():
    x = "fantastic"
    print("Python is " + x)

myFunc()
print("Python is " + x)

# The global keyword
def myFunc():
    global x
    x = "fantastic"

myFunc()
print("Python is " + x)

#To change the value of a global variable inside a function, refer to the variable by using the global keyword:
x = "awesome"

def myFunc():
  global x
  x = "fantastic"

myFunc()

print("Python is " + x) 