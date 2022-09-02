
import javax.swing.JOptionPane;

public class calcTwinsTix {


	
public static void main(String[] args) {
		
	final int TICKETCOST = 75;
	final int PROCESSINGFEE = 20;
	final double SALESTAX = 0.07;
	String numberTickets;
	
	numberTickets= JOptionPane.showInputDialog ("Enter number of tickets: ");
	
	int numericInput = Integer.parseInt(numberTickets);
	
	double totalTicketCost = numericInput * TICKETCOST;
	double salesTaxAmt = totalTicketCost * SALESTAX;
	double totalCost = totalTicketCost + salesTaxAmt + PROCESSINGFEE;
		
		System.out.println(numberTickets + " tickets cost $" + totalCost);
	}

	
	
	
}
