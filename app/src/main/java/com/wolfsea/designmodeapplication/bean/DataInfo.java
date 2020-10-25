package com.wolfsea.designmodeapplication.bean;
import java.io.Serializable;
import java.util.List;

public class DataInfo implements Serializable {

   /*
   *
   *"resultCode":"00",
  "configInfo":"1234",
  "others":"其他",
  "resultInfo":[]
   * */

    private String resultCode;
    private String configInfo;
    private String others;
    private List<InnerInfo> resultInfo;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public List<InnerInfo> getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(List<InnerInfo> resultInfo) {
        this.resultInfo = resultInfo;
    }

    public static class InnerInfo implements Serializable {
        /*
        *  {
        "id":"101",
        "score":100,
        "phone":"101803832",
        "grade":"1",
        "hobby":"滑冰"
      },
      {
        "id":"102",
        "score":90,
        "grade":"3",
        "hobby":"游泳"
      },
      {
        "id":"103",
        "score":80,
        "hobby":"羽毛球"
      }
        * */

        private String id;
        private int score;
        private String phone;
        private String grade;
        private String hobby;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }


        @Override
        public String toString() {
            return "InnerInfo{" +
                    "id='" + id + '\'' +
                    ", score=" + score +
                    ", phone='" + phone + '\'' +
                    ", grade='" + grade + '\'' +
                    ", hobby='" + hobby + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DataInfo{" +
                "resultCode='" + resultCode + '\'' +
                ", configInfo='" + configInfo + '\'' +
                ", others='" + others + '\'' +
                ", resultInfo=" + resultInfo +
                '}';
    }
}
