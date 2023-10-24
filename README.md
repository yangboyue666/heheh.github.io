# linfeng-community

#### 1.介绍

林风社交论坛uniapp小程序/H5/App版本基于SpringBoot+MybatisPlus+Shiro+jwt+Redis+Vue+Uniapp的前后端分离的社交论坛问答发帖/BBS项目 项目分为Uniapp用户端（兼容H5、微信小程序以及App）和Vue后台管理端（包括完整的权限处理）， 基于以下技术栈开发：SpringBoot、MybatisPlus、Websocket、Shiro、jwt、Redis、Vue、Uniapp、MySQL5.7。

功能：图文帖，长文贴，短视频，圈子，私聊，微信支付（小程序/H5/app），付费贴，积分签到，钱包充值，积分余额兑换，话题标签，抽奖大转盘，手机号邮箱登录，人机发帖，即时通讯IM，好友模块等，直接看演示更直观↓↓↓

**优先更新国内码云Gitee**：https://gitee.com/virus010101/linfeng-community

***后台前端的代码在 src\main\resources\static\linfeng-community-vue目录下！***

***用户端的前端代码在 src\main\resources\static\linfeng-community-uniapp-ky 目录下！***

代码三端均发布了开源版供学习（**SQL文件在qq群文件中**，点个star加群获取即可）



#### 2.软件演示

官网：https://net.linfeng.tech

##### 2.1移动端演示

![移动端二维码](https://github.com/virus010101/linfeng-community/blob/main/images/er.jpg)

或者：

H5端：https://h5.linfeng.tech

微信小程序：搜索”林风bbs“

后台管理系统演示地址：https://dev.linfeng.tech

演示账号1 ： test           密码：  123456

演示账号2 ： test2         密码：  123456

演示账号3 ： test3         密码：  123456



**注意:演示站点为标准商业版**

开源版具体的功能清单请查看：https://net.linfeng.tech/version/version.html

##### 2.2移动端效果截图

<img src="https://github.com/virus010101/linfeng-community/blob/main/images/showPic11.png"/>

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic12.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic13.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic14.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic04.png)

##### 2.3后台管理端效果截图

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic05.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic06.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic08.png)

