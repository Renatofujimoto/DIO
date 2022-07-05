const nums = [2, 4, 6, 8, 10]

function mapsWithoutThis(arr) {
  return arr.map(function (item) {
    return item * 2
  })
}

console.log(mapsWithoutThis(nums))

// segunda forma

const array = [1, 2, 3, 4, 5]

console.log(array)
console.log(array.map(item => item * 2))

