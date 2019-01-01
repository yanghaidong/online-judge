package software.judger.consumer;

import org.springframework.data.redis.core.RedisTemplate;
import software.beans.CompileRequest;
import software.beans.CompileResponse;
import software.beans.RedisSubmission;
import software.beans.RunResponse;
import software.judger.core.JudgeClient;
import software.judger.utils.SpringContextUtil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //            佛祖保佑       永不宕机     永无BUG                    //
 * ////////////////////////////////////////////////////////////////////
 */

public class JudgeThread {

    private RedisTemplate<String,Object> redisTemplate;

    private JudgeClient judgeClient;

    Thread thread;

    public JudgeThread(RedisTemplate<String,Object> redisTemplate, JudgeClient judgeClient) {
        this.redisTemplate = redisTemplate;
        this.judgeClient = judgeClient;
    }

    private boolean stop = false;


    public void start() {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {

                while(!stop){
                    try {

                        final Object judges = redisTemplate.opsForList().leftPop("judges");
                        if(judges != null) {
                            System.out.println(judges);
                            System.out.println(judges.getClass().toString());
                        }
                        if(judges instanceof RedisSubmission){


                            RedisSubmission redisSubmission = (RedisSubmission) judges;

                            CompileResponse compile = judgeClient.compile(redisSubmission.compileRequest());

                            System.out.println(compile);

                            if(compile.isSuccess()){

                                RunResponse run = judgeClient.run(redisSubmission.runRequest());

                                System.out.println(run);
                            }


                        }

                    } catch (Exception e) {
                        if(stop){

                        }

                    }
                }
                //如果被标记停止执行，则将阻塞队列中的所有值清空


            }
        });

        thread.setDaemon(true);
        thread.start();

    }
}
