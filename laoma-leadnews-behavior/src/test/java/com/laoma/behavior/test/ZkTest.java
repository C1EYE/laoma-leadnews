package com.laoma.behavior.test;

import com.laoma.common.zookeeper.sequence.Sequences;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ZkTest {
    @Autowired
    private Sequences sequence;

    @Test
    public void testSequence() {
        Long aLong = sequence.sequenceApReadBehavior();
        System.out.println(aLong);
    }
}
