// Grade 11, Computer Science, Assignment 2

// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class assignment_2 {
	JFrame frame;
	JTable table;

	assignment_2() {
		frame = new JFrame(); // Frame initialization
		frame.setTitle("Student Semester Time Table"); // Frame Title

		// Data to be displayed in the JTable
		String[][] data = {
				{ "Period 1", "co-op" },
				{ "Period 2", "co-op" },
				{ "Period 3", "computer science" },
				{ "Period 4", "auto/transportation" }
		};

		String[] columnNames = { "Period", "Class Name" }; // Column Names

		// Creating the JTable
		table = new JTable(data, columnNames);

		// Adding to JScrollPane
		JScrollPane sp = new JScrollPane(table);
		frame.add(sp);
		frame.setSize(400, 150); // frame size X,Y
		frame.setVisible(true);
	}

	// Runs the function
	public static void main(String[] args) {
		new assignment_2();
	}
}

// Made by MBlais with ♥