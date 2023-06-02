import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPhuongTienGiaoThong quanLyPhuongTienGiaoThong = new QuanLyPhuongTienGiaoThong();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 2 để chọn Menu:");
                System.out.println("1: Nhập thông tin phuong tien");
                System.out.println("2: Xuat thong tin phuong tien");
                System.out.println("3: Tim kiem phuong tien theo mau");
                System.out.println("4: Thoat");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhap thong tin phuong tien");
                    System.out.println("1: Nhap thong tin xe oto");
                    System.out.println("2: Nhap thong tin xe may");
                    System.out.println("3: Nhap thong tin xe tai");
                    int chon = sc.nextInt();
                    if (chon < 1 || chon > 3) {
                        System.out.println("Nhap sai gia tri vui long nhap lai");
                    } else if (chon ==1) {
                        System.out.println("Nhap thong tin xe oto");
                        System.out.println("Nhap thong tin hang san xuat");
                        Scanner scHangSanXuat = new Scanner(System.in);
                        String inputHangSanXuat = scHangSanXuat.nextLine();
                        System.out.println("Nhap thong tin nam san xuat");
                        Scanner scNamSanXuat = new Scanner(System.in);
                        int inputNamSanXuat = scNamSanXuat.nextInt();
                        System.out.println("Nhap gia ban");
                        Scanner scGiaBan = new Scanner(System.in);
                        int inputGiaBan = scGiaBan.nextInt();
                        System.out.println("Nhap mau xe");
                        Scanner scMau = new Scanner(System.in);
                        String inputMau = scMau.nextLine();
                        System.out.println("Nhap so cho ngoi");
                        Scanner scSoChoNgoi = new Scanner(System.in);
                        int inputSoChoNgoi = scSoChoNgoi.nextInt();
                        System.out.println("Nhap kieu dong co");
                        Scanner scKieuDongCo = new Scanner(System.in);
                        String inputKieuDongCo = scKieuDongCo.nextLine();
                        quanLyPhuongTienGiaoThong.NhapThongTinOto(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputSoChoNgoi,inputKieuDongCo);
                    } else if (nhap == 2) {
                        System.out.println("Nhap thong tin xe may");
                        System.out.println("Nhap thong tin hang san xuat");
                        Scanner scHangSanXuat = new Scanner(System.in);
                        String inputHangSanXuat = scHangSanXuat.nextLine();
                        System.out.println("Nhap thong tin nam san xuat");
                        Scanner scNamSanXuat = new Scanner(System.in);
                        int inputNamSanXuat = scNamSanXuat.nextInt();
                        System.out.println("Nhap gia ban");
                        Scanner scGiaBan = new Scanner(System.in);
                        int inputGiaBan = scGiaBan.nextInt();
                        System.out.println("Nhap mau xe");
                        Scanner scMau = new Scanner(System.in);
                        String inputMau = scMau.nextLine();
                        System.out.println("Nhap vao cong xuat xe");
                        Scanner scCongXuat = new Scanner(System.in);
                        int inputCongXuat = scCongXuat.nextInt();
                        quanLyPhuongTienGiaoThong.NhapThongTinXeMay(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputCongXuat);
                    } else if (nhap ==3) {
                        System.out.println("Nhap thong tin xe tai");
                        System.out.println("Nhap thong tin hang san xuat");
                        Scanner scHangSanXuat = new Scanner(System.in);
                        String inputHangSanXuat = scHangSanXuat.nextLine();
                        System.out.println("Nhap thong tin nam san xuat");
                        Scanner scNamSanXuat = new Scanner(System.in);
                        int inputNamSanXuat = scNamSanXuat.nextInt();
                        System.out.println("Nhap gia ban");
                        Scanner scGiaBan = new Scanner(System.in);
                        int inputGiaBan = scGiaBan.nextInt();
                        System.out.println("Nhap mau xe");
                        Scanner scMau = new Scanner(System.in);
                        String inputMau = scMau.nextLine();
                        System.out.println("Nhap vao trong tai xe");
                        Scanner scTrongTai = new Scanner(System.in);
                        int inputTrongTai = scTrongTai.nextInt();
                        quanLyPhuongTienGiaoThong.NhapThongTinXeTai(inputHangSanXuat,inputNamSanXuat,inputGiaBan,inputMau,inputTrongTai);
                    }
                } else if (nhap==2) {
                    System.out.println("Xuat thong tin xe");
                    System.out.println("1: Xuat thong tin xe oto");
                    System.out.println("2: Xuat thong tin xe may");
                    System.out.println("3: Xuat thong tin xe tai");
                    int chonGiaTri = sc.nextInt();
                    if (chonGiaTri < 1 || chonGiaTri > 3) {
                        System.out.println("Nhap sai gia tri vui long nhap lai");
                    } else if (chonGiaTri ==1) {
                        System.out.println("Xuat thong tin xe oto");
                        quanLyPhuongTienGiaoThong.XuatThongTinOto();
                    } else if (chonGiaTri==2) {
                        System.out.println("Xuat thong tin xe may");
                        quanLyPhuongTienGiaoThong.XuatThongTinXeMay();
                    } else if (chonGiaTri==3) {
                        System.out.println("Xuat thong tin xe tai");
                        quanLyPhuongTienGiaoThong.XuatThongTinXeTai();
                    }
                } else if (nhap==3) {
                    System.out.println("Tim kiem xe theo mau");
                    System.out.println("Nhap mau xe");
                    Scanner scMau = new Scanner(System.in);
                    String inputMau = scMau.nextLine();
                    quanLyPhuongTienGiaoThong.TimKiemTheoMau(inputMau);
                }
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 4);
    }
}