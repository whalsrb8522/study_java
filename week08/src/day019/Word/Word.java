package day019.Word;

// 단어장 만들기
// 1. 단어 추가
// 2. 단어 출력 (단어 기준 오름차순 정렬)

// class Word
// 변수: 단어, 의미

public class Word implements Comparable<Object> {
	private String word;
	private String mean;

	public Word() {
	}

	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + " : " + mean;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null) {
				return false;
			}
		} else if (!word.equals(other.word)) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Object o) {
		Word word = (Word) o;
		
		// 오름차순
		return this.word.compareTo(word.word);

		// 오름차순
//		return -this.word.compareTo(word.word);
	}
}
