package com.deep.smartuser.view.tools;

import android.util.Log;

/**
 * Created by mac on 15/3/24.
 */
public class LogTools {
    private static boolean STATE = true;
    private static boolean STATE_ERROR = true;
    private static boolean STATE_WARNING = true;
    private static boolean STATE_INFORMATION = true;
    private static boolean STATE_DEBUG = true;
    private static boolean STATE_VERBOSE = true;

    private static String FLG = "myLog";

    public enum infoType {
        Exception,Default
    };

    public static void LogError(String className, String methodName, Object info, infoType type){
        if(STATE_ERROR && STATE) {
            Log.e(FLG, getInfo(className, methodName, info, type));
        }
    }

    public static void LogWarning(String className, String methodName, Object info, infoType type){
        if(STATE_WARNING && STATE) {
            Log.w(FLG, getInfo(className, methodName, info, type));
        }
    }

    public static void LogInformation(String className, String methodName, Object info, infoType type){
        if(STATE_INFORMATION && STATE) {
            Log.i(FLG, getInfo(className, methodName, info, type));
        }
    }

    public static void LogDebug(String className, String methodName, Object info, infoType type){
        if(STATE_DEBUG && STATE) {
            Log.d(FLG, getInfo(className, methodName, info, type));
        }
    }

    public static void LogVerbose(String className, String methodName, Object info, infoType type){
        if(STATE_VERBOSE && STATE) {
            Log.v(FLG, getInfo(className, methodName, info, type));
        }
    }

    //拼接字符串
    private static String getInfo(String className, String methodName, Object info, infoType type){
        info = className + ":" +methodName + ":" +info;
        if(type == infoType.Exception){
            info = "Exception:" + info;
        }else {
            info = "Default:" + info;
        }
        return info + "";
    }
}
