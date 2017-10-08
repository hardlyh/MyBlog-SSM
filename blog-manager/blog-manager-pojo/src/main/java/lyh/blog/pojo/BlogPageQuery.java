package lyh.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogPageQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogPageQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNull() {
            addCriterion("page_title is null");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNotNull() {
            addCriterion("page_title is not null");
            return (Criteria) this;
        }

        public Criteria andPageTitleEqualTo(String value) {
            addCriterion("page_title =", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotEqualTo(String value) {
            addCriterion("page_title <>", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThan(String value) {
            addCriterion("page_title >", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("page_title >=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThan(String value) {
            addCriterion("page_title <", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThanOrEqualTo(String value) {
            addCriterion("page_title <=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLike(String value) {
            addCriterion("page_title like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotLike(String value) {
            addCriterion("page_title not like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleIn(List<String> values) {
            addCriterion("page_title in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotIn(List<String> values) {
            addCriterion("page_title not in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleBetween(String value1, String value2) {
            addCriterion("page_title between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotBetween(String value1, String value2) {
            addCriterion("page_title not between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlIsNull() {
            addCriterion("page_html_url is null");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlIsNotNull() {
            addCriterion("page_html_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlEqualTo(String value) {
            addCriterion("page_html_url =", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlNotEqualTo(String value) {
            addCriterion("page_html_url <>", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlGreaterThan(String value) {
            addCriterion("page_html_url >", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_html_url >=", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlLessThan(String value) {
            addCriterion("page_html_url <", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("page_html_url <=", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlLike(String value) {
            addCriterion("page_html_url like", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlNotLike(String value) {
            addCriterion("page_html_url not like", value, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlIn(List<String> values) {
            addCriterion("page_html_url in", values, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlNotIn(List<String> values) {
            addCriterion("page_html_url not in", values, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlBetween(String value1, String value2) {
            addCriterion("page_html_url between", value1, value2, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("page_html_url not between", value1, value2, "pageHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountIsNull() {
            addCriterion("page_viewing_count is null");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountIsNotNull() {
            addCriterion("page_viewing_count is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountEqualTo(Short value) {
            addCriterion("page_viewing_count =", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountNotEqualTo(Short value) {
            addCriterion("page_viewing_count <>", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountGreaterThan(Short value) {
            addCriterion("page_viewing_count >", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountGreaterThanOrEqualTo(Short value) {
            addCriterion("page_viewing_count >=", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountLessThan(Short value) {
            addCriterion("page_viewing_count <", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountLessThanOrEqualTo(Short value) {
            addCriterion("page_viewing_count <=", value, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountIn(List<Short> values) {
            addCriterion("page_viewing_count in", values, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountNotIn(List<Short> values) {
            addCriterion("page_viewing_count not in", values, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountBetween(Short value1, Short value2) {
            addCriterion("page_viewing_count between", value1, value2, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andPageViewingCountNotBetween(Short value1, Short value2) {
            addCriterion("page_viewing_count not between", value1, value2, "pageViewingCount");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andPageTagIsNull() {
            addCriterion("page_tag is null");
            return (Criteria) this;
        }

        public Criteria andPageTagIsNotNull() {
            addCriterion("page_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPageTagEqualTo(String value) {
            addCriterion("page_tag =", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagNotEqualTo(String value) {
            addCriterion("page_tag <>", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagGreaterThan(String value) {
            addCriterion("page_tag >", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagGreaterThanOrEqualTo(String value) {
            addCriterion("page_tag >=", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagLessThan(String value) {
            addCriterion("page_tag <", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagLessThanOrEqualTo(String value) {
            addCriterion("page_tag <=", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagLike(String value) {
            addCriterion("page_tag like", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagNotLike(String value) {
            addCriterion("page_tag not like", value, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagIn(List<String> values) {
            addCriterion("page_tag in", values, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagNotIn(List<String> values) {
            addCriterion("page_tag not in", values, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagBetween(String value1, String value2) {
            addCriterion("page_tag between", value1, value2, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageTagNotBetween(String value1, String value2) {
            addCriterion("page_tag not between", value1, value2, "pageTag");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateIsNull() {
            addCriterion("page_is_private is null");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateIsNotNull() {
            addCriterion("page_is_private is not null");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateEqualTo(Byte value) {
            addCriterion("page_is_private =", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateNotEqualTo(Byte value) {
            addCriterion("page_is_private <>", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateGreaterThan(Byte value) {
            addCriterion("page_is_private >", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateGreaterThanOrEqualTo(Byte value) {
            addCriterion("page_is_private >=", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateLessThan(Byte value) {
            addCriterion("page_is_private <", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateLessThanOrEqualTo(Byte value) {
            addCriterion("page_is_private <=", value, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateIn(List<Byte> values) {
            addCriterion("page_is_private in", values, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateNotIn(List<Byte> values) {
            addCriterion("page_is_private not in", values, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateBetween(Byte value1, Byte value2) {
            addCriterion("page_is_private between", value1, value2, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageIsPrivateNotBetween(Byte value1, Byte value2) {
            addCriterion("page_is_private not between", value1, value2, "pageIsPrivate");
            return (Criteria) this;
        }

        public Criteria andPageImgurlIsNull() {
            addCriterion("page_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andPageImgurlIsNotNull() {
            addCriterion("page_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andPageImgurlEqualTo(String value) {
            addCriterion("page_imgurl =", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlNotEqualTo(String value) {
            addCriterion("page_imgurl <>", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlGreaterThan(String value) {
            addCriterion("page_imgurl >", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("page_imgurl >=", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlLessThan(String value) {
            addCriterion("page_imgurl <", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlLessThanOrEqualTo(String value) {
            addCriterion("page_imgurl <=", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlLike(String value) {
            addCriterion("page_imgurl like", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlNotLike(String value) {
            addCriterion("page_imgurl not like", value, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlIn(List<String> values) {
            addCriterion("page_imgurl in", values, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlNotIn(List<String> values) {
            addCriterion("page_imgurl not in", values, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlBetween(String value1, String value2) {
            addCriterion("page_imgurl between", value1, value2, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageImgurlNotBetween(String value1, String value2) {
            addCriterion("page_imgurl not between", value1, value2, "pageImgurl");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNull() {
            addCriterion("page_description is null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNotNull() {
            addCriterion("page_description is not null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionEqualTo(String value) {
            addCriterion("page_description =", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotEqualTo(String value) {
            addCriterion("page_description <>", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThan(String value) {
            addCriterion("page_description >", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("page_description >=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThan(String value) {
            addCriterion("page_description <", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("page_description <=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLike(String value) {
            addCriterion("page_description like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotLike(String value) {
            addCriterion("page_description not like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIn(List<String> values) {
            addCriterion("page_description in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotIn(List<String> values) {
            addCriterion("page_description not in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionBetween(String value1, String value2) {
            addCriterion("page_description between", value1, value2, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotBetween(String value1, String value2) {
            addCriterion("page_description not between", value1, value2, "pageDescription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}