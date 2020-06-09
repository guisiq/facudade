var botaoLogar = document.querySelector("#botao-logar");
botaoLogar.addEventListener("click", function () {
    var usuario = document.querySelector('#usuario');
    var senha = document.querySelector('#senha');
    if (usuario.value == "admin" && senha.value == "admin") {
        window.location.href = "index.html";
    } else{
        alert("Usuário ou senha errada!");
    }
})