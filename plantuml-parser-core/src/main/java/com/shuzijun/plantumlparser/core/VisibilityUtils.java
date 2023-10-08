package com.shuzijun.plantumlparser.core;

import org.jetbrains.kotlin.lexer.KtTokens;
import org.jetbrains.kotlin.psi.KtModifierListOwner;

/**
 * 转换限定符
 *
 * @author shuzijun
 */
public class VisibilityUtils {

    public static String toCharacter(String visibility) {
        if (visibility == null) {
            return "+";
        } else if ("private".equals(visibility)) {
            return "-";
        } else if ("default".equals(visibility)) {
            return "~";
        } else if ("protected".equals(visibility)) {
            return "#";
        } else {
            return "+";
        }
    }

    public static boolean isVisibility(String visibility) {
        if (visibility == null) {
            return false;
        } else if ("private".equals(visibility)) {
            return true;
        } else if ("default".equals(visibility)) {
            return true;
        } else if ("protected".equals(visibility)) {
            return true;
        } else if ("public".equals(visibility)) {
            return true;
        } else {
            return false;
        }
    }

    public static String toVisibility(KtModifierListOwner ktModifierListOwner) {
        if  (ktModifierListOwner.hasModifier(KtTokens.PRIVATE_KEYWORD)){
            return  "private";
        } else if (ktModifierListOwner.hasModifier(KtTokens.INTERNAL_KEYWORD)){
            return "private";
        } else if (ktModifierListOwner.hasModifier(KtTokens.PROTECTED_KEYWORD)){
            return "protected";
        } else {
            return "public";
        }
    }
}
