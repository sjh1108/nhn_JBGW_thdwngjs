import java.io.*;
import java.util.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N, M, K;

    static int count;
    static int[][] map;
    static boolean[][] visited;
    static boolean[] key = new boolean[26];

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void open(){
        for(int[] arr: map){
            for(int i: arr){
                char c = (char)i;

                if(key[c-'A']){
                    arr[i] = '.';
                }
            }
        }
    }
    public static void bfs(){
    }

    public static void main(String[] args) throws IOException{
        K = Integer.parseInt(br.readLine());

        while(K-- > 0){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];
            key = new boolean[26];

            for(int i = 0; i < N; i++){
                String str = br.readLine();
                for(int j = 0; j < M; j++){
                    map[i][j] = str.charAt(j);
                }
            }

            String keys = br.readLine();
            if(!keys.equals("0")){
                for(int i = 0; i < keys.length(); i++){
                    key[keys.charAt(i) - 'a'] = true;
                }
            }

            count = 0;
            bfs();

            sb.append(count).append("\n");
        }

        System.out.println(count);
    }

}