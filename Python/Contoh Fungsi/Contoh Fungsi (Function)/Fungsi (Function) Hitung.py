print("Menu: \n")
print("1. Pertambahan ")
print("2. Pengurangan ")
print("3. Perkalian   ")
print("4. Pembagian \n")
pil = input("Masukkan Pilihan : ")

def pertambahan(a,b):
   print("--------- +")
   print("Hasil : ",a+b)
def pengurangan(a,b):
   print("--------- -")
   print("Hasil : ",a-b)
def perkalian(a,b):
   print("--------- *")
   print("Hasil : ",a*b)
def pembagian(a,b):
   print("--------- /")
   print("Hasil : ",a/b)

if pil == "1":
   print("\nSilahkan Masukkan Angka \n")
   a = int(input("Angka : "))
   b = int(input("Angka : "))
   pertambahan(a,b)
elif pil == "2":
   print("\nSilahkan Masukkan Angka \n")
   a = int(input("Angka : "))
   b = int(input("Angka : "))
   pengurangan(a,b)
elif pil == "3":
   print("\nSilahkan Masukkan Angka \n")
   a = int(input("Angka : "))
   b = int(input("Angka : "))
   perkalian(a,b)
elif pil == "4":
   print("\nSilahkan Masukkan Angka \n")
   a = int(input("Angka : "))
   b = int(input("Angka : "))
   pembagian(a,b)
else:
   print("Masukkan pilihan (1..4)")
