package me.ele.rank.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by chenjie on 15/12/1.
 */
@Entity
@Table(name="rec_trd_restaurant_rank")
public class RankEntity {

    @Id
    @GeneratedValue
    int id;



   //餐厅id
    @Column(name="restaurant_id")
    long restaurantId;

    //餐厅名字
    String restaurant_name;

    //城市id
    long city_id;

    //城市名字
    String city_name;

    //餐厅类型，以逗号分隔
    String restaurant_type;

    //一个月的订单量
    long order_num;

    //一个月的下单用户
    long users;

    // 一个月内的开店日期
    long open_day;

    //一个月内投诉数
    long complaints;

    //投诉分
    double complaints_score;

    //餐厅退单量
    long restaurant_withdraw_order_num;

    //退单分
    double restaurant_withdraw_order_score;

    //用户退单数
    long user_withdraw_order_num;

    //用户退单分
    double user_withdraw_order_score;

    //差评数
    long bad_rating_num;

    //差评分
    double bad_rating_score;

    //催单分
    double reminder_score;

    //订单分
    double order_score;

    //收藏分
    double collections_score;

    //回头客量
    double user_order;

    //回头客分
    double user_order_score;

    //'好评分'
    double like_score;

    //支付分
    double payment_score;


    //图片分
    double picture_score;

    //认证分
    double certification_score;

    //补贴分
    double subsidy_score;

    //回扣分
    double bod_rebate_score;

    //付费分
    double sass_score;

    //自营分
    double sia_score;

    //蜂鸟分
    double hummer_score;

    //独家餐厅分
    double exclusive_score;

    //bod分
    double bod_score;

    //新店分
    double new_restaurant_score;

    //不含新店的总分
    double score;

    //总分
    double total_score;

    //
    Date created_at;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getRestaurant_type() {
        return restaurant_type;
    }

    public void setRestaurant_type(String restaurant_type) {
        this.restaurant_type = restaurant_type;
    }

    public long getOrder_num() {
        return order_num;
    }

    public void setOrder_num(long order_num) {
        this.order_num = order_num;
    }

    public long getUsers() {
        return users;
    }

    public void setUsers(long users) {
        this.users = users;
    }

    public long getOpen_day() {
        return open_day;
    }

    public void setOpen_day(long open_day) {
        this.open_day = open_day;
    }

    public long getComplaints() {
        return complaints;
    }

    public void setComplaints(long complaints) {
        this.complaints = complaints;
    }

    public double getComplaints_score() {
        return complaints_score;
    }

    public void setComplaints_score(double complaints_score) {
        this.complaints_score = complaints_score;
    }

    public long getRestaurant_withdraw_order_num() {
        return restaurant_withdraw_order_num;
    }

    public void setRestaurant_withdraw_order_num(long restaurant_withdraw_order_num) {
        this.restaurant_withdraw_order_num = restaurant_withdraw_order_num;
    }

    public double getRestaurant_withdraw_order_score() {
        return restaurant_withdraw_order_score;
    }

    public void setRestaurant_withdraw_order_score(double restaurant_withdraw_order_score) {
        this.restaurant_withdraw_order_score = restaurant_withdraw_order_score;
    }

    public long getUser_withdraw_order_num() {
        return user_withdraw_order_num;
    }

    public void setUser_withdraw_order_num(long user_withdraw_order_num) {
        this.user_withdraw_order_num = user_withdraw_order_num;
    }

    public double getUser_withdraw_order_score() {
        return user_withdraw_order_score;
    }

    public void setUser_withdraw_order_score(double user_withdraw_order_score) {
        this.user_withdraw_order_score = user_withdraw_order_score;
    }

    public long getBad_rating_num() {
        return bad_rating_num;
    }

    public void setBad_rating_num(long bad_rating_num) {
        this.bad_rating_num = bad_rating_num;
    }

    public double getBad_rating_score() {
        return bad_rating_score;
    }

    public void setBad_rating_score(double bad_rating_score) {
        this.bad_rating_score = bad_rating_score;
    }

    public double getReminder_score() {
        return reminder_score;
    }

    public void setReminder_score(double reminder_score) {
        this.reminder_score = reminder_score;
    }

    public double getOrder_score() {
        return order_score;
    }

