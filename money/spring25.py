rent = 700
primeStoreCardMin = 29
creditCardMin = 35
electric = 150
laundry = 47
insurance = 20
ultimate = 22
youtube = 8
netflix = 17
spotify = 12
tuition = 1516

monthly = rent + primeStoreCardMin + creditCardMin + electric + laundry + insurance + ultimate + youtube + netflix + spotify
semester = (monthly * 4) + tuition

print("Your monthly expenses are " + str(monthly))
print("Your total for the whole semester is " + str(semester))