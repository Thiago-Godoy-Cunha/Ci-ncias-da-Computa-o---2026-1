valores = []
while True:
    valor = input("Digite um valor: ")
    try:
        valor = int(valor)
        if len(valores) > 0 and valores[len(valores)-1] <= valor:
            break
        else:
            valores.append(valor)
            print(valores)
    except ValueError:
        print("Digite um número!")

print(f"Soma dos valores: {sum(valores)}")