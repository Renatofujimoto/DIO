function verificarPalindromo(string) {
  if (!string) return 'String inexistente'
  return string.split('').reverse().join('') === string
}
console.log(verificarPalindromo('ele'))

// segunda solução para verificar o palindromo

function verificarPalindromo2(string) {
  if (!string) return 'String Inexistente'

  for (let i = 0; i < string.lenght / 2; i++) {
    if (string[i] !== string[string.lenght - 1 - i]) {
      return false
    }
  }
  return true
}

console.log(verificarPalindromo2('gato'))