    public void setOrder_score(double order_score) {
        this.order_score = order_score;
    }

    public double getCollections_score() {
        return collections_score;
    }

    public void setCollections_score(double collections_score) {
        this.collections_score = collections_score;
    }

    public double getUser_order() {
        return user_order;
    }

    public void setUser_order(double user_order) {
        this.user_order = user_order;
    }

    public double getUser_order_score() {
        return user_order_score;
    }

    public void setUser_order_score(double user_order_score) {
        this.user_order_score = user_order_score;
    }

    public double getLike_score() {
        return like_score;
    }

    public void setLike_score(double like_score) {
        this.like_score = like_score;
    }

    public double getPayment_score() {
        return payment_score;
    }

    public void setPayment_score(double payment_score) {
        this.payment_score = payment_score;
    }

    public double getPicture_score() {
        return picture_score;
    }

    public void setPicture_score(double picture_score) {
        this.picture_score = picture_score;
    }

    public double getCertification_score() {
        return certification_score;
    }

    public void setCertification_score(double certification_score) {
        this.certification_score = certification_score;
    }

    public double getSubsidy_score() {
        return subsidy_score;
    }

    public void setSubsidy_score(double subsidy_score) {
        this.subsidy_score = subsidy_score;
    }

    public double getBod_rebate_score() {
        return bod_rebate_score;
    }

    public void setBod_rebate_score(double bod_rebate_score) {
        this.bod_rebate_score = bod_rebate_score;
    }

    public double getSass_score() {
        return sass_score;
    }

    public void setSass_score(double sass_score) {
        this.sass_score = sass_score;
    }

    public double getSia_score() {
        return sia_score;
    }

    public void setSia_score(double sia_score) {
        this.sia_score = sia_score;
    }

    public double getHummer_score() {
        return hummer_score;
    }

    public void setHummer_score(double hummer_score) {
        this.hummer_score = hummer_score;
    }

    public double getExclusive_score() {
        return exclusive_score;
    }

    public void setExclusive_score(double exclusive_score) {
        this.exclusive_score = exclusive_score;
    }

    public double getBod_score() {
        return bod_score;
    }

    public void setBod_score(double bod_score) {
        this.bod_score = bod_score;
    }

    public double getNew_restaurant_score() {
        return new_restaurant_score;
    }

    public void setNew_restaurant_score(double new_restaurant_score) {
        this.new_restaurant_score = new_restaurant_score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTotal_score() {
        return total_score;
    }

    public void setTotal_score(double total_score) {
        this.total_score = total_score;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }


    @Override
    public String toString() {
        return "RankEntity{" +
                "id=" + id +
                ", restaurantId=" + restaurantId +
                ", restaurant_name='" + restaurant_name + '\'' +
                ", city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                ", restaurant_type='" + restaurant_type + '\'' +
                ", order_num=" + order_num +
                ", users=" + users +
                ", open_day=" + open_day +
                ", complaints=" + complaints +
                ", complaints_score=" + complaints_score +
                ", restaurant_withdraw_order_num=" + restaurant_withdraw_order_num +
                ", restaurant_withdraw_order_score=" + restaurant_withdraw_order_score +
                ", user_withdraw_order_num=" + user_withdraw_order_num +
                ", user_withdraw_order_score=" + user_withdraw_order_score +
                ", bad_rating_num=" + bad_rating_num +
                ", bad_rating_score=" + bad_rating_score +
                ", reminder_score=" + reminder_score +
                ", order_score=" + order_score +
                ", collections_score=" + collections_score +
                ", user_order=" + user_order +
                ", user_order_score=" + user_order_score +
                ", like_score=" + like_score +
                ", payment_score=" + payment_score +
                ", picture_score=" + picture_score +
                ", certification_score=" + certification_score +
                ", subsidy_score=" + subsidy_score +
                ", bod_rebate_score=" + bod_rebate_score +
                ", sass_score=" + sass_score +
                ", sia_score=" + sia_score +
                ", hummer_score=" + hummer_score +
                ", exclusive_score=" + exclusive_score +
                ", bod_score=" + bod_score +
                ", new_restaurant_score=" + new_restaurant_score +
                ", score=" + score +
                ", total_score=" + total_score +
                ", created_at=" + created_at +
                '}';
    }
}
