# Desafio Bootcamp Santander 2025: Funções de um Carro

Este projeto foi desenvolvido para cumprir o desafio do Bootcamp Santander 2025, simulando as principais funções de um carro em um ambiente de console interativo.

## Sobre o Projeto

Aqui, o usuário pode criar um carro informando modelo, cor e ano, e então controlar suas funções por meio de um menu interativo. É possível ligar/desligar, acelerar, frear, trocar marchas, virar para esquerda/direita e verificar a velocidade, sempre respeitando as regras de segurança e funcionamento de um veículo real.

## Como funciona

- **Menu interativo:** O usuário navega por um menu no terminal, podendo executar quantas ações quiser até optar por sair do programa.
- **Painel de marchas:** Ao escolher trocar marcha, um submenu permite selecionar a marcha desejada, respeitando as regras de não pular marchas e limites de velocidade.
- **Mensagens informativas:** O sistema informa sempre que uma ação não é permitida, explicando o motivo (ex: tentar acelerar em ponto morto, trocar marcha fora do limite de velocidade, etc).
- **Validações:** Todas as funções do carro só podem ser executadas se o carro estiver ligado e dentro das condições corretas.

## Regras de Implementação

- O carro inicia desligado, em ponto morto e com velocidade 0.
- Carro desligado não executa funções.
- Acelerar incrementa 1km/h (máx. 120km/h).
- Frear decrementa 1km/h (mín. 0km/h).
- 6 marchas, não pode pular marchas.
- Limites de velocidade por marcha:
    - Marcha 0 (ponto morto): não pode acelerar
    - 1ª marcha: 0km/h a 20km/h
    - 2ª marcha: 21km/h a 40km/h
    - 3ª marcha: 41km/h a 60km/h
    - 4ª marcha: 61km/h a 80km/h
    - 5ª marcha: 81km/h a 100km/h
    - 6ª marcha: 101km/h a 120km/h
- Só pode desligar em ponto morto e velocidade 0.
- Só pode virar se a velocidade estiver entre 1km/h e 40km/h.

---

## Pontos de Melhoria e Funcionalidades Extras

- **Enum para marcha:** Usei um enum para representar as marchas, deixando o código mais organizado, seguro e fácil de manter.
- **Painel de marchas dedicado:** O usuário pode acessar um painel exclusivo para troca de marchas, facilitando a navegação e evitando erros.
- **Validação detalhada:** O sistema informa exatamente por que uma ação não pode ser realizada, melhorando a experiência do usuário.
- **Estrutura modular:** O código está organizado em classes separadas (`Carro` e `App`), facilitando futuras expansões e manutenções.
- **Possibilidade de expansão:** A estrutura permite adicionar facilmente novas funções, como buzina, faróis, etc.

---

## Estrutura do Projeto

- `src/`: código-fonte Java
- `lib/`: dependências
- `bin/`: arquivos compilados

---

### **Projeto criado para estudo e aprimoramento de habilidades em Java e programação orientada a objetos.**