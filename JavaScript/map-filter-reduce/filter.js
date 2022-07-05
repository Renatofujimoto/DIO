const myArray = [1, 23, 55, 67, 30, 2, 4]

function numberPairs(arr) {
  return arr.filter(pairs)
}

function pairs(item) {
  return item % 2 === 0 // buscando pares
  // return item % 2 !== 0 // buscando impares
}

console.log(numberPairs(myArray))
