package b2;

import java.util.Scanner;

public class ThiSinh {
	private String maTS;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    

   

	public ThiSinh(String maTS, String hoTen, double diemToan, double diemLy, double diemHoa) {
	
		this.maTS = maTS;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}


	

	public ThiSinh() {
		
	}




	public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã TS: ");
        maTS = sc.nextLine();

        System.out.print("Họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("Điểm Toán: ");
        diemToan = sc.nextDouble();

        System.out.print("Điểm Lý: ");
        diemLy = sc.nextDouble();

        System.out.print("Điểm Hóa: ");
        diemHoa = sc.nextDouble();
    }

    public double tongDiem() {
        return diemToan + diemLy + diemHoa;
    }

    public boolean kiemTraDau() {
        return tongDiem() >= 15 && diemToan >= 3 && diemLy >= 3 && diemHoa >= 3;
    }

    public void xuat() {
        System.out.printf("%s | %s | Toán: %.1f | Lý: %.1f | Hóa: %.1f | Tổng: %.1f%n",
                maTS, hoTen, diemToan, diemLy, diemHoa, tongDiem());
    }

   
}
