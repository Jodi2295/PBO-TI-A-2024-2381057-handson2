public class SwitchStatement {
    public static void main(String[] args) {

        String namaHari = "";

        switch (nomorHari){
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;

            default:
                System.out.println("Masukkan nomor antara 1 - 7");
                System.exit(0);
        }
        System.out.println("Hari : " + namaHari);
    }
}