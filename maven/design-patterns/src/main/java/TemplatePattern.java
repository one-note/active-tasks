
abstract class DataProcessor {
    public void process() {
        readData();
        processData();
        saveData();
    }


    abstract void readData();

    abstract void processData();

    abstract void saveData();
}

class CsvDataProcessor extends DataProcessor {
    void readData() {

    }

    void processData() {

    }

    void saveData() {

    }

}

public class TemplatePattern extends DataProcessor {
    public static void main(String[] args) {
        TemplatePattern templatePattern = new TemplatePattern();
        templatePattern.readData();
    }

    @Override
    void readData() {
    }

    @Override
    void processData() {
        System.out.println("This is processing data using Template Design Pattern");

    }

    @Override
    void saveData() {
        System.out.println("This is saving data using Template Design Pattern");

    }

}
