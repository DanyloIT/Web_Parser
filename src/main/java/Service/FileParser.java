package Service;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FileParser {
    public static String parse(String url) {
        ColorParser colorParser = new ColorParser();
        JSONArray jsonFile = new JSONArray();
        Document document;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException("Impossible to connect", e);
        }
        Elements clothes = document.select("a.sc-1qheze-0.dgBQdu");
        for (Element element : clothes) {
            JSONObject jsonProduct = new JSONObject();
            jsonProduct.put("Id:", element.id());
            jsonProduct.put("ProductTitle:", element.select("img").first().attr("alt"));
            jsonProduct.put("Brand:", element.select("p.sc-1gv4rhx-2.cYTPsp").first().text());
            JSONArray colors = new JSONArray();
            Elements colorsValues = element.select("li");
            for (Element color : colorsValues) {
                if (color.toString().contains("color")) {
                    colors.add(colorParser.getColorFromHex(
                            Integer.decode(color.attr("color").toLowerCase())));
                }
            }
            jsonProduct.put("Colors:", colors);
            jsonProduct.put("Sizes:", element.select("span").last().text());
            jsonProduct.put("Price:", element.select("span").first().text());
            jsonFile.add(jsonProduct);
        }
        try (FileWriter writer = new FileWriter("products.json")) {
            writer.write(jsonFile.toJSONString());
            return "URL: " + url + " was successfully read. "
                    + jsonFile.size() + " elements were written to file products.json.";
        } catch (IOException e) {
            throw new RuntimeException("Impossible to commit JSON file");
        }
    }
}
