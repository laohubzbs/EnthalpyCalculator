package bondparse;

import scanIter.ScanningIterator;

//TODO single character for now, later multiple char elements & more complex reactions
public class BondParser {
	//	private boolean atSecond;
	private char oldChar;
	private charType cT;
	private charType oldCT;
	private int atomIndex;
	private String input;
	private String[] lBAr;
	private String[] holdAtoms;
	private String holdStr;
	private ScanningIterator sI;

	private enum charType {
		isUpper, isLower, isNum, isNone
	}
	public void setInput(String str) {
		input = str;
//		int a = input.length();
		lBAr = new String[50];
		holdAtoms = new String[2];
//		atSecond=false;
		atomIndex = 0;
		oldChar = ' ';
		oldCT = charType.isNone;
		cT = charType.isNone;
//		sI = new ScanningIterator();
	}
	public String getInput() {
		return input;
	}
	private void parseString(String str) {
		sI = new ScanningIterator(input);
		while (sI.hasNext()) {
			char ch = sI.next().charAt(0);
			if (Character.isUpperCase(ch)) {
				cT = charType.isUpper;
//				if
//				if ()
			} else if (Character.isLowerCase(ch)) {
				cT = charType.isLower;

			} else if (Character.isDigit(ch)) {
				cT = charType.isNum;
			} else {
				cT = charType.isNone;
			}

//			if(sI.next().charAt(1)!=null) {
//
//			}
			oldChar = ch;
			oldCT = cT;
//			cT = charType.isNone;
		}
	}
	public String[] getBonds() {
		return null;
	}
//	private void testMethod() {
//		//i do nothing
//	}
}
