webpackJsonp([20],{EbgA:function(e,t,a){var n=a("Patn");"string"==typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);a("rjj0")("0d6726c2",n,!0)},Patn:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.el-table-1[data-v-63941ee3] {\n  height: 67vh;\n}\n.demo-table-expand[data-v-63941ee3] {\n  font-size: 0;\n}\n.demo-table-expand label[data-v-63941ee3] {\n  width: 90px;\n  color: #99a9bf;\n}\n.demo-table-expand .el-form-item[data-v-63941ee3] {\n  margin-right: 0;\n  margin-bottom: 0;\n  width: 100%;\n}\n","",{version:3,sources:["C:/vue/kerwin-vue/kerwin-vue/src/components/manager/client/List.vue"],names:[],mappings:";AACA;EACE,aAAa;CACd;AACD;EACE,aAAa;CACd;AACD;EACE,YAAY;EACZ,eAAe;CAChB;AACD;EACE,gBAAgB;EAChB,iBAAiB;EACjB,YAAY;CACb",file:"List.vue",sourcesContent:["\n.el-table-1[data-v-63941ee3] {\n  height: 67vh;\n}\n.demo-table-expand[data-v-63941ee3] {\n  font-size: 0;\n}\n.demo-table-expand label[data-v-63941ee3] {\n  width: 90px;\n  color: #99a9bf;\n}\n.demo-table-expand .el-form-item[data-v-63941ee3] {\n  margin-right: 0;\n  margin-bottom: 0;\n  width: 100%;\n}\n"],sourceRoot:""}])},gQif:function(e,t,a){"use strict";function n(e){a("EbgA")}Object.defineProperty(t,"__esModule",{value:!0});var l=a("fuSz"),o=a("DoGJ"),i={components:{ElRow:o.a},data:function(){return{loading:!1,clientPageQo:{cName:"",cPhone:"",cLevel:"",pageIndex:1,pageSize:7},data:{}}},methods:{indexMethod:function(e){return this.clientPageQo.pageIndex*this.clientPageQo.pageSize-this.clientPageQo.pageSize+e+1},onSubmit:function(){var e=this;this.loading=!0,l.a.get("/client/getPage",{params:{cName:this.clientPageQo.cName,cPhone:this.clientPageQo.cPhone,cLevel:this.clientPageQo.cLevel,pageIndex:this.clientPageQo.pageIndex,pageSize:this.clientPageQo.pageSize}}).then(function(t){var a=t.data;e.data=a,e.loading=!1,console.log(e.data)}).catch(function(){}),console.log(this.data)},addItem:function(){this.$router.push({path:"/manager/clientAdd"})},handleEdit:function(e,t){this.$router.push({path:"/manager/clientModify/"+t.id})},handleSizeChange:function(e){this.clientPageQo.pageSize=e,this.onSubmit()},handleCurrentChange:function(e){this.clientPageQo.pageIndex=e,this.onSubmit()}},created:function(){this.onSubmit()}},r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("el-row",[a("el-form",{attrs:{inline:!0,model:e.clientPageQo}},[a("el-col",{attrs:{span:7}},[a("el-form-item",{attrs:{label:"客户名称"}},[a("el-input",{attrs:{size:"small",placeholder:"客户名称"},model:{value:e.clientPageQo.cName,callback:function(t){e.$set(e.clientPageQo,"cName",t)},expression:"clientPageQo.cName"}})],1)],1),e._v(" "),a("el-col",{attrs:{span:7}},[a("el-form-item",{attrs:{label:"客户手机号"}},[a("el-input",{attrs:{size:"small",placeholder:"客户手机号"},model:{value:e.clientPageQo.cPhone,callback:function(t){e.$set(e.clientPageQo,"cPhone",t)},expression:"clientPageQo.cPhone"}})],1)],1),e._v(" "),a("el-col",{attrs:{span:6}},[a("el-form-item",{attrs:{label:"级别"}},[a("el-select",{attrs:{clearable:"",placeholder:"请选择客户级别"},model:{value:e.clientPageQo.cLevel,callback:function(t){e.$set(e.clientPageQo,"cLevel",t)},expression:"clientPageQo.cLevel"}},[a("el-option",{attrs:{label:"初级",value:"1"}}),e._v(" "),a("el-option",{attrs:{label:"中级",value:"2"}}),e._v(" "),a("el-option",{attrs:{label:"高级",value:"3"}})],1)],1)],1),e._v(" "),a("el-col",{attrs:{span:2}},[a("el-form-item",[a("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.onSubmit}},[e._v("查询")])],1)],1),e._v(" "),a("el-col",{attrs:{span:2}},[a("el-form-item",[a("el-button",{attrs:{size:"small",type:"primary"},on:{click:e.addItem}},[e._v("新 增 客 户")])],1)],1)],1)],1),e._v(" "),a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"el-table-1",attrs:{data:e.data.result,"empty-text":"暂无数据",height:"auto","default-sort":{order:"descending"}}},[a("el-table-column",{attrs:{type:"expand"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-form",{staticClass:"demo-table-expand",attrs:{"label-position":"left",inline:""}},[a("el-form-item",{attrs:{label:"客户地址:"}},[e._v("\n            "+e._s(t.row.cAddress)+"\n          ")]),e._v(" "),a("el-form-item",{attrs:{label:"备注:"}},[e._v("\n            "+e._s(t.row.cRemark)+"\n          ")])],1)]}}])}),e._v(" "),a("el-table-column",{attrs:{sortable:"",type:"index",index:e.indexMethod,label:"序号",width:"50",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cName",label:"客户名称",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cSex",label:"客户性别",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cPhone",label:"客户电话",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cWx",label:"微信号",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cQq",label:"QQ号",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"cLevel",label:"客户级别",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{sortable:"",prop:"createTime",label:"创建时间",align:"center"}}),e._v(" "),a("el-table-column",{attrs:{label:"操作",align:"center",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{size:"mini"},on:{click:function(a){e.handleEdit(t.$index,t.row)}}},[e._v("修改客户信息\n        ")])]}}])})],1),e._v(" "),a("div",{staticClass:"block paging"},[a("el-pagination",{attrs:{"current-page":e.data.currentPageNo,"page-sizes":[7,20,30,100],"page-size":7,layout:"total, sizes, prev, pager, next, jumper",total:e.data.totalCount},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)],1)},c=[],s={render:r,staticRenderFns:c},d=s,g=a("VU/8"),p=n,u=g(i,d,!1,p,"data-v-63941ee3",null);t.default=u.exports}});
//# sourceMappingURL=20.c723744f1a7c41d3aa12.js.map