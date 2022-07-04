const myArray = [30, 30, 40, 5, 223, 2049, 3034, 5]

function valoresUnicos(arr) {
  const mySet = new Set(arr)
  return [...mySet] //usando spread para criar um novo array
}

console.log(valoresUnicos(myArray))
