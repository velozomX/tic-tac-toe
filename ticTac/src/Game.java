import java.util.Map;
import java.util.Scanner;

class Game{

    private int sc;
    private String Rul;
    private static char[][] map = {{'.','.','.'},
                                   {'.','.','.'},
                                   {'.','.','.'}};;
    public void map_veiw(){

        for(int i = 0;i< map.length;i++){
            for(int j = 0; map.length > j; j++){

                System.out.print(map[i][j]+" " );
            }
            System.out.println();
        }
        System.out.println();
    }
    public void Rules(String Rul){
        this.Rul = Rul;
        System.out.println(Rul);
    }

    public static void map_morf(int sc_,int sc1_){
        map[sc_][sc1_]='X';

    }
    public String game_win(){
        String win = "у вас победа!!";
        if(map[0][0]== 'X' && map[1][0] == 'X' && map[2][0]== 'X'){
            return win;
        }else if( map[0][2] == 'X' && map[1][2]=='X' && map[2][2] == 'X'){
            return win;
        }else if( map[1][0]=='X' && map[1][1]=='X' && map[1][2]=='X'){
            return win;
        }else if(map[0][0]=='X'&& map[1][1]=='X' && map[2][2]=='X'){
            return win;
        } else if (map[0][1] == 'X' && map[1][1]=='X' && map[2][1] == 'X') {
            return win;
        }
        return win;
    }
    public void game_gamePlay(){
        int i = 0;
        while(i < 3){

            Game game2 = new Game();


            Scanner scan= new Scanner(System.in);

            System.out.println("введите индекс строки цифрами 0/2");
            int sc1 = scan.nextInt();

            System.out.println("введите индекс столбца цифрами 0/2");
            int sc = scan.nextInt();


            Game.map_morf(sc,sc1);
            game2.map_veiw();
            i++;


        }

    }
    public void gameScore(){
        int score = 0;
        score++;
    }
    public void 
    }

