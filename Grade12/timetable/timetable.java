// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class timetable {
	JFrame frame;
	JTable table;

	timetable() {
		frame = new JFrame(); // Frame initialization
		frame.setTitle("Student Semester Time Table"); // Frame Title

		// Data to be displayed in the JTable
		String[][] data = {
				{ "Period 1", "computer science" },
				{ "Period 2", "cooking" },
				{ "Period 3", "english" },
				{ "Period 4", "comm-tech" }
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
		new madlib();
	}
}

// Made by MBlais with ♥