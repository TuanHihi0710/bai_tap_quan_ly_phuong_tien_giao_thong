public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;
    public Oto(){}
    public Oto(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau, int inputSoChoNgoi, String inputKieuDongCo){
        super(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau);
        soChoNgoi=inputSoChoNgoi;
        kieuDongCo=inputKieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }
    public void setSoChoNgoi(int inputSoChoNgoi){
        soChoNgoi=inputSoChoNgoi;
    }
    public void setKieuDongCo(String inputKieuDongCo){
        kieuDongCo=inputKieuDongCo;
    }
    public void ThongTinOto(){
        System.out.println("Hang san xuat: "+getHangSanXuat());
        System.out.println("Nam san xuat: "+getNamSanXuat());
        System.out.println("Gia ban: "+getGiaBan());
        System.out.println("Mau: "+getMau());
        System.out.println("So cho ngoi: "+getSoChoNgoi());
        System.out.println("Kieu dong co: "+getKieuDongCo());
    }
}
