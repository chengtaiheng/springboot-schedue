package springboot.schedue;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author: 程泰恒
 * @date: 2019/3/22 8:59
 */
@Component
public class SchedueCnf {

    private static final Logger LOG = LoggerFactory.getLogger(SchedueCnf.class);
    private SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Random random = new Random();


    //每隔5秒钟
    @Scheduled(fixedRate = 5000)
    public void timedTask() throws InterruptedException {
        LOG.info("fixedRate开始执行时间：{}",simpleDateFormat.format(new Date() ));
        int i = random.nextInt(4) + 5;
        LOG.info("delay time is {}", i);
        Thread.sleep(i*1000);

        Thread.sleep(6000);
            LOG.info("fixedRate执行结束时间：{}",simpleDateFormat.format(new Date()) );
    }

    //每隔5秒
//    @Scheduled(fixedDelay = 5000)
//    public void timedTask1() throws InterruptedException {
//        LOG.info("fixedDelay开始执行时间：{}",simpleDateFormat.format(new Date() ));
//        int i = random.nextInt(4) + 5;
//        LOG.info("delay time is {}", i);
//        Thread.sleep(i*1000);
//
//        Thread.sleep(6000);
//            LOG.info("fixedDelay执行结束时间：{}",simpleDateFormat.format(new Date()) );
//    }

    //






}
