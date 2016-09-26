# =================================== QUESTAO 5:



# ===================================
# =================================== QUESTAO 4:

import random as ra
#import statistics as sta
lnome = []
lidd = []
lalt = []
def povoarLista():
    for e in range(1, 46):
        lnome.extend(['Nome: %s'% str(e)])
        lidd.extend([ra.randint(15, 27)])
        lalt.extend([ra.uniform(1.50, 2.00)])
def mediaIdad():
    povoarLista()
    mIdd =[]
    for e in lidd:
        if lidd[e] > 20:
            mIdd.extend([lidd[e]])
            print(lnome[e-1],"Idade: ",lidd[e],"Altura: %0.2f"%(lalt[e]))
    #return "%0.2f"%(sta.mean(mIdd))
    return "A Media da Idade é %0.2f"%(sum(mIdd)/len(mIdd))

def mediaAlt():
    povoarLista()
    mAlt = []
    for e in range(len(lalt)):
        if lalt[e] < 1.70:
            mAlt.extend([lalt[e]])
            print(lnome[e-1],"Idade: ",lidd[e],"Altura: %0.2f"%(lalt[e]))
    #return "%0.2f"%(sta.mean(mAlt))
    return "A Altura media é %0.2f"%(sum(mAlt)/len(mAlt))


def mult7():
    def opcao1():
        for e in range(1, 22):
            if e % 7 == 0:
                print(e)
    def opcao2():
        l = []
        for e in range(1,22):
            if e % 7 == 0:
                l.extend([e])
        return l        

def quest5():
    import array as ar
    lista = [int(e) for e in range(1,11)]
    arr = ar.array('b', [int(e) for e in range(1,11)])
    def apaga(v):
        arr.remove(v)
    def alvo():
        alvo = int(input("Escolha um dos valores abaixo para remove-lo: %s"%(str(arr))))
        try:
            apaga(alvo)
            print(tuple(arr))
        except ValueError:
            pass
    for e in range(10):
        alvo()
    
def escolha():
    print("1° opção Media de idade:\n2° opção Media da Altura:  ")
    esc = int(input("Escolha a opção: "))
    if esc == 1:
        print("A Idade Media é:")
        print(mediaIdad())
    elif esc == 2:
        print("A Altura Media é:")
        print(mediaAlt())
    elif esc == 3:
        print("Multiplos de 7")
        print(mult7())
    elif esc == 4:
        print("Apagar da Lista")
        print(quest5())
    else:
        print("VocÊ não escolheu nada")
    
escolha()

# ===================================
