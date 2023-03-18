public class OOPS_basic {
    public static void main(String args[]) {
        Pen p1 = new Pen();//Constructer :- Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "AbhishekBehera";
        //myAcc.password is not accessible 
        myAcc.setPassword("AbhiSima");// only changable , not accessible
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    String getColor() { // get : to return the value
        return this.color; // this : it refers to the current object
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) { // set : to modify the value
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    
}


