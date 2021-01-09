package org.fields.aiplatformmetadata;

import org.fields.aiplatformmetadata.metadata.Metadata;
import org.fields.aiplatformmetadata.metadata.MetadataDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetadataTest {
    @Autowired
    MetadataDao metadataDao;

    @Test
    public void read(){
        Metadata metadata = metadataDao.findAll();
        Assert.assertEquals("Incorrectly bound AShareEODPrices property", "wind_AShareEODPrices.py", metadata.getQuotationTable().getAShareEODPrices());
        Assert.assertEquals("Incorrectly bound CCommidityFuturesEODPrices property", "wind_CCommidityFuturesEODPrices.py", metadata.getQuotationTable().getCCommidityFuturesEODPrices());

        Assert.assertEquals("Incorrectly bound AShareDescription property", "wind_AShareDescription.py", metadata.getDatasetTable().getAShareDescription());
        Assert.assertEquals("Incorrectly bound AShareIntroduction property", "wind_AShareIntroduction.py", metadata.getDatasetTable().getAShareIntroduction());
        Assert.assertEquals("Incorrectly bound AShareIndustriesClassCITICS property", "wind_AShareIndustriesClassCITICS.py", metadata.getDatasetTable().getAShareIndustriesClassCITICS());
        Assert.assertEquals("Incorrectly bound AIndexMembers property", "wind_AIndexMembers.py", metadata.getDatasetTable().getAIndexMembers());

        Assert.assertEquals("Incorrectly bound AShareFinancialIndex property", "wind_AShareFinancialIndex.py", metadata.getFinancialReportTable().getAShareFinancialIndex());
        Assert.assertEquals("Incorrectly bound AShareCaseFlowSheet property", "wind_AShareCaseFlowSheet.py", metadata.getFinancialReportTable().getAShareCaseFlowSheet());
        Assert.assertEquals("Incorrectly bound AShareBalanceSheet property", "wind_AShareBalanceSheet.py", metadata.getFinancialReportTable().getAShareBalanceSheet());

        Assert.assertEquals("Incorrectly bound GlobalMacrography property", "wind_GlobalMacrography.py", metadata.getMacrographyTable().getGlobalMacrography());
        Assert.assertEquals("Incorrectly bound ChineseMacrography property", "wind_ChineseMacrography.py", metadata.getMacrographyTable().getChineseMacrography());
        Assert.assertEquals("Incorrectly bound IndustrialChain property", "wind_IndustrialChain.py", metadata.getMacrographyTable().getIndustrialChain());
    }
    @Test
    public void modifyAndRestore(){
        final String test = "test";

        String old = metadataDao.getAShareEODPrices();
        metadataDao.updateAShareEODPrices(test);
        Assert.assertEquals("Incorrectly bound AShareEODPrices property", test, metadataDao.getAShareEODPrices());
        metadataDao.updateAShareEODPrices(old);

        old = metadataDao.getCCommidityFuturesEODPrices();
        metadataDao.updateCCommidityFuturesEODPrices(test);
        Assert.assertEquals("Incorrectly bound CCommidityFuturesEODPrices property", test, metadataDao.getCCommidityFuturesEODPrices());
        metadataDao.updateCCommidityFuturesEODPrices(old);

        old = metadataDao.getAShareDescription();
        metadataDao.updateAShareDescription(test);
        Assert.assertEquals("Incorrectly bound AShareDescription property", test, metadataDao.getAShareDescription());
        metadataDao.updateAShareDescription(old);

        old = metadataDao.getAShareIntroduction();
        metadataDao.updateAShareIntroduction(test);
        Assert.assertEquals("Incorrectly bound AShareIntroduction property", test, metadataDao.getAShareIntroduction());
        metadataDao.updateAShareIntroduction(old);

        old = metadataDao.getAShareIndustriesClassCITICS();
        metadataDao.updateAShareIndustriesClassCITICS(test);
        Assert.assertEquals("Incorrectly bound AShareIndustriesClassCITICS property", test, metadataDao.getAShareIndustriesClassCITICS());
        metadataDao.updateAShareIndustriesClassCITICS(old);

        old = metadataDao.getAIndexMembers();
        metadataDao.updateAIndexMembers(test);
        Assert.assertEquals("Incorrectly bound AIndexMembers property", test, metadataDao.getAIndexMembers());
        metadataDao.updateAIndexMembers(old);

        old = metadataDao.getAShareFinancialIndex();
        metadataDao.updateAShareFinancialIndex(test);
        Assert.assertEquals("Incorrectly bound AShareFinancialIndex property", test, metadataDao.getAShareFinancialIndex());
        metadataDao.updateAShareFinancialIndex(old);

        old = metadataDao.getAShareCaseFlowSheet();
        metadataDao.updateAShareCaseFlowSheet(test);
        Assert.assertEquals("Incorrectly bound AShareCaseFlowSheet property", test, metadataDao.getAShareCaseFlowSheet());
        metadataDao.updateAShareCaseFlowSheet(old);

        old = metadataDao.getAShareBalanceSheet();
        metadataDao.updateAShareBalanceSheet(test);
        Assert.assertEquals("Incorrectly bound AShareBalanceSheet property", test, metadataDao.getAShareBalanceSheet());
        metadataDao.updateAShareBalanceSheet(old);

        /*old = metadataDao.getGlobalMacrography();
        metadataDao.updateGlobalMacrography(test);
        Assert.assertEquals("Incorrectly bound GlobalMacrography property", test, metadataDao.getGlobalMacrography());
        metadataDao.updateGlobalMacrography(old);

        old = metadataDao.getChineseMacrography();
        metadataDao.updateChineseMacrography(test);
        Assert.assertEquals("Incorrectly bound ChineseMacrography property", test, metadataDao.getChineseMacrography());
        metadataDao.updateChineseMacrography(old);

        old = metadataDao.getIndustrialChain();
        metadataDao.updateIndustrialChain(test);
        Assert.assertEquals("Incorrectly bound IndustrialChain property", test, metadataDao.getIndustrialChain());
        metadataDao.updateIndustrialChain(old);*/
    }

    @Test
    public void test(){
        metadataDao.updateGlobalMacrography("test");
    }
}
