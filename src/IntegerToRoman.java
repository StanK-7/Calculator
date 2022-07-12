class IntegerToRoman {
    public static String intToRoman(int number) {
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return hundreds[(number / 100)] + tens[(number % 100) / 10] + units[number % 10];
    }
}
