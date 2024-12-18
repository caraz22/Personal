# Strings
# Strings in python are surrounded by either single quotation marks, or double quotation marks
print("Hello")     
print('Hello')   

# Quotes inside quotes
# You can use quotes inside a string, as long as they don't match the quotes surrounding the string:
print("It's alright")
print("He is called 'Johnny'")
print('He is called "Johnny"')

# Assign string to a variable
a = "Hello"
print(a)

# Multiline strings
# You can use three double quotes:
a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a) 
# Or three single quotes:
a = '''Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua.'''
print(a)

# Strings are arrays
a = "Hello, World!"
print(a[1])

# Looping through a string
for x in "banana":
    print(x)

# String length
# The len() function returns the length of a string:
a = "Hello, World!"
print(len(a))

# Check string
# To check if a certain phrase or character is present in a string, we can use the keyword "in"
# Returns true or false
txt = "The best things in life are free!"
print("free" in txt) 

# Check if NOT
# To check if a certain phrase or character is NOT present in a string, we can use the keyword "not in"
txt = "The best things in life are free!"
print("expensive" not in txt)
#Use it in an if statement:
txt = "The best things in life are free!"
if "expensive" not in txt:
  print("No, 'expensive' is NOT present.")