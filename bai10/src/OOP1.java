import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class CucXuong {
    private String loai;

    public CucXuong(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }
}

// Class CucPhan
class CucPhan {
    private static int count = 0;
    private int id;

    public CucPhan() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }
}

// Class ConCho
class ConCho {
    private String ten;
    private int tuoi;

    public ConCho(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    // 1. Tự tổ chức sinh nhật
    public void tuToChucSinhNhat() {
        this.tuoi++;
        System.out.println(ten + " tự tổ chức sinh nhật! Tuổi mới: " + tuoi);
    }


    public void toChucSinhNhatConChoKhac(ConCho conKhac) {
        conKhac.tuoi++;
        System.out.println(this.ten + " tổ chức sinh nhật cho " + conKhac.ten +
                ". Tuổi mới của nó: " + conKhac.tuoi);
    }


    public void anXuong(CucXuong x) {
        System.out.println(ten + " ăn 1 cục xương loại: " + x.getLoai());
    }


    public void anNhieuXuong(List<CucXuong> dsXuong) {
        System.out.println(ten + " ăn " + dsXuong.size() + " cục xương!");
        for (int i = 0; i < dsXuong.size(); i++) {
            System.out.println(" - Cục xương " + (i + 1) + ": " + dsXuong.get(i).getLoai());
        }
    }


    public CucPhan anXuong2(CucXuong x) {
        System.out.println(ten + " ăn xương và thải ra 1 cục phân!");
        return new CucPhan();
    }


    public List<CucPhan> anXuong3(CucXuong x) {
        System.out.println(ten + " ăn xương và thải ra nhiều cục phân!");
        List<CucPhan> dsPhan = new ArrayList<>();
        dsPhan.add(new CucPhan());
        dsPhan.add(new CucPhan());
        dsPhan.add(new CucPhan());
        return dsPhan;
    }

    @Override
    public String toString() {
        return "ConCho{ten='" + ten + "', tuoi=" + tuoi + "}";
    }
}

// Class Main để test
public class OOP1 {
    public static void main(String[] args) {

        ConCho cho1 = new ConCho("Milu", 2);
        ConCho cho2 = new ConCho("Vang", 3);

        // Test sinh nhật
        cho1.tuToChucSinhNhat();
        cho1.toChucSinhNhatConChoKhac(cho2);

        // Tạo xương
        CucXuong x1 = new CucXuong("Xương bò");
        CucXuong x2 = new CucXuong("Xương gà");
        CucXuong x3 = new CucXuong("Xương heo");

        // Test ăn xương
        cho1.anXuong(x1);

        // Test ăn nhiều xương (dùng List)
        List<CucXuong> dsXuong = Arrays.asList(x1, x2, x3);
        cho1.anNhieuXuong(dsXuong);

        // Test ăn xương -> trả về 1 cục phân
        CucPhan p1 = cho1.anXuong2(x1);
        System.out.println("Cục phân nhận được: ID = " + p1.getId());

        // Test ăn xương -> trả về nhiều cục phân
        List<CucPhan> dsPhan = cho1.anXuong3(x2);
        System.out.println("Số cục phân nhận được: " + dsPhan.size());
        for (CucPhan p : dsPhan) {
            System.out.println(" - Cục phân ID: " + p.getId());
        }
    }
}
