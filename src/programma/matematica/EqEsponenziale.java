package programma.matematica;

import java.text.*;

public class EqEsponenziale {

    private double A;
    private double B;
    private double soluzione = Double.NaN;
    private String rapA;
    private String rapB;
    private String rapEquazione;
    private int tipo;
    private DecimalFormat df;

    public EqEsponenziale(String format) {
        df = new DecimalFormat(format);
    }

    public void setFormat(String format) {
        df = new DecimalFormat(format);
    }

    public void setRapA() {
        rapA = df.format(A);
    }

    public void setRapB() {
        rapB = df.format(B);
    }

    public void setRapEquazione() {
        setRapA();
        setRapB();
        rapEquazione = (tipo == 1 ? ("y=" + rapA + "^x" + (A >= 0 ? "+" : "") + rapB) : (tipo == 0 ? ("y=" + rapA + "^x") : ""));
    }

    public String getRapEquazione() {
        setRapEquazione();
        return rapEquazione;
    }

    public String getRapEquazioneWoY() {
        setRapEquazione();
        String eq = rapEquazione.substring(2);
        return eq;
    }

    public void setTipo(int tipo) {
        if (tipo != 0 && tipo != 1) {
        } else {
            this.tipo = tipo;
        }
    }

    public int getTipo() {
        return tipo;
    }
    
    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public void setSoluzione() {
        try {
            if (tipo == 1) {
                if (A == 0.0 || A == 1.0) {
                    soluzione = Double.NaN;

                } else if (B < 0.0) {
                        soluzione = (Math.log10(-B) / Math.log10(A));
                } else {
                    soluzione = Double.NaN;
                }

            } else {
                soluzione = Double.NaN;
            }
        } catch (Exception e) {
        }

    }

    public double getSoluzione() {
        return soluzione;
    }

}
