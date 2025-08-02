Fname = input("Enter your First Name:")
Lname = input ("Enter Your Last Name:")
Course  = input ("Enter your Course:")
Year = input ("Enter your Year:")

Mgrade = float(input ("Enter your Mathematics Grade:"))
Cgrade = float (input ("Enter your Computer Grade:"))
Sgrade = float (input("Enter your Science Grade:"))
Fgrade = float (input ("Enter your Filipino Grade:"))

FinalGrade = (Mgrade+Cgrade+Sgrade+Fgrade)/4

print("                                                 ")
print("Your Information: ")
print("                                                 ")
print("Full Name:",Fname, Lname)
print("Course & Year:",Course,"-",Year)
print("Your Grades is: ",FinalGrade)
print("                                                 ")
print("Your Award: ")
if FinalGrade >= 100:
    print("Invalid Number")
elif FinalGrade >= 97:
    print("With Highest Honor!")
elif FinalGrade >= 94:
    print("With High Honor!")
elif FinalGrade >= 89:
    print("With Honor")
elif FinalGrade >= 74:
    print ("Passed!")
else:
    print("Failed:< Better luck next time")
