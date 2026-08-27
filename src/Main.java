import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("나이: ");
    int age = scanner.nextInt();
    System.out.print("이름: ");
    String name = scanner.nextLine();
// 남아 있던 줄바꿈을 읽어 name이 빈 문자열
    System.out.println(name);
}