用于日常Demo学习，测试及入门案例等(仅用于个人测试使用，喜欢可以查看，不喜勿喷。有什么改进意见，欢迎评论，也可以发我邮箱（18309225600@163.com）谢谢！)。

package 目录规则：

    lhf.test01： 设计模式
            a1 : 设计原则01-单一职责demo


        .test02  nio
            q: io 和 nio的区别和联系？
            a:联系： 基于相同的目的和作用。
              区别：1. io面向流  ，nio面向缓冲区。
                    2. io阻塞 ，nio非阻塞。
                    3.Buffer操作起来很麻烦
            a1: 基于io方式的server 与client的交互（存在的问题：1.阻塞  2.线程暴增）
                解决方案：可以使用线程池优化第二点，多余的请求在queue中排队等候。
            a2: 对于nio中buffer的使用
