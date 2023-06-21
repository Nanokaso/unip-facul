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

public class CadastrarDisciplina extends BaseInit {

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

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Sigla:", BaseDesign.enBounds.NewLinha));
		JTextField txtSigla = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtSigla, BaseDesign.enBounds.NewLinha));
		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Descrição:", BaseDesign.enBounds.NewLinha));
		JTextField txtDescricao = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtDescricao, BaseDesign.enBounds.NewLinha));
		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Curso:", BaseDesign.enBounds.NewLinha));
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
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxCurso, BaseDesign.enBounds.NewLinha));
		
		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		JButton btnCadastrar = BaseDesign.basicButton("Cadastrar", BaseDesign.enBounds.NewLinha,
				BaseDesign.enColorButton.Primary);
		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				new controllers.CadastrarDisciplina().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnCadastrar);

	}
}
