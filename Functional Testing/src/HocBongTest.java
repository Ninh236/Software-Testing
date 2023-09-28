import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocBongTest {

    @Test
    void testXepLoaiHocBong() {
        HocBong hocBong = new HocBong();
        // Test case 1
        assertEquals("Học bổng Xuất sắc", hocBong.xepLoaiHocBong(9.5, 95));

        // Test case 2
        assertEquals("Học bổng Giỏi", hocBong.xepLoaiHocBong(9.5, 85));

        // Test case 3
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(9.5, 75));

        // Test case 4
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(9.5, 65));

        // Test case 5
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(9.5, 55));

        // Test case 6
        assertEquals("Học bổng Giỏi", hocBong.xepLoaiHocBong(8.5, 95));

        // Test case 7
        assertEquals("Học bổng Giỏi", hocBong.xepLoaiHocBong(8.5, 85));

        // Test case 8
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(8.5, 75));

        // Test case 9
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(8.5, 65));

        // Test case 10
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(8.5, 55));

        // Test case 11
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(7.5, 95));

        // Test case 12
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(7.5, 85));

        // Test case 13
        assertEquals("Học bổng Khá", hocBong.xepLoaiHocBong(7.5, 75));

        // Test case 14
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(7.5, 65));

        // Test case 15
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(7.5, 55));

        // Test case 16
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(6, 95));

        // Test case 17
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(6, 85));

        // Test case 18
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(6, 75));

        // Test case 19
        assertEquals("Học bổng Trung bình", hocBong.xepLoaiHocBong(6, 65));

        // Test case 20
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(6, 55));

        // Test case 21
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(2.5, 95));

        // Test case 22
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(2.5, 85));

        // Test case 23
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(2.5, 75));

        // Test case 24
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(2.5, 65));

        // Test case 25
        assertEquals("Không được học bổng", hocBong.xepLoaiHocBong(2.5, 55));

        // Test case 26
        assertEquals("Lỗi đầu vào", hocBong.xepLoaiHocBong(-2, 50));

        // Test case 27
        assertEquals("Lỗi đầu vào", hocBong.xepLoaiHocBong(11, 70));

        // Test case 28
        assertEquals("Lỗi đầu vào", hocBong.xepLoaiHocBong(7, -4));

        // Test case 29
        assertEquals("Lỗi đầu vào", hocBong.xepLoaiHocBong(8, 105));
    }
}