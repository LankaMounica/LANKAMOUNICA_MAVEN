public class Sweets implements Units {
    double weight;
    double energy;
    double protein;
    double carbohydrates;
    double fats;
}

class rasagulla extends Sweets{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 9*n;
        energy = 106*n;
        protein = 2.4*n;
        carbohydrates = 14.8*n;
        fats = 3.3*n;
    }
}

class burfi extends Sweets{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 100*n;
        energy = 106*n;
        protein = 16*n;
        carbohydrates = 153*n;
        fats = 17*n;
    }
}

class rasmalai extends Sweets{
    public double display(){
        return weight;
    }
    public void calculate(int n){
        weight = 11*n;
        energy = 331*n;
        protein = 8.7*n;
        carbohydrates = 33.6*n;
        fats = 13.1*n;
    }
}

