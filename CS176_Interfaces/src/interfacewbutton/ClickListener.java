package interfacewbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{
	private Measurable[] objects;
	private String metric;
	
	public ClickListener(Measurable[] objects, String metric)
	{
		this.objects = objects;
		this.metric = metric;
	}

	public void actionPerformed(ActionEvent event)
	{
		double result;
		String objectType;
		
		// Get the result of the metric
		if (this.metric == "Maximum") {
			result = Data.max(this.objects);
		} else if (this.metric == "Minimum") {
			result = Data.min(this.objects);
		} else { // else it must be average metric
			result = Data.average(this.objects);
		}
		
		// Get the type of result we are looking for (just for printing reasons)
		String name = this.objects[0].getClass().getSimpleName(); // getSimpleName() just returns class name, does not include package name like getName() does
		if (name.equals("BankAccount")) {
			objectType = "Account Balance";
		} else if (name.equals("Country")) {
			objectType = "Country Area";
		} else { // else it must be of quiz class
			objectType = "Quiz Score";
		}
		
		// Print the result
		System.out.printf("The "+this.metric+" "+objectType+" is: %.1f", result);
		System.out.println();
	}
}
