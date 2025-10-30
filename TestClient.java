public class TestClient {

public static void main(String[] args) throws Exception{

// TODO Auto-generated method stub

java.net.URL endpointUrl = new

java.net.URL("http://localhost:8080/CalculatorService/services/CalService");

org.apache.axis.client.Service service new org.apache.axis.client.Service

CalServiceSoapBindingStub stub = new

CalServiceSoapBindingStub(endpointUrl,service); int addresult-stub.add(20,11);

System.out.println("Addition = "+addresult);
