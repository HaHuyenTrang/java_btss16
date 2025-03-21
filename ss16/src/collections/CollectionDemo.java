package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. KHai báo 1 đối tượng từ List Interface và lớp triển khai ArrayList

        /*
            Ưu điểm: Linh hoạt -> Chuyen doi du lieu đơn giản, maintain và mở rộng
            Nhược điểm: Chỉ sử dụng được cac phương thức của List
         */
        List<Student> listStudents = new ArrayList<Student>();

        // 2. Khai báo 1 đôi tượng từ lớp ArrayList
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("SV001", "Doe", 23);
        Student student2 = new Student("SV002", "Jack", 24);
        Student student3 = new Student("SV003", "Huyen", 25);
        Student student4 = new Student("SV004", "Trang", 26);

        // 1. boolean add(Object obj)
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);

        students.add(student4);
        students.add(student1);

        // 2. boolean addAll(Collection c) thêm 1 danh sách vào danh sách hiện tại
        listStudents.addAll(students);

        // 3. boolean remove(Object obj): Xóa đối tượng trong danh sách
        listStudents.remove(student1);

        // 4. boolean removeAll(Object obj): Xóa đối tượng danh sach trong danh sách
        listStudents.removeAll(students);

        // 5. int size(): Trả về số lượng trong danh sách
        System.out.println(listStudents.size());

        // 6. void clear: Xóa sach tất cả phần tử trong danh sách
//        listStudents.clear();

        // 7. boolean contains(Object obj): Kiểm tra sv2 có trong ds không
        System.out.println(listStudents.contains(student2));

        // 8. void add(int index, Object obj): Chèn phần tử vào chỉ số index
        listStudents.add(1, student1);

        // 9. Object get(int index): Lấy phan tử tại chỉ so index
        System.out.println(listStudents.get(1).getStudentName());

        // 10. Object set(int index, Object obj): Đè obj vào phâ tử có chỉ số index
        listStudents.set(1, student4);

        // 11. Object remove(int index): Xóa phần tử tại vị trí index
        listStudents.remove(1);

        // 12. Interator
        Iterator<Student> itrStudent = listStudents.iterator();

        // Thông tin các phần tử trong danh sach
        while(itrStudent.hasNext()) {
            Student student = itrStudent.next();
            System.out.println(student.getStudentName());
        }
    }
}
