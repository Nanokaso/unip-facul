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

public class CadastrarProfessorDisciplina extends BaseInit {

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

		BaseFrame.frame.getContentPane()
				.add(BaseDesign.basicLabelCenter("Escolha o Professor:", BaseDesign.enBounds.NewLinha));
		JComboBox<String> cbxProfessor = new JComboBox<String>();
		cbxProfessor.addItem("Alana Sônia Aurora Freitas");
		cbxProfessor.addItem("Anderson Nelson Moura");
		cbxProfessor.addItem("Clarice Mirella Aragão");
		cbxProfessor.addItem("Elias Mateus Anderson Assis");
		cbxProfessor.addItem("Levi Bento José Corte Real");
		cbxProfessor.addItem("Luzia Nina Bruna Fogaça");
		cbxProfessor.addItem("Malu Lara Moreira");
		cbxProfessor.addItem("Marcos Erick Henrique Corte Real");
		cbxProfessor.addItem("Martin Bento Assis");
		cbxProfessor.addItem("Milena Marli Caldeira");
		cbxProfessor.addItem("Murilo Danilo Fábio Duarte");
		cbxProfessor.addItem("Pedro Vinicius Castro");
		cbxProfessor.addItem("Sarah Eliane de Paula");
		cbxProfessor.addItem("Vinicius Antonio Thiago Assis");
		cbxProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(cbxProfessor, BaseDesign.enBounds.NewLinha));

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
				new controllers.CadastrarProfessorDisciplina().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnCadastrar);

	}
}