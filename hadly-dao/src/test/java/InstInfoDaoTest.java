import com.hadly.dal.model.InstInfo;
import com.hadly.dal.service.IInstInfoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author hadly
 * @since 2017/11/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/dao.xml"})
@Transactional
public class InstInfoDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
    @Resource
    private IInstInfoDao instInfoDao;

    @Test
    public void insertTest(){
        InstInfo record = new InstInfo();
        record.setInstcd("14位");
        record.setInstcd("4位");
        instInfoDao.insert(record);
    }
}
