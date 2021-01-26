class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    {int TotMM = 55 * 11;
    int Numbags = 11;
    double blueMM = .24 * TotMM;
    double brownMM = .13 * TotMM;
    double greenMM = .16 * TotMM;
    double orangeMM = .2 * TotMM;
    double redMM = .13 * TotMM;
    double yellowMM = TotMM *.14;
    System.out.println("blue: " + blueMM);
    System.out.println("brown: " + brownMM);
    System.out.println("green: " + greenMM);
    System.out.println("orange: " + orangeMM);
    System.out.println("red: " + redMM);
    System.out.println("yellow: " + yellowMM);
    double SumColor = blueMM + brownMM + greenMM + orangeMM + redMM + yellowMM;
    System.out.println("Colors Added:" + SumColor);
    if ( blueMM > brownMM && redMM > orangeMM)
     System.out.println("Blue over Brown and Red over Orange");
     if ( brownMM <= greenMM)
     System.out.println("Brown is less than or equal to Green");
     if (SumColor == TotMM)
     System.out.println("Numbers match");
    }
  }
}