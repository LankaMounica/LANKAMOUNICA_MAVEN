public class Candy implements Units {
    double weight;
    double energy;
    double protein;
    double carbohydrates;
    double fats;
}

class caramels extends Candy{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 100*n;
        energy = 5.4*n;
        protein = 5.0*n;
        carbohydrates = 78.0*n;
        fats = 8.0*n;
    }
}

class licorice extends Candy{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 14*n;
        energy = 3.2*n;
        protein = 0.0*n;
        carbohydrates = 13.0*n;
        fats = 0.0*n;
    }
}

class gummies extends Candy{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 34*n;
        energy = 2.7*n;
        protein = 2.3*n;
        carbohydrates = 31.0*n;
        fats = 0.0*n;
    }
}

