package reNew01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

public class New08 {
	public static void main(String[] args) throws IOException {
		// Network
		// IP 주소 : 실질적인 사이트의 주소
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");

		System.out.printf("getHostAddress : %s\n", ip.getHostAddress());
		System.out.printf("getHostName : %s\n", ip.getHostName());
		System.out.printf("toString : %s\n", ip.toString());

		URL url = new URL("https://n.news.naver.com/article/057/0001740553?ntype=RANKING");

		System.out.printf("%s\n", url.getAuthority());
		System.out.printf("%s\n", url.getContent());
		System.out.printf("%s\n", url.getPort());
		System.out.printf("%s\n", url.getProtocol());
		System.out.printf("%s\n", url.getQuery()); // 많이 사용
		System.out.printf("%s\n", url.getHost()); // 많이 사용
		System.out.printf("%s\n", url.getPath()); // 많이 사용
	}
}
