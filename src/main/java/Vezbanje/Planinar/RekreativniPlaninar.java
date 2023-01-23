package Vezbanje.Planinar;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;

    public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpreme, String okrug, int maxUspon) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    @Override
    public boolean uspesanUspon(Planina p){
        int hendikepOpreme = this.tezinaOpreme * 50;
        if(maxUspon > p.getVisina() + hendikepOpreme){
            return true;
        }
        return false;
    }
    @Override
    public double vratiClanarinu(){
        return 1000;
    }

    @Override
    public void stampaj(){
        System.out.println("Rekreativac, id: " + this.id);
        System.out.println(this.imeIPrezime);
        System.out.println("Okrug: " + this.okrug);
        System.out.println("--------------------------");
    }

}
