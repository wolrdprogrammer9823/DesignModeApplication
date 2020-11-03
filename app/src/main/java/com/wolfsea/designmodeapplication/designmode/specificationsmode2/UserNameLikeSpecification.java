package com.wolfsea.designmodeapplication.designmode.specificationsmode2;

/**
 * @author liuliheng
 * @desc 用户名字像规格
 * @time 2020/11/4  0:54
 **/
public class UserNameLikeSpecification implements IUserSpecification {

    private static final String LIKE_FLAG = "%";

    private String name;

    public UserNameLikeSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean mIsSatisfiedUser(User user) {

        boolean result;
        String paramName = user.getName();

        String simplifyName = name.replaceAll(LIKE_FLAG, "");

        boolean nameStartWithLikeFlag = name.startsWith(LIKE_FLAG);
        boolean nameEndWithLikeFlag = name.endsWith(LIKE_FLAG);

        if (nameStartWithLikeFlag && !nameEndWithLikeFlag) {

            //%XX
            result = paramName.endsWith(simplifyName);
        } else if (!nameStartWithLikeFlag && nameEndWithLikeFlag){

            //XX%
            result = paramName.startsWith(simplifyName);
        } else {

            //%XX%
            result = paramName.contains(simplifyName);
        }

        return result;
    }
}
