package com.laoma;

import io.mycat.config.model.rule.RuleAlgorithm;
import io.mycat.route.function.AbstractPartitionAlgorithm;

public class LaoMaBurstRuleAlgorithm extends AbstractPartitionAlgorithm implements RuleAlgorithm {

    private Long volume;
    private Integer step;
    private Integer mod;

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
    }

    /**
     * columevalue 3-2 表示id为3分片为2
     *
     * @param s
     * @return
     */
    @Override
    public Integer calculate(String columnValue) {
        // 实现分片算法
        if (columnValue != null) {
            String[] args = columnValue.split("-");
            if (args.length == 2) {
                Long dataId = Long.valueOf(args[0]);
                Long burstId = Long.valueOf(args[1]);
                // 计算分片
                int group = (int) ((dataId / volume) * step);
                int pos = group + (int) (burstId / mod);
                System.out.println("分片结果：" + columnValue + "-" + pos);
                return pos;
            }
        }
        return new Integer(0);
    }

    @Override
    public Integer[] calculateRange(String beginValue, String endValue) {
        if (beginValue != null && endValue != null) {
            Integer begin = calculate(beginValue);
            Integer end = calculate(endValue);
            if (begin == null || end == null || begin > end) {
                return new Integer[0];
            }
            int len = end - begin + 1;
            Integer[] result = new Integer[len];
            for (int i = 0; i < len; i++) {
                result[i] = begin + i;
            }
            return result;
        }
        return new Integer[0];
    }
}
