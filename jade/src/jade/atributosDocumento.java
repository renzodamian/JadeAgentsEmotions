/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

/**
 *
 * @author USUARIO
 */
public class atributosDocumento {

    private int intTristes;
    private int intNeutro;
    private int intAlegre;
    private int intSorpresa;
    private int intGratitud;
    private int intIra;
    private int intVengaza;
    /**
     * Mas variables se los sentimiento
     */

    /**/
    private double dblporcentajeT;
    private double dblporcentajeN;
    private double dblporcentajeA;
    private double dblporcentajeSor;
    private double dblporcentajeGra;
    private double dblporcentajeIra;
    private double dblporcentajeVeng;

    private double dblpromedio;

    public atributosDocumento(int intTristes, int intNeutro, int intAlegre,
            int intSorpresa, int intGratitud, int intIra,
            int intVengaza, double dblporcentajeT,
            double dblporcentajeN, double dblporcentajeA,
            double dblporcentajeSor,
            double dblporcentajeGra, double dblporcentajeIra, double dblporcentajeVeng, double dblpromedio) {
        this.intTristes = intTristes;
        this.intNeutro = intNeutro;
        this.intAlegre = intAlegre;

        this.intSorpresa = intSorpresa;
        this.intGratitud = intGratitud;

        this.intIra = intIra;
        this.intVengaza = intVengaza;
        this.dblporcentajeT = dblporcentajeT;
        this.dblporcentajeN = dblporcentajeN;
        this.dblporcentajeA = dblporcentajeA;

        this.dblporcentajeSor = dblporcentajeSor;
        this.dblporcentajeGra = dblporcentajeGra;

        this.dblporcentajeIra = dblporcentajeIra;
        this.dblporcentajeVeng = dblporcentajeVeng;
        this.dblpromedio = dblpromedio;
    }

  
    public int getIntSorpresa() {
        return intSorpresa;
    }

    public void setIntSorpresa(int intSorpresa) {
        this.intSorpresa = intSorpresa;
    }

    public int getIntGratitud() {
        return intGratitud;
    }

    public void setIntGratitud(int intGratitud) {
        this.intGratitud = intGratitud;
    }

  

    public int getIntIra() {
        return intIra;
    }

    public void setIntIra(int intIra) {
        this.intIra = intIra;
    }

    public int getIntVengaza() {
        return intVengaza;
    }

    public void setIntVengaza(int intVengaza) {
        this.intVengaza = intVengaza;
    }



    public double getDblporcentajeSor() {
        return dblporcentajeSor;
    }

    public void setDblporcentajeSor(double dblporcentajeSor) {
        this.dblporcentajeSor = dblporcentajeSor;
    }

    public double getDblporcentajeGra() {
        return dblporcentajeGra;
    }

    public void setDblporcentajeGra(double dblporcentajeGra) {
        this.dblporcentajeGra = dblporcentajeGra;
    }



    public double getDblporcentajeIra() {
        return dblporcentajeIra;
    }

    public void setDblporcentajeIra(double dblporcentajeIra) {
        this.dblporcentajeIra = dblporcentajeIra;
    }

    public double getDblporcentajeVeng() {
        return dblporcentajeVeng;
    }

    public void setDblporcentajeVeng(double dblporcentajeVeng) {
        this.dblporcentajeVeng = dblporcentajeVeng;
    }

    public int getIntTristes() {
        return intTristes;
    }

    public void setIntTristes(int intTristes) {
        this.intTristes = intTristes;
    }

    public int getIntNeutro() {
        return intNeutro;
    }

    public void setIntNeutro(int intNeutro) {
        this.intNeutro = intNeutro;
    }

    public int getIntAlegre() {
        return intAlegre;
    }

    public void setIntAlegre(int intAlegre) {
        this.intAlegre = intAlegre;
    }

    public double getDblporcentajeT() {
        return dblporcentajeT;
    }

    public void setDblporcentajeT(double dblporcentajeT) {
        this.dblporcentajeT = dblporcentajeT;
    }

    public double getDblporcentajeN() {
        return dblporcentajeN;
    }

    public void setDblporcentajeN(double dblporcentajeN) {
        this.dblporcentajeN = dblporcentajeN;
    }

    public double getDblporcentajeA() {
        return dblporcentajeA;
    }

    public void setDblporcentajeA(double dblporcentajeA) {
        this.dblporcentajeA = dblporcentajeA;
    }

    public double getDblpromedio() {
        return dblpromedio;
    }

    public void setDblpromedio(double dblpromedio) {
        this.dblpromedio = dblpromedio;
    }

}
