function getAdmins(map) {
  let admins = []
  for ([key, value] of map) {
    if (value === 'Admin') {
      admins.push(key)
    }
  }
  return admins
}

const usuarios = new Map()

usuarios.set('Renato', 'Admin')
usuarios.set('Leila', 'Admin')
usuarios.set('Patricia', 'User')
usuarios.set('Bruno', 'User')
usuarios.set('Luciano', 'Admin')
console.log(getAdmins(usuarios))
