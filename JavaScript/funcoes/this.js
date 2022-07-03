function calculaIdade(anos) {
  return `Daqui a ${anos} anos, ${this.nome} terá ${
    this.idade + anos
  } anos de idade`
}

const pessoa1 = {
  nome: 'Renato',
  idade: 28
}
const pessoa2 = {
  nome: 'Patricia',
  idade: 22
}
const animal = {
  nome: 'Hanna',
  idade: 5,
  raca: 'Rotweiler'
}

console.log(calculaIdade.call(pessoa1, 20))
