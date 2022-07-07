function validArray(arr, num) {
  try {
    if (!arr && !num) throw new ReferenceError('Envie os Parâmetros')

    if (typeof arr !== 'object')
      throw new TypeError('O Array precisa ser do tipo object')

    if (typeof num !== 'number')
      throw new TypeError('O Num precisa ser do tipo Number')

    if (arr.length !== num) throw new RangeError('Tamanho do Array Inválido!')

    return arr
  } catch (e) {
    if (e instanceof ReferenceError) {
      console.log('Este erro é um ReferenceError!')
      console.log(e.message)
    } else if (e instanceof TypeError) {
      console.log('Este erro é um TypeError')
      console.log(e.message)
    } else if (e instanceof RangeError) {
      console.log('Este erro é um RangeError')
      console.log(e.message)
    } else {
      console.log('Erro desconhecido:' + e)
    }
  }
}

console.log(validArray([1, 2, 3, 4, 5], 5))
