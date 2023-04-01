import matplotlib.pyplot as plt
tempo_bubbleSort = [11131327 , 2778920 , 1269642 , 216140 , 133355 , 10588 , 2719]
tempo_insertionSort = [3897350 , 744592 , 231918 , 49586 , 12920 , 2699 , 774]
tempo_selection = [4505774 , 748830 , 268082 , 62636 , 14166 , 3632 , 928]
n_vetores = [2560000 , 1280000 , 640000 , 320000 , 160000 , 80000 , 40000]
grafico_1 = plt.plot(tempo_bubbleSort , n_vetores)
plt.show(grafico_1)





