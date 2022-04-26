package swings_book;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class Main extends Frame implements ActionListener{
	ArrayList<Book> blist = new ArrayList<Book>();
	JLabel title,author,edition,volume,quantity,price;
	JTextField titletxt,pricetxt;
	JCheckBox author1,author2;
	JRadioButton oldEdition,newEdition;
	JComboBox<Integer> vol,quan;
	Integer volarr[] = {1,2,3,4};
	Integer quanarr[] = {1,2,3,4,5};	
	JButton submit,display;
	JTextArea area;
	public Main(){
			title = new JLabel("title");
			author = new JLabel("author name");
			edition = new JLabel("edition");
			volume = new JLabel("volume");
			quantity = new JLabel("quantity");
			price = new JLabel("Price");
			
			titletxt = new JTextField();
			pricetxt = new JTextField();
			
			author1 = new JCheckBox("Author-1");
			author2 = new JCheckBox("Author-2");
			
			oldEdition = new JRadioButton("OLD");
			newEdition = new JRadioButton("NEW");
			ButtonGroup bg = new ButtonGroup();
			bg.add(oldEdition);
			bg.add(newEdition);
			
			vol = new JComboBox<Integer>(volarr);
			quan = new JComboBox<Integer>(quanarr);
			
			submit = new JButton("Submit");
			display = new JButton("Display");
			
			area = new JTextArea();
			
			add(title);
			add(titletxt);
			add(author);
			add(author1);
			add(author2);
			add(price);
			add(pricetxt);
			add(edition);
			add(oldEdition);
			add(newEdition);
			add(volume);
			add(vol);
			add(quantity);
			add(quan);
			add(submit);
			add(display);
			add(area);
			
			display.addActionListener((ActionListener)this);
			submit.addActionListener((ActionListener)this);
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setSize(600,400);
			setVisible(true);
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			
			ArrayList<String>authors = new ArrayList<String>();
			
			if(author1.isSelected()) {
				authors.add(author1.getText());
				
			}
			if(author2.isSelected()) {
				authors.add(author2.getText());
			}
			String edition;
			if(oldEdition.isSelected()) {
				edition = oldEdition.getText();
			}
			else {
				edition = newEdition.getText();
			}
			
			blist.add(new Book(
					titletxt.getText(),
					authors,
					edition,
					vol.getItemAt(vol.getSelectedIndex()),
					quan.getItemAt(quan.getSelectedIndex()),
					Float.parseFloat(pricetxt.getText())
					));
		}
		
		if(ev.getSource()==display) {
			area.setText("");
			for(Book i:blist) {
				area.setText(area.getText()+"\n"+i);
			}
		}
		
		
	}
	public static void main(String args[]) {
		System.out.println("Hello");
		Main m = new Main();
		
	}
}
