function calcularIdade() {
    var dataNascimento = new Date(document.getElementById('dataNascimento').value);
    var hoje = new Date();
    var idade = hoje.getFullYear() - dataNascimento.getFullYear();
    var mes = hoje.getMonth() - dataNascimento.getMonth();
    if (mes < 0 || (mes === 0 && hoje.getDate() < dataNascimento.getDate())) {
      idade--;
    }
  
    document.getElementById('secaoFormulario').remove();
  
    var imgResultado = document.createElement('img');
    imgResultado.src = '/imagens/icon-site.gif';
    imgResultado.alt = 'Ícone do site';
    imgResultado.classList.add('resultados-img');
  
    var h2Resultado = document.createElement('h2');
    h2Resultado.textContent = 'Você tem ' + idade + ' anos!';
    h2Resultado.classList.add('resultados-h2');
  
    var botaoCalcularNovamente = document.createElement('button');
    botaoCalcularNovamente.textContent = 'Calcular Novamente';
    botaoCalcularNovamente.classList.add('resultados-botao');
  
    var main = document.querySelector('main');
    main.appendChild(imgResultado);
    main.appendChild(h2Resultado);
    main.appendChild(botaoCalcularNovamente);
  
    botaoCalcularNovamente.addEventListener('click', function() {
      location.reload();
    });
  }
  
  document.getElementById('btnEnviar').addEventListener('click', calcularIdade);