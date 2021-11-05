public class Main2 {
    public static void main(String[] args) {
        GameCharacter karA = new GameCharacter("Raiden", 10, 20);
        GameCharacter karB = new GameCharacter("Sub-Zero", 5, 25);

        karA.setLifePoint(100);
        karB.setLifePoint(100);

        //serangan pertama dari raiden
        karA.karakterKick(karB);

        //serangan balik dari sub-zer0
        karB.karakterKick(karA);

        //sub-zero melakukan pukulan 3x beruntun
        for(int s = 0; s <3; s++){
            karB.karakterHit(karA);
        }

        //raiden melakukan tendangan 4x beruntun
        for (int r = 0; r <4; r++){
            karA.karakterKick(karB);
        }

        //output akhir lifepoint
        System.out.println(" ");
        System.out.println(karA.getNamaChar() + " = " + karA.getLifePoint());
        System.out.println(karB.getNamaChar() + " = " + karB.getLifePoint() + "\n");

        //conclusion
        if(karA.getLifePoint() > karB.getLifePoint()){
            System.out.println("Raiden WIN");
        }else {
            System.out.println("Sub-Zero WIN");
        }
    }

}
