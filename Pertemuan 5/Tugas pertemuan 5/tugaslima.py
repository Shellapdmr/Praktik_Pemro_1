nama = input("Masukan nama Anda = ")
ipk = input("Masukan ipk Anda = ")
ipk = float(ipk)
tahun = input("Masukan berapa lama masa study Anda = ")
tahun = str(tahun)

if (ipk >= 3.51 and ipk <= 4.00 and tahun <= str(4)):
   print("Predikat Anda adalah dengan pujian tertinggi atau Summa Cumlaude ")
elif (ipk >= 3.51 and ipk <= 4.00 and tahun > 4):
    print("Predikat Anda adalah dengan pujian atau Camlaude ")
elif (ipk >= 3.01 and ipk < 3.51 >= 3.01 and ipk < 3.51):
    print("Predikat Anda sangat Memuaskan")
elif (ipk >= 2.76 and ipk < 3.01):
    print("Predikat Anda Memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("Predikat Anda Cukup")
elif (ipk < 2.00):
    print("Anda Tidak lulus")
else :
    (ipk > 4.00 or ipk < 0)
    print("Tidak Valid")
