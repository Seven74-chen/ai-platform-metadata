package org.fields.aiplatformmetadata.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.stereotype.Component;


@Component
public class MetadataDaoImpl implements MetadataDao{
    @Autowired
    private MongoTemplate mongoTemplate;

    private static Query query = Query.query(Criteria.where("type").is("metadata"));
    @Override
    public Metadata findAll(){
        return mongoTemplate.findOne(query, Metadata.class);
    }
    @Override
    public void updateAShareEODPrices(String AShareEODPrices){
        Update update = new Update().set("QuotationTable.$.AShareEODPrices", AShareEODPrices);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateCCommidityFuturesEODPrices(String CCommidityFuturesEODPrices) {
        Update update = new Update().set("QuotationTable.$.CCommidityFuturesEODPrices", CCommidityFuturesEODPrices);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareDescription(String AShareDescription) {
        Update update = new Update().set("DatasetTable.$.AShareDescription", AShareDescription);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareIntroduction(String AShareIntroduction) {
        Update update = new Update().set("DatasetTable.$.AShareIntroduction", AShareIntroduction);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareIndustriesClassCITICS(String AShareIndustriesClassCITICS) {
        Update update = new Update().set("DatasetTable.$.AShareIndustriesClassCITICS", AShareIndustriesClassCITICS);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAIndexMembers(String AIndexMembers) {
        Update update = new Update().set("DatasetTable.$.AIndexMembers", AIndexMembers);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareFinancialIndex(String AShareFinancialIndex) {
        Update update = new Update().set("FinancialReportTable.$.AShareFinancialIndex", AShareFinancialIndex);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareCaseFlowSheet(String AShareCaseFlowSheet) {
        Update update = new Update().set("FinancialReportTable.$.AShareCaseFlowSheet", AShareCaseFlowSheet);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateAShareBalanceSheet(String AShareBalanceSheet) {
        Update update = new Update().set("FinancialReportTable.$.AShareBalanceSheet", AShareBalanceSheet);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateGlobalMacrography(String GlobalMacrography) {
        Update update = new Update().set("MacrographyTable.$.globalMacrography", GlobalMacrography);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateChineseMacrography(String ChineseMacrography) {
        Update update = new Update().set("MacrographyTable.$.chineseMacrography", ChineseMacrography);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }

    @Override
    public void updateIndustrialChain(String IndustrialChain) {
        Update update = new Update().set("MacrographyTable.$.industrialChain", IndustrialChain);
        mongoTemplate.updateFirst(query, update, Metadata.class);
    }


    @Override
    public String getAShareEODPrices() {
        return mongoTemplate.findOne(query, Metadata.class).getQuotationTable().getAShareEODPrices();
    }

    @Override
    public String getCCommidityFuturesEODPrices() {
        return mongoTemplate.findOne(query, Metadata.class).getQuotationTable().getCCommidityFuturesEODPrices();
    }

    @Override
    public String getAShareDescription() {
        return mongoTemplate.findOne(query, Metadata.class).getDatasetTable().getAShareDescription();
    }

    @Override
    public String getAShareIntroduction() {
        return mongoTemplate.findOne(query, Metadata.class).getDatasetTable().getAShareIntroduction();
    }

    @Override
    public String getAShareIndustriesClassCITICS() {
        return mongoTemplate.findOne(query, Metadata.class).getDatasetTable().getAShareIndustriesClassCITICS();
    }

    @Override
    public String getAIndexMembers() {
        return mongoTemplate.findOne(query, Metadata.class).getDatasetTable().getAIndexMembers();
    }

    @Override
    public String getAShareFinancialIndex() {
        return mongoTemplate.findOne(query, Metadata.class).getFinancialReportTable().getAShareFinancialIndex();
    }

    @Override
    public String getAShareCaseFlowSheet() {
        return mongoTemplate.findOne(query, Metadata.class).getFinancialReportTable().getAShareCaseFlowSheet();
    }

    @Override
    public String getAShareBalanceSheet() {
        return mongoTemplate.findOne(query, Metadata.class).getFinancialReportTable().getAShareBalanceSheet();
    }

    @Override
    public String getGlobalMacrography() {
        Metadata metadata =  mongoTemplate.findOne(query, Metadata.class);//.getMacrographyTable().getGlobalMacrography();
        return metadata.getMacrographyTable().getGlobalMacrography();
    }

    @Override
    public String getChineseMacrography() {
        return mongoTemplate.findOne(query, Metadata.class).getMacrographyTable().getChineseMacrography();
    }

    @Override
    public String getIndustrialChain() {
        return mongoTemplate.findOne(query, Metadata.class).getMacrographyTable().getIndustrialChain();
    }

}
