import Service.FileParser;

public class MainApp {
    public static void main(String[] args) {
        String url = "https://www.aboutyou.de/c/maenner/bekleidung-20290";
        System.out.println(FileParser.parse(url));
    }
}
