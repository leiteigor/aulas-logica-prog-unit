Algoritmo "diasdasemana"


// Se��o de Declara��es das vari�veis
      var seg, ter, qua, qui, sex, sab, dom : caractere
       mon, tue, wed, thu, fri, sat, sun : caractere
       lingua : inteiro

INICIO
//Atribui��es
   seg <- ("Segunda-feira")
   ter <- ("Ter�a-feira")
   qua <- ("Quarta-feira")
   qui <- ("Quinta-feira")
   sex <- ("Sexta-feira")
   sab <- ("S�bado")
   dom <- ("Domingo")
   
   mon <- ("Monday")
   tue <- ("Tuesday")
   wed <- ("Wednesday")
   thu <- ("Thursday")
   fri <- ("Friday")
   sat <- ("Saturday")
   sun <- ("Sunday")
   
escreval ("Digite em que lingua voc� deseja ler ")
escreval ("1 para Portugu�s - BR")
escreval ("2 para Ingl�s - EUA")
leia (lingua)

se lingua = 1 ent�o
// PORTUGU�S
   escreval ("Os dias da semana s�o: ")
   escreval (seg)
   escreval (ter)
   escreval (qua)
   escreval (qui)
   escreval (sex)
   escreval (sab)
   escreval (dom)

sen�o
//INGLES
   escreval ("The days of the week are: ")
   escreval (mon)
   escreval (tue)
   escreval (wed)
   escreval (thu)
   escreval (fri)
   escreval (sat)
   escreval (sun)
fimse


Fimalgoritmo