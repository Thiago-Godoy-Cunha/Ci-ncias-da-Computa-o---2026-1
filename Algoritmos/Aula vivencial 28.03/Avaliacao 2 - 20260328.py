while True:
    num = list(map(int, input("Digite um número: ").replace('.', '').split(',')))

    for n in num:
        if n > 0:
            divisores = []
            for i in range(1, n):
                if n%i == 0:
                    divisores.append(i) 

            print(f"O número {n} é perfeito!") if sum(divisores) == n else print(f"O número {n} não é perfeito.")
        else:
            break