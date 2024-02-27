public class Dragon {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0; // Asumsi posisi awal adalah (0,0)
        this.y = 0;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    private void detectCollision() {
        System.out.println("Game Over"); // Dragon menyentuh ujung area permainan
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon(10, 8); // Contoh: area permainan lebar 10 dan tinggi 8
        dragon.moveRight();
        dragon.moveDown();
        dragon.moveLeft();
        dragon.moveUp();
    }
}
