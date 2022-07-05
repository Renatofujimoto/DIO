const orange = {
  value: 2
}

const apple = {
  value: 3
}

function mapWithThis(arr, thisArg) {
  return arr.map(function (item) {
    return item * this.value
  }, thisArg)
}

const nums = [1, 2]

console.log('this => orange', mapWithThis(nums, orange))
console.log('this => apple', mapWithThis(nums, apple))

// segunda resolução

function mapArray() {
  const array = [1, 2, 3, 4, 5]

  return array.map(function (item) {
    return item * this.price
  }, apple)
}

console.log(mapArray())
