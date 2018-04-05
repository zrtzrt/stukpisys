(()=>{
	$(".btn1").on("click",function(){
		$(this).parent().parent().next().children(":first").removeClass("none1").next().addClass("none1");
	});
	$(".btn2").on("click",function(){
		$(this).parent().parent().next().children(":first").addClass("none1").next().removeClass("none1");
	});
})();

var sift = new Vue({
    el: '#sift',
    data: {
        name:'',
        role:'',
        sex: ['全部','男','女'],
        hr: ['全部'],
        job: ['全部'],
        major: ['全部'],
        highest_educate: ['全部'],
        school_name: ['全部'],
        items6: [
            { message: '2017-12' },
            { message: '2018-3' },
            { message: '2018-4' }
        ],
        sift_sex: '',
        sift_hr: '',
        sift_job: '',
        sift_major: '',
        sift_highest_educate: '',
        sift_school_name: '',

    },
    mounted: function () {
        this.initialization();
    },
    methods: {
        initialization() {
            this.name=localStorage.getItem('name');
            this.role=localStorage.getItem('role');
            // console.log(localStorage.getItem('token'));
            this.$http.get('/sift/getSiftTerms').then((response) => {
                console.log(response);
                let data = response.data;
                this.hr.push(data.hr);
                this.job.push(data.job);
                this.major.push(data.major);
                this.highest_educate.push(data.highest_educate);
                this.school_name.push(data.school_name);
            }).catch(function (error) {
                alert("载入信息出错，"+error)
            });
        },
        Authorization(){
            if("ROLE_HR"==this.role)
                this.hr=[this.name];
            //todo

        },
        sift(){
            this.$http.get('/sift/score',{
                HRName:this.sift_hr,
                //todo
            }).then((response) => {
                console.log(response);
                //todo
            }).catch(function (error) {
                alert("载入信息出错，"+error)
            });
        },
        doLogout() {
            localStorage.clear();
        }
    }
});

var table = new Vue({
    el: '#table',
    data: {
        //todo
        items7: [
            { message: '面试官所在部门' },
            { message: '阶段一成绩↓' },
            { message: '阶段二成绩↓' },
            { message: '阶段三成绩↓' },
            { message: '个人信息' },
            { message: '详细信息' }
        ],
        items8: [
            { message: '电子政务' },
            { message: '89' },
            { message: '91' },
            { message: '90' },
            { message: '91' },
            { message: '90' }
        ],
        items9: [
            { message: '电子政务' },
            { message: '89' },
            { message: '91' },
            { message: '90' },
            { message: '91' },
            { message: '90' }
        ],
        items10: [
            { message: '电子政务' },
            { message: '89' },
            { message: '91' },
            { message: '90' },
            { message: '91' },
            { message: '90' }
        ],
        items11: [
            { message: '电子政务' },
            { message: '89' },
            { message: '91' },
            { message: '90' },
            { message: '91' },
            { message: '90' }
        ],
        items12: [
            { message: '电子政务' },
            { message: '89' },
            { message: '91' },
            { message: '90' },
            { message: '91' },
            { message: '90' },
        ]
    }
});