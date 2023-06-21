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

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Professor:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxProfessor = new JComboBox<String>();
		cbxProfessor.addItem("André Daniel Yuri Fogaça");
		cbxProfessor.addItem("André Diogo Raimundo Corte Real");
		cbxProfessor.addItem("André Mário Moura");
		cbxProfessor.addItem("Andrea Sophie Nogueira");
		cbxProfessor.addItem("Anthony Marcos Bernardo Lima");
		cbxProfessor.addItem("Beatriz Bruna Assis");
		cbxProfessor.addItem("Benedito Jorge Benício Cavalcanti");
		cbxProfessor.addItem("Brenda Cecília Betina Porto");
		cbxProfessor.addItem("Bruna Ayla Débora da Mota");
		cbxProfessor.addItem("Calebe Caio Pereira");
		cbxProfessor.addItem("Camila Sueli Castro");
		cbxProfessor.addItem("Carlos Eduardo Marcos Anthony Rocha");
		cbxProfessor.addItem("Cecília Elaine Maria Moreira");
		cbxProfessor.addItem("César Arthur Daniel Baptista");
		cbxProfessor.addItem("Diogo Ian Cavalcanti");
		cbxProfessor.addItem("Edson André Monteiro");
		cbxProfessor.addItem("Elias Kevin Drumond");
		cbxProfessor.addItem("Enzo Carlos Eduardo Aragão");
		cbxProfessor.addItem("Enzo Diego Ramos");
		cbxProfessor.addItem("Felipe Kevin Viana");
		cbxProfessor.addItem("Flávia Raimunda Ester da Conceição");
		cbxProfessor.addItem("Flávia Raimunda Rosa Drumond");
		cbxProfessor.addItem("Francisca Marli Cecília Galvão");
		cbxProfessor.addItem("Gabriel Lucas Drumond");
		cbxProfessor.addItem("Helena Isabelly Vitória Rocha");
		cbxProfessor.addItem("Henrique Emanuel Fernando Teixeira");
		cbxProfessor.addItem("Ian Davi Nascimento");
		cbxProfessor.addItem("Isabel Fátima Ramos");
		cbxProfessor.addItem("Isabel Giovana de Paula");
		cbxProfessor.addItem("Isabela Allana Kamilly Teixeira");
		cbxProfessor.addItem("Isabella Analu Nair das Neves");
		cbxProfessor.addItem("Isadora Nicole Benedita Figueiredo");
		cbxProfessor.addItem("Jéssica Camila Mendes");
		cbxProfessor.addItem("Juan Levi Victor da Mata");
		cbxProfessor.addItem("Julio Ryan Anthony Cavalcanti");
		cbxProfessor.addItem("Kamilly Eduarda Lima");
		cbxProfessor.addItem("Kamilly Tatiane Farias");
		cbxProfessor.addItem("Kauê Nathan Tiago Pereira");
		cbxProfessor.addItem("Leandro Cláudio Márcio Pereira");
		cbxProfessor.addItem("Lorenzo Otávio Ramos");
		cbxProfessor.addItem("Maitê Patrícia Antônia Rocha");
		cbxProfessor.addItem("Manuel Carlos Eduardo Joaquim da Mata");
		cbxProfessor.addItem("Marcelo Iago Thales da Cunha");
		cbxProfessor.addItem("Márcio Pedro Galvão");
		cbxProfessor.addItem("Mário Pedro Henrique Julio Oliveira");
		cbxProfessor.addItem("Mateus Thales Rafael Ferreira");
		cbxProfessor.addItem("Natália Maria Corte Real");
		cbxProfessor.addItem("Natália Regina Débora Peixoto");
		cbxProfessor.addItem("Paulo Ruan Fábio Mendes");
		cbxProfessor.addItem("Pietra Liz Sarah Viana");
		cbxProfessor.addItem("Raquel Francisca Costa");
		cbxProfessor.addItem("Renan Mário Manoel Pires");
		cbxProfessor.addItem("Rita Fernanda Bruna Monteiro");
		cbxProfessor.addItem("Rita Olivia Nascimento");
		cbxProfessor.addItem("Sérgio Diogo Peixoto");
		cbxProfessor.addItem("Sophia Carolina Mariana Pereira");
		cbxProfessor.addItem("Tatiane Catarina Mendes");
		cbxProfessor.addItem("Thomas Eduardo Corte Real");
		cbxProfessor.addItem("Valentina Isabela Moreira");
		cbxProfessor.addItem("Vitor Nelson Cauã Dias");
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Formação :", BaseDesign.enBounds.NewLinha));
		JTextField txtFormacao = new JTextField();
		txtFormacao.setEditable(false);
		txtFormacao.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtFormacao, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Curso de Formação :", BaseDesign.enBounds.NewLinha));
		JTextField txtCurso = new JTextField();
		txtCurso.setEditable(false);
		txtCurso.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCurso, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("CEP:", BaseDesign.enBounds.NewLinha));
		JTextField txtCEP = new JTextField();
		txtCEP.setEditable(false);
		txtCEP.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtCEP, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("País:", BaseDesign.enBounds.NewLinha));
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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Endereço:", BaseDesign.enBounds.NewLinha));
		JTextField txtEndereco = new JTextField();
		txtEndereco.setEditable(false);
		txtEndereco.setText("Some Text");
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtEndereco, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Número:", BaseDesign.enBounds.NewLinha));
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
