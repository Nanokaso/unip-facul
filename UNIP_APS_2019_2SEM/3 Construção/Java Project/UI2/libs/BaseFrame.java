package libs;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BaseFrame {
	public static JFrame frame = null;
	public static JScrollPane pane = null;
	public static JPanel panel = null;

	public static void PrepareNewFrame(IAction model) {

		if (frame == null) {
			frame = new JFrame();
		} else {
			frame.dispose();
			frame = new JFrame();
		}

		// Titulo page
		frame.setTitle(formatTitlePage(model.TitlePage));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// get dimensoes
		Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		// set size
		frame.setSize(dim.width - 350, dim.height - 50);

		// set location
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//panel = new JPanel();
		//panel.setLayout(new BorderLayout());
		//panel.setPreferredSize(new Dimension(frame.getWidth(), 50000000));
		//JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 300);
		//JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);

		//hbar.setUnitIncrement(2);
		//hbar.setBlockIncrement(1);

		//hbar.addAdjustmentListener(new AdjustmentListener() {
//
		//	@Override
		//	public void adjustmentValueChanged(AdjustmentEvent e) {
		//		frame.getContentPane().repaint();
		//	}
		//});
		//vbar.addAdjustmentListener(new AdjustmentListener() {
//
		//	@Override
		//	public void adjustmentValueChanged(AdjustmentEvent e) {
		//		frame.getContentPane().repaint();
		//	}
		//});

		//panel.add(hbar, BorderLayout.SOUTH);
		//panel.add(vbar, BorderLayout.EAST);

		//frame.setContentPane(panel);

		// frame.getContentPane().setLayout(null);

		// JPanel container = new JPanel();
		// container.setPreferredSize(new Dimension(frame.getWidth(), 50000000));
		// painel = new JPanel(new BoxLayout(container,BoxLayout.PAGE_AXIS));
		// painel.setPreferredSize(new Dimension(frame.getWidth(), 50000000));
		// container.add(painel);
		// JScrollPane jsp = new JScrollPane(container);
		// jsp.setPreferredSize(new Dimension(frame.getWidth(), 50000000));
		// jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// frame.add(jsp);

		// JPanel s = new JPanel();
		// s.setLayout(new BoxLayout(s,BoxLayout.PAGE_AXIS));

		// JScrollPane scroll = new JScrollPane(s);
		// scroll.setPreferredSize(new Dimension(frame.getWidth(), 50000000));
		// scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// frame.add(scroll);

		// JPanel content = new JPanel();// this is the panel that will be scrolled
		// JScrollPane pane = new JScrollPane(content);
		// frame.getContentPane().add(pane);

		// pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		// JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// frame.setContentPane(pane);

		 //frame.getContentPane().setLayout(null);
		// BaseFrame.frame.getContentPane().setPreferredSize(new
		// Dimension(frame.getContentPane().getWidth(), 5000));
		// frame.getContentPane().setMaximumSize(new
		// Dimension(frame.getContentPane().getWidth(), 50000));

		 frame.getContentPane().setLayout(null);
		 
		// set color
		frame.getContentPane().setBackground(new Color(255, 255, 255));
	}

	public static void ShowFrame() {
		if (frame != null) {
			// frame.pack();
			frame.setVisible(true);
		}
	}

	public static void SetNewSize(int w, int h) {
		Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		frame.setSize(w, h);
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
	}

	private static String formatTitlePage(String s) {
		try {
			String[] r = s.split("(?=\\p{Upper})");

			String rt = "";
			for (String string : r) {
				rt += " " + string;
			}
			return rt;
		} catch (Exception e) {
			return s;
		}

	}

}
