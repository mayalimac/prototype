class Veiculo{
    constructor(modelo, marca, cor, numeroRodas){
        this.modelo = modelo;
        this.modelo = marca;
        this.cor = cor;
        this.numeroRodas = numeroRodas;
    }

    clone(obj){
        obj.__proto__;
    }

    represent(){
        console.log(`Modelo: ${this.modelo}, Marca: ${this.marca}, Cor: ${this.cor}, Rodas: ${this.numeroRodas}`); 
    }
}

class Carro extends Veiculo{
    constructor(modelo, marca, cor, numeroRodas){
        super(modelo, marca, cor, numeroRodas)
        this.numeroPortas = this.numeroPortas

        let cloneCarro = {
            modelo: this.modelo,
            marca: this.marca,
            cor: this.cor,
            numeroRodas: this.numeroRodas,
            numeroPortas: this.numeroPortas
        }
        Veiculo.prototype.clone = function(obj){
            obj.prototype = cloneCarro
        }

        Veiculo.prototype.represent = function(){
            console.log(`Modelo: ${this.modelo}, Marca: ${this.marca}, Cor: ${this.cor}, Rodas: ${this.numeroRodas}`)
        }
    }
}

class Onibus extends Veiculo{
    constructor(modelo, marca, cor, numeroRodas){
        super(modelo, marca, cor, numeroRodas)
        this.numeroPortas = this.numeroPortas

        let cloneBike = {
            modelo: this.modelo,
            marca: this.marca,
            cor: this.cor,
            numeroRodas: this.numeroRodas,
            numeroPortas: this.numeroPortas
        }
        Veiculo.prototype.clone = function(obj){
            obj.prototype = cloneOnibus
        }

        Veiculo.prototype.represent = function(){
            console.log(`Modelo: ${this.modelo}, Marca: ${this.marca}, Cor: ${this.cor}, Rodas: ${this.numeroRodas}, ${this.numeroPortas}`)
        }
    }
}

let jeep = new Carro('Renegade','Jeep','Vermelho', 4, 4)
jeep.represent()
jeep.clone(jeep)

let chevrolet = new Carro('Onix','Chevrolet','Branco', 4, 4)
chevrolet.represent()
chevrolet.clone(chevrolet)

let Honda = new Carro('Accord','Honda','Preto', 4, 4)
Honda.represent()
Honda.clone(Honda)

let Mercedes = new Carro('O-400RSD','Mercedes','Branco', 4, 1)
Mercedes.represent()
Mercedes.clone(Mercedes)

let fiat = new Carro('Uno','Fiat','Prata', 4, 2)
fiat.represent()
fiat.clone(fiat)

let nissan = new Carro('Civilian','Nissan','Preto', 4, 1)
nissan.represent()
nissan.clone(nissan)

const veiculos = []

veiculos.push(jeep)
veiculos.push(chevrolet)
veiculos.push(Honda)

veiculos.push(Mercedes)
veiculos.push(fiat)
veiculos.push(nissan)
