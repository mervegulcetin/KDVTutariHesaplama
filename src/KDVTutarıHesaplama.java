import java.util.Scanner;

public class KDVTutarıHesaplama {

    public static void main(String[] args) {
        double tutar,kdvOran, kdvTutar, kdvliTutar;
        System.out.println("lütfen ücret tutarını giriniz: ");
        Scanner inp=new Scanner(System.in);
        tutar=inp.nextDouble();
        kdvOran=(tutar>=1000)?0.08:0.18;
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("KDV'li tutar: "+kdvliTutar);



    }
}
