package bondparse;

import scanIter.ScanningIterator;

public class BondParser {
	private String input;
	private String[] lBAr;
	private ScanningIterator sI;
	public void setInput(String str) {
		input = str;
//		int a = input.length();
		lBAr = new String[50];
//		sI = new ScanningIterator();
	}
	public String getInput() {
		return input;
	}
	private void parseString(String str) {
		sI = new ScanningIterator(input);
		while (sI.hasNext()) {
			char ch = sI.next().charAt(0);

		}
	}
	public String[] getBonds() {
		return null;
	}
//	private void testMethod() {
//		//i do nothing
//	}
}
