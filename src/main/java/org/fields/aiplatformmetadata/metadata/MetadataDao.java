package org.fields.aiplatformmetadata.metadata;

public interface MetadataDao {
    Metadata findAll();
    void updateAShareEODPrices(String AShareEODPrices);
    void updateCCommidityFuturesEODPrices(String CCommidityFuturesEODPrices);
    void updateAShareDescription(String AShareDescription);
    void updateAShareIntroduction(String AShareIntroduction);
    void updateAShareIndustriesClassCITICS(String AShareIndustriesClassCITICS);
    void updateAIndexMembers(String AIndexMembers);
    void updateAShareFinancialIndex(String AShareFinancialIndex);
    void updateAShareCaseFlowSheet(String AShareCaseFlowSheet);
    void updateAShareBalanceSheet(String AShareBalanceSheet);
    void updateGlobalMacrography(String GlobalMacrography);

    String getAShareEODPrices();
    String getCCommidityFuturesEODPrices();
    String getAShareDescription();
    String getAShareIntroduction();
    String getAShareIndustriesClassCITICS();
    String getAIndexMembers();
    String getAShareFinancialIndex();
    String getAShareCaseFlowSheet();
    String getAShareBalanceSheet();
    String getGlobalMacrography();
    String getChineseMacrography();
    String getIndustrialChain();
}
