print("Menu: \n")
print("1. Addition ")
print("2. Subtraction ")
print("3. Multiplication   ")
print("4. Division \n")
varchc = input("Enter : ")

def addition(a,b):
   print("--------- +")
   print("Result : ",a+b)
def subtraction(a,b):
   print("--------- -")
   print("Result : ",a-b)
def multiplication(a,b):
   print("--------- *")
   print("Result : ",a*b)
def division(a,b):
   print("--------- /")
   print("Result : ",a/b)

if varchc == "1":
   print("\nPlease Enter Number \n")
   a = int(input("Number : "))
   b = int(input("Number : "))
   addition(a,b)
elif varchc == "2":
   print("\nPlease Enter Number \n")
   a = int(input("Number : "))
   b = int(input("Number : "))
   subtraction(a,b)
elif varchc == "3":
   print("\nPlease Enter Number \n")
   a = int(input("Number : "))
   b = int(input("Number : "))
   multiplication(a,b)
elif varchc == "4":
   Arint("\nPlease Enter Number \n")
   a = int(input("Number : "))
   b = int(input("Number : "))
   division(a,b)
else:
   print("Enter Your Choice (1..4)")
