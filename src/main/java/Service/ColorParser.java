package Service;

import lombok.Data;
import java.util.ArrayList;

public class ColorParser {
    /* I took ready RGB to COLOR value converter from here:
    https://stackoverflow.com/questions/4126029/convert-rgb-values-to-color-name */
    private ArrayList<Color> initColorList() {
        ArrayList<Color> colorList = new ArrayList<Color>();
        colorList.add(new Color("AliceBlue", 0xF0, 0xF8, 0xFF));
        colorList.add(new Color("AntiqueWhite", 0xFA, 0xEB, 0xD7));
        colorList.add(new Color("Aqua", 0x00, 0xFF, 0xFF));
        colorList.add(new Color("Aquamarine", 0x7F, 0xFF, 0xD4));
        colorList.add(new Color("Azure", 0xF0, 0xFF, 0xFF));
        colorList.add(new Color("Beige", 0xF5, 0xF5, 0xDC));
        colorList.add(new Color("Bisque", 0xFF, 0xE4, 0xC4));
        colorList.add(new Color("Black", 0x00, 0x00, 0x00));
        colorList.add(new Color("BlanchedAlmond", 0xFF, 0xEB, 0xCD));
        colorList.add(new Color("Blue", 0x00, 0x00, 0xFF));
        colorList.add(new Color("BlueViolet", 0x8A, 0x2B, 0xE2));
        colorList.add(new Color("Brown", 0xA5, 0x2A, 0x2A));
        colorList.add(new Color("BurlyWood", 0xDE, 0xB8, 0x87));
        colorList.add(new Color("CadetBlue", 0x5F, 0x9E, 0xA0));
        colorList.add(new Color("Chartreuse", 0x7F, 0xFF, 0x00));
        colorList.add(new Color("Chocolate", 0xD2, 0x69, 0x1E));
        colorList.add(new Color("Coral", 0xFF, 0x7F, 0x50));
        colorList.add(new Color("CornflowerBlue", 0x64, 0x95, 0xED));
        colorList.add(new Color("Cornsilk", 0xFF, 0xF8, 0xDC));
        colorList.add(new Color("Crimson", 0xDC, 0x14, 0x3C));
        colorList.add(new Color("Cyan", 0x00, 0xFF, 0xFF));
        colorList.add(new Color("DarkBlue", 0x00, 0x00, 0x8B));
        colorList.add(new Color("DarkCyan", 0x00, 0x8B, 0x8B));
        colorList.add(new Color("DarkGoldenRod", 0xB8, 0x86, 0x0B));
        colorList.add(new Color("DarkGray", 0xA9, 0xA9, 0xA9));
        colorList.add(new Color("DarkGreen", 0x00, 0x64, 0x00));
        colorList.add(new Color("DarkKhaki", 0xBD, 0xB7, 0x6B));
        colorList.add(new Color("DarkMagenta", 0x8B, 0x00, 0x8B));
        colorList.add(new Color("DarkOliveGreen", 0x55, 0x6B, 0x2F));
        colorList.add(new Color("DarkOrange", 0xFF, 0x8C, 0x00));
        colorList.add(new Color("DarkOrchid", 0x99, 0x32, 0xCC));
        colorList.add(new Color("DarkRed", 0x8B, 0x00, 0x00));
        colorList.add(new Color("DarkSalmon", 0xE9, 0x96, 0x7A));
        colorList.add(new Color("DarkSeaGreen", 0x8F, 0xBC, 0x8F));
        colorList.add(new Color("DarkSlateBlue", 0x48, 0x3D, 0x8B));
        colorList.add(new Color("DarkSlateGray", 0x2F, 0x4F, 0x4F));
        colorList.add(new Color("DarkTurquoise", 0x00, 0xCE, 0xD1));
        colorList.add(new Color("DarkViolet", 0x94, 0x00, 0xD3));
        colorList.add(new Color("DeepPink", 0xFF, 0x14, 0x93));
        colorList.add(new Color("DeepSkyBlue", 0x00, 0xBF, 0xFF));
        colorList.add(new Color("DimGray", 0x69, 0x69, 0x69));
        colorList.add(new Color("DodgerBlue", 0x1E, 0x90, 0xFF));
        colorList.add(new Color("FireBrick", 0xB2, 0x22, 0x22));
        colorList.add(new Color("FloralWhite", 0xFF, 0xFA, 0xF0));
        colorList.add(new Color("ForestGreen", 0x22, 0x8B, 0x22));
        colorList.add(new Color("Fuchsia", 0xFF, 0x00, 0xFF));
        colorList.add(new Color("Gainsboro", 0xDC, 0xDC, 0xDC));
        colorList.add(new Color("GhostWhite", 0xF8, 0xF8, 0xFF));
        colorList.add(new Color("Gold", 0xFF, 0xD7, 0x00));
        colorList.add(new Color("GoldenRod", 0xDA, 0xA5, 0x20));
        colorList.add(new Color("Gray", 0x80, 0x80, 0x80));
        colorList.add(new Color("Green", 0x00, 0x80, 0x00));
        colorList.add(new Color("GreenYellow", 0xAD, 0xFF, 0x2F));
        colorList.add(new Color("HoneyDew", 0xF0, 0xFF, 0xF0));
        colorList.add(new Color("HotPink", 0xFF, 0x69, 0xB4));
        colorList.add(new Color("IndianRed", 0xCD, 0x5C, 0x5C));
        colorList.add(new Color("Indigo", 0x4B, 0x00, 0x82));
        colorList.add(new Color("Ivory", 0xFF, 0xFF, 0xF0));
        colorList.add(new Color("Khaki", 0xF0, 0xE6, 0x8C));
        colorList.add(new Color("Lavender", 0xE6, 0xE6, 0xFA));
        colorList.add(new Color("LavenderBlush", 0xFF, 0xF0, 0xF5));
        colorList.add(new Color("LawnGreen", 0x7C, 0xFC, 0x00));
        colorList.add(new Color("LemonChiffon", 0xFF, 0xFA, 0xCD));
        colorList.add(new Color("LightBlue", 0xAD, 0xD8, 0xE6));
        colorList.add(new Color("LightCoral", 0xF0, 0x80, 0x80));
        colorList.add(new Color("LightCyan", 0xE0, 0xFF, 0xFF));
        colorList.add(new Color("LightGoldenRodYellow", 0xFA, 0xFA, 0xD2));
        colorList.add(new Color("LightGray", 0xD3, 0xD3, 0xD3));
        colorList.add(new Color("LightGreen", 0x90, 0xEE, 0x90));
        colorList.add(new Color("LightPink", 0xFF, 0xB6, 0xC1));
        colorList.add(new Color("LightSalmon", 0xFF, 0xA0, 0x7A));
        colorList.add(new Color("LightSeaGreen", 0x20, 0xB2, 0xAA));
        colorList.add(new Color("LightSkyBlue", 0x87, 0xCE, 0xFA));
        colorList.add(new Color("LightSlateGray", 0x77, 0x88, 0x99));
        colorList.add(new Color("LightSteelBlue", 0xB0, 0xC4, 0xDE));
        colorList.add(new Color("LightYellow", 0xFF, 0xFF, 0xE0));
        colorList.add(new Color("Lime", 0x00, 0xFF, 0x00));
        colorList.add(new Color("LimeGreen", 0x32, 0xCD, 0x32));
        colorList.add(new Color("Linen", 0xFA, 0xF0, 0xE6));
        colorList.add(new Color("Magenta", 0xFF, 0x00, 0xFF));
        colorList.add(new Color("Maroon", 0x80, 0x00, 0x00));
        colorList.add(new Color("MediumAquaMarine", 0x66, 0xCD, 0xAA));
        colorList.add(new Color("MediumBlue", 0x00, 0x00, 0xCD));
        colorList.add(new Color("MediumOrchid", 0xBA, 0x55, 0xD3));
        colorList.add(new Color("MediumPurple", 0x93, 0x70, 0xDB));
        colorList.add(new Color("MediumSeaGreen", 0x3C, 0xB3, 0x71));
        colorList.add(new Color("MediumSlateBlue", 0x7B, 0x68, 0xEE));
        colorList.add(new Color("MediumSpringGreen", 0x00, 0xFA, 0x9A));
        colorList.add(new Color("MediumTurquoise", 0x48, 0xD1, 0xCC));
        colorList.add(new Color("MediumVioletRed", 0xC7, 0x15, 0x85));
        colorList.add(new Color("MidnightBlue", 0x19, 0x19, 0x70));
        colorList.add(new Color("MintCream", 0xF5, 0xFF, 0xFA));
        colorList.add(new Color("MistyRose", 0xFF, 0xE4, 0xE1));
        colorList.add(new Color("Moccasin", 0xFF, 0xE4, 0xB5));
        colorList.add(new Color("NavajoWhite", 0xFF, 0xDE, 0xAD));
        colorList.add(new Color("Navy", 0x00, 0x00, 0x80));
        colorList.add(new Color("OldLace", 0xFD, 0xF5, 0xE6));
        colorList.add(new Color("Olive", 0x80, 0x80, 0x00));
        colorList.add(new Color("OliveDrab", 0x6B, 0x8E, 0x23));
        colorList.add(new Color("Orange", 0xFF, 0xA5, 0x00));
        colorList.add(new Color("OrangeRed", 0xFF, 0x45, 0x00));
        colorList.add(new Color("Orchid", 0xDA, 0x70, 0xD6));
        colorList.add(new Color("PaleGoldenRod", 0xEE, 0xE8, 0xAA));
        colorList.add(new Color("PaleGreen", 0x98, 0xFB, 0x98));
        colorList.add(new Color("PaleTurquoise", 0xAF, 0xEE, 0xEE));
        colorList.add(new Color("PaleVioletRed", 0xDB, 0x70, 0x93));
        colorList.add(new Color("PapayaWhip", 0xFF, 0xEF, 0xD5));
        colorList.add(new Color("PeachPuff", 0xFF, 0xDA, 0xB9));
        colorList.add(new Color("Peru", 0xCD, 0x85, 0x3F));
        colorList.add(new Color("Pink", 0xFF, 0xC0, 0xCB));
        colorList.add(new Color("Plum", 0xDD, 0xA0, 0xDD));
        colorList.add(new Color("PowderBlue", 0xB0, 0xE0, 0xE6));
        colorList.add(new Color("Purple", 0x80, 0x00, 0x80));
        colorList.add(new Color("Red", 0xFF, 0x00, 0x00));
        colorList.add(new Color("RosyBrown", 0xBC, 0x8F, 0x8F));
        colorList.add(new Color("RoyalBlue", 0x41, 0x69, 0xE1));
        colorList.add(new Color("SaddleBrown", 0x8B, 0x45, 0x13));
        colorList.add(new Color("Salmon", 0xFA, 0x80, 0x72));
        colorList.add(new Color("SandyBrown", 0xF4, 0xA4, 0x60));
        colorList.add(new Color("SeaGreen", 0x2E, 0x8B, 0x57));
        colorList.add(new Color("SeaShell", 0xFF, 0xF5, 0xEE));
        colorList.add(new Color("Sienna", 0xA0, 0x52, 0x2D));
        colorList.add(new Color("Silver", 0xC0, 0xC0, 0xC0));
        colorList.add(new Color("SkyBlue", 0x87, 0xCE, 0xEB));
        colorList.add(new Color("SlateBlue", 0x6A, 0x5A, 0xCD));
        colorList.add(new Color("SlateGray", 0x70, 0x80, 0x90));
        colorList.add(new Color("Snow", 0xFF, 0xFA, 0xFA));
        colorList.add(new Color("SpringGreen", 0x00, 0xFF, 0x7F));
        colorList.add(new Color("SteelBlue", 0x46, 0x82, 0xB4));
        colorList.add(new Color("Tan", 0xD2, 0xB4, 0x8C));
        colorList.add(new Color("Teal", 0x00, 0x80, 0x80));
        colorList.add(new Color("Thistle", 0xD8, 0xBF, 0xD8));
        colorList.add(new Color("Tomato", 0xFF, 0x63, 0x47));
        colorList.add(new Color("Turquoise", 0x40, 0xE0, 0xD0));
        colorList.add(new Color("Violet", 0xEE, 0x82, 0xEE));
        colorList.add(new Color("Wheat", 0xF5, 0xDE, 0xB3));
        colorList.add(new Color("White", 0xFF, 0xFF, 0xFF));
        colorList.add(new Color("WhiteSmoke", 0xF5, 0xF5, 0xF5));
        colorList.add(new Color("Yellow", 0xFF, 0xFF, 0x00));
        colorList.add(new Color("YellowGreen", 0x9A, 0xCD, 0x32));
        return colorList;
    }

    public String getColorFromRgb(int r, int g, int b) {
        ArrayList<Color> colorList = initColorList();
        Color closestMatch = null;
        int minMSE = Integer.MAX_VALUE;
        int mse;
        for (Color c : colorList) {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE) {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null) {
            return closestMatch.getName();
        } else {
            return "No matched color name.";
        }
    }
    
    public String getColorFromHex(int hexColor) {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorFromRgb(r, g, b);
    }

    @Data
    public class Color {
        public String name;
        public int r;
        public int g;
        public int b;

        public Color(String name, int r, int g, int b) {
            this.name = name;
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int computeMSE(int pixR, int pixG, int pixB) {
            return (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
                    * (pixB - b)) / 3);
        }
    }
}