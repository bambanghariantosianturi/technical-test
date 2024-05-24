# technical-test

1. Weight String
pada code menjelaskan yang dimana mengembalikan nilai atau bobot dari karakter yang diberikan berdasarkan urutannya dalam alfabet. Misalnya, 'a' memiliki bobot 1, 'b' memiliki bobot 2, dan seterusnya. Yang kemudian di kalkulasikan dengan menghitung nilai atau bobot dari setiap karakter dan substring yang berulang dalam string yang diberikan. Menggunakan mutableSetOf untuk menyimpan nilai atau bobot. Saat karakter berulang ditemukan, kita meningkatkan jumlah dan menghitung bobot dari substring yang berulang tersebut. kemudian memeriksa setiap nilai dalam queries dan mengembalikan "Yes" jika nilai tersebut ada dalam set nilai atau bobot yang telah di kalkulasikan, atau "No" jika tidak.

2. Balanced bracket
Balanced bracket adalah code yang dimana mengecek inputan bracket yang di cek seimbang/sama atau tidak. pertama memeriksa apakah string input memiliki tanda kurung atau bracket yang seimbang.matchingBrackets adalah yang mencocokkan tanda kurung penutup dengan tanda kurung pembuka yang sesuai. Jika karakter adalah tanda kurung pembuka ('(', '{', '['), kita menambahkannya ke stack. Jika karakter adalah tanda kurung penutup (')', '}', ']'), kita memeriksa apakah stack kosong atau tanda kurung paling atas di stack tidak cocok dengan tanda kurung penutup saat ini.
Jika salah satu kondisi tersebut benar, kita mengembalikan "NO".
Setelah loop selesai, kita mengembalikan "YES" jika stack kosong (semua tanda kurung telah seimbang), atau "NO" jika tidak.

3. Highest Palindrom
Menggunakan fungsi rekursif untuk mencari palindrom tertinggi.
idx adalah indeks saat ini yang sedang dipertimbangkan.
pal adalah bagian palindrom yang telah dibangun.
maxPal adalah palindrom tertinggi yang ditemukan sejauh ini.
Basis rekursi adalah saat idx mencapai setengah panjang string.
Saat mencapai basis rekursi, kita membangun palindrom dari tengah ke sisi kanan dan kemudian dari tengah ke sisi kiri (jika panjang string ganjil).
Setiap langkah, kita memilih digit maksimum dari karakter yang sesuai di kedua sisi dan menambahkannya ke palindrom jika tidak sama. Jika sama, kita tambahkan digit saat ini ke palindrom.
Kita mengurangi k jika kita melakukan penggantian karakter.
Kita bandingkan palindrom yang baru dibangun dengan palindrom tertinggi yang ditemukan sejauh ini, dan mengembalikan yang lebih tinggi
