public class XeTai extends PhuongTienGiaoThong{
    private int trongTai;
    public XeTai(){}
    public XeTai(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau,int inputTrongTai){
        super(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau);
        trongTai=inputTrongTai;
    }
    public int getTrongTai(){
        return trongTai;
    }
    public void setTrongTai(int inputTrongTai){
        trongTai=inputTrongTai;
    }
    public void ThongTinXeTai(){
        System.out.println("Hang san xuat: "+getHangSanXuat());
        System.out.println("Nam san xuat: "+getNamSanXuat());
        System.out.println("Gia ban: "+getGiaBan());
        System.out.println("Mau: "+getMau());
        System.out.println("Trong tai: "+getTrongTai());
    }
}
