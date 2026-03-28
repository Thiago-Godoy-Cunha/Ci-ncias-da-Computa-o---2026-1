x = int(input("Valor de x: "))
y = int(input("Valor de y: "))

for i in range (1, 1001):
    if x%i == 0 and y%i == 0:
        print(i)