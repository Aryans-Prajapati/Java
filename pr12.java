 interface disp {
    
    // final int a= 9;

    void display();
}


 interface inter2 extends disp {
    void disp1();
}

public class pr12 implements inter2{
    
   public void display(){
        System.out.println("Hi....! this is Heet Nakrani");
    }


    public void disp1(){
        System.out.println("this is extended interfaces");
    }

    public static void main(String[] args){
        pr12 obj= new pr12();
        obj.display();
        obj.disp1();
        // System.out.println(a);
    }
}
