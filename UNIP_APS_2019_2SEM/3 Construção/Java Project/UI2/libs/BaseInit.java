package libs;

import java.lang.reflect.Method;

public class BaseInit {
	public void GenerateView(IAction action) {
		// montar a view e gerar os listeners
		try {

			// prepara o frame
			BaseFrame.PrepareNewFrame(action);

			// procura o template
			Class<?> template = Class.forName(action.classe.getName());

			// procura o metodo iniciar dele
			Method initMethod = template.getDeclaredMethod("init", IAction.class);

			// prepara o Menu
			if (action.permiteMenu)
			{
				new BaseMenu().IniciarMenu();				
			}

			BaseDesign.SetDefault();

			// executa o metodo iniciar
			initMethod.invoke(null, action);

			// mostra frame
			BaseFrame.ShowFrame();

			// envoca metodo onload -> metodo para ser executado quando a tela for toda
			// carregada
			for (IActionItem acao : action.acoes) {
				if ("onload".equals(acao.idElement)) {
					acao.acao.actionPerformed(null);
				}
			}
		} catch (Exception e) {
			System.out.print("Não foi possivel montar a view! " + e.getMessage());
		}

	}
}