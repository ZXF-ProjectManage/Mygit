package com.xdclass.springboot.xdclass;

import io.swagger.annotations.ApiParam;

public class User {

    @ApiParam(name = "name",value = "name",defaultValue = "")
    public String name;
    @ApiParam(name = "age",value = "age",defaultValue = "")
    public String age;
    @ApiParam(name = "sex",value = "sex",defaultValue = "")
    public String sex;
    @ApiParam(name = "birth",value = "birth",defaultValue = "")
    public String birth;

    public static void main(String[] args) {

        String data="{\n" +
                "  \"username\":\"xdclass\",\n" +
                "  \"sex\":\"male\",\n" +
                "  \"birth\":\"1991-11-11\"\n" +
                "}";
    }

}
