package br.com.fabricadeprogramador;

import java.util.List;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		//testSalvar();
		//testBuscarTodos();
		//testCadastrar();
		//testAlterar();
		testAutenticar();
	}

	private static void testAutenticar() {


		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usu = new Usuario();
		usu.setLogin("jao");
		usu.setSenha("123456");
		
		Usuario usuRetorno = usuarioDAO.autenticar(usu);
		
		System.out.println(usuRetorno);
	}

	private static void testBuscarPorId() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscarPorId(1);

		System.out.println(usuario);

	}
	/**
	 * Método para buscar todos os registros
	 */

	private static void testBuscarTodos() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> lista = usuarioDAO.buscarTodos();
		for (Usuario u : lista) {
			
			System.out.println(u);
		}
	}

	public static void testCadastrar() {
		// Criando Usuario

		Usuario usu = new Usuario();
		usu.setNome("Renato");
		usu.setLogin("relesi");
		usu.setSenha("123456789");

		// Cadastrando usuário no banco de dados

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!!!");
	}

	public static void testAlterar() {
		// Criando Usuario

		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jãozão da Silva");
		usu.setLogin("jzaoss");
		usu.setSenha("123456");

		// Cadastrando usuário no banco de dados

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado  com sucesso!!!");
	}

	public static void testExcluir() {

		Usuario usu = new Usuario();
		usu.setId(4);

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso!!!");
	}

	public static void testSalvar() {

		Usuario usuario = new Usuario();
		// usuario.setId(1);
		usuario.setNome("Javazeioro");
		usuario.setLogin("jav");
		usuario.setSenha("javanaveia");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.salvar(usuario);

		System.out.println("Salvo com sucesso");
	}

}
