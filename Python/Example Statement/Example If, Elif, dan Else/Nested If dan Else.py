print("Login: \n")
data1 = input("username : ")
data2 = input("password : ")

if data1 == "user1":
   if data2 == "psw123":
      print("\nyou succeeded")
   else:
      print("\nwrong password")
else:
   print("\nwrong username")