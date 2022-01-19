package Projects_02__;

public class sumTotal {

    /* Hakan Hocam
     * 
       String 2D array olustur
       {{"$12" , "$22" , "5$"},{"£9" , "£40" , "$1" , "$2"}, {"£12"}}
       String de $ varsa 3.2 ile carp
       String de  varsa 4.2 ile carp
       double return et
    */
    public static void main(String[] args) {

//        Koda burdan baslayinn



        String[][] nums = {

                {"$12", "$22", "5"},
                {"£9", "£40", "$1", "$2"},
                {"£12"}
        };

        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j].contains("$")) {

                    String strNum = nums[i][j];

                    strNum = strNum.replace("$", "");

                    int intNum = Integer.parseInt(strNum);

                    double doubleNum = intNum * 3.2;

                    total += doubleNum;

                } else if (nums[i][j].contains("£")) {
                    String strNum = nums[i][j];

                    strNum = strNum.replace("£", "");

                    int intNum = Integer.parseInt(strNum);

                    double doubleNum = intNum * 4.2;

                    total += doubleNum;

                }

            }
        }
        System.out.println(total);
        

    }
}
