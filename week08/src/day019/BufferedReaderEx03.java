package day019;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {
	public static void main(String[] args) throws IOException {
		// out.xt파일 읽어 와서 map에 저장 후 합계 출력

		// ex)
		// 이름:점수
		// 이름:점수
		// ...
		// 합계

		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int sum = 0;

		while (true) {
			String line = br.readLine();

			if (line == null)
				break;

			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ") + 1));

			map.put(name, score);
		}

		for (String key : map.keySet()) {
			System.out.printf("%s : %s\n", key, map.get(key));
			sum += map.get(key);
		}

		System.out.printf("총합계: %s, 총인원: %s", sum, map.size());
	}
}
