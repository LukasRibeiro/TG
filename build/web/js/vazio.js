/* verifica campo de preenchimento vazio no index*/
function vazio(){

    var usuario = $('#nome').val();
    var ra = $('#ra').val();
    var senha = $('#senha').val();
    
    /*pagina de cadastro*/
    
    if (usuario === ''){
        alert('campo "usuario" deve ser preenchido!');
    }
    else if (ra === ''){
        alert('campo "ra" deve ser preenchido!');
    }
    
     else if (senha === ''){
        alert('campo "senha" deve ser preenchido!');
    }
    
    else{
        alert('Por favor, os campos nao podem estar vazios!');
    }
}