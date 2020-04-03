package com.sung.bookexchange.mvp.model;

import java.util.List;

/**
 * Create by sung at 2018/11/21
 *
 * @Description:
 */
public class BookInfo extends BaseModel {

    /**
     * rating : {"max":10,"numRaters":424,"average":"7.6","min":0}
     * subtitle :
     * author : ["（美）斯蒂芬·金","Stephen King"]
     * pubdate : 2014-10-25
     * tags : [{"count":102,"name":"斯蒂芬·金","title":"斯蒂芬·金"},{"count":66,"name":"恐怖","title":"恐怖"},{"count":48,"name":"小说","title":"小说"},{"count":45,"name":"美国","title":"美国"},{"count":45,"name":"惊悚","title":"惊悚"},{"count":36,"name":"史蒂芬\u2022金","title":"史蒂芬\u2022金"},{"count":29,"name":"死亡","title":"死亡"},{"count":21,"name":"外国文学","title":"外国文学"}]
     * origin_title : Pet Semartary
     * image : https://img1.doubanio.com/view/subject/m/public/s27462107.jpg
     * binding : 平装
     * translator : ["赵尔心"]
     * catalog : 第一部 宠物公墓
     * 第二部 米克马克族古葬场
     * 第三部 伟大而恐怖的欧兹魔法师
     * pages : 424
     * images : {"small":"https://img1.doubanio.com/view/subject/s/public/s27462107.jpg","large":"https://img1.doubanio.com/view/subject/l/public/s27462107.jpg","medium":"https://img1.doubanio.com/view/subject/m/public/s27462107.jpg"}
     * alt : https://book.douban.com/subject/25981412/
     * id : 25981412
     * publisher : 上海文艺出版社
     * isbn10 : 7532154157
     * isbn13 : 9787532154159
     * title : 宠物公墓
     * url : https://api.douban.com/v2/book/25981412
     * alt_title : Pet Semartary
     * author_intro : 斯蒂芬‧金 Stephen King
     * 一九四七年出生于美国缅因州波特兰市，后在缅因州州立大学学习英语文学，毕业后走上写作之路。自一九七三年出版第一部长篇小说《魔女嘉莉》后，迄今已著有四十多部长篇小说和二百多部短篇小说。其所有作品均为全球畅销书，有超过百部影视作品取材自他的小说，因此被誉为“现代惊悚小说大师”。
     * 一九九九年，斯蒂芬‧金遭遇严重车祸，康复后立刻投入写作。二○○三年，获得美国国家图书基金会颁发的“杰出贡献奖”，其后又获得世界奇幻文学奖“终身成就奖”和美国推理作家协会“爱伦•坡奖”的“大师奖”。
     * 在斯蒂芬‧金的众多作品中，以历时三十余年才终于完成的奇幻巨著“黑暗塔”系列（共七卷）最为壮观，也最受金迷推崇，书里的人物与情节，散见于斯蒂芬‧金的其他小说。他的最新作品包括《11/22/63》、《暗夜无星》和《穹顶之下》等。
     * 目前斯蒂芬‧金与妻子居住在美国缅因州班戈市。他的妻子塔比莎•金也是位小说家。
     * summary : 克里德一家搬到缅因州乡下一处美丽的房子里，生活如田园牧歌一般，美好得不像真的：一家之主是医生，母亲美丽，女儿可爱，还有个牙牙学语的儿子。
     * 但附近的森林里隐藏着一个令人毛骨悚然的真相，那个地方比死亡更恐怖，更有力量。
     * 克里德一家将发现，有时候，能够死掉反而更好。
     * 《宠物公墓》自出版后备受好评，被认为是斯蒂芬•金的经典作品之一，深刻地探寻了死亡、失去和绝望的本质。每一个读过本书的读者都将难以忘怀。
     * 《宠物公墓》1984年入围世界奇幻文学奖最佳小说奖，1989年被改编成同名电影，1997年被BBC改编成广播剧，著名导演伯纳文图加目前正在制作新版电影。
     * series : {"id":"19849","title":"99畅销文库：斯蒂芬·金"}
     * price : 35.00元
     */

    public RatingBean rating;
    public String subtitle;
    public String pubdate;
    public String origin_title;
    public String image;
    public String binding;
    public String catalog;
    public String pages;
    public ImagesBean images;
    public String alt;
    public String id;
    public String publisher;
    public String isbn10;
    public String isbn13;
    public String title;
    public String url;
    public String alt_title;
    public String author_intro;
    public String summary;
    public SeriesBean series;
    public String price;
    public List<String> author;
    public List<TagsBean> tags;
    public List<String> translator;

    public static class RatingBean {
        /**
         * max : 10
         * numRaters : 424
         * average : 7.6
         * min : 0
         */

        public int max;
        public int numRaters;
        public String average;
        public int min;
    }

    public static class ImagesBean {
        /**
         * small : https://img1.doubanio.com/view/subject/s/public/s27462107.jpg
         * large : https://img1.doubanio.com/view/subject/l/public/s27462107.jpg
         * medium : https://img1.doubanio.com/view/subject/m/public/s27462107.jpg
         */

        public String small;
        public String large;
        public String medium;
    }

    public static class SeriesBean {
        /**
         * id : 19849
         * title : 99畅销文库：斯蒂芬·金
         */

        public String id;
        public String title;
    }

    public static class TagsBean {
        /**
         * count : 102
         * name : 斯蒂芬·金
         * title : 斯蒂芬·金
         */

        public int count;
        public String name;
        public String title;
    }
}
