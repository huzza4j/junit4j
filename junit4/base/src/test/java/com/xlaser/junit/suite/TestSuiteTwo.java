package com.xlaser.junit.suite;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * 测试suite{@link org.junit.runner.RunWith#value()}
 *
 * @package: com.xlaser.junit.suite
 * @author: Elijah.D
 * @time: 2019/11/22 16:01
 * @description:
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestSuiteTwo {
    @Test
    public void test2() {
        System.out.println("## Test 2 ##");
        assertTrue(true);
    }
}
