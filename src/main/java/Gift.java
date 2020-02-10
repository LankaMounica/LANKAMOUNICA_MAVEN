import java.util.*;
public class Gift {
    public static void main(String[] args){
        String[] Candy = {"caramels", "licorice", "Gummies"};
        String[] Chocolates = {"white_chocolate", "dark_chocolate", "milk_chocolate"};
        String[] Sweets = {"rasagulla", "burfi", "rasmalai"};
        int size=3;
        ArrayList<Double> weight = new ArrayList<Double>(size);
        for(int a =0;a<3;a++){
            Random r = new Random();
            int x = r.nextInt(20);
            double total_weight = 0;
            String i1 = Candy[a];
            String i2 = Chocolates[a];
            String i3 = Sweets[a];
            System.out.println("\n*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println("         Your Freebie surprises you with"+(a+1)+" ");
            System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");

            switch(i1){
                case "caramels":
                    caramels obj1 = new caramels();
                    obj1.calculate(x);
                    total_weight+=obj1.display();
                    System.out.println(i1+" : "+obj1.display());
                    break;
                case "licorice":
                    licorice obj2 = new licorice();
                    obj2.calculate(x);
                    total_weight += obj2.display();
                    System.out.println(i3+" : "+obj2.display());
                    break;
                case "gummies":
                    gummies obj3 = new gummies();
                    obj3.calculate(x);
                    total_weight+=obj3.display();
                    System.out.println(i2+" : "+obj3.display());
                    break;
            }

            switch(i2){
                case "white_chocolate":
                    white_chocolate obj1 = new white_chocolate();
                    obj1.calculate(x);
                    total_weight+=obj1.display();
                    System.out.println(i2+" : "+obj1.display());
                    break;
                case "milk_chocolate":
                    milk_chocolate obj2 = new milk_chocolate();
                    obj2.calculate(x);
                    total_weight += obj2.display();
                    System.out.println(i3+" : "+obj2.display());
                    break;
                case "dark_chocolate":
                    dark_chocolate obj3 = new dark_chocolate();
                    obj3.calculate(x);
                    total_weight+=obj3.display();
                    System.out.println(i1+" : "+obj3.display());
                    break;
            }

            switch(i3){
                case "rasagulla":
                    rasagulla obj1 = new rasagulla();
                    obj1.calculate(x);
                    total_weight+=obj1.display();
                    System.out.println(i3+" : "+obj1.display());
                    break;
                case "burfi":
                    burfi obj2 = new burfi();
                    obj2.calculate(x);
                    total_weight += obj2.display();
                    System.out.println(i1+" : "+obj2.display());
                    break;
                case "rasmalai":
                    rasmalai obj3 = new rasmalai();
                    obj3.calculate(x);
                    total_weight+=obj3.display();
                    System.out.println(i2+" : "+obj3.display());
                    break;
            }
            weight.add(total_weight);
            System.out.println("Weight of Giftbag:1 is "+total_weight);
        }
        ArrayList<String> gifts=new ArrayList<String>(Arrays.asList("Giftbag:1", "Giftbag:2", "Giftbag:3"));
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
        System.out.println("       Sorted list of Gifbags according to their weights ::");
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
        while(!weight.isEmpty()){
            int min = weight.indexOf(Collections.min(weight));
            String w = String.format("%,.2f",weight.get(min));
            System.out.println(gifts.get(min)+" : "+w);
            weight.remove(weight.get(min));
            gifts.remove(min);
        }
    }

}
