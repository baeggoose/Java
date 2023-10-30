package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name ="백구스";
        int hour = 109;

        System.out.println(name + " 안녕 " + hour + "시에 갈게");
        System.out.println(name + " 잘가");

        double score = 90.5;
        char grade = 'A';
        name = "토북이";
        System.out.println(name+ "의 평균점수는 " + score + "점이다.");
        System.out.println("학점은 " + grade + "이다.");

        boolean pass =true;
        System.out.println("합격? " + pass);

        double d = 3.1456789;
        float f = 3.1456789F;
        System.out.println(d);
        System.out.println(f);

         long L= 1000000000000L;
         L =  1_000_000_000_000L;
        System.out.println(L);

    }
}
