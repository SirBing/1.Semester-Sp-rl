
public class StringController {
	private StringBuilder sb;
	
	public void setString(String param) {
		sb = new StringBuilder(param);
	}
	
	public String getString() {
		return sb.toString();
	}
	
	public void addString(String param) {
		sb.append(param);
	}
	
	public int getLength() {
		return sb.length();
	}
	
	public int getCapacity() {
		return sb.capacity();
	}
	
	public void replaceString(int start, int end, String str) {
		sb.replace(start, end, str);
	}
	
	public void replaceString(int start, String str) {
		sb.replace(start, start + str.length(), str);	
	}
	
}
