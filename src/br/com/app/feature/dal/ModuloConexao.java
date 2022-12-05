
package br.com.app.feature.dal;
import java.sql.*;

/**
 *
 * @author GUSTAVO
 */
public class ModuloConexao {
   //Método que fará a conexão com o Banco MySQL
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // A linha abaixo chama o driver de conexao MySQL no RDS da AWS
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenamento de informações do banco
        String url = "jdbc:mysql://localhost:3306/dbfeature";
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco MySQL
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
}
// (ABAIXO É ILUSTRADO O MODULO DE CONEXAO CASO O BANCO ESTIVESSE NA AWS RODANDO PELO RDS EM UMA EC2)
        

//import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
//import com.amazonaws.services.rds.auth.GetIamAuthTokenRequest;
//import com.amazonaws.services.rds.auth.RdsIamAuthTokenGenerator;

//public class GenerateRDSAuthToken {

    //public static void main(String[] args) {

	    //String region = "us-west-2";
	    //String hostname = "featuresw.cvvbbxh4hcg3.us-east-1.rds.amazonaws.com""; -> ENDPOINT DO BANCO
	    //String port = "3306";
	    //String username = "admin";
	
	    //System.out.println(generateAuthToken(region, hostname, port, username));
   // }

    //static String generateAuthToken(String region, String hostName, String port, String username) {

	//    RdsIamAuthTokenGenerator generator = RdsIamAuthTokenGenerator.builder()
	//	    .credentials(new DefaultAWSCredentialsProviderChain())
	//	    .region(region)
	//	    .build();
//
//	    String authToken = generator.getAuthToken(
//		    GetIamAuthTokenRequest.builder()
//		    .hostname(hostName)
//		    .port(Integer.parseInt(3306))
//		    .userName(admin)
//		    .build());
//	    
//	    return authToken;
  //  }
//
///
//