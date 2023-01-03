package Project_XO;

import java.util.ArrayList;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeX;
    private String imeO;
    private String naPotezu;

    public String getImeO() {
        return imeO;
    }
    public void setImeO(String imeO) {
        this.imeO = imeO;
    }
    public String getImeX() {
        return imeX;
    }
    public void setImeX(String imeX) {
        this.imeX = imeX;
    }
    public String getPolje1() {
        return polje1;
    }
    public void setPolje1(String polje1) {
        this.polje1 = polje1;
    }
    public String getNaPotezu() {
        return naPotezu;
    }

    public void pokreniIgru(){
        polje1 = " ";
        polje2 = " ";
        polje3 = " ";
        polje4 = " ";
        polje5 = " ";
        polje6 = " ";
        polje7 = " ";
        polje8 = " ";
        polje9 = " ";
        naPotezu = "X";
    }
    public void stampaj(){
        System.out.print(polje1 + " | " + polje2 + " | " + polje3);
        System.out.println(" ");
        System.out.print(polje4 + " | " + polje5 + " | " + polje6);
        System.out.println(" ");
        System.out.print(polje7 + " | " + polje8 + " | " + polje9);
        System.out.println(" ");

        System.out.println(" ");

        System.out.println("Igrac X: " + imeX);
        System.out.println("Igrac O:" + imeO);

        System.out.println("Na potezu igrac " + naPotezu);

        System.out.print("Odigraj potez: ");
    }
    public boolean poljePrazno(int index){

       if(index == 1 && polje1.equals(" ")){
           return true;
       } else if (index == 2 && polje2.equals(" ")) {
           return true;
       } else if (index == 3 && polje3.equals(" ")) {
            return true;
       } else if (index == 4 && polje4.equals(" ")) {
            return true;
       } else if (index == 5 && polje5.equals(" ")) {
            return true;
       } else if (index == 6 && polje6.equals(" ")) {
            return true;
       } else if (index == 7 && polje7.equals(" ")) {
            return true;
       } else if (index == 8 && polje8.equals(" ")) {
            return true;
       } else if (index == 9 && polje9.equals(" ")) {
            return true;
       }
       return false;
    }
    public void zameniIgraca(){
        if(naPotezu.equals("X")){
            naPotezu = "O";
        }else {
            naPotezu = "X";
        }
    }
    public void odigrajPotez(int potez){

       if(poljePrazno(potez)){
          if(potez == 1){
              polje1 = naPotezu;
          }else if (potez == 2){
              polje2 = naPotezu;
          }else if (potez == 3){
              polje3 = naPotezu;
          }else if (potez == 4){
              polje4 = naPotezu;
          }else if (potez == 5){
              polje5 = naPotezu;
          }else if (potez == 6){
              polje6 = naPotezu;
          }else if (potez == 7){
              polje7 = naPotezu;
          }else if (potez == 8){
              polje8 = naPotezu;
          }else if (potez == 9){
              polje9 = naPotezu;
          }
       }
    }
    public boolean popunjenaTabla(){
        if(polje1.equals(" ")){
            return false;
        } else if (polje2.equals(" ")) {
            return false;
        }else if (polje3.equals(" ")) {
            return false;
        }else if (polje4.equals(" ")) {
            return false;
        }else if (polje5.equals(" ")) {
            return false;
        }else if (polje6.equals(" ")) {
            return false;
        }else if (polje7.equals(" ")) {
            return false;
        }else if (polje8.equals(" ")) {
            return false;
        }else if (polje9.equals(" ")) {
            return false;
        }else {
            return true;
        }
    }
    public boolean pobednikX(){
        if(polje1.equals("X") && polje2.equals("X") && polje3.equals("X")){
            return true;
        } else if (polje4.equals("X") && polje5.equals("X") && polje6.equals("X")) {
            return  true;
        } else if (polje7.equals("X") && polje8.equals("X") && polje9.equals("X")) {
            return true;
        } else if (polje1.equals("X") && polje4.equals("X") && polje7.equals("X")) {
            return true;
        } else if (polje2.equals("X") && polje5.equals("X") && polje8.equals("X")) {
            return true;
        } else if (polje3.equals("X") && polje6.equals("X") && polje9.equals("X")) {
            return true;
        } else if (polje1.equals("X") && polje5.equals("X") && polje9.equals("X")) {
            return true;
        } else if (polje3.equals("X") && polje5.equals("X") && polje7.equals("X")) {
            return true;
        }
        return false;
    }
    public boolean pobednikO(){
        if(polje1.equals("O") && polje2.equals("O") && polje3.equals("O")){
            return true;
        } else if (polje4.equals("O") && polje5.equals("O") && polje6.equals("O")) {
            return  true;
        } else if (polje7.equals("O") && polje8.equals("O") && polje9.equals("O")) {
            return true;
        } else if (polje1.equals("O") && polje4.equals("O") && polje7.equals("O")) {
            return true;
        } else if (polje2.equals("O") && polje5.equals("O") && polje8.equals("O")) {
            return true;
        } else if (polje3.equals("O") && polje6.equals("O") && polje9.equals("O")) {
            return true;
        } else if (polje1.equals("O") && polje5.equals("O") && polje9.equals("O")) {
            return true;
        } else if (polje3.equals("O") && polje5.equals("O") && polje7.equals("O")) {
            return true;
        }
        return false;
    }




}
