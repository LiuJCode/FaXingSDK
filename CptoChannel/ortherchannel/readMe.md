1.渠道逻辑封装LIB :将渠道的SDK加入进来并进行封装
这个lib依赖于baseSDK ,但是打入裸包时不需要再打入basesdk
打入裸包后还需要在游戏清单文件配置 (com.duojiao.huawei.XXChannel) 封装渠道SDK的类.