const nums = [2, 4, 6, 8, 10]

function mapsWithoutThis(arr) {
  return arr.map(function (item) {
    return item * 2
  })
}

console.log(mapsWithoutThis(nums))
