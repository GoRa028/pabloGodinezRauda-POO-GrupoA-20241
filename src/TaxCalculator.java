public class TaxCalculator {

    public double calculateTaxes(int inc) {
        return inc*0.15;
    }

    public double calculateTaxes(int inc, double taxPer) {
        return inc*(taxPer/100);
    }

    public double calculateTaxes(double div, double taxPer, double ex) {
        double tax = div*(taxPer/100);

        if(tax>ex) {
            return tax-ex;
        } else {
            return 0;
        }

    }


}
