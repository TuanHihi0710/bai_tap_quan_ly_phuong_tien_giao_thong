public class PhuongTienGiaoThong {
    private String hangSanXuat;
    private int namSanXuat;
    private int giaBan;
    private String mau;
    public PhuongTienGiaoThong(){
    }
    public PhuongTienGiaoThong(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau){
        hangSanXuat=inputHangSanXuat;
        namSanXuat=inputNamSanXuat;
        giaBan=inputGiaBan;
        mau=inputMau;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMau() {
        return mau;
    }
    public void setHangSanXuat(String inputHangSanXuat){
        hangSanXuat=inputHangSanXuat;
    }
    public void setNamSanXuat(int inputNamSanXuat){
        namSanXuat=inputNamSanXuat;
    }
    public void setGiaBan(int inputGiaBan){
        giaBan=inputGiaBan;
    }
    public void setMau(String inputMau){
        mau=inputMau;
    }
}
