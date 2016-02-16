package EntityModels;

import java.io.Serializable;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class Salary implements Serializable {

    private int id;
    private double basic;
    private double hra;
    private double da;
    private double lta;
    private double pf;
    private double fp;
    private double gratuity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getLta() {
        return lta;
    }

    public void setLta(double lta) {
        this.lta = lta;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public double getFp() {
        return fp;
    }

    public void setFp(double fp) {
        this.fp = fp;
    }

    public double getGratuity() {
        return gratuity;
    }

    public void setGratuity(double gratuity) {
        this.gratuity = gratuity;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", basic=" + basic +
                ", hra=" + hra +
                ", da=" + da +
                ", lta=" + lta +
                ", pf=" + pf +
                ", fp=" + fp +
                ", gratuity=" + gratuity +
                '}';

    }

    public void calculateSalary(double basic) {
        hra = 0.05 * basic;
        da = 0.08 * basic;
        lta = 0.10 * basic;
        pf = 0.125 * basic;
        fp = 0.03 * basic;
        gratuity = 0.15 * basic;

    }


}
