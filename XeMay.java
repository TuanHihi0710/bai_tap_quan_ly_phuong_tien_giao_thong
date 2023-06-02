public class XeMay extends PhuongTienGiaoThong{
    private int congSuat;
    public XeMay(){}
    public XeMay(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau, int inputCongSuat){
        super(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau);
        congSuat=inputCongSuat;
    }
    public int getCongSuat(){
        return congSuat;
    }
    public void setCongSuat(int inputCongSuat){
        congSuat=inputCongSuat;
    }
    public void ThongTinXeMay(){
        System.out.println("Hang san xuat: "+getHangSanXuat());
        System.out.println("Nam san xuat: "+getNamSanXuat());
        System.out.println("Gia ban: "+getGiaBan());
        System.out.println("Mau: "+getMau());
        System.out.println("Cong suat: "+getCongSuat());
    }
}
