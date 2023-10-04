import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocBongControlFlowTest {

    @Test
    void testXepLoaiHocBong() {
        HocBong hocBong = new HocBong();
        // Test case 1
        assertEquals("Lỗi đầu vào", hocBong.xepLoaiHocBong(-1, 40));

        // Test case 2
        assertEquals("Học bổng Xuất sắc", hocBong.xepLoaiHocBong(9.5, 90));

        // Test case 3
        assertEquals("Học bổng Giỏi", hocBong.xepLoaiHocBong(8.5, 85));

        // Test case 4
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(7.5, 75));

        // Test case 5
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(6, 80));

        // Test case 6
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(7, 55));
    }
}