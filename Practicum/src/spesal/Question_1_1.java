package spesal;

import java.util.ArrayList;
import java.util.List;

public class Question_1_1 {
	private final List<Integer> list = new ArrayList<>();
    public void add() {
        list.add(0);
    }
    public static void main(String[] args) {
        Question_1_1 q = new Question_1_1();
        q.add();
        q.add();
    }
}