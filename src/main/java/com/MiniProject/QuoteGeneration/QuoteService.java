package com.MiniProject.QuoteGeneration;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuoteService {

    @Autowired	
	private QuoteRepository quoteRepository;
     
    public void saveQuote(Quote quote) {
    	quoteRepository.save(quote);
    }
    
    public List<Quote> getAllQuotes() {
    	return quoteRepository.findAll();
    }
    
    public Quote getRandomQuote() {
    	List<Quote> randomQuote=quoteRepository.findAll();
    	Random random=new Random();
    	int randomIndex=random.nextInt(randomQuote.size());
    	return randomQuote.get(randomIndex);
    }
    
    
    }


