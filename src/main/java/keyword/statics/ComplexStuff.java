package keyword.statics;

public class ComplexStuff {

    static int f(int x) {

        int result = 0;

        // complex stuff step 1
        result = ComplexStuffStep1.step1(result);

        // complex stuff step 2
        result = ComplexStuffStep2.step2(result);

        // complex stuff step 3
        result = ComplexStuffStep3.step3(result);

        return result;
    }

    static class ComplexStuffStep1 {

        static int step1(int result) {
            result += 1;
            return result;
        }

    }

    static class ComplexStuffStep2 {
        public static int step2(int result) {
            result *= 1;
            return result;
        }
    }

    static class ComplexStuffStep3 {
        public static int step3(int result) {
            result /= 1;
            return result;
        }
    }

}
