repete = True
while repete:
    mesesAudiencia = int(input("Quantos meses de audiência vão ser comparados? "))

    audiencia = []
    for i in range(mesesAudiencia):
        audiencia.append(float(input(f"Qual foi o valor da audiência do {i+1}° mês? ")))

    crescente = True
    for i, a in enumerate(audiencia):
        if i > 0 and a < audiencia[i-1]:
            crescente = False

    if crescente:
        print(f'Audiência sempre crescente!\n Média de audiência:  {(sum(audiencia)/len(audiencia))}')
    else:
        print(f'Audiência nem sempre crescente!\n Média de audiência:  {(sum(audiencia)/len(audiencia))}')

    resp = ''
    
    while resp != 's' and resp != 'n':
        resp = input("Deseja continuar? [s/n] ").lower()
        if resp == 'n':
            repete = False
            break

