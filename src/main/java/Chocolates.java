public class Chocolates implements Units {
    double weight;
    double energy;
    double protein;
    double carbohydrates;
    double fats;
}

class white_chocolate extends Chocolates{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 9*n;
        energy = 538.5*n;
        protein = 5.87*n;
        carbohydrates = 59.24*n;
        fats = 32.09*n;
    }
}

class milk_chocolate extends Chocolates{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 100*n;
        energy = 487.0*n;
        protein = 8.0*n;
        carbohydrates = 31.8*n;
        fats = 8.7*n;
    }
}

class dark_chocolate extends Chocolates{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 100*n;
        energy = 530.0*n;
        protein = 6.0*n;
        carbohydrates = 27.3*n;
        fats = 46.2*n;
    }
}

