const alunos = [
  {
    nome: 'Renato',
    nota: 5,
    turma: '1b'
  },

  {
    nome: 'Leila',
    nota: 8,
    turma: '2b'
  },

  {
    nome: 'Patricia',
    nota: 6,
    turma: '3b'
  },

  {
    nome: 'Bruno',
    nota: 3,
    turma: '3b'
  }
]

function alunosAprovados(arr, media) {
  let aprovados = []

  for (let i = 0; i < arr.length; i++) {
    const { nota, nome } = arr[i]

    if (nota >= media) {
      aprovados.push(nome)
    }
  }
  return aprovados
}

console.log(alunosAprovados(alunos, 5))
