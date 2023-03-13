#language: pt
Funcionalidade: Cadastro de veiculos com sucesso

  Cenário: Acessar o site, acessar funcionalidade de cadastrar, inserir todos os dados obrigatórios e cadastrar o veiculo
    Dado que acesse o site tricentis
    E clique em vehicle data
    E selecione Make
    E selecione Model
    E digite Cylinder Capacity 
    E digite Engine Performance
    E informe Date of Manufacture 
    E selecione Number of Seats
    E escolha Right Hand Drive
    E selecione Number of Seats Dois
    E selecione Fuel Type
    E digite Payload
    E digite Total Weight
    E digite List Price
    E digite License Plate Number
    E digite Annual Mileage
    E clique Next
    
  Cenário: Funcionalidade de cadastrar Segurado, inserir todos os dados obrigatórios e cadastrar o segurado
   
    E clique em Insurant data
    E digite First Name 
    E digite Last Name
    E informe Date of Birth 
    E selecione Gender 
    E digite Street Address
    E selecione Country
    E digite Zip Code
    E digite City
    E selecione Occupation
    E escolha Hobbies
    E digite Website
    E adicione Picture
    E clique NextI
    
   Cenário: Funcionalidade de cadastrar as informações do produto, inserir todos os dados obrigatórios e cadastrar o Produto
    
   E clique em Product Data
   E informe Start Date
   E selecione Insurance Sum
   E selecione Merit Rating
   E selecione Damage Insurance
   E escolha Optional Products
   E selecione Courtesy Car 
   E clique NextP
   
   Cenário: Funcionalidade Opcao de Preco
   
   E clique em Select Price Option
   E escolha Select Option
  # E clique NextPO
   
  # Cenário: Funcionalidade Cotacao
   
  # E clique em Send Quote
  # E digite EMail
  #E digite Phone
   #E digite Username
   #E digite Password
   #E digite Confirm Password
   #E digite Comments
   #E clique Send
   