![](https://github.com/virus010101/linfeng-community/blob/main/images/showPic10.png)

#### 3.安装教程 

1.  配置数据库和redis。先启动redis，再启动后端api服务。
2.  数据库请使用MySQL5.7，或高于5.7的版本。
3.  配置后台前端  先npm install 下载依赖后，再npm run dev即可。
4.  移动端在HBuilderX中打开，需要先npm install安装依赖后，再启动。
5.  优先更新码云Gitee：https://gitee.com/virus010101/linfeng-community
6.  文档、SQL文件在QQ群文件（640700429）

#### 4.必看说明

1.后台前端的代码在\src\main\resources\static\linfeng-community-vue目录下！

2.用户端代码在\src\main\resources\static\linfeng-community-uniapp-ky目录下！

3.**商业版和开源版的区别**

https://net.linfeng.tech/version/version.html

详情查看官网：https://net.linfeng.tech

**标准商业版前往项目官网咨询客服了解详情**。



4.SQL文件开源的，在QQ群，开源不易，**请左上角点个star后备注gitee的用户名加QQ群（640700429）获取**

<img src="https://github.com/virus010101/linfeng-community/blob/main/images/qrcode.jpg" style="zoom:25%;" />



#### 5.开源须知

- 开源版仅允许用于个人学习研究使用!

- 禁止将本开源的代码和资源进行任何形式任何名义的改造或出售!

- 限制商用，如果需要商业使用请联系我们或查看官网了解商用详情！


#### 6.版本更新记录

***当前版本标准版V1.11.0***

2023.10.23

###### V1.11.0发布

【新增】1.新增短视频滑动浏览模块

【新增】2.新增短视频播放源加密保护

【新增】3.新增后台发视频及视频链接上传

【新增】4.集成富文本编辑新增后台发布长文

【优化】5.点赞评论、粉丝关注等模块深度集成Redis实现高效缓存，提升接口性能

【优化】6.优化搜索模块限制搜索频率

【优化】7.后台前端vue3重构相关模块优化

【优化】8.其他细节优化



2023.9.12

###### V1.10.0发布

【新增】1.后台前端重构升级为Vue3+Element-Plus

【新增】2.新增适配微信小程序用户隐私协议

【新增】3.新增多种全局自定义加载样式

【新增】4.新增用户端404模块页面跳转

【优化】5.优化websocket心跳机制保持通信长连接

【优化】6.重构升级广场页导航模块支持不限数量

【优化】7.优化登录刷新、优化会员续费

2023.8.9

###### V1.9.1发布

【新增】1.新增用户经验等级模块和用户LV标识

【新增】2.新增积分打赏模块

【新增】3.新增帖子列表暗黑系列皮肤

【新增】4.新增小程序端支持获取微信头像昵称

【新增】5.会员开通支持余额支付

【新增】6.支持后台增减用户积分

【新增】7.支持后台指定用户会员状态和有效期限

【新增】8.支持后台创建圈子

【优化】9.支持后台圈子分类、问答限制等修改

【优化】10.增加发帖积分奖励每日限制次数防止盗刷

【优化】11.帖子内容增加链接标识及跳转

【优化】12.优化分享海报可能变形的问题



2023.6.27

###### V1.9.0发布

【新增】1.新增限制进圈问答审核模块

【新增】2.新增圈子黑名单方便圈子管理

【新增】3.新增好友列表删除功能

【新增】4.新增首页公告弹框

【新增】5.新增后台发帖

【新增】6.新增动态返回顶部按钮

【新增】7.新增后台帖子模块上下架管理

【优化】8.热搜话题、热搜帖子界面升级

【优化】9.搜索模块界面优化升级

【优化】10.话题页帖子分类等优化升级

【优化】11.后台首页统计面板优化升级

【优化】12.付费贴样式优化升级

【优化】13.长文详情页增加圈子信息

【优化】14.圈子名称重复问题优化

###### V1.8.2发布

【新增】1.新增首页可配置化布局

【新增】2.新增帖子详情页可配置化样式

【新增】3.新增搜索记录、热门搜索

【新增】4.新增圈主转让、成员搜索、成员移除

【新增】5.新增圈子详情页多分类列表

【新增】6.新增流量主广告可配置化

【新增】7.新增会员模块入口开关

【优化】8.重构优化首页、瀑布流列表样式

【优化】9.优化用户主页、圈子设置页样式

【优化】10.优化websocket切换应用重连

###### **V1.8.1发布**

【新增】1.新增长文模块，支持富文本编辑

【新增】2.新增用户账号处罚管理

【新增】3.新增用户名个性签名敏感词检测

【新增】4.新增首页广场页顶部背景色

【新增】5.新增管理端话题删贴和修改权限

【新增】6.新增websocket掉线重连重发

【新增】7.新增uniapp分包方便小程序端二开

【优化】8.优化升级话题详情页，圈子页，圈子简介页，付费确认页页面

【优化】9.优化个人页mini轮播外链跳转

【优化】10.优化视频贴发布参数校验及h5端控制台提示处理

【优化】11.优化用户主页帖子点赞传参

###### V1.8.0发布

【新增】1.新增用户提现模块

【新增】2.新增导航区

【新增】3.新增小程序端顶部收藏提示栏

【新增】4.新增私信消息重发机制

【新增】5.新增后台账单、会员等模块条件查询

【优化】6.后台统计面板统计优化

【优化】7.token过期强制登录问题优化

【优化】8.积分兑换余额模块前端重构优化

【优化】9.视频详情页优化

【优化】10.ios在h5端长按复制问题处理

######  V1.7.0发布

【新增】1.新增好友模块

【新增】2.新增IM即时通讯(自研，非第三方)

【新增】3.私聊支持表情包，文件，视频，图片

【新增】4.新增用户侧边导航栏

【新增】5.用户隐私设置

【优化】6.发帖页UI优化

【优化】7.消息模块重构升级

2022.11.7

###### **V1.6.0发布**

【新增】1.新增广场页

【新增】2.新增热榜用户，热榜帖子，热榜圈子，热榜话题

【新增】3.新增h5和小程序端帖子和圈子详情页海报分享

【新增】4.新增微信小程序登录绑定手机号 打通三端账号

【新增】5.新增帖子多图智能布局

【新增】6.新增接口缓存优化性能

【新增】7.新增限流注解用于验证码发送等防止盗刷接口

【新增】8.新增个人页mini幻灯片

【新增】9.新增腾讯地图精确ip定位接口

【新增】10.新增会员续费功能

【新增】11.新增帖子详情页定位和话题跳转

【优化】12.微信小程序登录接口规则变更的调整

【优化】13.圈子详情页前端优化调整 增加用户列表展示

【优化】14.帖子详情页、会员页面样式调整

【优化】15.后台管理系统细节优化如文本超出弹窗等

2022.10.8

###### **V1.5.0发布**

【新增】1.新增会员模块

【新增】2.接入广告模块

【新增】3.新增用户改名限制

【新增】4.新增发帖奖励

【新增】5.新增数字格式化 过滤器

【新增】6.会员积分奖励翻倍

【新增】7.新增系统消息长按删除

【新增】8.增加管理端消息模块 帐单模块条件查询

【新增】9.创建圈子数量限制

【优化】10.处理app端视频播放

【优化】11.删除帖子的数据清理优化

【优化】12.禁用账号禁止私聊

【优化】13.用户端圈子信息修改可能越权的问题

【优化】14.帖子详情查询优化

【优化】15.敏感词库管理优化调整



######  V1.4.2发布

2022.9.6

【新增】1.新增举报模块 [重磅]

【新增】2.重构升级用户主页和个人页UI [重磅]

【新增】3.APP端适配  [重磅]

【新增】4.帖子列表操作栏动态处理 

【优化】5.帖子列表查询优化及移动端结构调整

【优化】6.增加个人页背景图公共配置项

######  V1.4.1发布

2022.8.16

【新增】1.新增积分抽奖大转盘 [重磅]

【新增】2.新增圈子内帖子置顶功能 与平台置顶区分 [重磅]

【新增】3.新增客服页面 [重磅]

【新增】4.新增邮箱验证码登录 可配置开关 [重磅]

【新增】5.H5端新增注册页面 区分登录和注册 [重磅]

【优化】6.圈子管理员h5端删帖优化

【优化】7.h5端设置管理员页面样式兼容和用户列表图标

【优化】8.帖子详情查询优化

【优化】9.投票贴空选项优化

【优化】10.fastjson升级

【优化】11.后端swagger文档全注释

【优化】12.用户缓存信息

【优化】13.手机验证码登录

###### **V1.4.0发布**

2022.7.24

【新增】1.虚拟用户自动注册发帖 *【重磅】*

【新增】2.后台统一管理可配置项设置 *【重磅】*

【新增】3.后台管理系统首页增加echarts图和快捷入口 *【重磅】*

【新增】4.个人中心菜单在管理端可配置化 *【重磅】*

【新增】5.轮播图新增跳转链接包括外链和页面链接

【新增】6.新增帖子上下架系统消息通知的处理

【新增】7.新增圈子页公告栏通知

【优化】8.后台管理系统添加敏感操作日志记录

【优化】9.h5端登录页面重构升级 *【重磅】*

【修复】10.修复帖子列表由于置顶帖导致分页查询不全的问题

【修复】11.修复圈子解散和删除存在的bug



2022.7.1

###### **V1.3.2发布**

1.新增投票贴

2.私聊模块前端样式重构升级

3.系统通知消息统一管理

4.修复苹果机型无法格式化时间的问题

5.修复瀑布流模式下h5可能存在的不兼容

###### **V1.3.1发布**

<u>2022.6.8</u>

1.修复移动端分页功能存在的底部提示bug

2.修复圈子管理员修改圈子背景图无效的bug

3.修复圈子人数展示不统一的问题

4.修复一键已读为空时的异常报错

5.优化圈子查询代码

6.优化帖子分页查询组装代码

7.新增子评论回复时间展示

8.新增帖子列表组件置顶图标展示属性

9.新增发帖时选择话题

10.发帖时间改为新格式

11.新增帖子瀑布流展示风格组件

<u>2022.5.14</u>

###### **V1.3.0发布**

1.优化私聊功能及时性

2.优化阿里云短信验证码和测试阶段的处理

3.优化话题标签删除导致的问题

4.新增用户端圈子管理员圈内删贴功能

5.新增微信小程序端支付

6.新增私信列表历史消息

7.新增付费贴

8.新增积分签到

9.新增余额钱包体系&用户积分体系

10.新增可配置消息清理定时任务

11.新增用户端父子评论长按删除

12.新增管理端模糊查询

13.新增后台管理端用户余额充值

14.修复私信排序问题和查询可能存在的问题

15.修复quartz定时任务暂停和恢复的bug

16.新增h5微信支付

17.新增视频模块和充值模块显示配置

18.新增积分兑换余额模块

<u>2022.5.1</u>

###### **V1.2.3发布**

1.优化私聊功能及时性

2.优化阿里云短信验证码和测试阶段的处理

3.优化话题标签删除导致的问题

4.新增用户端圈子管理员圈内删贴功能

5.新增微信小程序端支付

6.新增私信列表历史消息

7.新增付费贴

<u>2022.4.24</u>

###### **V1.2.2发布**

1.修复H5端回复评论bug； 

2.修复H5端分享图标布局； 

3.修复H5登录同步圈子人数；

4.优化H5端圈子页布局； 

5.优化无效token处理； 

6.新增H5端删除个人帖子选项；

<u>2022.04.17</u>

###### **V1.2.1发布**

1.新增防止重复提交注解

2.扩大匿名访问权限

3.优化小程序登录

4.新增后台前端面板统计数据

5.移动端用户手机号脱敏处理

6.新增帖子上下架处理



<u>2022.04.04</u>

###### **V1.2发布**

 1.优化私聊模块

 2.新增置顶功能

 3.优化UI 

4.优化消息已读未读的处理 

5.其他bug修复



<u>2022.03.05</u>

###### **V1.1发布**

移动端适配H5

移动端分享功能优化

移动端其他bug修复



<u>2022.01.29</u>

###### **V1.0发布**

