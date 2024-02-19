class calculator{
    void add(){
        int a = 10;
        int b = 20;
        int res = a+b;
        System.out.println("Addition "+res);
    }
    void substract(){
        int a = 10;
        int b = 20;
        int diff = a-b;
        System.out.println("Substraction "+diff);
    }
    void multi(){
        int a = 10;
        int b = 20;
        int pro = a *b;
        System.out.println("product "+pro);
    }
    void division(){
        int a = 10;
        int b = 20;
        int div = a/b;
        System.out.println("division "+div);
    }
    public static void main(String args[]){
       
        calculator c=new calculator();
        c.add();
        c.substract();
        c.multi();
        c.division();
        
    }
}
