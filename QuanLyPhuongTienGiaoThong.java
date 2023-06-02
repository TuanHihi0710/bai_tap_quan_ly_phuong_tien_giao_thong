import java.util.ArrayList;
import java.util.List;

public class QuanLyPhuongTienGiaoThong {
    private List<Oto> danhSachOto;
    private List<XeMay> danhSachXeMay;
    private List<XeTai> danhSachXeTai;
    public QuanLyPhuongTienGiaoThong(){
        danhSachOto= new ArrayList<>();
        danhSachXeMay = new ArrayList<>();
        danhSachXeTai = new ArrayList<>();
    }
    public void NhapThongTinOto(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau, int inputSoChoNgoi, String inputKieuDongCo){
        Oto oto = new Oto(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputSoChoNgoi,inputKieuDongCo);
        danhSachOto.add(oto);
    }
    public void NhapThongTinXeMay(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau, int inputCongSuat){
        XeMay xeMay = new XeMay(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputCongSuat);
        danhSachXeMay.add(xeMay);
    }
    public void NhapThongTinXeTai(String inputHangSanXuat, int inputNamSanXuat, int inputGiaBan, String inputMau,int inputTrongTai){
        XeTai xeTai = new XeTai(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputTrongTai);
        danhSachXeTai.add(xeTai);
    }
    public void XuatThongTinOto(){
        for (int i = 0; i < danhSachOto.size(); i++) {
            danhSachOto.get(i).ThongTinOto();
        }
    }
    public void XuatThongTinXeMay(){
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            danhSachXeMay.get(i).ThongTinXeMay();
        }
    }
    public void XuatThongTinXeTai(){
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            danhSachXeTai.get(i).ThongTinXeTai();
        }
    }
    public void TimKiemTheoMau(String inputMauXe){
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getMau().equals(inputMauXe)) {
                danhSachOto.get(i).ThongTinOto();
            }
        }
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if(danhSachXeMay.get(i).getMau().equals(inputMauXe)) {
                danhSachXeMay.get(i).ThongTinXeMay();
            }
        }
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            if (danhSachXeTai.get(i).getMau().equals(inputMauXe)) {
                danhSachXeTai.get(i).ThongTinXeTai();
            }
        }
    }
}
