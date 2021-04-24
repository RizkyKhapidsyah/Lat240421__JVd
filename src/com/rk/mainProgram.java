package com.rk;

/*  Source by ProgrammerJokesOfficial
    Modified by Rizky Khapidsyah
 */

public class mainProgram {
    private int data = 10;

    class Inner {
        private int data = 20;

        private int getData() {
            return data;
        }

        public void main(String[] args) {
            Inner inner = new Inner();
            System.out.println(inner.getData());
        }
    }

    private int getData() {
        return data;
    }

    public static void main(String[] args) {
        mainProgram MP = new mainProgram();
        mainProgram.Inner MP_inner = MP.new Inner();

        System.out.printf("Hasilnya adalah = %d", MP.getData());
        MP_inner.main(args);

    }
}
