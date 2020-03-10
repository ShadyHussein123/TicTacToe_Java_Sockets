import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TicTacToe implements Runnable
{
    private String ip;
    private int portNumber;
    private Scanner input;
    private JFrame frame; //width height
    private Thread t;
    private Painter painter;
    private Socket socket, serverSocket;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;
    private BufferedImage x,o;

    public TicTacToe()
    {
        //Port and ip
        System.out.println("Enter ip address: ");
        ip = input.nextLine();
        System.out.println("Enter Port Number: ");
        portNumber = input.nextInt();
        while (portNumber <  1 || portNumber < 65535)
        {
            System.out.println("Enter Port Number again please: ");
            portNumber = input.nextInt();
        }

        frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("");
        frame.setContentPane(painter);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }



    private class Painter extends JComponent implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {

        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }

    @Override
    public void run() {

    }

}
