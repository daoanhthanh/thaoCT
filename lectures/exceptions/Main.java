package lectures.exceptions;

public class Main {

  public void validateAge(int age) throws IllegalArgumentException { // Viết như này để bắt buộc người khác phải handle
                                                                     // exception. Không viết để có thể bỏ qua việc xử
                                                                     // lý (với những exception không cần)
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }

  public static void main(String[] args) {

  }
}
