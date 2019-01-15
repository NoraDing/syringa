/**
 * Bilibili.com Inc. Copyright (c) 2009-2019 All Rights Reserved.
 */
package com.bilibili.syringa.core.client;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bilibili.syringa.core.BaseTest;
import com.bilibili.syringa.core.SyringaContext;

/**
 *
 * @author xuezhaoming
 * @version $Id: OptionInitTest.java, v 0.1 2019-01-15 2:12 PM Exp $$
 */
public class OptionInitTest extends BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionInitTest.class);

    @Test
    public void initTest() {
        String[] args = new String[] { "" };
        OptionInit optionInit = new OptionInit(args);
        optionInit.startAsync().awaitRunning();

        String s = SyringaContext.getInstance().getSyringaSystemConfig().toString();
        System.out.println(s);
    }

    @Test
    public void parseMessageSizeStr() {

        String[] args = new String[] { "" };

        OptionInit optionInit = new OptionInit(args);
        String messageSizeStr = "123k";
        Long aLong = optionInit.parseMessageSizeStr(messageSizeStr);
        LOGGER.info("the value is {}", aLong);

        String messageSizeStr2 = "123m".toLowerCase();
        String messageSizeStrtt = "123M".toLowerCase();
        LOGGER.info("the value is {},{}", messageSizeStr2, messageSizeStrtt);

        Long aLong2 = optionInit.parseMessageSizeStr(messageSizeStr2);
        LOGGER.info("the value is {}", aLong2);

        String messageSizeStr3 = "123mk";
        Long aLong3 = optionInit.parseMessageSizeStr(messageSizeStr3);
        LOGGER.info("the value is {}", aLong3);

    }
}
