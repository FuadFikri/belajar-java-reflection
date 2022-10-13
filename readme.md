## Java Reflection
source : programmer zaman now


- merupakan fitur Java yang memperbolehkan program Java untuk mempelajari atau memodifikasi dirinya sendiri.
- Bahkan Java Reflection bisa digunakan untuk memodifikasi kode program yang sedang berjalan.
- Fitur Java Reflection terdapat dalam dua package, yaitu java.lang dan java.lang.reflect
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/package-summary.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/package-summary.html

### Class
ava.lang.Class<T> merupakan representasi dari reflection untuk Java Class, Interface dan Enum
Saat kita membuat Java Class, Interface atau Enum, kadang kita menambahkan field dan method
Dengan kemampuan java.lang.Class, kita bisa membaca seluruh data member yang terdapat pada Java Class, Interface atau Enum pada saat aplikasi nya berjalan



### Proxy
- bisa digunakan untuk membuat object bahkan tanpa membuat implementasi sebuah interface
- fitur ini sangat berguna pada kasus-kasus tertentu, bahkan saat ini populer yang namanya Spring Data yang bisa digunakan untuk memanipulasi  database cukup bermodalkan Interface, tanpa harus membuat implementasi class dan melakukan query database secara manual
- Saat kita membuat  proxy, kita bisa secara dinamis menerima method yang dipanggil, dan mengembalikan value di method tersebut dengan InvocationHandler
- 


