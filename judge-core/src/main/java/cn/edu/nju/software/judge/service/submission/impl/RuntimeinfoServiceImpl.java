package cn.edu.nju.software.judge.service.submission.impl;

import cn.edu.nju.software.judge.dao.RuntimeinfoMapper;
import cn.edu.nju.software.judge.model.RuntimeinfoModel;
import cn.edu.nju.software.judge.service.submission.RuntimeinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

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
@Service
public class RuntimeinfoServiceImpl implements RuntimeinfoService {

    @Resource
    private RuntimeinfoMapper runtimeinfoMapper;

    @Override
    @Transactional
    public void insert(RuntimeinfoModel runtimeinfoModel) {
        Assert.notNull(runtimeinfoModel.getSubmissionId(),"submissionId not null");
        runtimeinfoMapper.insert(runtimeinfoModel.runtimeinfo());

    }
}
