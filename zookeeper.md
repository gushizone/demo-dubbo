```wiki
1.	下载Zookeeper最新版，
http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.5.5/

2.	配置
打开文件夹/usr/local/apache-zookeeper-3.5.5-bin/conf
将zoo_sample.cfg 复制一份命名为zoo.cfg

3.	启动Zookeeper
打开文件夹/usr/local/apache-zookeeper-3.5.5-bin/bin
Mac执行命令行执行 ./zkServer.sh start
Windows同学执行对应的cmd文件

启动完成以后出现这个就代表着启动成功
ZooKeeper JMX enabled by default
Using config: /usr/local/apache-zookeeper-3.5.5/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED

4.	运行验证 ./zkCli.sh
最后打印出一堆东西最后一行是
WatchedEvent state:SyncConnected type:None path:null

5.	关闭Zookeeper   ./zkServer.sh stop

```