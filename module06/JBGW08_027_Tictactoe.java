import java.util.Scanner;
import java.util.StringTokenizer;

public class JBGW08_027_Tictactoe{

    // 0 is nothing
    // 1 is User
    // 2 is Computer
    static int tic[][] = new int[3][3];

    // flag = Turn argument
    static boolean flag = true;
    // useFlag == true > userWin | else > userLose
    static boolean useFlag = false;

    // Make Computer's Select
    static int comX, comY;
    static void comSelectMaker(){
        java.util.Random rand = new java.util.Random();

        boolean isValid = false;
        while(!isValid){
            comX = rand.nextInt(3);
            comY = rand.nextInt(3);

            if(tic[comX][comY] == 0){
                isValid = true;
            }
        }
    }
    
    // Enter selection into tic-tac-toe map
    static void enterSelection(int x, int y){
        if(x < 0 || x > 2 || y < 0 || y > 2){
            throw new IllegalArgumentException(x + " " + y + " is not invalid selection");
        } else if(tic[x][y] != 0){
            throw new IllegalArgumentException(x + " " + y + " is not invalid locate");
        }

        // flag == true > User Turn
        // flag == false > Com Turn
        if(flag){
            tic[x][y] = 1;
        } else{
            tic[x][y] = 2;
        }

        flag = !flag;
    }


    // check the Game is Ended
    static boolean checkEnd(){
        // |
        for(int j = 0; j < 3; j++){
            int u = 0, c = 0;
            for(int i = 0; i < 3; i++){
                if(tic[i][j] == 1) u++;
                else if(tic[i][j] == 2) c++;
            }

            if(u == 3){
                useFlag = true;
                return true;
            } else if(c == 3){
                return true;
            }
        }

        // -
        for(int i = 0; i < 3; i++){
            int u = 0, c = 0;
            for(int j = 0; j < 3; j++){
                if(tic[i][j] == 1) u++;
                else if(tic[i][j] == 2) c++;
            }

            if(u == 3){
                useFlag = true;
                return true;
            } else if(c == 3){
                return true;
            }
        }

        // /
        if(tic[0][2] == tic[1][1] && tic[1][1] == tic[2][0]){
            if(tic[0][2] == 1){
                useFlag = true;
                return true;
            } else if(tic[0][2] == 2){
                useFlag = false;
                return true;
            }
        }

        // \
        if(tic[0][0] == tic[1][1] && tic[1][1] == tic[2][2]){
            if(tic[0][0] == 1){
                useFlag = true;
                return true;
            } else if(tic[0][2] == 2){
                useFlag = false;
                return true;
            }
        }

        // full
        int tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tic[i][j] != 0) tmp++;
            }
        }
        if(tmp == 9) return true;

        return false;
    }

    // Print the map for easy viewing
    static void printMap(){
        char[][] arr = new char[5][11];

        for(int i = 0; i < 11; i++){
            if(i == 3 || i == 7){
                arr[0][i] = '|';
                arr[2][i] = '|';
                arr[4][i] = '|';
                continue;
            }
            arr[0][i] = ' ';
            arr[2][i] = ' ';
            arr[4][i] = ' ';
        }
        int x = 0, y = 0;
        for(int i = 0; i < 5; i += 2){
            y = 0;
            for(int j = 1; j < 11; j += 4){
                if(tic[x][y] == 1){
                    arr[i][j] = 'O';
                } else if(tic[x][y] == 2){
                    arr[i][j] = 'X';
                }

                y++;
            }
            x++;
        }

        for(int i = 0; i < 11; i++){
            arr[1][i] = '-';
            arr[3][i] = '-';
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 11; j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Game Until End
        do{
            System.out.println("Enter your select, ex)0 0");
            StringTokenizer st = new StringTokenizer(sc.nextLine());

            try{
                enterSelection(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

                // If Game is End, Print the Result
                if(checkEnd()){
                    printMap();
                    if(useFlag){
                        System.out.println("You Win");
                    } else{
                        System.out.println("Game End");
                    }

                    return;
                }
            } 
            // If User Enter the Illegal Select, Print "That locate is invalid"
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());

                continue;
            }
            printMap();

            comSelectMaker();
            System.out.println("Computer select: " + comX + " " + comY);
            enterSelection(comX, comY);
            
            printMap();
        } while(!checkEnd());
        sc.close();

        // If Not end the code and come here Computer win
        System.out.println("You Lose");
    }
}