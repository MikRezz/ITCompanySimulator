public class Workers {
    private String name;
    private int type;
    private int price;
    boolean hired;


//Typ 1 ->Programista
//Typ 2 ->Sprzedawca
//Typ 3 ->Tester
    public Workers(String name,int type,int price, boolean hired){
        this.name = name;
        this.type = type;
        this.price = price;
        this.hired = hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }

    public boolean isHired() {
        return hired;
    }
}
