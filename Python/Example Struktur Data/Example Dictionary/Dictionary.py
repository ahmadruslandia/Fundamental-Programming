def satu():
    return "Contoh Ke-1 Berhasil Dicoba"
def dua():
    return "Contoh Ke-2 Berhasil Dicoba"
def tiga():
    return "Contoh Ke-3 Berhasil Dicoba"
def empat():
    return "Contoh Ke-4 Berhasil Dicoba"
def default():
    return "Masukkan Pilihan Dengan Benar"

dict = {
    1: satu,
    2: dua,
    3: tiga,
    4: empat,
    }

def switch(angka):
    return dict.get(angka, default)()

print(switch(1))
print(switch(2))
print(switch(3))
print(switch(4))
print(switch(5))
print(switch(6))