startingAmount = 5700
laundry = 41.34
ultimate = 18.35
nitro = 2.99
primeStudent = 8
netflix = 16.54
spotify = 10.99
insurance = 17.34
youtube = 7.99
aes = 90
rent = 950
pc = 60.71

monthly = laundry + ultimate + nitro + primeStudent + netflix + spotify + insurance + youtube + aes + rent + pc
january = monthly - rent
restOfMonths = monthly * 3

currRemaining = 3557 - monthly * 2

print(str(currRemaining))