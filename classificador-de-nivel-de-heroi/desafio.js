let hero = "mary"
let XP = 10000
let nivel;

switch (XP){
    case (XP < 1000):
        nivel = "ferro"
        break;
    case (XP < 1001 || XP <= 2000):
        nivel = "bronze"
        break;
        case (XP < 2001 || XP <= 5000):
            nivel = "Prata"
            break;
    case (XP < 6001 || XP <= 7000):
        nivel = "ouro"
        break;
    case (XP < 7001 || XP <= 8000):
        nivel = "platina"
        break;
    case (XP < 8001 || XP <= 9000):
        nivel = "ascendente"
        break;
    case (XP < 9001 || XP <= 10000):
        nivel = "imortal"
        break;
    case (XP >- 10001):
        nivel = "radiante"
        break;
    default:
        break;
}

consoler.log(`A heroina de nome ${hero} esta no nível ${nivel}`)