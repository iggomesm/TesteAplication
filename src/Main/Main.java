package Main;

import java.sql.Connection;
import java.util.List;

import br.com.agenda.geral.enums.EnumOperacaoBD;
import br.com.agenda.geral.tabelas.Pessoa;
import br.com.agenda.integracao.IntegracaoDAO;
import br.com.agenda.integracao.PessoaDAO;
import br.com.agenda.utilitarios.Dia;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//pessoa.setPess_id(1);
		//pessoa.setPess_nascimento(new Dia("01/06/2010").toTimestamp());
		pessoa.setPess_nome("Igor MOises");
		
		try {
			
			IntegracaoDAO integracaoDAO = IntegracaoDAO.getIntegracaoDAO();
			
//			Connection con = integracaoDAO.abrirConexao();
//			
//			int retorno = integracaoDAO.applyUpdateTableMaster(pessoa, con, EnumOperacaoBD.INSERT);
//			
//			integracaoDAO.concluirConexao(con);
//			
//			System.out.println("SALVOU NO BANCO");
			
			PessoaDAO pessoaDAO = new PessoaDAO();
			
			List<Pessoa> lista = pessoaDAO.pesquisaPessoa(pessoa, null);			
			
			for (Pessoa pessoa2 : lista) {
				System.out.println(pessoa2.getPess_id() + " - " + pessoa2.getPess_nome() + "-" + new Dia(pessoa2.getPess_nascimento()).toString());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		Pessoa pessoa = new Pessoa();
//		
//		Dia dia =new Dia();
//		
//		Object o = pessoa;
//		
//		Class classe = o.getClass();
//		
//		for (Field field : classe.getDeclaredFields()) {
//			
//			Annotation [] annotation = field.getDeclaredAnnotations();
//			
//			if (annotation.length > 0){
//				System.out.println(field.getName());
//				for (Annotation annotation2 : annotation) {
//					if (annotation2 instanceof PKTableMaster)
//					System.out.println(annotation2.toString());
//				}
//				
//			}
//			
//		}
	
	}

}
