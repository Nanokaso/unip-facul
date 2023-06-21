package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import libs.*;

public class Home extends BaseInit {

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

	// metodo chamado automaticamente pela BaseInit para setar informacoes de
	// design
	public static void init(IAction action) {
BaseDesign.defaultX = BaseDesign.defaultX + (BaseDesign.defaultX / 2);
		
		BaseDesign.defaultHeight = BaseDesign.defaultHeight + (BaseDesign.defaultHeight / 2);
		
		BaseDesign.paddingBetweenY = BaseDesign.paddingBetweenY + (BaseDesign.paddingBetweenY / 2);
		
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));
		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("", BaseDesign.enBounds.NewLinha));

		BaseFrame.frame.getContentPane().add(BaseDesign.basicLabelCenter("Escolha a opção desejada pelo menu!", BaseDesign.enBounds.NewLinha));
	}
}
