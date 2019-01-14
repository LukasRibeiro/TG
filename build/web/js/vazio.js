/* verifica campo de preenchimento vazio no index*/
function vazio(){

    var usuario = $('#usuario').val();
    var senha = $('#Senha').val();
    
    /*pagina de login*/
    
    if (usuario === ''){
        alert('campo "usuario" deve ser preenchido!');
    }
    else if (senha === ''){
        alert('campo "senha" deve ser preenchido!');
    }
    else if (usuario ==='' && senha === ''){
        alert('Por favor, ambos os campos nao podem estar vazios!');
    }
}

/*Verifica os campos vazios da pagina de cria��o do usuario 

function confirma(){

    let usuario = ('#usuario').val();
    let senha = ('#senha').val();

    if (usuario == ''){
        $('#erro').html('Campo "usuario" deve ser preenchido!');
    }
    else if(senha == ''){
        $('#erro').html('Campo "senha" deve ser preenchido!');
    }
}

*/