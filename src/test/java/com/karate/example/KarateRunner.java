package com.karate.example;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {

    @Karate.Test
    Karate testAll(){
        return Karate.run("classpath:features/sample.feature");
    }
}
