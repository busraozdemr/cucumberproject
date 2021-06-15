# cucumberproject
testte pure cucumber kullanılmıştır.
feature,steps ve page adımların bulunmaktadır.
feature dosyasında gherkin syntaxı ile testler yazılmıştır
steps kısımlarında metodlarım
page clasında ise method içive en üstte xpath,id,csslerim tanımlanmıştır.
driver için driver factory tanımlanmıştır
Contants clasını sabit değerlerimiz için kullanabilir. Ben url için kullandım
ElementUtils clasının içinde sürekli olarak kullandığımız ve kullanacağımız methodları tanımlayabiliriz. Extend ederek diğer classlarımızda kullanımı sağladık.
config.properties dosyamızda propertylerini verip ConfigReader ile buradaki propertilerin okunmasını sağladık.
raporlamalar test-output kısmında bulunmaktadır 
paralel koşum gerçekleşmektedir
login.feature'da bir login senaryosu bilerek fail bırakılmıştır.
