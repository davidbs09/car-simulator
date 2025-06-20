# Desafio Bootcamp Santander 2025: Funções de um Carro

Este projeto foi desenvolvido para cumprir um desafio do Bootcamp Santander 2025.

## Desafio

Escreva um código onde controlamos as funções de um carro. O carro deve possuir as seguintes funções:

- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir velocidade
- Virar para esquerda/direita
- Verificar velocidade
- Trocar a marcha

### Regras de Implementação

- Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0.
- O carro desligado não pode realizar nenhuma função.
- Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (máximo 120km/h).
- Ao diminuir a velocidade, decrementar 1km (mínimo 0km/h).
- O carro deve possuir 6 marchas e não é permitido pular marchas.
- Limites de velocidade por marcha:
    - Marcha 0 (ponto morto): não pode acelerar
    - 1ª marcha: 0km/h a 20km/h
    - 2ª marcha: 21km/h a 40km/h
    - 3ª marcha: 41km/h a 60km/h
    - 4ª marcha: 61km/h a 80km/h
    - 5ª marcha: 81km/h a 100km/h
    - 6ª marcha: 101km/h a 120km/h
- O carro pode ser desligado apenas se estiver em ponto morto (marcha 0) e velocidade 0km/h.
- Só pode virar para esquerda/direita se a velocidade estiver entre 1km/h e 40km/h.

---

## Estrutura do Projeto

- `src/`: código-fonte Java
- `lib/`: dependências
- `bin/`: arquivos compilados

---

Projeto desenvolvido para fins educacionais.

