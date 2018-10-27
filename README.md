# AspectJ 

AspectJ là một thư viện, đặc tả trong Java để thực hiện AOP.

Tương tự với Spring AOP mà ta đã sử dụng ở bài trước. Tuy nhiên nó cung cấp các annotation, sử dụng đơn giản hơn.

Tương tự như Spring AOP, thay vì định nghĩa trong Bean, AspectJ cung cấp các annotation để định nghĩa các pointcut, advice, target object…

Các Annotation chung chủa AspectJ gồm:

    @Before: Chạy trước khi method được thực thi
    @After: Chạy sau khi method trả về một kết quả
    @AfterReturning: Chạy sau khi method trả về một kết quả, lọc lấy kết quả trả về
    @AfterThrowing: Chạy khi method xảy ra exception
    @Around: Gồm các tất cả các advice trên
    @Aspect: Đánh dấu đây là 1 aspect
