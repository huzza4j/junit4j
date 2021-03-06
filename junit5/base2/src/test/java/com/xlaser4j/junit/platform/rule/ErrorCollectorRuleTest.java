package com.xlaser4j.junit.platform.rule;

import org.junit.Rule;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.*;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/19 14:43
 * @description: 测试ErrorCollector


 * @modified: Elijah.D
 */
@EnableRuleMigrationSupport
public class ErrorCollectorRuleTest {
    /**
     * The ErrorCollector rule allows execution of a test to continue after the first problem is found.
     * 错误收集器,运行一个case完全执行,即使中途发生错误,仍然继续运行,最终记录所有错误信息.
     */
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    /**
     * 测试收集器,收集错误信息,即使中途发生异常,仍然执行,all lines will run.
     */
    @Disabled
    @Test
    public void test() {
        collector.addError(new Throwable("first thing went wrong"));
        collector.addError(new Throwable("second thing went wrong"));
        collector.checkThat("a", equalTo("b"));
        collector.checkThat("c", equalTo("c"));
        collector.checkThat("abc", not(containsString("c")));
    }
}
