    interface Formatter {
        String format(String text);
    }

    class PlainFormatter implements Formatter {
        public String format(String text) {
            return "Plain: " + text;
        }
    }

    class UpperCaseFormatter implements Formatter {
        public String format(String text) {
            return "UPPER CASE: " + text.toUpperCase();
        }
    }

    class LowerCaseFormatter implements Formatter {
        public String format(String text) {
            return "lower case: " + text.toLowerCase();
        }
    }

    class TextProcessor {
        private Formatter formatter;

        public void setFormatter(Formatter formatter) {
            this.formatter = formatter;
        }

        public String processText(String text) {
            return formatter.format(text);
        }
    }

    public class StrategyPattern {
        public static void main(String[] args) {
            TextProcessor processor = new TextProcessor();

            processor.setFormatter(new PlainFormatter());
            String plainText = processor.processText("This is plain text.");

            processor.setFormatter(new UpperCaseFormatter());
            String upperCaseText = processor.processText("This is uppercase text.");

            processor.setFormatter(new LowerCaseFormatter());
            String lowerCaseText = processor.processText("This is lowercase text.");

            System.out.println(plainText);
            System.out.println(upperCaseText);
            System.out.println(lowerCaseText);
        }
    }


