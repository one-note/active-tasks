package org.example;

public class EnumFinance {
    public class FinancePortfolio {
        enum FinancialInstrument {
            STOCK("Equity", 0.02), BOND("Fixed Income", 0.05), MUTUAL_FUND("Diversified", 0.03);

            private String assetClass;
            private double expectedReturn;

            FinancialInstrument(String assetClass, double expectedReturn) {
                this.assetClass = assetClass;
                this.expectedReturn = expectedReturn;
            }

            public String getAssetClass() {
                return assetClass;
            }

            public double getExpectedReturn() {
                return expectedReturn;
            }
        }

        public static void main(String[] args) {

            FinancialInstrument[] portfolio = {
                    FinancialInstrument.STOCK,
                    FinancialInstrument.BOND,
                    FinancialInstrument.MUTUAL_FUND
            };


            for (FinancialInstrument instrument : portfolio) {
                System.out.println("Instrument: " + instrument);
                System.out.println("Asset Class: " + instrument.getAssetClass());
                System.out.println("Expected Return: " + (instrument.getExpectedReturn() * 100) + "%");
                System.out.println();
            }
        }
    }

}
