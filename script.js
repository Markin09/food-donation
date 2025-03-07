document.addEventListener("DOMContentLoaded", () => {
    console.log("Plataforma de Doação de Alimentos carregada.");
    
    const form = document.getElementById("cadastro-form");
    if (form) {
        form.addEventListener("submit", async (event) => {
            event.preventDefault();
            
            const tipo = document.getElementById("tipo").value;
            const nome = document.getElementById("nome").value;
            const email = document.getElementById("email").value;
            const senha = document.getElementById("senha").value;
            
            const response = await fetch("http://localhost:3000/cadastro", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ tipo, nome, email, senha })
            });
            
            const result = await response.json();
            alert(result.message);
        });
    }
});
