
public class RemovePunctuation {

	public static void main(String[] args) {
		String word= new String("/../][hi.");
		System.out.println(remove(word));
		

	}
	
	public static String remove(String s){
		s=s.toLowerCase();
		int index1=0, index2=s.length()-1;
		while(s.charAt(index1) < 'a' || s.charAt(index1) > 'z'){
			index1++;
		}
		while(s.charAt(index2) < 'a' || s.charAt(index2) > 'z'){
			index2--;
		}
		return s.substring(index1, index2+1);
	}

}
