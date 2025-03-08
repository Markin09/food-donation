// Validação de Login
document.getElementById('login-form')?.addEventListener('submit', function (e) {
    e.preventDefault();

    // Obtendo os valores dos campos de email e senha
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;

    // Verificação simples (Você pode melhorar com expressões regulares ou lógica mais avançada)
    if (email === "" || senha === "") {
        alert("Por favor, preencha todos os campos.");
    } else {
        alert("Login realizado com sucesso!");
        // Aqui você pode redirecionar o usuário para a página principal ou algo similar
        // window.location.href = 'pagina-principal.html';
    }
});

// Exibição de tipo de doador/cliente no formulário de doação
document.getElementById('tipo-doacao')?.addEventListener('change', function () {
    const tipoDoacao = document.getElementById('tipo-doacao').value;
    const descricaoContainer = document.getElementById('descricao-container');

    // Se for um restaurante ou mercado, mostrar campo adicional
    if (tipoDoacao === "Restaurante/Mercado") {
        descricaoContainer.style.display = 'block'; // Mostra campo adicional
    } else {
        descricaoContainer.style.display = 'none'; // Oculta campo adicional
    }
});

// Efeito de navegação para o menu
const menuLinks = document.querySelectorAll('nav ul li a');
menuLinks.forEach(link => {
    link.addEventListener('mouseover', () => {
        link.style.backgroundColor = '#555';
        link.style.transition = 'background-color 0.3s';
    });
    link.addEventListener('mouseout', () => {
        link.style.backgroundColor = '';
    });
});

// Formatação e validação de número na doação
document.getElementById('quantidade-doacao')?.addEventListener('input', function (e) {
    const value = e.target.value;
    // Só permitir números e vírgula
    e.target.value = value.replace(/[^0-9,]/g, '');
});

// Exemplo de animação de efeito em botões
const buttons = document.querySelectorAll('button');
buttons.forEach(button => {
    button.addEventListener('mouseover', () => {
        button.style.backgroundColor = '#45a049';
    });
    button.addEventListener('mouseout', () => {
        button.style.backgroundColor = '#4CAF50';
    });
});

// Função para mostrar a mensagem de sucesso na doação
document.getElementById('doar-form')?.addEventListener('submit', function (e) {
    e.preventDefault();
    const quantidade = document.getElementById('quantidade-doacao').value;
    const tipo = document.getElementById('tipo-doacao').value;

    if (!quantidade || !tipo) {
        alert("Por favor, preencha todos os campos de doação.");
        return;
    }

    alert(`Doação realizada com sucesso! Tipo: ${tipo}, Quantidade: ${quantidade}`);
    // Aqui, você pode enviar os dados para o servidor ou atualizar a UI
});

// Código para abrir/fechar menu em dispositivos móveis (se necessário)
document.getElementById('menu-toggle')?.addEventListener('click', function () {
    const nav = document.querySelector('nav ul');
    nav.classList.toggle('active');
});

// Exemplo de animação ao carregar a página (fade-in)
window.addEventListener('load', () => {
    document.body.style.opacity = 1;
    document.body.style.transition = "opacity 1s";
});
