
import java.util.*;
class Get_input{
    float number_one;
    float number_two;

    Scanner sc = new Scanner(System.in);

    public void get_input_for_cal(){
            this.number_one = sc.nextFloat();
            this.number_two = sc.nextFloat();
    }

    public int get_input_for_menu(){
        return sc.nextInt();
    }
}

class Calculation{
    Get_input in = new Get_input();

    public float addition(){
        in.get_input_for_cal();

        return  in.number_two + in.number_one;
    }

    //public float subtraction(){
        //in.get_input_for_cal();
        //return  in.number_one
   // }
}
class Calculator{
    Get_input in = new Get_input();
    Calculation cal = new Calculation();
    //Main_menu main_menu = new Main_menu();
    public void menu(){

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        int option = in.get_input_for_menu();
        if (option ==1){
            System.out.println(cal.addition());
            menu();
        }
    }
}


class Main_menu{
    Get_input in = new Get_input();
    Calculator calc = new Calculator();
    public void menu(){
        System.out.println("1.Calculator\n2.Converter");
        int option = in.get_input_for_menu();
        if (option == 1){
            calc.menu();
        }
    }
}

public class Main{
    public static void main(String[] args){
        Main_menu main = new Main_menu();
        main.menu();
    }
}