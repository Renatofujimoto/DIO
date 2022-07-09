class contaBancaria {
  constructor(agencia, numero, tipo, saldo) {
    this.agencia = agencia
    this.numero = numero
    this.tipo = tipo
    this._saldo = 0
  }

  get saldo() {
    return this._saldo
  }

  set saldo(valor) {
    this._saldo = valor
  }

  sacar(valor) {
    if (valor > this._saldo) {
      return 'Operação negada, saldo insuficiente'
    }
    this._saldo = this._saldo - valor
    return this._saldo
  }

  depositar(valor) {
    this.saldo = this._saldo + valor
    return this._saldo
  }
}

class contaCorrente extends contaBancaria {
  constructor(agencia, numero, saldo, cartaCredito) {
    super(agencia, numero, saldo)
    this.tipo = 'corrente'
    this._cartaoCredito = cartaCredito
  }

  get cartaCredito() {
    return this._cartaoCredito
  }

  set cartaCredito(valor) {
    this._cartaoCredito = valor
  }
}

class contaPoupanca extends contaBancaria {
  constructor(agencia, numero) {
    super(agencia, numero)
    this.tipo = 'poupança'
  }
}

class contaUniversitaria extends contaBancaria {
  constructor(agencia, numero) {
    super(agencia, numero)
    this.tipo = 'universitária'
  }

  sacar(valor) {
    if (valor > 500) {
      return 'Operação Negada!'
    }

    this._saldo = this._saldo - valor
  }
}
