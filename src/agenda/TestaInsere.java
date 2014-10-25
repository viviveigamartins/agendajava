package agenda;

import java.util.Calendar;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("teste@caelum.com.br");
		contato.setEndereco("R. Professor Pimenta da Veiga");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
		

	}

}
