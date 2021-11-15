package listener;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
   This program demonstrates how an action listener can access 
   a variable from a surrounding block.
*/
public class InvestmentViewer1
{
   private static final double INTEREST_RATE = 10;
   private static final double INITIAL_BALANCE = 1000;

   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 200;

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      // The button to trigger the calculation
      JButton button = new JButton("Add Interest");
      frame.add(button);

      // The application adds interest to this bank account
      final BankAccount account = new BankAccount(INITIAL_BALANCE);

      ActionListener listener = new AddInterestListener(account);
      button.addActionListener(listener);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
