const list = [
  {
    name: 'arroz',
    price: 20
  },

  {
    name: 'feijão',
    price: 7
  },

  {
    name: 'carne',
    price: 30
  }
]

const disponible = 100

function calculateBalance(disponible, list) {
  return list.reduce(function (prev, current, index) {
    console.log('rodada', index + 1)
    console.log({ prev })
    console.log({ current })
    return prev - current.price
  }, disponible)
}

console.log(calculateBalance(disponible, list))
