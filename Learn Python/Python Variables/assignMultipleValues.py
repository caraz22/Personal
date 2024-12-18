# Many values to multiple variables
# Python allows you to assign values to multiple variables in one line:
x, y, z = "Orange", "Banana", "Cherry"
print(x)
print(y)
print(z)

# One value to multiple variables
x = y = z = "Orange"
print(x)
print(y)
print(z)

# Unpack a collection
# If you have a collection of values in a list, tuple etc. Python allows you to extract the values into variables. This is called unpacking
fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)