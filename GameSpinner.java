public class GameSpinner {
  private int numSectors;
  private int prevSpin;
  private int currentRun;

  public GameSpinner (int numSectors) {
    this.numSectors = numSectors;
  }

  public int spin () {
    int result = (int) Math.random()*(numSectors)+1;
    if (result == prevSpin) {
        currentRun++;
    } else {
        currentRun = 0;
    }
    prevSpin = result;
  }

  public int currentRun () {
    return currentRun;
  }
}