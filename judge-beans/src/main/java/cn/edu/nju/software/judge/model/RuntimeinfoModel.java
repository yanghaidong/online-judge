package cn.edu.nju.software.judge.model;

import cn.edu.nju.software.judge.beans.Runtimeinfo;
import lombok.*;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RuntimeinfoModel {

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _runtimeinfo.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _runtimeinfo.error
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String error;

    public Runtimeinfo runtimeinfo(){

        Runtimeinfo runtimeinfo = new Runtimeinfo();

        runtimeinfo.setError(error);
        runtimeinfo.setSubmissionId(submissionId);
        return runtimeinfo;
    }

}
