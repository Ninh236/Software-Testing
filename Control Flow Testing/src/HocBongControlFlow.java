 public class HocBongControlFlow {

    public String xepLoaiHocBong(double GPA, int DRL) {
        boolean inputError = false;

        if (GPA < 0 || GPA > 10) {
            inputError = true;
        }
        if (DRL < 0 || DRL > 100) {
            inputError = true;
        }
        if (inputError) {
            System.out.println("Lỗi đầu vào");
            return "Lỗi đầu vào";
        } else if (GPA >= 9 && DRL >= 90) {
            System.out.println("Học bổng Xuất sắc");
            return "Học bổng Xuất sắc";
        } else if (GPA >= 8 && DRL >= 80) {
            System.out.println("Học bổng Giỏi");
            return "Học bổng Giỏi";
        } else if (GPA >= 7 && DRL >= 70) {
            System.out.println("Học bổng Khá");
            return "Học bổng Khá";
        } else if (GPA >= 5 && DRL >= 60) {
            System.out.println("Học bổng Trung bình");
            return "Học bổng Trung bình";
        } else {
            System.out.println("Không được học bổng");
            return "Không được học bổng";
        }
    }
}