# SwFeature
Teste de CRUD
-- Projeto desenvolvido em JAVA com banco de dados MYSQL, na pasta de Modulo de conexão, há um método de conexão para usar quando o banco estiver hospedado em RDS na AWS 
usando uma instancia EC2.
-- Para que o projeto rode sem problemas, como o banco está em rede local, o correto é alterar os parâmetros de conexão, dentro deste repositório encontra-se 
o diagrama do banco e o script de criação.
Além disso, foi desenvolvido um manifesto de deploy automatizado pelo kubernetes, então basta criar uma imagem no Docker e incluir no dockerfile repository.
Este pequeno projeto tem a proposta de executar um CRUD com banco, para facilitar o uso foram cridas duas telas para inserir, listar, excluir e modificar os campos do banco 
por meio de uma interface gráfica.
