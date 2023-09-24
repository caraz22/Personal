fallBalance = 6299.37
nonResidency = 4709.00
residency = fallBalance - nonResidency
fallLoan = 18250.00
nonResidencyRefund = fallLoan - nonResidency
residencyRefund = fallLoan - residency

primeFamily = 16.00
primeStudent = 8.00
nitro = 4.99
spotify = 5.99
dashPass = 4.99
gamepass = 16.19
monthlySubscriptions = primeFamily + primeStudent + nitro + spotify + dashPass + gamepass

rent = 840
internet = 50
pet = 25
laundry = 35
utilities = 50
rentersInsurance = 15.34
monthlyApartment = rent + internet + pet + laundry + utilities + rentersInsurance

monthly = monthlyApartment + monthlySubscriptions

fallSemester = monthly * 5

nonResidencyRemainder = nonResidencyRefund - fallSemester
residencyRemainder = residencyRefund - fallSemester

print("Your student balance for the Fall is " + str(round(fallBalance, 2)) + "\n")
print("The cost of tuition for being a non-resident of Ohio is " + str(round(nonResidency, 2)) + "\n")
print("Your student balance for the Fall with residency is " + str(round(residency, 2)) + "\n")
print("Your refund for being a non-resident will be " + str(round(nonResidencyRefund, 2)) + "\n")
print("Your refund with residency will be " + str(round(residencyRefund, 2)) + "\n")
print("Your monthly apartment expenses costs you " + str(round(monthlyApartment, 2)) + "\n")
print("Overall, your monthly expenses will be " + str(round(monthly, 2)) + "\n")
print("Your total expneses for the fall semester will be " + str(round(fallSemester, 2)) + "\n")
print("Your remaining money for the fall semester as a non-resident will be " + str(round(nonResidencyRemainder, 2)) + "\n")
print("Your remaining money for the fall semester as an Ohio resident will be " + str(round(residencyRemainder, 2)) + "\n")
