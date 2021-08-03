package com.company;
import java.util.*;
import java.util.Locale;

public class Main {

    int lcs( char[] X, char[] Y, int m, int n ) {
        int[][] L = new int[m+1][n+1];

        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[m][n];
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {

        HashMap<String, String> mp1 = new HashMap<>();
        mp1.put("01", "Jammu and Kashmir");
        mp1.put("02", "Himachal Pradesh");
        mp1.put("03", "Punjab");
        mp1.put("04", "Chandigarh");
        mp1.put("05", "Uttarakhand");
        mp1.put("06", "Haryana");
        mp1.put("07", "Delhi");
        mp1.put("08", "Rajasthan");
        mp1.put("09", "Uttar Pradesh");
        mp1.put("1", "Jammu and Kashmir");
        mp1.put("2", "Himachal Pradesh");
        mp1.put("3", "Punjab");
        mp1.put("4", "Chandigarh");
        mp1.put("5", "Uttarakhand");
        mp1.put("6", "Haryana");
        mp1.put("7", "Delhi");
        mp1.put("8", "Rajasthan");
        mp1.put("9", "Uttar Pradesh");
        mp1.put("10", "Bihar");
        mp1.put("11", "Sikkim");
        mp1.put("12", "Arunachal Pradesh");
        mp1.put("13", "Nagaland");
        mp1.put("14", "Manipur");
        mp1.put("15", "Mizoram");
        mp1.put("16", "Tripura");
        mp1.put("17", "Meghalaya");
        mp1.put("18", "Assam");
        mp1.put("19", "West Bengal");
        mp1.put("20", "Jharkhand");
        mp1.put("21", "Odisha");
        mp1.put("22", "Chattisgarh");
        mp1.put("23", "Madhya Pradesh");
        mp1.put("24", "Gujarat");
        mp1.put("26", "Dadra & Nagar Haveli and Daman & Diu");
        mp1.put("27", "Maharashtra");
        mp1.put("28", "Andhra Pradesh");
        mp1.put("29", "Karnataka");
        mp1.put("30", "Goa");
        mp1.put("31", "Lakshadweep Islands");
        mp1.put("32", "Kerala");
        mp1.put("33", "Tamil Nadu");
        mp1.put("34", "Pondicherry");
        mp1.put("35", "Andaman and Nicobar Islands");
        mp1.put("36", "Telangana");
        mp1.put("37", "Andhra Pradesh");
        mp1.put("38", "Ladakh");
        mp1.put("97", "Other Territory");

        HashMap<String, String> mp2 = new HashMap<>();
        mp2.put("JK", "Jammu and Kashmir");
        mp2.put("HP", "Himachal Pradesh");
        mp2.put("PB", "Punjab");
        mp2.put("CH", "Chandigarh");
        mp2.put("UT", "Uttarakhand");
        mp2.put("HR", "Haryana");
        mp2.put("DL", "Delhi");
        mp2.put("RJ", "Rajasthan");
        mp2.put("UP", "Uttar Pradesh");
        mp2.put("BR", "Bihar");
        mp2.put("SK", "Sikkim");
        mp2.put("AR", "Arunachal Pradesh");
        mp2.put("NL", "Nagaland");
        mp2.put("MN", "Manipur");
        mp2.put("MZ", "Mizoram");
        mp2.put("TR", "Tripura");
        mp2.put("ML", "Meghalaya");
        mp2.put("AS", "Assam");
        mp2.put("WB", "West Bengal");
        mp2.put("JH", "Jharkhand");
        mp2.put("OD", "Odisha");
        mp2.put("CG", "Chattisgarh");
        mp2.put("MP", "Madhya Pradesh");
        mp2.put("GJ", "Gujarat");
        mp2.put("DN", "Dadra & Nagar Haveli and Daman & Diu");
        mp2.put("MH", "Maharashtra");
        mp2.put("KA", "Karnataka");
        mp2.put("GA", "Goa");
        mp2.put("LD", "Lakshadweep Islands");
        mp2.put("KL", "Kerala");
        mp2.put("TN", "Tamil Nadu");
        mp2.put("PY", "Pondicherry");
        mp2.put("AN", "Andaman and Nicobar Islands");
        mp2.put("TS", "Telangana");
        mp2.put("AD", "Andhra Pradesh");
        mp2.put("LA", "Ladakh");

        String[] states = {
                "Assam",
                "Haryana",
                "Delhi",
                "Lakshadweep Islands",
                "Maharashtra",
                "Madhya Pradesh",
                "Meghalaya",
                "Himachal Pradesh",
                "Andhra Pradesh",
                "Goa",
                "Chandigarh",
                "Nagaland",
                "Arunachal Pradesh",
                "Uttar Pradesh",
                "Karnataka",
                "Uttarakhand",
                "Bihar",
                "Chhattisgarh",
                "Gujarat",
                "Jharkhand",
                "Manipur",
                "Jammu and Kashmir",
                "Kerala",
                "Odisha",
                "Mizoram",
                "Punjab",
                "Rajasthan",
                "Sikkim",
                "Tamil Nadu",
                "Telangana",
                "Tripura",
                "West Bengal",
                "Dadra & Nagar Haveli and Daman & Diu",
                "Pondicherry",
                "Andaman and Nicobar Islands",
                "Ladakh"
        };

        Main lcs = new Main();

        Scanner sc = new Scanner(System.in);
        String str,s1,s2,s3,s4,org;
        System.out.println("Keep on entering region name in any form.");
        System.out.println("Enter end to stop.");
        while(true) {
            str = sc.nextLine();
            if(str.equals("end"))
                break;
            else if(str.equals(""))
                continue;
            else
            {
                org=str;
                str = str.replaceAll("\\s", "");
                s1 = str.toLowerCase();

                s4 = s1;
                s4 = s4.replaceAll("[^\\d]", " ");
                s4 = s4.trim();
                s4 = s4.replaceAll(" +", "");
                if(!s4.equals("") && mp1.containsKey(s4)) {
                    System.out.println(mp1.get(s4));
                    continue;
                }

                s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
                if(s1.length()==2 && mp2.containsKey(s1.toUpperCase(Locale.ROOT))) {
                    System.out.println(mp2.get(s1.toUpperCase(Locale.ROOT)));
                    continue;
                }

                int max_length=-1;
                String result="";

                for (String state : states) {
                    char[] X = s1.toCharArray();
                    s2 = state;
                    s2 = s2.replaceAll("\\s", "");
                    s3 = s2.toLowerCase();
                    char[] Y = s3.toCharArray();
                    int m = X.length;
                    int n = Y.length;
                    int l = lcs.lcs(X, Y, m, n);
                    if (max_length < l) {
                        max_length = l;
                        result = state;
                    }
                }
                System.out.print(result+"\n");
            }
        }
    }
}
