import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       //Класс Cow (weight, age, gender, nickName)
        //Класс Sheep(weight, age, gender, nickName)
        //Класс Horse(weight, age, color, gender, nickName)
        //Класс Farm2(address, cows, horses, sheep, OwnerName)
        //2 Farm2 тузунуз.
        //1-Farmда 3 sheep, 5 cows, 2 horses болсун.
        //2-Farmда 1 sheep, 1 cow, 1 horse болсун.
       Cow cow=new Cow(110,9,"famele","cow1");
       Cow cow1=new Cow(109,10,"male","cow2");
       Cow cow2=new Cow(99,11,"male","cow3");
        Cow cow3=new Cow(109,10,"male","cow4");
        Cow cow4=new Cow(98,8,"male","cow5");
        Cow cow5=new Cow(88,13,"male","cow6");
Cow []cows={cow,cow1,cow2,cow3,cow4};
Cow[]cows1={cow5};

       Horse horse=new Horse(120,12,"black","male","horse1");
        Horse horse1=new Horse(120,12,"black","male","horse2");
        Horse[]horses={horse,horse1};
      Horse[]horses1={horse};
       Sheep sheep=new Sheep(68, 4,"famale","sheep1");
        Sheep sheep1=new Sheep(68, 4,"famale","sheep2");
        Sheep sheep2=new Sheep(68, 4,"famale","sheep3");
        Sheep sheep3=new Sheep(68, 4,"famale","sheep4");
        Sheep[]sheeps={sheep3,sheep1,sheep2};
    Sheep []sheeps1={sheep};


        Farm farm=new Farm("Perova",cows,horses,sheeps,"Aizirek");
        System.out.println(farm);
        Farm farm1=new Farm("Novocosino",cows1,horses1,sheeps1,"Aizirek");
        System.out.println(farm1);
    }
}