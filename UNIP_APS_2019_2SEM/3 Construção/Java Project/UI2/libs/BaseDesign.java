package libs;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
//import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BaseDesign {

	public static void SetDefault() {

		//Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		BaseDesign.paddingLeft2Collum = 10;
		BaseDesign.defaultWidth = 250;
		BaseDesign.defaultHeight = 25;

		BaseDesign.paddingBetweenX = 10;
		BaseDesign.paddingBetweenY = 27;

		BaseDesign.paddingLeft = BaseFrame.frame.getWidth() / 2 - ((defaultWidth * 2 + paddingBetweenX) / 2);
		
		if (BaseDesign.paddingLeft < 10) {
			BaseDesign.paddingLeft = 10;
		}
		BaseDesign.paddingTop = 5;

		BaseDesign.defaultX = paddingLeft + 5;
		BaseDesign.thisY = paddingTop;
		BaseDesign.thisX = defaultX;
	}

	public static int paddingLeft;
	public static int paddingTop;
	public static int paddingBetweenX;
	public static int paddingBetweenY;

	public static int paddingLeft2Collum;

	public static int defaultWidth;
	public static int defaultHeight;
	public static int defaultX;

	public static int thisX;
	public static int thisY;

	public static enum enBounds {
		NewLinha, NewColun, SameLinha, SameColun, NewLinhaSameColun, NewColunSameLinha;
	}

	public static Component SetBounds(Component comp, enBounds bounds) {
		if (bounds == enBounds.NewLinha) {
			BaseDesign.thisY = BaseDesign.thisY + BaseDesign.paddingBetweenY;
			BaseDesign.thisX = BaseDesign.defaultX;
		}
		if (bounds == enBounds.NewColun) {
			BaseDesign.thisX = BaseDesign.defaultX;
		}
		if (bounds == enBounds.SameLinha) {

		}
		if (bounds == enBounds.SameColun) {
			BaseDesign.thisX = BaseDesign.defaultWidth + BaseDesign.paddingBetweenX + BaseDesign.defaultX;
		}
		if (bounds == enBounds.NewLinhaSameColun) {
			BaseDesign.thisY = BaseDesign.thisY + BaseDesign.paddingBetweenY;
		}
		if (bounds == enBounds.NewColunSameLinha) {
			BaseDesign.thisX = BaseDesign.thisX + BaseDesign.paddingBetweenX + BaseDesign.defaultWidth;
		}

		comp.setBounds(BaseDesign.thisX, BaseDesign.thisY, BaseDesign.defaultWidth, BaseDesign.defaultHeight);
		return comp;
	}

	public static JLabel basicLabelCenter(String txtHtml, enBounds bounds) {
		JLabel lbl = new JLabel();
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Arial", 0, 15));
		SetBounds(lbl, bounds);
		lbl.setText(txtHtml);
		return lbl;
	}

	public static JLabel basicLabelCenterMR(String txtHtml, enBounds bounds) {
		JLabel lbl = new JLabel();
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Arial", 0, 20));
		lbl.setText(txtHtml);
		SetBounds(lbl, bounds);
		return lbl;
	}

	public static JButton basicButton(String txtHtml, enBounds bounds, enColorButton color) {
		JButton obj = new JButton();
		obj.setForeground(Color.BLACK);
		obj.setFont(new Font("Arial", 0, 15));
		obj.setText(txtHtml);
		SetBounds(obj, bounds);
		SetColor(obj, color);
		obj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		return obj;
	}

	public static enum enColorButton {
		Primary, Secondary, Success, Danger, Warning, Info, Light, Dark, Invisible;
	}

	public static Component SetColor(Component comp, enColorButton color) {

		if (color == enColorButton.Primary) {
			comp.setBackground(new Color(0, 123, 255));
			comp.setForeground(Color.WHITE);
		}

		if (color == enColorButton.Secondary) {
			comp.setBackground(new Color(108, 117, 125));
			comp.setForeground(Color.WHITE);
		}

		if (color == enColorButton.Success) {
			comp.setBackground(new Color(40, 167, 69));
			comp.setForeground(Color.WHITE);
		}

		if (color == enColorButton.Danger) {
			comp.setBackground(new Color(220, 53, 69));
			comp.setForeground(Color.WHITE);
		}

		if (color == enColorButton.Warning) {
			comp.setBackground(new Color(255, 193, 7));
			comp.setForeground(Color.BLACK);
		}

		if (color == enColorButton.Info) {
			comp.setBackground(new Color(23, 162, 184));
			comp.setForeground(Color.WHITE);
		}

		if (color == enColorButton.Light) {
			comp.setBackground(new Color(248, 249, 250));
			comp.setForeground(Color.BLACK);
		}

		if (color == enColorButton.Dark) {
			comp.setBackground(new Color(52, 58, 64));
			comp.setForeground(Color.WHITE);
		}
		if (color == enColorButton.Invisible) {
			comp.setBackground(new Color(20, 30, 40));
			comp.setForeground(Color.WHITE);
		}

		return comp;
	}
}