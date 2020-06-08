package com.easybuy.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmz
 */
@Controller
public class PageController {

    @RequestMapping("index")
    public String index() {
        return "Index";
    }

    @RequestMapping("brand")
    public String brand() {
        return "Brand";
    }

    @RequestMapping("brandList")
    public String brandList() {
        return "BrandList";
    }

    @RequestMapping("buyCar")
    public String buyCar() {
        return "BuyCar";
    }

    @RequestMapping("buyCarThree")
    public String buyCarThree() {
        return "BuyCar_Three";
    }

    @RequestMapping("buyCarTwo")
    public String buyCarTwo() {
        return "BuyCar_Two";
    }

    @RequestMapping("category")
    public String category() {
        return "Category";
    }

    @RequestMapping("categoryList")
    public String categoryList() {
        return "CategoryList";
    }

    @RequestMapping("login")
    public String login() {
        return "Login";
    }

    @RequestMapping("member")
    public String member() {
        return "Member";
    }

    @RequestMapping("memberAddress")
    public String memberAddress() {
        return "Member_Address";
    }

    @RequestMapping("memberCash")
    public String memberCash() {
        return "Member_Cash";
    }

    @RequestMapping("memberCollect")
    public String memberCollect() {
        return "Member_Collect";
    }

    @RequestMapping("memberCommission")
    public String memberCommission() {
        return "Member_Commission";
    }

    @RequestMapping("memberMember")
    public String memberMember() {
        return "Member_Member";
    }

    @RequestMapping("memberMemberList")
    public String memberMemberList() {
        return "Member_Member_List";
    }

    @RequestMapping("memberMoney")
    public String memberMoney() {
        return "Member_Money";
    }

    @RequestMapping("memberMoneyCharge")
    public String memberMoneyCharge() {
        return "Member_Money_Charge";
    }

    @RequestMapping("memberMoneyPay")
    public String memberMoneyPay() {
        return "Member_Money_Pay";
    }

    @RequestMapping("memberMsg")
    public String memberMsg() {
        return "Member_Msg";
    }

    @RequestMapping("memberOrder")
    public String memberOrder() {
        return "Member_Order";
    }

    @RequestMapping("memberPacket")
    public String memberPacket() {
        return "Member_Packet";
    }

    @RequestMapping("memberResults")
    public String memberResults() {
        return "Member_Results";
    }

    @RequestMapping("memberSafe")
    public String memberSafe() {
        return "Member_Safe";
    }

    @RequestMapping("memberUser")
    public String memberUser() {
        return "Member_User";
    }

    @RequestMapping("product")
    public String product() {
        return "Product";
    }

    @RequestMapping("regist")
    public String regist() {
        return "Regist";
    }

    @RequestMapping("sell")
    public String sell() {
        return "Sell";
    }

    @RequestMapping("sellDetails")
    public String sellDetails() {
        return "SellDetails";
    }
}
