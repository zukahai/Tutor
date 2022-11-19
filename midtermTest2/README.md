## Đề thi thử lập trình hướng đối tượng
***(Thời gian làm bài: 90 phút)***

Siêu thị trái cây quản lý trái cây với các thông tin như mã, tên, giá và số lượng như sau:
- Fruit (id:int, name:String, price:double)
- FruitIn là mô tả trái cây trong nước, quản lý thêm phí nội bộ extraIn: double
- FruitOut là mô tả trái cây nhập khẩu, quản lý thêm xuất xứ orgin: String và phí nhập khẩu
extraOut: double

#### Yêu cầu:

**Câu 1**. Định nghĩa interface IFruit với các phương thức định giá bán tới người dùng priceForSale()

**Câu 2**. Định nghĩa lớp Fruit cài đặt (hiện thực) giao diện IFruit, với các thuộc tính và phương thức
theo yêu cầu.

**Câu 3**. Định nghĩa lớp FruitIn kế thừa lớp Fruit.

**Câu 4**. Định nghĩa lớp FruitOut kế thừa lớp Fruit.
Yêu cầu tính giá bán của trái cây priceForSale, biết rằng
- Giá bán FruitIn bằng giá price cộng với phí nội bộ extraIn .
- Giá bán FruitOut bằng giá price cộng với phí nhập khẩu extraOut và 10% của extraOut

**Câu 5**. Định nghĩa lớp FruitList với thuộc tính và các phương thức sau:
- 1) Thêm Fruit vào danh sách gồm FruitIn và FruitOut
- 2) In ra danh sách Fruit
- 3) In danh sách FruitIn và FruitOut có priceForSale lớn hơn 20
- 4) Tính tổng số Fruit có trong danh sách
- 5) Viết chương trình theo dạng Menu Driven Program
