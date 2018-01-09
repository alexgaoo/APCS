
class fast_expt {


    public static void main(String[] args){

        int b = 4;
        int n = 55;

        System.out.println(looper(b, n));



    }

    static int looper(int b, int n){

        int result = 1;

        while(n > 0){

            if(n % 2 == 0){

                b *= b;
                n /= 2;

            }else{

                result *= b;
                n -= 1;

            }

        }

        return result;

    }



}