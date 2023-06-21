package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import libs.BaseDesign;
import libs.BaseFrame;
import libs.BaseInit;
import libs.IAction;
import libs.IActionItem;

public class Login extends BaseInit {

	// Metodo para ser chamado quando inicia um novo com as programacoes
	public void Index() {

		List<IActionItem> itens = new ArrayList<IActionItem>();
		itens.add(new IActionItem("onload", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "on load");
			}
		}));

		super.GenerateView(new IAction(this.getClass(), itens, false));
	}

	// metodo chamado automaticamente pela BaseInit para setar informacoes de
	// design
	public static void init(IAction action) {

		BaseDesign.defaultX = BaseDesign.defaultX + (BaseDesign.defaultX / 2);
		
		BaseDesign.defaultHeight = BaseDesign.defaultHeight + (BaseDesign.defaultHeight / 2);
		
		BaseDesign.paddingBetweenY = BaseDesign.paddingBetweenY + (BaseDesign.paddingBetweenY / 2);
		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Login:", BaseDesign.enBounds.NewLinha));
		JTextField txtLogin = new JTextField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtLogin, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Senha:", BaseDesign.enBounds.NewLinha));
		JTextField  txtSenha = new JPasswordField();
		BaseFrame.frame.getContentPane().add(BaseDesign.SetBounds(txtSenha, BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		JButton btnLogar = BaseDesign.basicButton("Logar", BaseDesign.enBounds.NewLinha,
				BaseDesign.enColorButton.Primary);
		btnLogar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new controllers.Home().Index();
			}
		});
		BaseFrame.frame.getContentPane().add(btnLogar);
	}
}