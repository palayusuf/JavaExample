# JavaExample

JUnit ile birim testi (unit test) yazma pratiği yapmak için hazırlanmış bir Java örnek projesi. Gradle (Kotlin DSL) ile yapılandırılmıştır.

## Özellikler

- %100 Java ile yazılmıştır
- JUnit kullanılarak yazılmış birim testleri içerir
- Build aracı olarak Gradle (Kotlin DSL — `build.gradle.kts`, `settings.gradle.kts`) kullanır
- Gradle Wrapper içerir, ek kurulum gerektirmez
- Kod kalitesi analizi için JetBrains Qodana yapılandırması (`qodana.yaml`) içerir

## Proje Yapısı

```
JavaExample/
├── .idea/                 # IntelliJ IDEA proje ayarları
├── gradle/wrapper/         # Gradle Wrapper dosyaları
├── src/                    # Kaynak kod ve JUnit test sınıfları
├── build.gradle.kts        # Gradle build yapılandırması
├── settings.gradle.kts     # Gradle ayar dosyası
├── gradlew / gradlew.bat   # Gradle Wrapper çalıştırıcıları
├── qodana.yaml             # Qodana kod analizi yapılandırması
└── .gitignore
```

## Gereksinimler

- JDK 17 veya üzeri (proje yapısına göre güncelleyin)
- İnternet bağlantısı (ilk derlemede Gradle bağımlılıklarının indirilmesi için)

## Kurulum ve Çalıştırma

Depoyu klonlayın:

```bash
git clone https://github.com/palayusuf/JavaExample.git
cd JavaExample
```

Projeyi derleyin:

```bash
./gradlew build
```

Windows için:

```bash
gradlew.bat build
```

Testleri çalıştırın:

```bash
./gradlew test
```

Test raporunu görüntülemek için derleme sonrası şu dosyayı tarayıcıda açabilirsiniz:

```
build/reports/tests/test/index.html
```

## Katkıda Bulunma

1. Bu depoyu fork'layın
2. Yeni bir özellik dalı oluşturun (`git checkout -b ozellik/yeni-ozellik`)
3. Değişikliklerinizi commit'leyin (`git commit -m 'Yeni özellik eklendi'`)
4. Dalınızı push'layın (`git push origin ozellik/yeni-ozellik`)
5. Bir Pull Request açın
