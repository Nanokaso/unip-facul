package libs;

import java.awt.event.ActionListener;
import java.util.*;

public class IAction {

	public ActionListener getActionByIdElement(String idElement, List<IActionItem> acoes) {
		for (IActionItem acao : acoes) {
			if (idElement.contains(acao.idElement)) {
				return acao.acao;
			}
		}
		return null;
	}

	// entidades
	public List<IActionItem> acoes;
	public String TitlePage;
	public Class<?> classe;
	public Boolean permiteMenu;

	// metodo construtor sem title page
	public IAction(Class<?> classe, List<IActionItem> acoes) {
		setData(classe, acoes, classe.getName().replace("controllers.", ""), true);
	}
	
	public IAction(Class<?> classe, List<IActionItem> acoes, boolean permitemenu) {
		setData(classe, acoes, classe.getName().replace("controllers.", ""), permitemenu);
	}

	public IAction(Class<?> classe, List<IActionItem> acoes, String titlePage) {
		setData(classe, acoes, titlePage, true);
	}

	public IAction(Class<?> classe, List<IActionItem> acoes, String titlePage, boolean permitemenu) {
		setData(classe, acoes, titlePage, permitemenu);
	}

	private void setData(Class<?> classe, List<IActionItem> acoes, String titlePage, boolean permitemenu) {
		this.acoes = acoes;
		this.classe = classe;
		this.TitlePage = titlePage;
		this.permiteMenu = permitemenu;
	}

}
