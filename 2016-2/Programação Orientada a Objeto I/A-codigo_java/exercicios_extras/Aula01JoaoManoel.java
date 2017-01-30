import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Aula01JoaoManoel extends JFrame implements ActionListener
{
    JLabel label1, label2, label3;
    JButton btAbrir, btGravar, btLimpar;
    JTextField tfCodigo, tfNome, tfEmail;

    public static void main(String[] args)
    {
	JFrame janela = new Aula01JoaoManoel();
	janela.setUndecorated(true);
	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setVisible(true);
    }

    Aula01JoaoManoel()
    {
	setTitle("Cadastro, usando arquivo de texto");
	setBounds(250, 50, 340, 160);
	getContentPane();
	setBackground(new Color (150, 150, 150));
	label1   = new JLabel     ("Código");
	label2   = new JLabel     ("Nome");
	label3   = new JLabel     ("Email");
	btAbrir  = new JButton    ("Abrir");
	btGravar = new JButton    ("Gravar");
	btLimpar = new JButton    ("Limpar");
	tfCodigo = new JTextField ();
	tfNome   = new JTextField ();
	tfEmail  = new JTextField ();
	btAbrir.addActionListener(this);
	btGravar.addActionListener(this);
	btLimpar.addActionListener(this);
	setLayout (null);
	label1.setBounds   (10,   15,  40, 20);
	label2.setBounds   (10,   40,  45, 20);
	label3.setBounds   (10,   65,  45, 20);
	btAbrir.setBounds  (10,  100,  75, 20);
	btGravar.setBounds (95,  100,  75, 20);
	btLimpar.setBounds (180, 100,  75, 20);
	tfCodigo.setBounds (60,   15,  55, 20);
	tfNome.setBounds   (60,   40, 255, 20);
	tfEmail.setBounds  (60,   65, 255, 20);
	getContentPane().add(label1);
	getContentPane().add(label2);
	getContentPane().add(label3);
	getContentPane().add(btAbrir);
	getContentPane().add(btGravar);
	getContentPane().add(btLimpar);
	getContentPane().add(tfCodigo);
	getContentPane().add(tfNome);
	getContentPane().add(tfEmail);
    }

    public void actionPerformed (ActionEvent e)
    {
	if (e.getSource() == btLimpar) {
	    tfCodigo.setText ("");
	    tfNome.setText ("");
	    tfEmail.setText ("");
	}
	if (e.getSource() == btGravar) {
	    if (tfCodigo.getText().equals("")) {
		JOptionPane.showMessageDialog(null, "Prencha o campo código!");
		tfCodigo.requestFocus();
	    }
	    else if (tfNome.getText().equals("")) {
		JOptionPane.showMessageDialog(null, "Prencha o nome!");
		tfNome.requestFocus();
	    }
	    else if (tfEmail.getText().equals("")) {
		JOptionPane.showMessageDialog(null, "Prencha o email!");
		tfEmail.requestFocus();
	    }
	    else {
		try {
		    PrintWriter out = new PrintWriter(tfCodigo.getText() + ".txt");
		    out.println(tfCodigo.getText());
		    out.println(tfNome.getText());
		    out.println(tfEmail.getText());
		    out.close();
		    JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");
		} catch (IOException erro) {
		    JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo!");
		}
	    }
	}
	if (e.getSource() == btAbrir) {
	    try {
		String arq = JOptionPane.showInputDialog(null, "Informe o código a abrir:");
		BufferedReader br = new BufferedReader (new FileReader(arq + ".txt"));
		tfCodigo.setText(br.readLine());
		tfNome.setText(br.readLine());
		tfEmail.setText(br.readLine());
		br.close();
	    } catch (IOException erro) {
		JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo!");
	    }
	}
    }
}
