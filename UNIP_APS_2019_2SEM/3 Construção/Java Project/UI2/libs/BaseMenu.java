package libs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BaseMenu {

	public void IniciarMenu() {
		JMenuBar menuBar = new JMenuBar();

		// Adiciona a barra de menu ao frame
		BaseFrame.frame.setJMenuBar(menuBar);

		// ----------------   Arquivo
		JMenu arquivoMenu = new JMenu("Arquivo");
		arquivoMenu.add(addItemPersonalizado("Deslogar", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.Login().Index();
			}
		}));
		arquivoMenu.addSeparator();		
		arquivoMenu.add(addItemPersonalizado("Fechar programa", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		}));
		menuBar.add(arquivoMenu);	
		// ----------------
		
		JMenu cadastrarMenu = new JMenu("Cadastrar");
		cadastrarMenu.add(addItemPersonalizado("Aluno", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.CadastrarAluno().Index();
			}
		}));				
		cadastrarMenu.add(addItemPersonalizado("Disciplina", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.CadastrarDisciplina().Index();
			}
		}));
		cadastrarMenu.add(addItemPersonalizado("Professor", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.CadastrarProfessor().Index();
			}
		}));

		cadastrarMenu.add(addItemPersonalizado("Professor Disciplina", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.CadastrarProfessorDisciplina().Index();
			}
		}));
		cadastrarMenu.add(addItemPersonalizado("Aluno Disciplina", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.CadastrarAlunoDisciplina().Index();
			}
		}));
		menuBar.add(cadastrarMenu);	
		// ----------------
		
		JMenu mostrarMenu = new JMenu("Mostrar");
		mostrarMenu.add(addItemPersonalizado("Aluno", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.MostrarAluno().Index();
			}
		}));				
		mostrarMenu.add(addItemPersonalizado("Disciplina", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.MostrarDisciplina().Index();
			}
		}));
		mostrarMenu.add(addItemPersonalizado("Professor", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				new controllers.MostrarProfessor().Index();
			}
		}));		
		menuBar.add(mostrarMenu);
		
		// ----------------
		JMenu EditarMenu = new JMenu("Editar");
		menuBar.add(EditarMenu);
		// ----------------
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.add(addItemPersonalizado("Encerrar programa", new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		}));					
		menuBar.add(helpMenu);	
		
	}
	
	private JMenuItem addItemPersonalizado(String nome,ActionListener acao)
	{
		JMenuItem newAction = new JMenuItem(nome);
		newAction.addActionListener(acao);		
		return newAction;
	}
}
