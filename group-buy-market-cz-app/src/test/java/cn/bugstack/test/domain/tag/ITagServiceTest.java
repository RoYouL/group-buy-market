package cn.bugstack.test.domain.tag;

import cn.bugstack.domain.tag.service.TagService;
import cn.bugstack.infrastructure.redis.IRedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBitSet;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ITagServiceTest {

    @Resource
    private TagService tagService;
    @Resource
    private IRedisService redisService;

    @Test
    public void test_tag_job() {
        tagService.execTagBatchJob("RQ_KJHKL98UU78H66554GFDV", "10002");
    }

    @Test
    public void test_get_tag_bitmap() {
        RBitSet bitSet = redisService.getBitSet("RQ_KJHKL98UU78H66554GFDV");
        // 是否存在
        log.info("测试结果:{}", bitSet.get(redisService.getIndexFromUserId("xfg03")));
    }

}
