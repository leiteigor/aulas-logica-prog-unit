Algoritmo "diasdasemana"


// Seção de Declarações das variáveis
      var seg, ter, qua, qui, sex, sab, dom : caractere
       mon, tue, wed, thu, fri, sat, sun : caractere
       lingua : inteiro

INICIO
//Atribuições
   seg <- ("Segunda-feira")
   ter <- ("Terça-feira")
   qua <- ("Quarta-feira")
   qui <- ("Quinta-feira")
   sex <- ("Sexta-feira")
   sab <- ("Sábado")
   dom <- ("Domingo")
   
   mon <- ("Monday")
   tue <- ("Tuesday")
   wed <- ("Wednesday")
   thu <- ("Thursday")
   fri <- ("Friday")
   sat <- ("Saturday")
   sun <- ("Sunday")
   
escreval ("Digite em que lingua você deseja ler ")
escreval ("1 para Português - BR")
escreval ("2 para Inglês - EUA")
leia (lingua)

se lingua = 1 então
// PORTUGUÊS
   escreval ("Os dias da semana são: ")
   escreval (seg)
   escreval (ter)
   escreval (qua)
   escreval (qui)
   escreval (sex)
   escreval (sab)
   escreval (dom)

senão
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