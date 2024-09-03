import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 단어의 개수를 입력 받기
		int totalWrd = sc.nextInt();
		sc.nextLine(); //입력 버퍼 비우기
		
		Set<String> wrdSet = new HashSet<>();
		for (int i = 0; i < totalWrd; i++) {
			wrdSet.add(sc.nextLine());
		}
//		System.out.println(wrdSet);
		
		List<Word> wordList = new ArrayList<Word>();
		for (String str : wrdSet) {
			wordList.add(new Word(str));
		}
//		System.out.println(wordList);
		
		//입력끝 스캐너 닫기
		sc.close();
		Collections.sort(wordList, new DictionaryAsc());
		for (Word o : wordList) {
			System.out.println(o.getWord());
		}
	}
}

class Word implements Comparable<Word>{
	//field
	private String word;
	
	//constructor
	public Word(String word) {
		this.word = word;
	}
	
	//getter
	public String getWord() {
		return this.word;
	}
	
	//toString
	@Override
	public String toString() {
		return this.word;
	}
	
	//compareTo
	@Override
	public int compareTo(Word o) {
		if (this.word.length()>o.word.length()) {
			return 1;
		} else if (this.word.length()==o.word.length()) {
			return 0;
		} else {
			return -1;
		}
	}
}

class DictionaryAsc implements Comparator<Word>{

	@Override
	public int compare(Word o1, Word o2) {
		String w1 = o1.getWord();
		String w2 = o2.getWord();
		
		if (o1.getWord().length()>o2.getWord().length()) {
			return 1;
		} else if (o1.getWord().length()==o2.getWord().length()) {
			return w1.compareTo(w2);
		} else {
			return -1;
		}
	}
	
}