package asignacionmemoria;

public class Proceso {

    int[] first(int num, int[] cantidad) {
        int[] vector = cantidad;
        for (int i = 0; i < 7; i++) {
            if ((cantidad[i] - num) >= 0) {
                vector[i] = cantidad[i] - num;

                vector[7] = i + 1;

                break;
            }
        }
        return vector;
    }

    int[] next(int num, int[] cantidad) {
        int[] vector = cantidad;
        if (cantidad[7] == 3) {
            if ((cantidad[4] - num) >= 0) {
                vector[4] = cantidad[4] - num;
                vector[7] = 5;
            } else if ((cantidad[6] - num) >= 0) {
                vector[6] = cantidad[6] - num;
                vector[7] = 7;
            } else if ((cantidad[2] - num) >= 0) {
                vector[2] = cantidad[2] - num;
                vector[7] = 3;
            }
        } else if (cantidad[7] == 5) {
            if ((cantidad[6] - num) >= 0) {
                vector[6] = cantidad[6] - num;
                vector[7] = 7;
            } else if ((cantidad[2] - num) >= 0) {
                vector[2] = cantidad[2] - num;
                vector[7] = 3;
            } else if ((cantidad[4] - num) >= 0) {
                vector[4] = cantidad[4] - num;
                vector[7] = 5;
            }
        } else if (cantidad[7] == 7) {
            if ((cantidad[2] - num) >= 0) {
                vector[2] = cantidad[2] - num;
                vector[7] = 3;
            } else if ((cantidad[4] - num) >= 0) {
                vector[4] = cantidad[4] - num;
                vector[7] = 5;
            } else if ((cantidad[6] - num) >= 0) {
                vector[6] = cantidad[6] - num;
                vector[7] = 7;
            }
        } else if (cantidad[7] == 6) {
            if ((cantidad[6] - num) >= 0) {
                vector[6] = cantidad[6] - num;
                vector[7] = 7;
            } else if ((cantidad[2] - num) >= 0) {
                vector[2] = cantidad[2] - num;
                vector[7] = 3;
            } else if ((cantidad[4] - num) >= 0) {
                vector[4] = cantidad[4] - num;
                vector[7] = 5;
            }
        }
        return vector;
    }

    int[] best(int num, int[] cantidad) {
        int[] vector = cantidad;
        int[] mejor = new int[3];
        mejor[0] = cantidad[2] - num;
        mejor[1] = cantidad[4] - num;
        mejor[2] = cantidad[6] - num;
        int x = 8;
        int pos=3;
        for (int i = 0; i < 3; i++) {
            if (mejor[i] >= 0 && mejor[i] <= x) {
                pos=i;
                x = mejor[i];
            }
        }
        if (pos == 0) {
            vector[2] = mejor[0];
            vector[7] = 3;
        } else if (pos == 1) {
            vector[4] = mejor[1];
            vector[7] = 5;
        } else if (pos == 2) {
            vector[6] = mejor[2];
            vector[7] = 7;
        }

        return vector;
    }
    int[] worst(int num, int[] cantidad) {
        int[] vector = cantidad;
        int[] peor = new int[3];
        peor[0] = cantidad[2] - num;
        peor[1] = cantidad[4] - num;
        peor[2] = cantidad[6] - num;
        int x = 0;
        int pos=3;
        for (int i = 0; i < 3; i++) {
            if (peor[i] >= 0 && peor[i] >= x) {
                pos=i;
                x = peor[i];
            }
        }
        if (pos == 0) {
            vector[2] = peor[0];
            vector[7] = 3;
        } else if (pos == 1) {
            vector[4] = peor[1];
            vector[7] = 5;
        } else if (pos == 2) {
            vector[6] = peor[2];
            vector[7] = 7;
        }

        return vector;
    }
}
