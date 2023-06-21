package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import libs.BaseDesign;
import libs.BaseFrame;
import libs.BaseInit;
import libs.IAction;
import libs.IActionItem;

public class CadastrarProfessor extends BaseInit {

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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Nome:", BaseDesign.enBounds.NewLinha));
		JTextField txtNome = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtNome, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Sexo:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxSexo = new JComboBox<String>();
		cbxSexo.addItem("Feminino");
		cbxSexo.addItem("Masculino");
		cbxSexo.addItem("N�o declarado");
		cbxSexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxSexo, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Naturalidade:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxNaturalidade = new JComboBox<String>();
		cbxNaturalidade.addItem("Brasileiro");
		cbxNaturalidade.addItem("Estrangeiro");
		cbxNaturalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(cbxNaturalidade, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Data Nascimento:", BaseDesign.enBounds.NewLinha));
		JTextField txtDT_Nascimento = new JTextField();
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtDT_Nascimento, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("CPF:", BaseDesign.enBounds.NewLinha));
		JTextField txtCPF = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCPF, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("RG:", BaseDesign.enBounds.NewLinha));
		JTextField txtRG = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtRG, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Telefone 1:", BaseDesign.enBounds.NewLinha));
		JTextField txtTelefone_1 = new JTextField();
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtTelefone_1, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("E-mail:", BaseDesign.enBounds.NewLinha));
		JTextField txtEmail = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEmail, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Forma��o:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxFormacao = new JComboBox<String>();
		cbxFormacao.addItem("Ensino M�dio");
		cbxFormacao.addItem("Ensino Profissionalizante");
		cbxFormacao.addItem("Ensino Superior Incompleto");
		cbxFormacao.addItem("Ensino Superior Completo");
		cbxFormacao.addItem("Mestrado");
		cbxFormacao.addItem("Doutorado");
		cbxFormacao.addItem("Especializa��o");
		cbxFormacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxFormacao, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Curso de Forma��o :", BaseDesign.enBounds.NewLinha));
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("CEP:", BaseDesign.enBounds.NewLinha));
		JTextField txtCEP = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCEP, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Pa�s:", BaseDesign.enBounds.NewLinha));
		JTextField txtPais = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtPais, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Estado:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxUF = new JComboBox<String>();
		cbxUF.addItem("AC");
		cbxUF.addItem("AL");
		cbxUF.addItem("AM");
		cbxUF.addItem("AP");
		cbxUF.addItem("BA");
		cbxUF.addItem("CE");
		cbxUF.addItem("DF");
		cbxUF.addItem("ES");
		cbxUF.addItem("GO");
		cbxUF.addItem("MA");
		cbxUF.addItem("MG");
		cbxUF.addItem("MS");
		cbxUF.addItem("MT");
		cbxUF.addItem("PA");
		cbxUF.addItem("PB");
		cbxUF.addItem("PE");
		cbxUF.addItem("PI");
		cbxUF.addItem("PR");
		cbxUF.addItem("RJ");
		cbxUF.addItem("RN");
		cbxUF.addItem("RO");
		cbxUF.addItem("RR");
		cbxUF.addItem("RS");
		cbxUF.addItem("SC");
		cbxUF.addItem("SE");
		cbxUF.addItem("SP");
		cbxUF.addItem("TO");
		cbxUF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxUF, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Tipo Logradouro:", BaseDesign.enBounds.NewLinha));
		JTextField txtTipo_Logradouro = new JTextField();
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtTipo_Logradouro, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Endere�o:", BaseDesign.enBounds.NewLinha));
		JTextField txtEndereco = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEndereco, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("N�mero:", BaseDesign.enBounds.NewLinha));
		JTextField txtNumero = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtNumero, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Cidade:", BaseDesign.enBounds.NewLinha));
		JTextField txtCidade = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCidade, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Bairro:", BaseDesign.enBounds.NewLinha));
		JTextField txtBairro = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtBairro, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Complemento:", BaseDesign.enBounds.NewLinha));
		JTextField txtComplemento = new JTextField();
		BaseFrame.frame.getContentPane()
				.add(BaseDesign.SetBounds(txtComplemento, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		JButton btnCadastrar = BaseDesign.basicButton("Cadastrar", BaseDesign.enBounds.NewColunSameLinha,
				BaseDesign.enColorButton.Primary);
		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				new controllers.CadastrarProfessor().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnCadastrar);

	}
}
