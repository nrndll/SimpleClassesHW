public class Printer {
    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets(){
        return this.sheets;
    }

    public boolean print(int pages, int copies){
        int sheetsToPrint = pages * copies;
        if(this.sheets >= sheetsToPrint){
            this.sheets -= sheetsToPrint;
            return true;
        }
        return false;
    }
}
