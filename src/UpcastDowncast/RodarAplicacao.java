package UpcastDowncast;

class RodarAplicacao {

    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario(); Exemplo de erro
        //Vendedor vendedor_ = (Vendedor) new Funcionario(); Exemplo de erro
    }
    
}
