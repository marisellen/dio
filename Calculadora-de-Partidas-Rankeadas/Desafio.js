// Calculadora de Partidas Rankeadas


let vitorias = Calculadora(V)
let derrotas = Calculadora(D)

function Calculadora(V,D) {

    let saldo = (V - D)
    let nivel

    switch (V) {
        case ( V <= 10):
            nivel = Ferro
        break;
        case (V >= 11 || V <= 20):
            nivel = Bronze
            break;
        case (V >= 21 || V <= 50 ):
            nivel = Prata
            break;
        case ( V >= 51 || V <= 80):
            nivel = Ouro
            break;
        case (V >=81 || D <= 90):
            nivel = Diamante
            break;
        case ( V >= 91 || V <= 100):
            nivel = Lendário
        case (V >= 101):
            nivel = Imortal
            break;
    }
console.log(`O Herói tem de saldo de ${saldo} está no nível de ${nivel}`)














}














