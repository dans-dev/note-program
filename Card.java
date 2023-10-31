public class Card {
    
    private String sideA;
    private String sideB;

    public Card(String a, String b) {
        this.sideA = a;
        this.sideB = b;
    }


    public String getSideA() {
        return this.sideA;
    }

    public void setSideA(String sideA) {
        this.sideA = sideA;
    }

    public String getSideB() {
        return this.sideB;
    }

    public void setSideB(String sideB) {
        this.sideB = sideB;
    }

}
