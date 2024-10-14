function verificarNumero() {
  var numero = parseInt(document.getElementById('numero').value);

  document.getElementById('secaoFormulario').remove();

  var imgResultado = document.createElement('img');
  imgResultado.src = '/imagens/icon-site.gif'; 
  imgResultado.alt = 'Ícone do site';
  imgResultado.classList.add('resultados-img');

  var h2Resultado = document.createElement('h2');
  h2Resultado.classList.add('resultados-h2');

  if (numero % 2 === 0) {
    h2Resultado.textContent = 'O número ' + numero + ' é par!';
  } else {
    h2Resultado.textContent = 'O número ' + numero + ' é ímpar!';
  }

  var botaoVerificarNovamente = document.createElement('button');
  botaoVerificarNovamente.textContent = 'Verificar Novamente';
  botaoVerificarNovamente.classList.add('resultados-botao');

  var main = document.querySelector('main');
  main.appendChild(imgResultado);
  main.appendChild(h2Resultado);
  main.appendChild(botaoVerificarNovamente);

  botaoVerificarNovamente.addEventListener('click', function() {
    location.reload();
  });
}

document.getElementById('btnEnviar').addEventListener('click', verificarNumero);