public class TemplatePattern {

    abstract class DataProcessor {
        // Template method with steps in a fixed order
        public void process() {
            readData();
            processData();
            saveData();
        }

        // Abstract methods to be implemented by subclasses
        abstract void readData();
        abstract void processData();
        abstract void saveData();
    }

    class CSVDataProcessor extends DataProcessor {
        void readData() {
            // Read data from a CSV file
        }

        void processData() {
            // Process CSV data
        }

        void saveData() {
            // Save processed data
        }
    }

    class XMLDataProcessor extends DataProcessor {
        void readData() {
            // Read data from an XML file
        }

        void processData() {
            // Process XML data
        }

        void saveData() {
            // Save processed data
        }
    }

}
