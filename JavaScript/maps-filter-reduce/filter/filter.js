const myArray = [1, 23, 55, 67, 30, 2, 4]

function numberPairs(arr) {
  return arr.filter(pairs)
}

function pairs(item) {
  return item % 2 === 0 // buscando pares
  // return item % 2 !== 0 // buscando impares
}

console.log(numberPairs(myArray))

// segunda forma de resolução
function filtraPares(arr) {
  if (!arr || !arr.length) return

  const filteredArr = arr.filter(item => item % 2 === 0)

  return filteredArr
}

console.log(filtraPares([1, 2, 3, 4]))
