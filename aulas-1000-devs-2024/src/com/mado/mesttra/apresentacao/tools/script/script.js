// Seleciona todas as seções
const sections = document.querySelectorAll('section');

// Itera sobre as seções e adiciona os eventos de clique
sections.forEach(section => {
    section.addEventListener('click', function() {
        // Remove a classe 'active-section' de todas as seções antes
        sections.forEach(sec => sec.classList.remove('active-section'));
        
        // Adiciona a classe 'active-section' à seção clicada
        this.classList.add('active-section');
    });
});