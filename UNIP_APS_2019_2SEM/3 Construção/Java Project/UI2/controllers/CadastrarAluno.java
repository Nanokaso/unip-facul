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

public class CadastrarAluno extends BaseInit {

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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Pai:", BaseDesign.enBounds.NewLinha));
		JTextField txtPai = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtPai, BaseDesign.enBounds.NewColunSameLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Mãe:", BaseDesign.enBounds.NewLinha));
		JTextField txtMae = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtMae, BaseDesign.enBounds.NewColunSameLinha));

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
				new controllers.CadastrarAluno().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnCadastrar);


// 		JTextArea textArea_1 = new JTextArea();
// 		textArea_1.setBounds(126, 157, 212, 40);
// 		BaseFrame.frame.getContentPane().add(textArea_1);

// 		JButton btnClear = new JButton("Clear");
// 		btnClear.setBounds(312, 387, 89, 23);
// 		BaseFrame.frame.getContentPane().add(btnClear);

// 		JLabel lblSex = new JLabel("Sex");
// 		lblSex.setBounds(65, 228, 46, 14);
// 		BaseFrame.frame.getContentPane().add(lblSex);

// 		JLabel lblMale = new JLabel("Male");
// 		lblMale.setBounds(128, 228, 46, 14);
// 		BaseFrame.frame.getContentPane().add(lblMale);

// 		JLabel lblFemale = new JLabel("Female");
// 		lblFemale.setBounds(292, 228, 46, 14);
// 		BaseFrame.frame.getContentPane().add(lblFemale);

// 		JRadioButton radioButton = new JRadioButton("");
// 		radioButton.setBounds(337, 224, 109, 23);
// 		BaseFrame.frame.getContentPane().add(radioButton);

// 		JRadioButton radioButton_1 = new JRadioButton("");
// 		radioButton_1.setBounds(162, 224, 109, 23);
// 		BaseFrame.frame.getContentPane().add(radioButton_1);

// 		JLabel lblOccupation = new JLabel("Occupation");
// 		lblOccupation.setBounds(65, 288, 67, 14);
// 		BaseFrame.frame.getContentPane().add(lblOccupation);

// 		JComboBox comboBox = new JComboBox();
// 		comboBox.addItem("Select");
// 		comboBox.addItem("Business");
// 		comboBox.addItem("Engineer");
// 		comboBox.addItem("Doctor");
// 		comboBox.addItem("Student");
// 		comboBox.addItem("Others");
// 		comboBox.addActionListener(new ActionListener() {
// 			public void actionPerformed(ActionEvent arg0) {
// 			}
// 		});
// 		comboBox.setBounds(180, 285, 91, 20);
// 		BaseFrame.frame.getContentPane().add(comboBox);

// 		JButton btnSubmit = new JButton("submit");

// 		btnSubmit.setBackground(Color.BLUE);
// 		btnSubmit.setForeground(Color.MAGENTA);
// 		btnSubmit.setBounds(65, 387, 89, 23);
// 		BaseFrame.frame.getContentPane().add(btnSubmit);

		// Container c = BaseFrame.frame.getContentPane();
		// BaseFrame.frame.getContentPane()..setLayout(new FlowLayout());// Set layout
		// to be FlowLayout explicitly.
		// JButton btnOK = new JButton("OK!");
		// btnOK.setPreferredSize(new Dimension(100, 50000));// use set PreferredSize
		// BaseFrame.frame.getContentPane().add(btnOK);

		// c.add(btnOK);
		// c.add(BaseDesign.lbl1("Socorro"));
		// c.setSize(20, 20);
		// c.setVisible(true);

		// JOptionPane.showMessageDialog(null, "minha mae");

	}
}
