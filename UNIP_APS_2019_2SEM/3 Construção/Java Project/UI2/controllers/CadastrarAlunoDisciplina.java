package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import libs.BaseDesign;
import libs.BaseFrame;
import libs.BaseInit;
import libs.IAction;
import libs.IActionItem;

public class CadastrarAlunoDisciplina extends BaseInit {

	// Metodo para ser chamado quando inicia um novo com as programacoes
	public void Index() {

		List<IActionItem> itens = new ArrayList<IActionItem>();
		itens.add(new IActionItem("onload", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "on load");
			}
		}));

		super.GenerateView(new IAction(this.getClass(), itens));
	}

	// metodo chamado automaticamente pelaa BaseInit para setar informacoes de
	// design
	public static void init(IAction action) {

		BaseDesign.defaultX = BaseDesign.defaultX + (BaseDesign.defaultX / 2);

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Curso:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxCurso = new JComboBox<String>();
		cbxCurso.addItem("Administra��o de empresas");
		cbxCurso.addItem("Administra��o P�blica");
		cbxCurso.addItem("Agroneg�cios");
		cbxCurso.addItem("Agronomia");
		cbxCurso.addItem("Antropologia");
		cbxCurso.addItem("Arqueologia");
		cbxCurso.addItem("Arquitetura");
		cbxCurso.addItem("Arquivologia");
		cbxCurso.addItem("Artes C�nicas");
		cbxCurso.addItem("Artes Pl�sticas");
		cbxCurso.addItem("Artes Visuais");
		cbxCurso.addItem("Astronomia");
		cbxCurso.addItem("Biblioteconomia");
		cbxCurso.addItem("Biologia");
		cbxCurso.addItem("Biomedicina");
		cbxCurso.addItem("Biotecnologia");
		cbxCurso.addItem("Ci�ncia da Computa��o");
		cbxCurso.addItem("Ci�ncias Ambientais");
		cbxCurso.addItem("Ci�ncias Atu�rias");
		cbxCurso.addItem("Ci�ncias Biol�gicas");
		cbxCurso.addItem("Ci�ncias Cont�beis");
		cbxCurso.addItem("Ci�ncias Exatas");
		cbxCurso.addItem("Ci�ncias Naturais");
		cbxCurso.addItem("Ci�ncias Pol�ticas");
		cbxCurso.addItem("Ci�ncias Sociais");
		cbxCurso.addItem("Cinema");
		cbxCurso.addItem("Com�rcio Exterior");
		cbxCurso.addItem("Comunica��o Social");
		cbxCurso.addItem("Dan�a");
		cbxCurso.addItem("Desenho Industrial");
		cbxCurso.addItem("Design de Games");
		cbxCurso.addItem("Design Gr�fico");
		cbxCurso.addItem("Direito");
		cbxCurso.addItem("Economia");
		cbxCurso.addItem("Educa��o F�sica");
		cbxCurso.addItem("Enfermagem");
		cbxCurso.addItem("Engenharia Aeron�utica");
		cbxCurso.addItem("Engenharia Aerospacial");
		cbxCurso.addItem("Engenharia Agr�cola");
		cbxCurso.addItem("Engenharia Ambiental");
		cbxCurso.addItem("Engenharia Biom�dica");
		cbxCurso.addItem("Engenharia Civil");
		cbxCurso.addItem("Engenharia da Computa��o");
		cbxCurso.addItem("Engenharia de Agrimensura");
		cbxCurso.addItem("Engenharia de Alimentos");
		cbxCurso.addItem("Engenharia de Controle e Automa��o");
		cbxCurso.addItem("Engenharia de Energia");
		cbxCurso.addItem("Engenharia de Materiais");
		cbxCurso.addItem("Engenharia de Minas");
		cbxCurso.addItem("Engenharia de Pesca");
		cbxCurso.addItem("Engenharia de Petr�leo");
		cbxCurso.addItem("Engenharia de Produ��o");
		cbxCurso.addItem("Engenharia El�trica");
		cbxCurso.addItem("Engenharia Florestal");
		cbxCurso.addItem("Engenharia Mec�nica");
		cbxCurso.addItem("Engenharia Mecatr�nica");
		cbxCurso.addItem("Engenharia Metal�rgica");
		cbxCurso.addItem("Engenharia Naval");
		cbxCurso.addItem("Engenharia Nuclear");
		cbxCurso.addItem("Engenharia Qu�mica");
		cbxCurso.addItem("Engenheria de Telecomunica��es");
		cbxCurso.addItem("Est�tica");
		cbxCurso.addItem("Farm�cia");
		cbxCurso.addItem("Filosofia");
		cbxCurso.addItem("F�sica");
		cbxCurso.addItem("Fisioterapia");
		cbxCurso.addItem("Fonoaudiologia");
		cbxCurso.addItem("Fotografia");
		cbxCurso.addItem("Gastronomia");
		cbxCurso.addItem("Geografia");
		cbxCurso.addItem("Geologia");
		cbxCurso.addItem("Gest�o Ambiental");
		cbxCurso.addItem("Gest�o Comercial");
		cbxCurso.addItem("Gest�o de Recursos Humanos");
		cbxCurso.addItem("Gest�o Financeira");
		cbxCurso.addItem("Gest�o Hospitalar 2");
		cbxCurso.addItem("Hotelaria e Turismo");
		cbxCurso.addItem("Jornalismo");
		cbxCurso.addItem("Letras");
		cbxCurso.addItem("Log�stica");
		cbxCurso.addItem("Matem�tica");
		cbxCurso.addItem("Mec�nica Industrial");
		cbxCurso.addItem("Medicina");
		cbxCurso.addItem("Medicina Veterin�ria");
		cbxCurso.addItem("Meteorologia");
		cbxCurso.addItem("Moda");
		cbxCurso.addItem("Multim�dia");
		cbxCurso.addItem("M�sica");
		cbxCurso.addItem("Neg�cios Imobili�rios");
		cbxCurso.addItem("Nutri��o");
		cbxCurso.addItem("Oceanografia");
		cbxCurso.addItem("Odontologia");
		cbxCurso.addItem("Pedagogia");
		cbxCurso.addItem("Processos Gerenciais");
		cbxCurso.addItem("Psicologia");
		cbxCurso.addItem("Publicidade e Propaganda");
		cbxCurso.addItem("Qu�mica");
		cbxCurso.addItem("R�dio e TV");
		cbxCurso.addItem("Radiologia");
		cbxCurso.addItem("Rela��es Internacionais");
		cbxCurso.addItem("Rela��es P�blicas");
		cbxCurso.addItem("Secretariado");
		cbxCurso.addItem("Seguran�a do Trabalho");
		cbxCurso.addItem("Servi�o Social");
		cbxCurso.addItem("Sistemas de Informa��o");
		cbxCurso.addItem("Teatro");
		cbxCurso.addItem("Tecnologia da Informa��o");
		cbxCurso.addItem("Teologia");
		cbxCurso.addItem("Terapia Ocupacional");
		cbxCurso.addItem("Zootecnia");
		cbxCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxCurso, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Aluno:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxAluno = new JComboBox<String>();
		cbxAluno.addItem("Andr� Daniel Yuri Foga�a");
		cbxAluno.addItem("Andr� Diogo Raimundo Corte Real");
		cbxAluno.addItem("Andr� M�rio Moura");
		cbxAluno.addItem("Andrea Sophie Nogueira");
		cbxAluno.addItem("Anthony Marcos Bernardo Lima");
		cbxAluno.addItem("Beatriz Bruna Assis");
		cbxAluno.addItem("Benedito Jorge Ben�cio Cavalcanti");
		cbxAluno.addItem("Brenda Cec�lia Betina Porto");
		cbxAluno.addItem("Bruna Ayla D�bora da Mota");
		cbxAluno.addItem("Calebe Caio Pereira");
		cbxAluno.addItem("Camila Sueli Castro");
		cbxAluno.addItem("Carlos Eduardo Marcos Anthony Rocha");
		cbxAluno.addItem("Cec�lia Elaine Maria Moreira");
		cbxAluno.addItem("C�sar Arthur Daniel Baptista");
		cbxAluno.addItem("Diogo Ian Cavalcanti");
		cbxAluno.addItem("Edson Andr� Monteiro");
		cbxAluno.addItem("Elias Kevin Drumond");
		cbxAluno.addItem("Enzo Carlos Eduardo Arag�o");
		cbxAluno.addItem("Enzo Diego Ramos");
		cbxAluno.addItem("Felipe Kevin Viana");
		cbxAluno.addItem("Fl�via Raimunda Ester da Concei��o");
		cbxAluno.addItem("Fl�via Raimunda Rosa Drumond");
		cbxAluno.addItem("Francisca Marli Cec�lia Galv�o");
		cbxAluno.addItem("Gabriel Lucas Drumond");
		cbxAluno.addItem("Helena Isabelly Vit�ria Rocha");
		cbxAluno.addItem("Henrique Emanuel Fernando Teixeira");
		cbxAluno.addItem("Ian Davi Nascimento");
		cbxAluno.addItem("Isabel F�tima Ramos");
		cbxAluno.addItem("Isabel Giovana de Paula");
		cbxAluno.addItem("Isabela Allana Kamilly Teixeira");
		cbxAluno.addItem("Isabella Analu Nair das Neves");
		cbxAluno.addItem("Isadora Nicole Benedita Figueiredo");
		cbxAluno.addItem("J�ssica Camila Mendes");
		cbxAluno.addItem("Juan Levi Victor da Mata");
		cbxAluno.addItem("Julio Ryan Anthony Cavalcanti");
		cbxAluno.addItem("Kamilly Eduarda Lima");
		cbxAluno.addItem("Kamilly Tatiane Farias");
		cbxAluno.addItem("Kau� Nathan Tiago Pereira");
		cbxAluno.addItem("Leandro Cl�udio M�rcio Pereira");
		cbxAluno.addItem("Lorenzo Ot�vio Ramos");
		cbxAluno.addItem("Mait� Patr�cia Ant�nia Rocha");
		cbxAluno.addItem("Manuel Carlos Eduardo Joaquim da Mata");
		cbxAluno.addItem("Marcelo Iago Thales da Cunha");
		cbxAluno.addItem("M�rcio Pedro Galv�o");
		cbxAluno.addItem("M�rio Pedro Henrique Julio Oliveira");
		cbxAluno.addItem("Mateus Thales Rafael Ferreira");
		cbxAluno.addItem("Nat�lia Maria Corte Real");
		cbxAluno.addItem("Nat�lia Regina D�bora Peixoto");
		cbxAluno.addItem("Paulo Ruan F�bio Mendes");
		cbxAluno.addItem("Pietra Liz Sarah Viana");
		cbxAluno.addItem("Raquel Francisca Costa");
		cbxAluno.addItem("Renan M�rio Manoel Pires");
		cbxAluno.addItem("Rita Fernanda Bruna Monteiro");
		cbxAluno.addItem("Rita Olivia Nascimento");
		cbxAluno.addItem("S�rgio Diogo Peixoto");
		cbxAluno.addItem("Sophia Carolina Mariana Pereira");
		cbxAluno.addItem("Tatiane Catarina Mendes");
		cbxAluno.addItem("Thomas Eduardo Corte Real");
		cbxAluno.addItem("Valentina Isabela Moreira");
		cbxAluno.addItem("Vitor Nelson Cau� Dias");
		cbxAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxAluno, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha a Disciplina:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxDisciplina = new JComboBox<String>();
		cbxDisciplina.addItem("Administracao");
		cbxDisciplina.addItem("Algebra Linear");
		cbxDisciplina.addItem("Analise Matematica");
		cbxDisciplina.addItem("Aplic Ling Progr Orien Objetos");
		cbxDisciplina.addItem("Arquitetura De Computadores");
		cbxDisciplina.addItem("Aspec Teor Da Computacao");
		cbxDisciplina.addItem("Atividades Complementares18");
		cbxDisciplina.addItem("Atividades Praticas Supervis");
		cbxDisciplina.addItem("Banco De Dados");
		cbxDisciplina.addItem("Calculo Numerico");
		cbxDisciplina.addItem("Ciencia Da Computacao Integ");
		cbxDisciplina.addItem("Ciencia Da Computacao Interdis");
		cbxDisciplina.addItem("Ciencias Sociais");
		cbxDisciplina.addItem("Circuitos Digitais");
		cbxDisciplina.addItem("Compiladores E Computabilidade");
		cbxDisciplina.addItem("Computacao Grafica");
		cbxDisciplina.addItem("Comunicacao E Expressao");
		cbxDisciplina.addItem("Desen Em Ambiente Web");
		cbxDisciplina.addItem("Desenv De Sist Distribuidos");
		cbxDisciplina.addItem("Eletricidade E Optica");
		cbxDisciplina.addItem("Engenharia De Software");
		cbxDisciplina.addItem("Estatistica E Probabilidade");
		cbxDisciplina.addItem("Estrutura De Dados");
		cbxDisciplina.addItem("Geometria Analitica");
		cbxDisciplina.addItem("Homem E Sociedade");
		cbxDisciplina.addItem("Inteligencia Artificial");
		cbxDisciplina.addItem("Interpretacao E Prod Textos");
		cbxDisciplina.addItem("Libras (opt)");
		cbxDisciplina.addItem("Ling De Prog De Bco De Dados");
		cbxDisciplina.addItem("Ling De Prog Estrut");
		cbxDisciplina.addItem("Ling Formais E Automatos");
		cbxDisciplina.addItem("Ling Prog Orient A Objetos");
		cbxDisciplina.addItem("Logica De Program E Algoritmos");
		cbxDisciplina.addItem("Logica Matematica");
		cbxDisciplina.addItem("Matematica Discreta");
		cbxDisciplina.addItem("Metod Do Trabalho Academico");
		cbxDisciplina.addItem("Metodos De Pesquisa");
		cbxDisciplina.addItem("Nocoes De Direito");
		cbxDisciplina.addItem("Paradigmas De Linguagens");
		cbxDisciplina.addItem("Processamento De Imagem");
		cbxDisciplina.addItem("Projeto Logico De Computadores");
		cbxDisciplina.addItem("Qualidade De Software");
		cbxDisciplina.addItem("Redes De Computadores");
		cbxDisciplina.addItem("Sist De Inform Inteligentes");
		cbxDisciplina.addItem("Sist Operacionais Abertos");
		cbxDisciplina.addItem("Sistemas Distribuidos");
		cbxDisciplina.addItem("Sistemas Operacionais");
		cbxDisciplina.addItem("Telecomunicacoes");
		cbxDisciplina.addItem("Teoria Dos Grafos");
		cbxDisciplina.addItem("Topicos De Ambiente Web");
		cbxDisciplina.addItem("Topicos De Matematica Aplicada");

		cbxDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxDisciplina, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		JButton btnCadastrar = BaseDesign.basicButton("Cadastrar", BaseDesign.enBounds.NewLinha,
				BaseDesign.enColorButton.Primary);
		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				new controllers.CadastrarAlunoDisciplina().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnCadastrar);

	}
}