

class Practical2 {
    public static void main(String[] args) {
        int total, per;
        int marks[] = { 89, 91, 52, 72, 73, 68 };
        total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5];
        per = (total * 100) / 600;
        System.out.println("percentage is :" + per);
    }
}