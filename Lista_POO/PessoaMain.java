public class PessoaMain {

    public static void main(String[] args) {
    	
        Pessoa pessoa = new Pessoa("João", 18, 1.70f, 70.0);

        System.out.println("Dados iniciais:");
        System.out.println(pessoa);

        for (int i = 0; i < 5; i++) {
            pessoa.Envelhecer();
        }

        System.out.println("\nApós envelhecer 5 anos:");
        System.out.println(pessoa);

        pessoa.Engordar(5.0);
        System.out.println("\nApós engordar 5kg:");
        System.out.println(pessoa);
        
        pessoa.Emagrecer(3.0);
        System.out.println("\nApós emagrecer 3kg:");
        System.out.println(pessoa);
    }
}
