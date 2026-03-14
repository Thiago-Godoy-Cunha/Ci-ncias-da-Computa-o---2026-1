x = 0
while x == 0:
    escolha = input("\n\n\nCalculadora master blaster:\nDigite 1 para somar dois valores\nDigite 2 para subtrair dois valores\nDigite 3 para multiplicar dois valores\nDigite 4 para dividir dois valores\nDigite 5 para realizar a potência entre dois valores\nDigite 6 para realizar a radiciação de dois valores\nDigite qualquer outro número para sair\n")
    if escolha.isdigit():
        escolha = int(escolha)

        if escolha < 1 or escolha > 6:
            print("Tchau")
            x = 1
            continue

        num1 = input("Digite o valor do primeiro número: ")
        num2 = input("Digite o valor do segundo número: ")

        if num1.isdigit() and num2.isdigit():
            num1 = int(num1)
            num2 = int(num2)
            
            print(f"O seu número é: ")
            if escolha == 1:
                print(num1+num2)
            elif escolha == 2:
                print(num1-num2)
            elif escolha == 3:
                print(num1*num2)
            elif escolha == 4:
                if num2 == 0:
                    print("Não pode dividir por 0")
                else:
                    print(num1/num2)
            elif escolha == 5:
                print(num1 ** num2)
            elif escolha == 6:
                print(round(num1**(1/num2)))
        else:
            print("Digite um número!")
    else:
        print("Digite um número!")