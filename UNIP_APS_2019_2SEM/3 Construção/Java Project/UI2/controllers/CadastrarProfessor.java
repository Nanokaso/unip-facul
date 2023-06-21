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
		cbxSexo.addItem("Não declarado");
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Formação:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxFormacao = new JComboBox<String>();
		cbxFormacao.addItem("Ensino Médio");
		cbxFormacao.addItem("Ensino Profissionalizante");
		cbxFormacao.addItem("Ensino Superior Incompleto");
		cbxFormacao.addItem("Ensino Superior Completo");
		cbxFormacao.addItem("Mestrado");
		cbxFormacao.addItem("Doutorado");
		cbxFormacao.addItem("Especialização");
		cbxFormacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxFormacao, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Curso de Formação :", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxCurso = new JComboBox<String>();
		cbxCurso.addItem("Administração de empresas");
		cbxCurso.addItem("Administração Pública");
		cbxCurso.addItem("Agronegócios");
		cbxCurso.addItem("Agronomia");
		cbxCurso.addItem("Antropologia");
		cbxCurso.addItem("Arqueologia");
		cbxCurso.addItem("Arquitetura");
		cbxCurso.addItem("Arquivologia");
		cbxCurso.addItem("Artes Cênicas");
		cbxCurso.addItem("Artes Plásticas");
		cbxCurso.addItem("Artes Visuais");
		cbxCurso.addItem("Astronomia");
		cbxCurso.addItem("Biblioteconomia");
		cbxCurso.addItem("Biologia");
		cbxCurso.addItem("Biomedicina");
		cbxCurso.addItem("Biotecnologia");
		cbxCurso.addItem("Ciência da Computação");
		cbxCurso.addItem("Ciências Ambientais");
		cbxCurso.addItem("Ciências Atuárias");
		cbxCurso.addItem("Ciências Biológicas");
		cbxCurso.addItem("Ciências Contábeis");
		cbxCurso.addItem("Ciências Exatas");
		cbxCurso.addItem("Ciências Naturais");
		cbxCurso.addItem("Ciências Políticas");
		cbxCurso.addItem("Ciências Sociais");
		cbxCurso.addItem("Cinema");
		cbxCurso.addItem("Comércio Exterior");
		cbxCurso.addItem("Comunicação Social");
		cbxCurso.addItem("Dança");
		cbxCurso.addItem("Desenho Industrial");
		cbxCurso.addItem("Design de Games");
		cbxCurso.addItem("Design Gráfico");
		cbxCurso.addItem("Direito");
		cbxCurso.addItem("Economia");
		cbxCurso.addItem("Educação Física");
		cbxCurso.addItem("Enfermagem");
		cbxCurso.addItem("Engenharia Aeronáutica");
		cbxCurso.addItem("Engenharia Aerospacial");
		cbxCurso.addItem("Engenharia Agrícola");
		cbxCurso.addItem("Engenharia Ambiental");
		cbxCurso.addItem("Engenharia Biomédica");
		cbxCurso.addItem("Engenharia Civil");
		cbxCurso.addItem("Engenharia da Computação");
		cbxCurso.addItem("Engenharia de Agrimensura");
		cbxCurso.addItem("Engenharia de Alimentos");
		cbxCurso.addItem("Engenharia de Controle e Automação");
		cbxCurso.addItem("Engenharia de Energia");
		cbxCurso.addItem("Engenharia de Materiais");
		cbxCurso.addItem("Engenharia de Minas");
		cbxCurso.addItem("Engenharia de Pesca");
		cbxCurso.addItem("Engenharia de Petróleo");
		cbxCurso.addItem("Engenharia de Produção");
		cbxCurso.addItem("Engenharia Elétrica");
		cbxCurso.addItem("Engenharia Florestal");
		cbxCurso.addItem("Engenharia Mecânica");
		cbxCurso.addItem("Engenharia Mecatrônica");
		cbxCurso.addItem("Engenharia Metalúrgica");
		cbxCurso.addItem("Engenharia Naval");
		cbxCurso.addItem("Engenharia Nuclear");
		cbxCurso.addItem("Engenharia Química");
		cbxCurso.addItem("Engenheria de Telecomunicações");
		cbxCurso.addItem("Estética");
		cbxCurso.addItem("Farmácia");
		cbxCurso.addItem("Filosofia");
		cbxCurso.addItem("Física");
		cbxCurso.addItem("Fisioterapia");
		cbxCurso.addItem("Fonoaudiologia");
		cbxCurso.addItem("Fotografia");
		cbxCurso.addItem("Gastronomia");
		cbxCurso.addItem("Geografia");
		cbxCurso.addItem("Geologia");
		cbxCurso.addItem("Gestão Ambiental");
		cbxCurso.addItem("Gestão Comercial");
		cbxCurso.addItem("Gestão de Recursos Humanos");
		cbxCurso.addItem("Gestão Financeira");
		cbxCurso.addItem("Gestão Hospitalar 2");
		cbxCurso.addItem("Hotelaria e Turismo");
		cbxCurso.addItem("Jornalismo");
		cbxCurso.addItem("Letras");
		cbxCurso.addItem("Logística");
		cbxCurso.addItem("Matemática");
		cbxCurso.addItem("Mecânica Industrial");
		cbxCurso.addItem("Medicina");
		cbxCurso.addItem("Medicina Veterinária");
		cbxCurso.addItem("Meteorologia");
		cbxCurso.addItem("Moda");
		cbxCurso.addItem("Multimídia");
		cbxCurso.addItem("Música");
		cbxCurso.addItem("Negócios Imobiliários");
		cbxCurso.addItem("Nutrição");
		cbxCurso.addItem("Oceanografia");
		cbxCurso.addItem("Odontologia");
		cbxCurso.addItem("Pedagogia");
		cbxCurso.addItem("Processos Gerenciais");
		cbxCurso.addItem("Psicologia");
		cbxCurso.addItem("Publicidade e Propaganda");
		cbxCurso.addItem("Química");
		cbxCurso.addItem("Rádio e TV");
		cbxCurso.addItem("Radiologia");
		cbxCurso.addItem("Relações Internacionais");
		cbxCurso.addItem("Relações Públicas");
		cbxCurso.addItem("Secretariado");
		cbxCurso.addItem("Segurança do Trabalho");
		cbxCurso.addItem("Serviço Social");
		cbxCurso.addItem("Sistemas de Informação");
		cbxCurso.addItem("Teatro");
		cbxCurso.addItem("Tecnologia da Informação");
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("País:", BaseDesign.enBounds.NewLinha));
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Endereço:", BaseDesign.enBounds.NewLinha));
		JTextField txtEndereco = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEndereco, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Número:", BaseDesign.enBounds.NewLinha));
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
