import java.util.LinkedList;
/**
 * 0은 움직일 수 있는 위치
 * 1은 움직일 수 없는 위치 (벽))
 * @author JBGW08-027 송주헌
 */
public class JBGW08_027_Maze {
    static int[][] maze;
    public static void main(String[] args){
        maze = mazemaker(true);

        // 임의로 maze 생성
        // maze = new int[][]
        // {{0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        // };

        // maze를 보여주는 코드
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        // maze의 탈출 가능 여부를 알려주는 코드
        if(bfs()){
            System.out.println("Pass, " + count + " times moved");
        } else{
            System.out.println("Fail, " + count + " times moved");
        }
    }


    // 
    static int count = 0;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visited = new boolean[10][10];
    /** @Autor JBGW08-027 송주헌
     * @param . BFS 알고리즘을 사용함
     * @param . LinkedList를 사용하여 작성하였으나, Queue를 사용하는게 이 문제에선 더 적절함
     * @param dx BFS 알고리즘을 사용하기 위한 배열 (direction을 위한 dx, dy 배열, 방문 여부를 판단하기 위한 visited 배열)
     * @param dy BFS 알고리즘을 사용하기 위한 배열 (direction을 위한 dx, dy 배열, 방문 여부를 판단하기 위한 visited 배열)
     * @param visited BFS 알고리즘을 사용하기 위한 배열 (direction을 위한 dx, dy 배열, 방문 여부를 판단하기 위한 visited 배열)
     */
    private static boolean bfs(){
        visited[0][0] = true;
        int[] cur = new int[]{0, 0, 0};

        LinkedList<int[]> list = new LinkedList<>();

        list.add(cur);
        while(!list.isEmpty()){
            cur = list.removeFirst();
            int x = cur[0], y = cur[1];
            int cnt = cur[2]+1;
            if(x == 9 && y == 9) {
                count = cur[2];
                return true;
            }

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= 10 || ny < 0 || ny >= 10) continue;
                if(visited[nx][ny]) continue;
                visited[nx][ny] = true;

                if(maze[nx][ny] == 0) list.add(new int[]{nx, ny, cnt});
            }
        }

        count = cur[2]+1;
        return false;
    }

    /**
     * maze를 생성해주는 메소드
     * @autor JBGW08-027 송주헌
     * @param flag flag가 true면 벽의 위치를 랜덤하게 생성, false의 경우엔 0으로 고정함
     */
    private static int[][] mazemaker(boolean flag){
        maze = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if((i==0 && j == 0) || (i == 9 && j == 9)){
                    maze[i][j] = 0;
                } else if(flag){
                    java.util.Random r = new java.util.Random();
                    maze[i][j] = r.nextInt(2);

                } else{
                    // 모두 움직일 수 있는 메이즈 생성
                    maze[i][j] = 0;
                }
            }
        }
        return maze;
    }
}