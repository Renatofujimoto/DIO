let button = document.getElementById('button');
let input = document.getElementById('inputI') as HTMLInputElement;
let input2 = document.getElementById('inputII') as HTMLInputElement;

function addNumber (number1: number, number2: number,devePrintar: boolean, frase: string ){
  let resultado = number1 + number2

  if(devePrintar){
    console.log(frase + resultado)
  }
  return number1 + number2
}

let devePrintar = true;
let frase: string;
frase = "O valor é: "

if(button){
  button.addEventListener("click", () =>{
    if(input && input2){
      console.log(addNumber(Number(input.value), Number(input2.value), devePrintar, frase));
    }
  })
}