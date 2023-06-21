package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import libs.BaseDesign;
import libs.BaseFrame;
import libs.BaseInit;
import libs.IAction;
import libs.IActionItem;

public class MostrarDisciplina extends BaseInit {

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
				.add(BaseDesign.basicLabelCenter("Escolha Curso:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxCurso = new JComboBox<String>();
		cbxCurso.addItem("-- Selecione --");
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

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Professor:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxProfessor = new JComboBox<String>();
		cbxProfessor.addItem("-- Selecione --");
		cbxProfessor.addItem("Andr� Daniel Yuri Foga�a");
		cbxProfessor.addItem("Andr� Diogo Raimundo Corte Real");
		cbxProfessor.addItem("Andr� M�rio Moura");
		cbxProfessor.addItem("Andrea Sophie Nogueira");
		cbxProfessor.addItem("Anthony Marcos Bernardo Lima");
		cbxProfessor.addItem("Beatriz Bruna Assis");
		cbxProfessor.addItem("Benedito Jorge Ben�cio Cavalcanti");
		cbxProfessor.addItem("Brenda Cec�lia Betina Porto");
		cbxProfessor.addItem("Bruna Ayla D�bora da Mota");
		cbxProfessor.addItem("Calebe Caio Pereira");
		cbxProfessor.addItem("Camila Sueli Castro");
		cbxProfessor.addItem("Carlos Eduardo Marcos Anthony Rocha");
		cbxProfessor.addItem("Cec�lia Elaine Maria Moreira");
		cbxProfessor.addItem("C�sar Arthur Daniel Baptista");
		cbxProfessor.addItem("Diogo Ian Cavalcanti");
		cbxProfessor.addItem("Edson Andr� Monteiro");
		cbxProfessor.addItem("Elias Kevin Drumond");
		cbxProfessor.addItem("Enzo Carlos Eduardo Arag�o");
		cbxProfessor.addItem("Enzo Diego Ramos");
		cbxProfessor.addItem("Felipe Kevin Viana");
		cbxProfessor.addItem("Fl�via Raimunda Ester da Concei��o");
		cbxProfessor.addItem("Fl�via Raimunda Rosa Drumond");
		cbxProfessor.addItem("Francisca Marli Cec�lia Galv�o");
		cbxProfessor.addItem("Gabriel Lucas Drumond");
		cbxProfessor.addItem("Helena Isabelly Vit�ria Rocha");
		cbxProfessor.addItem("Henrique Emanuel Fernando Teixeira");
		cbxProfessor.addItem("Ian Davi Nascimento");
		cbxProfessor.addItem("Isabel F�tima Ramos");
		cbxProfessor.addItem("Isabel Giovana de Paula");
		cbxProfessor.addItem("Isabela Allana Kamilly Teixeira");
		cbxProfessor.addItem("Isabella Analu Nair das Neves");
		cbxProfessor.addItem("Isadora Nicole Benedita Figueiredo");
		cbxProfessor.addItem("J�ssica Camila Mendes");
		cbxProfessor.addItem("Juan Levi Victor da Mata");
		cbxProfessor.addItem("Julio Ryan Anthony Cavalcanti");
		cbxProfessor.addItem("Kamilly Eduarda Lima");
		cbxProfessor.addItem("Kamilly Tatiane Farias");
		cbxProfessor.addItem("Kau� Nathan Tiago Pereira");
		cbxProfessor.addItem("Leandro Cl�udio M�rcio Pereira");
		cbxProfessor.addItem("Lorenzo Ot�vio Ramos");
		cbxProfessor.addItem("Mait� Patr�cia Ant�nia Rocha");
		cbxProfessor.addItem("Manuel Carlos Eduardo Joaquim da Mata");
		cbxProfessor.addItem("Marcelo Iago Thales da Cunha");
		cbxProfessor.addItem("M�rcio Pedro Galv�o");
		cbxProfessor.addItem("M�rio Pedro Henrique Julio Oliveira");
		cbxProfessor.addItem("Mateus Thales Rafael Ferreira");
		cbxProfessor.addItem("Nat�lia Maria Corte Real");
		cbxProfessor.addItem("Nat�lia Regina D�bora Peixoto");
		cbxProfessor.addItem("Paulo Ruan F�bio Mendes");
		cbxProfessor.addItem("Pietra Liz Sarah Viana");
		cbxProfessor.addItem("Raquel Francisca Costa");
		cbxProfessor.addItem("Renan M�rio Manoel Pires");
		cbxProfessor.addItem("Rita Fernanda Bruna Monteiro");
		cbxProfessor.addItem("Rita Olivia Nascimento");
		cbxProfessor.addItem("S�rgio Diogo Peixoto");
		cbxProfessor.addItem("Sophia Carolina Mariana Pereira");
		cbxProfessor.addItem("Tatiane Catarina Mendes");
		cbxProfessor.addItem("Thomas Eduardo Corte Real");
		cbxProfessor.addItem("Valentina Isabela Moreira");
		cbxProfessor.addItem("Vitor Nelson Cau� Dias");
		cbxProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxProfessor, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Aluno:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxAluno = new JComboBox<String>();
		cbxAluno.addItem("-- Selecione --");
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

		for (int i = 0; i < 15; i++) {
			String generatedString = "AAAA";
			BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter(
					"Disciplina " + i + "    Sigla:  " + generatedString, BaseDesign.enBounds.NewLinha));
		}

	}
}
