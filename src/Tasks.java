public class Tasks {
    private String name ;
    private int id ;
    private int days;
    private String type;
    private String client;
    private String deadline;
    private int punish;
    private double price;
    private int pay_day;
    private int level;


    public Tasks(String name,int id, int days,String type,String client,String deadline,int punish,double price,int pay_day,int level ){
        this.name = name;
        this.id = id;
        this.days = days;
        this.client = client;
        this.deadline = deadline;
        this.punish = punish;
        this.price = price;
        this.pay_day = pay_day;
        this.level = level;


    }

}
