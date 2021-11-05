public class GameCharacter {
    private String namaChar;
    private int atkHitPoint;
    private int atkKickPoint;
    private int lifePoint;

    public GameCharacter(String namaChar, int atkHitPoint, int atkKickPoint) {
        this.namaChar = namaChar;
        this.atkHitPoint = atkHitPoint;
        this.atkKickPoint = atkKickPoint;
    }

    public String getNamaChar() {
        return namaChar;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint){
        this.lifePoint = lifePoint;
    }

    public void karakterHit(GameCharacter karA){
        karA.lifePoint -= this.atkHitPoint;
        System.out.println(karA.getNamaChar() + " dipukul "+ this.namaChar);
        System.out.println(karA.getNamaChar() + " -" + this.atkHitPoint);
        System.out.println(karA.getLifePoint());
        System.out.println("\n");
    }

    public void karakterKick(GameCharacter karA){
        karA.lifePoint -= this.atkKickPoint;
        System.out.println(karA.getNamaChar() + " ditendang "+ this.namaChar);
        System.out.println(karA.getNamaChar() + " -" + this.atkKickPoint);
        System.out.println(karA.getLifePoint());
        System.out.println("\n");
    }


}
