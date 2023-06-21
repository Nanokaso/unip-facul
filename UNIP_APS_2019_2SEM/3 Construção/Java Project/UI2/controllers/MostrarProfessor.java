package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import libs.BaseDesign;
import libs.BaseFrame;
import libs.BaseInit;
import libs.IAction;
import libs.IActionItem;

public class MostrarProfessor extends BaseInit {

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
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxCurso, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Professor:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxProfessor = new JComboBox<String>();
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
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxProfessor, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Nome:", BaseDesign.enBounds.NewLinha));
		JTextField txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtNome, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Sexo:", BaseDesign.enBounds.NewLinha));
		JTextField txtSexo = new JTextField();
		txtSexo.setEditable(false);
		txtSexo.setText("Some Text");

		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtSexo, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Naturalidade:", BaseDesign.enBounds.NewLinha));
		JTextField txtNaturalidade = new JTextField();
		txtNaturalidade.setEditable(false);
		txtNaturalidade.setText("Some Text");

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtNaturalidade, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Data Nascimento:", BaseDesign.enBounds.NewLinha));
		JTextField txtDT_Nascimento = new JTextField();
		txtDT_Nascimento.setEditable(false);
		txtDT_Nascimento.setText("Some Text");
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtDT_Nascimento, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("CPF:", BaseDesign.enBounds.NewLinha));
		JTextField txtCPF = new JTextField();
		txtCPF.setEditable(false);
		txtCPF.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCPF, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("RG:", BaseDesign.enBounds.NewLinha));
		JTextField txtRG = new JTextField();
		txtRG.setEditable(false);
		txtRG.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtRG, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Telefone 1:", BaseDesign.enBounds.NewLinha));
		JTextField txtTelefone_1 = new JTextField();
		txtTelefone_1.setEditable(false);
		txtTelefone_1.setText("Some Text");
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtTelefone_1, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("E-mail:", BaseDesign.enBounds.NewLinha));
		JTextField txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEmail, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Forma��o :", BaseDesign.enBounds.NewLinha));
		JTextField txtFormacao = new JTextField();
		txtFormacao.setEditable(false);
		txtFormacao.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtFormacao, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Curso de Forma��o :", BaseDesign.enBounds.NewLinha));
		JTextField txtCurso = new JTextField();
		txtCurso.setEditable(false);
		txtCurso.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCurso, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("CEP:", BaseDesign.enBounds.NewLinha));
		JTextField txtCEP = new JTextField();
		txtCEP.setEditable(false);
		txtCEP.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCEP, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Pa�s:", BaseDesign.enBounds.NewLinha));
		JTextField txtPais = new JTextField();
		txtPais.setEditable(false);
		txtPais.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtPais, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("UF:", BaseDesign.enBounds.NewLinha));
		JTextField txtUF = new JTextField();
		txtUF.setEditable(false);
		txtUF.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtUF, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Tipo Logradouro:", BaseDesign.enBounds.NewLinha));
		JTextField txtTipo_Logradouro = new JTextField();
		txtTipo_Logradouro.setEditable(false);
		txtTipo_Logradouro.setText("Some Text");
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtTipo_Logradouro, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Endere�o:", BaseDesign.enBounds.NewLinha));
		JTextField txtEndereco = new JTextField();
		txtEndereco.setEditable(false);
		txtEndereco.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEndereco, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("N�mero:", BaseDesign.enBounds.NewLinha));
		JTextField txtNumero = new JTextField();
		txtNumero.setEditable(false);
		txtNumero.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtNumero, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Cidade:", BaseDesign.enBounds.NewLinha));
		JTextField txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCidade, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Bairro:", BaseDesign.enBounds.NewLinha));
		JTextField txtBairro = new JTextField();
		txtBairro.setEditable(false);
		txtBairro.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtBairro, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Complemento:", BaseDesign.enBounds.NewLinha));
		JTextField txtComplemento = new JTextField();
		txtComplemento.setEditable(false);
		txtComplemento.setText("Some Text");
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtComplemento, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

	}
}
