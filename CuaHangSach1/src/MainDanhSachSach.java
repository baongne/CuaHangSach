
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class MainDanhSachSach {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        DanhSachSach dss1 = new DanhSachSach();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.docDuLieuTuFileTruyen(f);

        DanhSachSach dss2 = new DanhSachSach();
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.docDuLieuTuFileSGK(a);

        DanhSachSach dss3 = new DanhSachSach();
        File b = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.docDuLieuTuFileSTK(b);

        DanhSachSach dss = new DanhSachSach();
        dss.gopdss(dss1, dss2, dss3);

        int luaChon = 0;
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Them sach vao danh sach.\n"
                    + "2.In danh sach sach ra man hinh.\n"
                    + "3.Kiem tra sach co ton tai trong danh sach hay khong, dua tren ma sach.\n"
                    + "4. Xoa mot sach ra khoi danh sách dua tren ma sach.\n"
                    + "5.Xoa mot sach ra khoi danh sach dua tren STT .\n"
                    + "6.Sua sach.\n"
                    + "7.Tim kiem sach dua theo ma sach. \n"
                    + "8.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    int i = dss.LuaChonThem();
                    if (i == 1) {
                       dss2.themSGK();
                    } else if (i == 2) {
                        dss3.themSTK();
                    } else if (i == 3) {
                        dss1.themTRUYEN();
                    }

                    break;
                case 2:
                    dss.xoaALL();
                    dss.gopdss(dss1, dss2, dss3);
                    dss.xuatHET();

                    break;
                case 3:
                    
                    int k = dss.LuaChonKiemTra();
                    if (k == 1) {
                       dss2.KiemtratontaiMasach();

                    } else if (k == 2) {
                        dss3.KiemtratontaiMasach();
                    } else if (k == 3) {
                        dss1.KiemtratontaiMasach();
                        
                    }

                    break;
                case 4:
                    
                    int j = dss.LuaChonXoa();
                    if (j == 1) {
                       dss2.xoaTheoMa();

                    } else if (j == 2) {
                        dss3.xoaTheoMa();
                    } else if (j == 3) {
                        dss1.xoaTheoMa();
                        
                    }

                    break;
                case 5:
                    int h = dss.LuaChonXoa();
                    if (h == 1) {
                       dss2.xoaTheoSTT();

                    } else if (h == 2) {
                        dss3.xoaTheoSTT();
                    } else if (h == 3) {
                        dss1.xoaTheoSTT();
                        
                    }

                    break;
                case 6:
                    int lc = dss.LuaChonSua();
                    if (lc == 1) {
                    int posi=dss2.traPOSI();
                    dss2.dss[posi].SuaSach();
                    
                    } else if (lc == 2) {
                    int posi=dss3.traPOSI();
                    dss3.dss[posi].SuaSach();
                    } else if (lc == 3) {
                    int posi=dss1.traPOSI();
                    dss1.dss[posi].SuaSach();
                    
                    }
                    
                    break;
                case 7:
                    int l = dss.LuaChonTimKiem();
                    if (l == 1) {
                       dss2.TimkiemMasach();

                    } else if (l == 2) {
                        dss3.TimkiemMasach();
                    } else if (l == 3) {
                        dss1.TimkiemMasach();
                        
                    }
                    break;
                case 8:
                    dss1.ghiDuLieuXuongFile(f);
                    dss1.docDuLieuTuFileTruyen(f);

                    dss2.ghiDuLieuXuongFile(a);
                    dss2.docDuLieuTuFileSGK(a);

                    dss3.ghiDuLieuXuongFile(b);
                    dss3.docDuLieuTuFileSTK(b);
                    break;

            }

        } while (luaChon != 0);
        test.menu();

    }
}
