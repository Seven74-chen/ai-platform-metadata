package org.fields.aiplatformmetadata.metadata;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "metadata")
public class Metadata implements Serializable {
    private static final long serialVersionUID = 1L;

    public static class QuotationTable{
        private String AShareEODPrices;
        private String CCommidityFuturesEODPrices;
        public String getAShareEODPrices() {
            return AShareEODPrices;
        }
        public void setAShareEODPrices(String AShareEODPrices) {
            this.AShareEODPrices = AShareEODPrices;
        }
        public String getCCommidityFuturesEODPrices() {
            return CCommidityFuturesEODPrices;
        }
        public void setCCommidityFuturesEODPrices(String CCommidityFuturesEODPrices) {
            this.CCommidityFuturesEODPrices = CCommidityFuturesEODPrices;
        }
    }
    public static class DatasetTable{
        private String AShareDescription;
        private String AShareIntroduction;
        private String AShareIndustriesClassCITICS;
        private String AIndexMembers;
        public String getAShareDescription() {
            return AShareDescription;
        }
        public void setAShareDescription(String AShareDescription) {
            this.AShareDescription = AShareDescription;
        }
        public String getAShareIntroduction() {
            return AShareIntroduction;
        }
        public void setAShareIntroduction(String AShareIntroduction) {
            this.AShareIntroduction = AShareIntroduction;
        }
        public String getAShareIndustriesClassCITICS() {
            return AShareIndustriesClassCITICS;
        }
        public void setAShareIndustriesClassCITICS(String AShareIndustriesClassCITICS) {
            this.AShareIndustriesClassCITICS = AShareIndustriesClassCITICS;
        }
        public String getAIndexMembers() {
            return AIndexMembers;
        }
        public void setAIndexMembers(String AIndexMembers) {
            this.AIndexMembers = AIndexMembers;
        }
    }
    public static class FinancialReportTable{
        private String AShareFinancialIndex;
        private String AShareCaseFlowSheet;
        private String AShareBalanceSheet;
        public String getAShareFinancialIndex() {
            return AShareFinancialIndex;
        }
        public void setAShareFinancialIndex(String AShareFinancialIndex) {
            this.AShareFinancialIndex = AShareFinancialIndex;
        }
        public String getAShareCaseFlowSheet() {
            return AShareCaseFlowSheet;
        }
        public void setAShareCaseFlowSheet(String AShareCaseFlowSheet) {
            this.AShareCaseFlowSheet = AShareCaseFlowSheet;
        }
        public String getAShareBalanceSheet() {
            return AShareBalanceSheet;
        }
        public void setAShareBalanceSheet(String AShareBalanceSheet) {
            this.AShareBalanceSheet = AShareBalanceSheet;
        }
    }
    public static class MacrographyTable {
        private String globalMacrography;
        private String chineseMacrography;
        private String industrialChain;
        public String getGlobalMacrography() {
            return globalMacrography;
        }
        public void setGlobalMacrography(String globalMacrography) {
            this.globalMacrography = globalMacrography;
        }
        public String getChineseMacrography() {
            return chineseMacrography;
        }
        public void setChineseMacrography(String chineseMacrography) {
            this.chineseMacrography = chineseMacrography;
        }
        public String getIndustrialChain() {
            return industrialChain;
        }
        public void setIndustrialChain(String industrialChain) {
            this.industrialChain = industrialChain;
        }
    }

    @Id
    private ObjectId id;
    @Field("type")
    private String type;
    @Field("QuotationTable")
    private QuotationTable quotationTable;
    @Field("DatasetTable")
    private DatasetTable datasetTable;
    @Field("MacrographyTable")
    private MacrographyTable macrographyTable;
    @Field("FinancialReportTable")
    private FinancialReportTable financialReportTable;

    public QuotationTable getQuotationTable() {
        return quotationTable;
    }
    public void setQuotationTable(QuotationTable quotationTable) {
        this.quotationTable = quotationTable;
    }
    public DatasetTable getDatasetTable() {
        return datasetTable;
    }
    public void setDatasetTable(DatasetTable datasetTable) {
        this.datasetTable = datasetTable;
    }
    public FinancialReportTable getFinancialReportTable() {
        return financialReportTable;
    }
    public void setFinancialReportTable(FinancialReportTable financialReportTable) {
        this.financialReportTable = financialReportTable;
    }
    public MacrographyTable getMacrographyTable() {
        return macrographyTable;
    }
    public void setMacrographyTable(MacrographyTable macrographyTable) {
        this.macrographyTable = macrographyTable;
    }
}
