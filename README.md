# API do Projeto Angels

## Descrição

O projeto Angels-API é uma API desenvolvida para simplificar e aprimorar o acompanhamento pré-natal, oferecendo uma plataforma centralizada para registro de informações e monitoramento do progresso das gestantes. A API permite o cadastro detalhado das gestantes, registro e acompanhamento de cada consulta pré-natal, integração com recursos de Inteligência Artificial para análise dos dados registrados, entre outras funcionalidades.

## Requisitos Funcionais

1. **Cadastro de Gestantes**: Permite o cadastro detalhado de gestantes, incluindo informações como nome, idade, data prevista para o parto, histórico médico, alergias, medicamentos em uso e informações de contato de emergência.

2. **Registro de Consultas Pré-natais**: Permite o registro de informações de cada consulta pré-natal, como pressão arterial, peso, altura uterina, batimentos cardíacos do feto, resultados de exames laboratoriais e prescrições médicas.

3. **Acompanhamento do Progresso da Gestação**: Permite que o profissional de saúde acompanhe o progresso das gestantes cadastradas.

4. **Integração com Inteligência Artificial**: Integra recursos de Inteligência Artificial para análise dos dados registrados, identificação de possíveis riscos durante a gestação e sugestão de ações preventivas ou tratamentos necessários.

5. **Acesso Hierárquico**: Possui um sistema de controle de acesso hierárquico, permitindo que diferentes profissionais de saúde tenham acesso apenas às informações pertinentes às gestantes sob sua responsabilidade.

## Requisitos Não Funcionais

1. **Segurança**: Garante a segurança dos dados, utilizando métodos robustos de criptografia e autenticação de usuários.

2. **Desempenho**: Responsivo e com um tempo de resposta aceitável, mesmo com um grande volume de dados e usuários acessando simultaneamente.

3. **Usabilidade**: Interface intuitiva e fácil de usar, mesmo para profissionais de saúde com pouca experiência em tecnologia.

4. **Compatibilidade**: Compatível com diferentes dispositivos (computadores, tablets, smartphones) e navegadores web populares.

5. **Disponibilidade**: Disponível 24 horas por dia, 7 dias por semana, com um tempo de inatividade mínimo para manutenção e atualizações.

## Instalação e Configuração

1. Clone o repositório do projeto:
   ```sh
   git clone https://github.com/VictorGabrielCuralesvic/Angels.git
   ```

2. Importe o projeto em sua IDE preferida (por exemplo, IntelliJ IDEA, Eclipse).

3. Configure o arquivo `application.properties` com as informações do seu banco de dados:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

4. Execute a aplicação.

## Uso

A API do projeto Angels pode ser acessada através de requisições HTTP para os endpoints disponíveis. Abaixo estão alguns exemplos de uso dos principais endpoints:

Para criar uma gestante juntamente com seus dados evolutivos, você pode usar o DTO `CadastrarGestanteEDadosEvolutivosDTO` da seguinte maneira:

#### Requisição HTTP
1. **Cadastro de Gestantes**:
   - Endpoint: `/gestantes`
   - Método: `POST`
   - Corpo da Requisição:
```json
{
  "gestante": {
    "nome": "Maria da Silva",
    "dataNascimento": "1990-01-01",
    "cpf": "123.456.789-00",
    "raca": 1,
    "sexo": "Feminino"
    },
  "dadosEvolutivos": {
    "municipio": "Recife",
    "diagnosticoDesnutricao": 0,
    "energiaEletricaDomicilio": true,
    "escolaridade": 2,
    "tipoMoradia": 1,
    "moradiaRedeEsgoto": true,
    "rendaFamiliar": 1500.00,
    "tratamentoAgua": true,
    "amamentacao": true,
    "chefeFamilia": false,
    "emRisco": false,
    "estadoCivil": 1,
    "quantidadeAbortos": 0,
    "quantidadeFilhosVivos": 1,
    "quantidadeGemelares": 0,
    "quantidadeGestacao": 1,
    "quantidadeNascidosMortos": 0,
    "quantidadeNascidosVivos": 1,
    "quantidadeObitosSemana1": 0,
    "quantidadeObitosAposSemana1": 0,
    "quantidadePartos": 1,
    "quantidadePartosCesarios": 0,
    "quantidadePartosVaginais": 1,
    "quantidadeRnPeso2500_4000": 1,
    "quantidadeRnPesoMaior4000": 0,
    "quantidadeRnPesoMenor2500": 0,
    "hipertensao": false,
    "diabetes": false,
    "cirurgiaPelvica": false,
    "infeccaoUrinaria": false,
    "maFormacaoCongenita": false,
    "familiarGemeos": false,
    "contato": "Contato",
    "contatoEmergencia": "Contato de Emergência"
  }
}
```

2. **Registro de Consultas Pré-natais**:
   - Endpoint: `/consultas`
   - Método: `POST`
   - Corpo da Requisição:
     ```json
     {
       "idGestante": 1,
       "dataAcompanhamento": "2024-03-20",
       "realizadoPor": "Dra. Lúcia Pacheco",
       "pesoAtual": 65,
       "idadeGestacional": 20,
       "pressaoArterial": "120/80",
       "batimentosCardiacosFeto": 140,
       "alturaUterina": 25,
       "tipo": "Pré-natal de Rotina"
     }
     ```

2. **Dados da gestação**:
   - Endpoint: `/gestacao`
   - Método: `POST`
   - Corpo da Requisição:
```json
{
    "gestanteId": 1,
    "consumoAlcool": false,
    "frequenciaUsoAlcool": 0,
    "dataUltimaMenstruacao": "2023-01-15",
    "dataInicioGestacao": "2023-01-01",
    "fatorRh": "+",
    "fuma": false,
    "quantidadeCigarrosDia": 0,
    "usoDrogas": 0,
    "gravidezPlanejada": true,
    "grupoSanguineo": 1,
    "pesoAntesGestacao": 60.5,
    "riscoGestacional": 1,
    "vacinaHepatiteB": true,
    "situacaoGestacional": 1
}
```

3. **Dados do acompanhamento**:
   - Endpoint: `/acompanhamento`
   - Método: `POST`
   - Corpo da Requisição:
```json
{
    "gestacaoId": 1,
    "dataAcompanhamento": "2023-02-01",
    "realizadoPor": "Dra. Lúcia Pacheco",
    "pesoAtual": 61.2,
    "idadeGestacional": 10,
    "pressaoArterial": "120/80",
    "batimentosCardiacosFeto": 140,
    "alturaUterina": 15,
    "tipo": "pré-natal de rotina",
    "riscoIA": false
}
```

4. **Dados do exame**:
   - Endpoint: `/exame`
   - Método: `POST`
   - Corpo da Requisição:
```json
{
    "acompanhamentoId": 1,
    "tipo": "Ultrassonografia",
    "resultado": "Normal",
    "observacao": "Feto em desenvolvimento adequado."
}
```

Nesses exemplos, os IDs das gestantes e gestações devem corresponder aos IDs existentes em seu banco de dados. Certifique-se de ajustar os valores dos campos de acordo com a necessidade do seu sistema.
