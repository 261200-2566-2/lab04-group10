import java.util.List;

public interface RPGcharactor {
    String getName();
    String getJob();
    int getHp(int level);
    int getLevel();
    int getDef(int level);
    int getAtk(int level);
    int getMana(int level);
    int getRunSpeed(int level);
}
