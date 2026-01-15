package b2;

import java.util.Scanner;

public class Main {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Nhập số thí sinh: ");
		        int n = sc.nextInt();
		        ThiSinh[] ds = new ThiSinh[n];
		       
		        int chon;
                int them=0;
		        do {
		            System.out.println("\n===== MENU =====");
		            System.out.println("1. Thêm sinh viên");
		            System.out.println("2. Hiển thị danh sách");
		            System.out.println("3. Sinh viên điểm TB cao nhất");
		            System.out.println("4. Sắp xếp theo điểm TB giảm dần");
		            System.out.println("0. Thoát");
		            System.out.print("Chọn: ");
		            chon = sc.nextInt();

		            switch (chon) {
		                case 1:
		                	
		                	ds[them] = new ThiSinh();
		                    ds[them].nhap();
		                   
		                	them++;
		                    
		                    break;

		                case 2:
		                    for (int i = 0; i < them; i++)
		                        ds[i].xuat();
		                 break;

		                case 3:
		                    
		                    ThiSinh max = ds[0];
		                    for (int i = 1; i < n; i++)
		                        if (ds[i].tongDiem() > max.tongDiem())
		                            max = ds[i];
		                    max.xuat();
		                    break;

		                case 4:
		                    for (int i = 0; i < n - 1; i++)
		                        for (int j = i + 1; j < n; j++)
		                            if (ds[i].tongDiem() < ds[j].tongDiem()) {
		                                ThiSinh tmp = ds[i];
		                                ds[i] = ds[j];
		                                ds[j] = tmp;
		                            }
		                    System.out.println("Danh sách sau khi sắp xếp:");
		                    for (int i = 0; i < them; i++) {
		                        ds[i].xuat();
		                    }
		                    break;
		            }
		        } while (chon != 0);
		    }
		


	}


