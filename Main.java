import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {

    private JTextField inputBar = new JTextField();

    private JTextArea chatOutput = new JTextArea();

    public Main() { 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);

        this.setTitle("Customer Service ChatBot");

        inputBar.setLocation(2, 540);
        inputBar.setSize(590, 30);

        inputBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String userInput = inputBar.getText();
                chatOutput.append("You: " + userInput + "\n");

                if (userInput.contains("help")) {
                    botOutput(
                            "Please select a catagory I can assist you with:Customer Service,Report Issue,Account Details, Make a Payment");
                }

                else if (userInput.contains("customer service")) {
                    botOutput("Please select area needing assistance: Speak to rep, Return Product, Broken Item");
                } else if (userInput.contains("Speak to rep")) {
                    botOutput("Please wait while we connect you!");
                } else if (userInput.contains("account details")) {
                    botOutput("Please enter Email or Account #");
                } else if (userInput.contains("make payment")) {
                    botOutput("Please enter Email or Account #");

                } else if (userInput.contains("report issue")) {
                    botOutput("Select an issue: Late delivery, Missing Product, Invalide Info");
                }
                inputBar.setText("");
            }
        });

        chatOutput.setLocation(15, 5);
        chatOutput.setSize(560, 510);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);

        this.add(inputBar);
        this.add(chatOutput);
    }

    public void botOutput(String s) {
        chatOutput.append("ChatBot: " + s + "\n");
    }

    public static void main(String[] args) {
        new Main();
    }

}