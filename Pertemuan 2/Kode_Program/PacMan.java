public class PacMan {

    int x, y, width, height;

    void moveLeft(int n) {
        x = x - 1;
    }
    void moveRight(int n) {
        x = x + 1;
    }
    void moveUp(int n) {
        y = y + 1;
    }
    void moveDown(int n) {
        y = y - 1;
    }
    void printPosition(int a, int b) {
        System.out.println("Pacman pada posisi (x,y) = " + x + "," + y);
    }
}
