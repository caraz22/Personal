startingAmount = 5700
creditCard = 250
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

afterCredit = startingAmount - creditCard
monthly = laundry + ultimate + nitro + primeStudent + netflix + spotify + insurance + youtube + aes + rent + pc
january = monthly - rent
restOfMonths = monthly * 3

leftOver = afterCredit - january - restOfMonths
freeMonthly = leftOver / 4
print("Total left over is " + str(round(leftOver, 2)))
print("Total left over per month is " + str(round(freeMonthly, 2)))