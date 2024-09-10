package com.nhnacademy.nullcheck;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Scanner;

public class NullCheck {
    public static void main(String[] args){
        String str = null;

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        if(Objects.isNull(str)){
            System.out.println("is Null");
        } else if(str.isEmpty()){
            System.out.println("is Empty");
        }

        System.out.println(StringUtils.isEmpty(str));

        sc.close();
    }
}
