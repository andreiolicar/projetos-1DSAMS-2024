function inserir(valor) {
    document.getElementById('display').value += valor;
}

function limpar() {
    document.getElementById('display').value = '';
}

function apagar() {
    var display = document.getElementById('display');
    display.value = display.value.slice(0, -1);
}

function calcular() {
    var display = document.getElementById('display').value;
    var resultado = eval(display);
    document.getElementById('display').value = resultado;
}