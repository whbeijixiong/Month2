package com.bwei.month2.bean;

import java.util.List;

/**
 * 作    者 ： 文欢
 * 时    间 ： 2017/3/1.
 * 描    述 ：
 * 修改时间 ：
 */

public class Bean {


    private ResultBean result;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {


        private String title;
        private String total;
        private List<RowsBean> rows;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {


            private String fang_type;
            private InfoBean info;

            public String getFang_type() {
                return fang_type;
            }

            public void setFang_type(String fang_type) {
                this.fang_type = fang_type;
            }

            public InfoBean getInfo() {
                return info;
            }

            public void setInfo(InfoBean info) {
                this.info = info;
            }

            public static class InfoBean {


                private ActivityTagsBean activity_tags;
                private String address;
                private String baidu_lat;
                private String baidu_lng;
                private BrandBean brand;
                private String city_id;
                private String default_image;
                private String fang_type;
                private int has_consultant;
                private int has_sale;
                private int has_video;
                private String kaipan_new_date;
                private KftBean kft;
                private String lat;
                private String lng;
                private String loupan_id;
                private String loupan_name;
                private String loupan_property_type;
                private String new_price_back;
                private String new_price_value;
                private String price;
                private RecommendPriceBean recommend_price;
                private String region_id;
                private String region_title;
                private String sale_label;
                private String sale_title;
                private ShowActivityBean show_activity;
                private String status_sale;
                private String sub_region_id;
                private String sub_region_title;
                private String tags;
                private TuangouBean tuangou;
                private ZhuankftBean zhuankft;
                private List<?> activity_tags_icon;
                private List<?> multi_image;

                public ActivityTagsBean getActivity_tags() {
                    return activity_tags;
                }

                public void setActivity_tags(ActivityTagsBean activity_tags) {
                    this.activity_tags = activity_tags;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getBaidu_lat() {
                    return baidu_lat;
                }

                public void setBaidu_lat(String baidu_lat) {
                    this.baidu_lat = baidu_lat;
                }

                public String getBaidu_lng() {
                    return baidu_lng;
                }

                public void setBaidu_lng(String baidu_lng) {
                    this.baidu_lng = baidu_lng;
                }

                public BrandBean getBrand() {
                    return brand;
                }

                public void setBrand(BrandBean brand) {
                    this.brand = brand;
                }

                public String getCity_id() {
                    return city_id;
                }

                public void setCity_id(String city_id) {
                    this.city_id = city_id;
                }

                public String getDefault_image() {
                    return default_image;
                }

                public void setDefault_image(String default_image) {
                    this.default_image = default_image;
                }

                public String getFang_type() {
                    return fang_type;
                }

                public void setFang_type(String fang_type) {
                    this.fang_type = fang_type;
                }

                public int getHas_consultant() {
                    return has_consultant;
                }

                public void setHas_consultant(int has_consultant) {
                    this.has_consultant = has_consultant;
                }

                public int getHas_sale() {
                    return has_sale;
                }

                public void setHas_sale(int has_sale) {
                    this.has_sale = has_sale;
                }

                public int getHas_video() {
                    return has_video;
                }

                public void setHas_video(int has_video) {
                    this.has_video = has_video;
                }

                public String getKaipan_new_date() {
                    return kaipan_new_date;
                }

                public void setKaipan_new_date(String kaipan_new_date) {
                    this.kaipan_new_date = kaipan_new_date;
                }

                public KftBean getKft() {
                    return kft;
                }

                public void setKft(KftBean kft) {
                    this.kft = kft;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLng() {
                    return lng;
                }

                public void setLng(String lng) {
                    this.lng = lng;
                }

                public String getLoupan_id() {
                    return loupan_id;
                }

                public void setLoupan_id(String loupan_id) {
                    this.loupan_id = loupan_id;
                }

                public String getLoupan_name() {
                    return loupan_name;
                }

                public void setLoupan_name(String loupan_name) {
                    this.loupan_name = loupan_name;
                }

                public String getLoupan_property_type() {
                    return loupan_property_type;
                }

                public void setLoupan_property_type(String loupan_property_type) {
                    this.loupan_property_type = loupan_property_type;
                }

                public String getNew_price_back() {
                    return new_price_back;
                }

                public void setNew_price_back(String new_price_back) {
                    this.new_price_back = new_price_back;
                }

                public String getNew_price_value() {
                    return new_price_value;
                }

                public void setNew_price_value(String new_price_value) {
                    this.new_price_value = new_price_value;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public RecommendPriceBean getRecommend_price() {
                    return recommend_price;
                }

                public void setRecommend_price(RecommendPriceBean recommend_price) {
                    this.recommend_price = recommend_price;
                }

                public String getRegion_id() {
                    return region_id;
                }

                public void setRegion_id(String region_id) {
                    this.region_id = region_id;
                }

                public String getRegion_title() {
                    return region_title;
                }

                public void setRegion_title(String region_title) {
                    this.region_title = region_title;
                }

                public String getSale_label() {
                    return sale_label;
                }

                public void setSale_label(String sale_label) {
                    this.sale_label = sale_label;
                }

                public String getSale_title() {
                    return sale_title;
                }

                public void setSale_title(String sale_title) {
                    this.sale_title = sale_title;
                }

                public ShowActivityBean getShow_activity() {
                    return show_activity;
                }

                public void setShow_activity(ShowActivityBean show_activity) {
                    this.show_activity = show_activity;
                }

                public String getStatus_sale() {
                    return status_sale;
                }

                public void setStatus_sale(String status_sale) {
                    this.status_sale = status_sale;
                }

                public String getSub_region_id() {
                    return sub_region_id;
                }

                public void setSub_region_id(String sub_region_id) {
                    this.sub_region_id = sub_region_id;
                }

                public String getSub_region_title() {
                    return sub_region_title;
                }

                public void setSub_region_title(String sub_region_title) {
                    this.sub_region_title = sub_region_title;
                }

                public String getTags() {
                    return tags;
                }

                public void setTags(String tags) {
                    this.tags = tags;
                }

                public TuangouBean getTuangou() {
                    return tuangou;
                }

                public void setTuangou(TuangouBean tuangou) {
                    this.tuangou = tuangou;
                }

                public ZhuankftBean getZhuankft() {
                    return zhuankft;
                }

                public void setZhuankft(ZhuankftBean zhuankft) {
                    this.zhuankft = zhuankft;
                }

                public List<?> getActivity_tags_icon() {
                    return activity_tags_icon;
                }

                public void setActivity_tags_icon(List<?> activity_tags_icon) {
                    this.activity_tags_icon = activity_tags_icon;
                }

                public List<?> getMulti_image() {
                    return multi_image;
                }

                public void setMulti_image(List<?> multi_image) {
                    this.multi_image = multi_image;
                }

                public static class ActivityTagsBean {
                }

                public static class BrandBean {
                }

                public static class KftBean {
                }

                public static class RecommendPriceBean {
                }

                public static class ShowActivityBean {
                }

                public static class TuangouBean {
                }

                public static class ZhuankftBean {
                }
            }
        }
    }
}
