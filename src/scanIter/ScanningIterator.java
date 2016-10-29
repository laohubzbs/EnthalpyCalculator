package scanIter;

import java.util.Iterator;

public class ScanningIterator implements Iterator<String> {

	private int nowIndex;
	private int strL;
	private String str1;
	
	public ScanningIterator(String str1) {
		this.str1 = str1;
		strL = this.str1.length();
		nowIndex = -1;
	}
	
	@Override
	public boolean hasNext() {
		if(nowIndex<(strL-1)) {
			nowIndex+=1;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String next() {
		String currentCharStr = str1.substring(nowIndex,nowIndex+1);
		//nowIndex++;
		return currentCharStr;
	}
	
	public int indexOf(String s, char ch, int fromIndex) {
		int storeInt = nowIndex;
		String storeStr = str1;
		str1 = s;
		nowIndex = fromIndex-1;
		while(this.hasNext()) {
			if(this.next().equals(Character.toString(ch))) {
				int ansInt = nowIndex+1;
				//restore initial condition before call of indexOf()
				nowIndex = storeInt;
				str1 = storeStr;
				return ansInt;
			}
		}
		nowIndex = storeInt;
		return -1;
		//return 0;
	}
	
	public int indexOfNot(String s, char ch, int fromIndex) {
		int storeInt = nowIndex;
		String storeStr = str1;
		str1 = s;
		nowIndex=fromIndex-1;
		while(this.hasNext()) {
			if(this.next().equals(Character.toString(ch))) {
				
			}
			else {
				int ansInt = nowIndex+1;
				nowIndex = storeInt;
				str1=storeStr;
				return ansInt;
			}
		}
		nowIndex = storeInt;
		return -1;
	}
	
	public int getIndex() {
		return nowIndex+1;
	}

}
