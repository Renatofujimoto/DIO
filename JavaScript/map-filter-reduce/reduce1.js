const arr = [1, 2]

function sumNumbers(arr) {
  return arr.reduce(function (prev, current) {
    console.log({ prev }) // valor anterior: 1
    console.log({ current }) //valor atual: 2
    return prev + current // 3
  })
}

console.log(sumNumbers(arr))
