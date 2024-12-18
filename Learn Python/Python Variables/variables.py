# Creating variables
x = 5
y = "John"
print(x)
print(y)
# Variables do not need to be declared with any particular type, and can even change type after they have been set
x = "Sally" # x is not of type str
print(x)

# Casting
# If you want to specify the data type of a variable, this can be done with casting
x = str(3)      # x will be "3"
y = int(3)      # x will be 3
z = float(3)    # x will be 3.0

# Get the type
# You can get the data type of a variable with the type() function
x = 5
y = "John"
print(type(x))
print(type(y))

# Single or double quotes?
x = "John"
# is the same as
x = 'John'

# Case-sensitive
# This will create two variables:
a = 4
A = "Sally"