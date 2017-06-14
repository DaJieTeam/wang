package wangyadi.baway.com.mvptext_demo1.model.home;

import java.util.List;

/**
 * 类的作用：
 * 类的思路：
 * 作者：岳俊飞
 * 时间：2017/5/9
 */

public class Bean {

    /**
     * status : 1
     * info : 获取内容成功
     * data : [{"news_id":"14740","news_title":"第十七届成都国际家具展览会\u2014\u20147月3日盛装呈现","news_summary":"2016年7月3日，国内三大家具展之一，第十七届成都国际家具工业展览会(以下简称\u201c成都家具展\u201d)将在世纪城新会展中心盛装","pic_url":"http://f.expoon.com/sub/news/2016/06/23/721512_230x162_0.jpg"},{"news_id":"14129","news_title":"全景看不一样的博鳌亚洲论坛","news_summary":"近日，举办的博鳌亚洲论坛2016年年会的分论坛通过全景相机拍摄。当日，主题为\u201c亚洲新未来：新活力与新愿景\u201d的博鳌亚洲论坛","pic_url":"http://f.expoon.com/sub/news/2016/03/24/417246_230x162_0.jpg"},{"news_id":"14083","news_title":"2016上海国际虚拟现实高峰论坛暨展览会","news_summary":"由中华人民共和国商务部、中华人民共和国科学技术部、中华人民共和国国家知识产权局所主办的2016上海国际虚拟现实高峰论坛暨","pic_url":"http://f.expoon.com/sub/news/2016/03/14/588974_230x162_0.jpg"},{"news_id":"14082","news_title":"2016全球首届VR&AR互动娱乐博览会","news_summary":"2016全球首届VR&AR互动娱乐博览会将在2016年10月12日\u201414日深圳会展中心盛大举办！","pic_url":"http://f.expoon.com/sub/news/2016/03/14/899861_230x162_0.jpg"},{"news_id":"14071","news_title":"幻影星空VR游戏跑步机 上海、广州展会引试玩热潮","news_summary":"广州展会上汇聚了中国顶尖的游艺设备品牌商，各种新奇好玩的游乐设备让人眼花缭乱，而在一个主打\u201c全民对战、玩出健康\u201d的幻影星","pic_url":"http://f.expoon.com/sub/news/2016/03/11/594102_230x162_0.png"},{"news_id":"14069","news_title":"HTC Vive开发者峰会深圳召开 共促VR生态发展","news_summary":"3月10日，HTC Vive开发者峰会于深圳威盛科技大厦隆重举行，峰会现场聚集来自全国近千名VR游戏开发者、创业者以及行","pic_url":"http://f.expoon.com/sub/news/2016/03/11/360348_230x162_0.jpg"},{"news_id":"13991","news_title":"2016中国VR开发者论坛召开，暴风魔镜推VR平台发展","news_summary":"近日，由\u201c国内虚拟现实引领者\u201d暴风魔镜、\u201c虚拟现实第一站\u201dVR界共同主办的\u201c2016中国VR开发者论坛\u201d在吉林动画学院召","pic_url":"http://f.expoon.com/sub/news/2016/03/04/973715_230x162_0.jpg"},{"news_id":"13906","news_title":"2016年虚拟现实大会5月将于北京举办","news_summary":"2016年被视为虚拟现实技术元年，新一轮热潮正在席卷全球。其产业发展迅猛，行业发展空间广阔。","pic_url":"http://f.expoon.com/sub/news/2016/02/22/627538_230x162_0.jpg"},{"news_id":"13878","news_title":"第十届中国（青岛）国际建筑节能和新型建材博览会","news_summary":"由中国建材联合会、中国贸促会建材分会、海展集团所主办的第十届中国（青岛）国际建筑节能和新型建材博览会将于2016年7月1","pic_url":"http://f.expoon.com/sub/news/2016/02/16/370742_230x162_0.jpg"},{"news_id":"13877","news_title":"第十二届中国（青岛）国际门窗幕墙及相关设备展览会","news_summary":"由中国建材联合会、中国贸促会建材分会、海展集团所主办的第十二届中国（青岛）国际门窗幕墙及相关设备展览会将于2016年7月","pic_url":"http://f.expoon.com/sub/news/2016/02/16/599992_230x162_0.jpg"},{"news_id":"13876","news_title":"2016第七届（上海）国际高端食品饮料展览会","news_summary":"由中国饭店协会所主办的2016第七届（上海）国际高端食品饮料展览会将于2016年8月25\u201427日在上海新国际博览中心盛大","pic_url":"http://f.expoon.com/sub/news/2016/02/16/502258_230x162_0.jpg"},{"news_id":"13875","news_title":"2016上海餐饮连锁加盟及数字化管理展览会","news_summary":"由中国饭店协会、亚洲好食材联盟所主办的2016上海餐饮连锁加盟及数字化管理展览会将于2016年8月25日\u201427日在上海新","pic_url":"http://f.expoon.com/sub/news/2016/02/16/719167_230x162_0.jpg"},{"news_id":"13872","news_title":"2016国际（杭州）文物交流博览会","news_summary":"为弘扬中国传统文化和灿烂文明，推动文化艺术的繁荣与发展，同时为文玩经营者和收藏爱好者之间搭建一个交流交易的平台，经有关部","pic_url":"http://f.expoon.com/sub/news/2016/02/03/431004_230x162_0.jpg"},{"news_id":"13871","news_title":"2016中国国际纺织机械展暨ITMA亚洲展览会展","news_summary":"据中国纺织机械协会副会长顾平介绍，中国国际纺织机械展览会与ITMA亚洲展联合以后，主办方引进了先进的国际办展理念，并与中","pic_url":"http://f.expoon.com/sub/news/2016/02/03/219921_230x162_0.jpg"},{"news_id":"13864","news_title":"2016湖南车展5月在湖南国际会展中心举行","news_summary":"中部第一车展\u201d\u2014\u20142016湖南车展全新起航。记者从车展组委会获悉，以\u201c乐享生活\u201d为主题的2016湖南车展，5月5日至5月","pic_url":"http://f.expoon.com/sub/news/2016/02/01/498241_230x162_0.jpg"},{"news_id":"13863","news_title":"第二届大数据产业博览会五月贵阳召开","news_summary":"从\u201c2016中国贵阳电子商务大会暨贵阳国际大数据产业博览会\u201d新闻发布会上获悉,第二届数博会将于2016年5月26日至29","pic_url":"http://f.expoon.com/sub/news/2016/02/01/155596_230x162_0.jpg"},{"news_id":"13840","news_title":"IG,CHINA 2016 全球气体行业第一展首站移师上海","news_summary":"成功举办十七载，继往开来谱新篇。全球气体行业最具影响力的第一盛会\u2014\u2014中国国际气体技术、设备与应用展览会(IG, Chin","pic_url":"http://f.expoon.com/sub/news/2016/01/27/556463_230x162_0.jpg"},{"news_id":"13826","news_title":"婴儿纸尿裤市场将迎来加速跑","news_summary":"近年来，纸尿裤正经历着快速发展阶段。据预测，全球婴儿纸尿裤的市场规模将在2020年达到594亿美元。新兴市场，特别是亚洲","pic_url":"http://f.expoon.com/sub/news/2016/01/26/428779_230x162_0.jpg"},{"news_id":"13818","news_title":"内蒙古非遗年货展暨传统文化月月传在内蒙古展览馆隆重开幕","news_summary":"2016年1月22日，由自治区文化厅主办，内蒙古展览馆和各盟市文化局承办的\u201c非遗走进现代生活\u2014\u2014全区非物质文化遗产年货展","pic_url":"http://f.expoon.com/sub/news/2016/01/25/511616_230x162_0.jpg"},{"news_id":"13813","news_title":"东莞名家具展从一年两届增加到一年三届模式","news_summary":"据网展获悉，1月13日，拥有17年34届历史的国际名家具(东莞)展览会发布重大战略调整，2016年起将进入一年三届展会的","pic_url":"http://f.expoon.com/sub/news/2016/01/22/728818_230x162_0.jpg"}]
     */

    private int status;
    private String info;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * news_id : 14740
         * news_title : 第十七届成都国际家具展览会——7月3日盛装呈现
         * news_summary : 2016年7月3日，国内三大家具展之一，第十七届成都国际家具工业展览会(以下简称“成都家具展”)将在世纪城新会展中心盛装
         * pic_url : http://f.expoon.com/sub/news/2016/06/23/721512_230x162_0.jpg
         */

        private String news_id;
        private String news_title;
        private String news_summary;
        private String pic_url;

        public String getNews_id() {
            return news_id;
        }

        public void setNews_id(String news_id) {
            this.news_id = news_id;
        }

        public String getNews_title() {
            return news_title;
        }

        public void setNews_title(String news_title) {
            this.news_title = news_title;
        }

        public String getNews_summary() {
            return news_summary;
        }

        public void setNews_summary(String news_summary) {
            this.news_summary = news_summary;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }
    }
}
