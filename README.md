# cucumberproject
## Projemizin özellikleri <br/>
1)testte pure cucumber kullanılmıştır. <br/>
2)feature,steps ve page adımların bulunmaktadır.<br/>
-->feature dosyasında gherkin syntaxı ile testler yazılmıştır<br/>
-->steps kısımlarında metodlarım<br/>
-->page clasında ise method içindee en üstte xpath,id,csslerim tanımlanmıştır.<br/>
3)driver için driver factory tanımlanmıştır<br/>
4)Contants clasını sabit değerlerimiz için kullanabilir. Ben url için kullandım<br/>
5)ElementUtils clasının içinde sürekli olarak kullandığımız ve kullanacağımız methodları tanımlayabiliriz. Extend ederek diğer classlarımızda kullanımı sağladık.
config.properties dosyamızda propertylerini verip ConfigReader ile buradaki propertilerin okunmasını sağladık.<br/>
6)raporlamalar test-output kısmında bulunmaktadır 
7)paralel koşum gerçekleşmektedir<br/>
8)login.feature'da bir login senaryosu bilerek fail bırakılmıştır.<br/>
