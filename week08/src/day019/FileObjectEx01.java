package day019;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {
	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		// D:\java_workspace\week08\out.txt

		File f = new File("D:\\java_workspace\\week08\\out.txt");

		String fileName = f.getName(); // 경로를 제외한 파일 이름
		System.out.println(fileName);
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(File.separator); // 파일 구분자 (가장 많이 사용)
		System.out.println(File.separatorChar);

		// 시스템에서 직접알아낸 사용자파일의 경로는 분리
		String fstr = f.toString();
		System.out.println(fstr);
		// fstr에서 드라이브만 추출 출력
		System.out.println(fstr.substring(0, fstr.indexOf(File.separator)));
		// fstr에서 파일명만 추출 출력
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator) + 1));
		// fstr에서 파일경로만 추출 출력
		System.out.println(fstr.substring(fstr.indexOf(File.separator) + 1, fstr.lastIndexOf(File.separator)));

		// 파일명과 확장자 분리
		System.out.println(f.getName()); // 파일명.확장자
		String[] str = f.getName().split(File.separator + ".");
		System.out.printf("파일명: %s, 확장자: %s\n", str[0], str[1]);

		// StringTokenizer 클래스 사용
		StringTokenizer stk = new StringTokenizer(f.getName(), ".");
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
	}
}
