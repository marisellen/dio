

class hero{
    constructor(name, age, tipe){
        this.name = name;
        this.age = age;
        this.tipe = tipe;
    }
    
    atacar(classe) {
        if ( classe >= 0 && classe < this.tipo.length){
            let attack;
            
            switch (this.tipo[classe]) {
                case "necromante":
                    attack = "necromancia"
                    break;
                    case "guerreiro":
                        attack = "espada"
                        break;
                        case "mago":
                            attack = "magia"
                            break;
                            case "paladino":
                                attack = "martelo"
                                break;
                                case "clerrigo":
                                    attack = "cura"
                                    break;
            }
                            console.log(`o ${this.tipo} ${this.nome} atacou usando ${attack}`)
        } else {
                            console.log("Por favor selecione uma classe")
    }}}

    let hero = new hero (Amarga, 23, ["necromante", "guerreiro", "mago", "paladino", "clerigo"])
    heroi.atacar(0)
