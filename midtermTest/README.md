# Quản lý giáo viên sinh viên
***(Phan Đức Hải - HaiZuka)***

### Tạo interface IPerson có các hàm:
- int getYearOfBirth() tính năm sinh của Person

### Tạo lớp Person implement IPerson và gồm các thuộc tính: <br>
  - int ID;
  - String name;
  - int age;
  - String address;

### Tạo interface IPerson có các hàm:
- int getYearOfBirth() tính năm sinh của Person

### Tạo lớp Student kế thừa lớp Person, implement IPerson và gồm các thuộc tính:
- int ID;
- String name;
- int age;
- String address;
- float math;
- float physics;
- float chemistry;

### Tạo lớp Teacher kế thừa lớp Person  implement IPerson và gồm các thuộc tính:
- int ID;
- String name;
- int age;
- String address;
- int experience

*(Tất cả các class đều phải có hàm khởi tạo mặc định, khởi tạo có thuộc tính, các hàm getter setter, ngoài ra bạn có thể viết thêm các phương thức khác, Ở class Student nên có hàm getAverage() để tính điểm trung bình của 3 môn, và khi hiện thị thông tin của một Student cũng hiện thị điểm trung bình của ba môn)*



## Viết chương trình quản lý Student, Teacher gồm các chức năng:

*(Lưu ý: Một ID chỉ sử dụng một lần cho tất cả giáo viên và sinh viên, nếu nhập vào một ID bị trùng với một sinh viên hay giáo viên nào đó thì yêu cầu nhập là đối tượng đó)*

1. Xem tất cả thông tin

2. Nhập vào một Student

3. Nhập vào một Teacher

4. Sắp xếp các Persons: <br>
4.1 Tăng theo ID <br>
4.2 Giảm theo ID <br>
4.3 Tăng theo name <br>
4.4 Giảm theo name <br>
4.5 Tăng theo age<br>
4.6 Giảm theo age<br>
4.7 Tăng theo address<br>
4.8 Giảm theo address<br>
4.9 Các Teacher ở trước Student, các Teacher sắp xếp tăng theo experience, các Student sắp xếp tăng theo điểm trung bình của 3 môn math, physics, chemistry. <br>
5. Tìm kiếm và in ra các Person dựa vào:<br>
5.1 ID<br>
5.2 name<br>
5.3 age<br>
5.4 Year of Birth<br>
5.5 address<br>

6. In thông tin của tất cả:<br>
6.1 Teacher<br>
6.2 Student<br>

7. Xóa thông tin theo ID

8. Sửa thông tin theo ID
*Cho người dùng xem thông tin của đối tưởng cần sửa*<br>
*Cho phép người dùng sửa lại từng thông tin của đối tượng đó.*

9. Xóa tất cả dữ liệu.

10. Thoát chương trình.
