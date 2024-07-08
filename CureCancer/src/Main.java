public class Main {
    public static void main(String[] args) {

        char[][] body =  {
                "someGreaTstuffIthinkThisI1".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray()
        };
        int[] answer = mutationLocation(body);
        System.out.println(answer[0] + " " + answer[1]);
    }

    private static int[] mutationLocation(char[][] body) {
        int rows = body.length;
        int cols = body[0].length;

        char[] reference = findRef(body);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (body[i][j] != reference[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static char[] findRef(char[][] body) {
        int cols = body[0].length;

        char[] reference = new char[cols];


        for (int i = 1; i < 3; i++) {
            boolean equal = true;
            for (int j = 0; j < cols; j++) {
                equal = body[0][j] == body[i][j];
            }
            if (equal) {
                for (int j = 0; j < cols; j++) {
                    reference[j] = body[0][j];
                }
                return reference;
            } else if (!equal && i == 2) {
                for (int j = 0; j < cols; j++) {
                    reference[j] = body[2][j];
                }
                return reference;
            }
        }
        return reference;
    }

}