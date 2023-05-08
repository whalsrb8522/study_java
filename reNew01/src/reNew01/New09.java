package reNew01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class New09 {
	public static void main(String[] args) {
		// https://www.daum.net/
		URL url = null;
		BufferedReader input = null;
		String address = "https://www.daum.net/";
		String line = "";

		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {
				System.out.printf(line);
			}

			input.close();
		} catch (Exception e) {
			
		}
	}
}
