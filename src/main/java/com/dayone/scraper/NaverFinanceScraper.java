package com.dayone.scraper;

import com.dayone.model.Company;
import com.dayone.model.ScrapedResult;
import org.springframework.stereotype.Component;

@Component
public class NaverFinanceScraper implements Scraper {
    @Override
    public Company scrapCompanyByTicker(String ticker) {
        return null;
    }

    @Override
    public ScrapedResult scrap(Company company) {
        return null;
    }
}
