# Java-TourismSystem
 # 功能说明
 本课程设计内容为旅游管理系统。运用了Swing图形界面设计和数据库程序设计，分别实现了前台用户注册、线路查询、留言等功能；后台线路、订单管理，留言回复等功能。具体功能如下图所示：
 
 <div align="center">
 
![image](https://user-images.githubusercontent.com/73818850/226194587-9284b4ce-7d38-4ff0-89f9-1751a83d9a3c.png)

</div>

1. 账号模块：尚未注册的游客可在一开始的主界面处点击注册，注册信息将录入数据库；登录时用户名和密码与数据库中信息做判断，登陆后数据库中登录状态变为已登录；注销时数据库中的用户账户将被删除。
2. 旅游线路模块：游客可在查询界面通过游玩地点查询线路，在推荐界面查看系统所推荐的线路；无需登录即可了解到线路的详细信息；同时可在此界面点击预定按钮，系统会判断游客的登录状态，已登录用户填写个人信息即可预定，未登录用户则跳转到登录界面。
3. 留言模块：未登录游客可以浏览留言板，登录后可以留言，留言板会显示留言时间和身份。
4. 管理员模块：管理员通过管理员账号密码进入管理中心，管理员权限有：
 1. 对旅游线路的增删改和通过线路id查询。
b.对用户订单的删改和通过姓名或电话号码查询。
c.对用户账号的删除。
d.对用户留言的回复。
