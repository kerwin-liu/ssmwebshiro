webpackJsonp([4],{"101C":function(e,t,n){var i=n("uO+r");"string"==typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);n("rjj0")("5913e6c6",i,!0)},"5dBV":function(e,t,n){e.exports={default:n("quu5"),__esModule:!0}},"9GQk":function(e,t,n){"use strict";function i(e){n("101C")}Object.defineProperty(t,"__esModule",{value:!0});var l=n("5dBV"),a=n.n(l),r=n("fuSz"),o=n("LOkV"),s=(n("fAxu"),n("kMct")),c=n("DoGJ"),d={components:{ElRow:c.a,ElCol:s.a},data:function(){return{clientLoading:!1,clientAddAddressVisible:!1,clientListDialogVisible:!1,remarkEditDialogVisible:!1,loading:!1,inventoriesIndex:"",inventoryListDialogVisible:!1,inventoryLoading:!1,isIndeterminate:!0,checkAll:!1,options:[],addresses:[],transports:[],modelForm:{clientId:"",cAddress:"",cPhone:"",transport:"",transportNo:"",remake:"",inventoryLogs:[]},deliverInventory:{deliverQuantity:0,deliverTaxAmount:0,deliverTotalPrice:0,deliverTotalPriceTax:0,stockResult:0},inventoryListQo:{itemId:"",itemName:"",userId:"",inventoryTime:[],inventoryTimeStart:"",inventoryTimeEnd:"",pageIndex:1,pageSize:5},clientAddressAddQo:{id:"",clientId:"",address:""},inventoryListVo:[],inventory:{},client:{id:"",cName:"",cAddress:"",cPhone:"",transport:"",transportNo:""},clientUpdate:{id:"",cAddress:""},clientPageQo:{cName:"",cPhone:"",cLevel:"",pageIndex:1,pageSize:4},clientPageVo:{},rules:{clientAddress:[{required:!0,message:"收货人新增地址不能为空",trigger:"blur"}]}}},methods:{indexMethod:function(e){return this.inventoryListQo.pageIndex*this.inventoryListQo.pageSize-this.inventoryListQo.pageSize+e+1},indexMethod2:function(e){return this.clientPageQo.pageIndex*this.clientPageQo.pageSize-this.clientPageQo.pageSize+e+1},openSearchForm:function(){this.loading=!0,this.inventoryListDialogVisible=!0,this.getInventory()},openSearchClient:function(){this.clientLoading=!0,this.clientListDialogVisible=!0,this.getClient()},remarkEdit:function(){this.remarkEditDialogVisible=!0},getClient:function(){var e=this;r.a.get("/client/getPage",{params:{cName:this.clientPageQo.cName,cPhone:this.clientPageQo.cPhone,cLevel:this.clientPageQo.cLevel,pageIndex:this.clientPageQo.pageIndex,pageSize:this.clientPageQo.pageSize}}).then(function(t){var n=t.data;e.clientPageVo=n,e.clientLoading=!1}).catch(function(){})},chooseClient:function(e){this.client=e,this.modelForm.clientId=e.id,this.clientListDialogVisible=!1,this.getAddressAndTransport()},getAddressAndTransport:function(){var e=this;r.a.get("/client/getAddress/"+this.modelForm.clientId).then(function(t){var n=t.data;e.addresses=n}).catch(function(){}),r.a.get("/transport/getList",{}).then(function(t){var n=t.data;e.transports=n}).catch(function(){})},getInventory:function(){var e=this;this.inventoryLoading=!0,r.a.get("/inventory/getPages",{params:{itemId:this.inventoryListQo.itemId,itemName:this.inventoryListQo.itemName,userId:this.inventoryListQo.userId,startTime:this.inventoryListQo.inventoryTimeStart,endTime:this.inventoryListQo.inventoryTimeEnd,pageIndex:this.inventoryListQo.pageIndex,pageSize:this.inventoryListQo.pageSize}}).then(function(t){var n=t.data;e.loading=!1,e.inventoryListVo=n}).catch(function(){})},getOne:function(){var e=this;r.a.get("/inventory/getOne/"+this.$route.params.id).then(function(t){e.inventory=t.data,e.deliverInventory.stockResult=e.inventory.stock}).catch(function(){})},deliverQuantityChange:function(){this.inventory.stock>0&&(this.deliverInventory.stockResult=this.inventory.stock-this.deliverInventory.deliverQuantity,this.deliverInventory.deliverTotalPrice=this.deliverInventory.deliverQuantity*this.inventory.price,this.deliverInventory.deliverTotalPrice=Number(a()(this.deliverInventory.deliverTotalPrice).toFixed(2)),this.deliverInventory.deliverTotalPriceTax=this.deliverInventory.deliverQuantity*this.inventory.priceTax,this.deliverInventory.deliverTotalPriceTax=Number(a()(this.deliverInventory.deliverTotalPriceTax).toFixed(2)),this.deliverInventory.deliverTaxAmount=this.deliverInventory.deliverTotalPriceTax-this.deliverInventory.deliverTotalPrice,this.deliverInventory.deliverTaxAmount=Number(a()(this.deliverInventory.deliverTaxAmount).toFixed(2)),this.inventory.remainTotalPrice=this.deliverInventory.stockResult*this.inventory.price,this.inventory.remainTotalPrice=Number(a()(this.inventory.remainTotalPrice).toFixed(2)),this.inventory.remainTotalPriceTax=this.deliverInventory.stockResult*this.inventory.priceTax,this.inventory.remainTotalPriceTax=Number(a()(this.inventory.remainTotalPriceTax).toFixed(2)),this.inventory.remainTaxAmount=this.inventory.remainTotalPriceTax-this.inventory.remainTotalPrice,this.inventory.remainTaxAmount=Number(a()(this.inventory.remainTaxAmount).toFixed(2)))},AddInventory:function(){this.modelForm.inventoryLogs.push({id:this.inventory.id,itemName:this.inventory.itemName,models:this.inventory.models,quantity:this.deliverInventory.deliverQuantity,unitName:this.inventory.unitName,priceTax:this.inventory.priceTax,price:this.inventory.price,totalPrice:this.deliverInventory.deliverTotalPrice,rates:this.inventory.rates,taxAmount:this.deliverInventory.deliverTaxAmount,totalPriceTax:this.deliverInventory.deliverTotalPriceTax,stockResult:this.deliverInventory.stockResult,remainTaxAmount:this.inventory.remainTaxAmount,remainTotalPrice:this.inventory.remainTotalPrice,remainTotalPriceTax:this.inventory.remainTotalPriceTax}),this.deliverInventory.deliverQuantity=0,this.inventory.stock=this.deliverInventory.stockResult},openAddClientAddress:function(){""!==this.client.id?this.clientAddAddressVisible=!0:this.$message.error("必须先选择收货人才能新增地址！！")},AddClientAddress:function(){var e=this;""===this.clientAddressAddQo.address?this.$message.error("新增地址为空"):(this.loading=!0,this.clientAddressAddQo.clientId=this.client.id,r.a.post("/client/saveAddress",o.a.stringify(this.clientAddressAddQo)).then(function(t){e.loading=!1,e.clientAddAddressVisible=!1,e.$message({message:t.msg,type:"success"}),e.client.cAddress=e.clientAddressAddQo.address}).catch(function(t){e.loading=!1,e.$message({message:t.msg,type:"error"})})),this.updateClientAddress()},updateClientAddress:function(){var e=this;this.clientUpdate.cAddress=this.clientAddressAddQo.address,this.clientUpdate.id=this.client.id,r.a.post("/client/update",o.a.stringify(this.clientUpdate)).then(function(t){e.loading=!1,e.$message({message:t.msg,type:"success"})}).catch(function(t){e.loading=!1,e.$message({message:t.msg,type:"error"})}),this.getAddressAndTransport()},addClient:function(){this.clientListDialogVisible=!1,this.$router.push({path:"/manager/clientAdd"})},DeleteInventory:function(){this.options.sort(function(e,t){return e-t});for(var e=this.options.length;e>0;e--)this.modelForm.inventoryLogs.splice(this.options[e-1],1);this.options=[],this.isIndeterminate=!1},handleCurrentChange:function(e){this.inventoryListQo.pageIndex=e,this.getInventory()},handleSizeChange:function(e){this.inventoryListQo.pageSize=e,this.getInventory()},handleCurrentChangeClient:function(e){this.clientPageQo.pageIndex=e,this.getClient()},handleSizeChangeClient:function(e){this.clientPageQo.pageSize=e,this.getClient()},chooseItem:function(e){this.inventory=e,this.deliverInventory.stockResult=this.inventory.stock,this.deliverInventory.deliverQuantity=0,this.inventoryListDialogVisible=!1},handleCheckAllChange:function(e){this.options=e?options:[],this.isIndeterminate=!1},handleCheckedCitiesChange:function(){this.checkAll=this.options.length===options.length,this.isIndeterminate=this.options.length>0&&this.options.length<options.length},handleSave:function(e){var t=this;this.$refs[e].validate(function(e){if(!e)return!1;console.log(t.client),0==t.modelForm.inventoryLogs.length?t.$message.error("必须选择出库商品才能出库！！"):""===t.modelForm.clientId?t.$message.error("必须选择收货人才能出库！！"):""===t.client.cPhone?t.$message.error("必须填写收货人电话才能出库！！"):""===t.modelForm.transport?t.$message.error("必须选择物流公司才能出库！！"):""===t.modelForm.transportNo?t.$message.error("必须填写物流单号才能出库！！"):(t.loading=!0,t.modelForm.cAddress=t.client.cAddress,t.modelForm.cPhone=t.client.cPhone,r.a.post("/inventoryLog/save",t.modelForm).then(function(e){t.loading=!1,t.$message({message:e.msg,type:"success"}),t.$router.push("/repertory/Log")}).catch(function(e){t.loading=!1,t.$message({message:e.msg,type:"error"})}))})}},created:function(){"123"!=this.$route.params.id&&this.getOne()}},v=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("el-form",{ref:"inventory",attrs:{"label-position":"top",model:e.inventory}},[n("el-row",{attrs:{gutter:20}},[n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"商品名称",prop:"itemName"}},[n("el-input",{staticClass:"login-form-input",attrs:{placeholder:"库存",size:"small",readonly:!0},model:{value:e.inventory.itemName,callback:function(t){e.$set(e.inventory,"itemName",t)},expression:"inventory.itemName"}},[n("i",{staticClass:"el-icon-search el-input__icon",attrs:{slot:"suffix"},on:{click:function(t){e.openSearchForm()}},slot:"suffix"})])],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"库存数量",prop:"stock"}},[n("el-input",{attrs:{placeholder:"库存数量",size:"small",readonly:!0},model:{value:e.inventory.stock,callback:function(t){e.$set(e.inventory,"stock",t)},expression:"inventory.stock"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:3}},[n("el-form-item",{attrs:{label:"出库数量",prop:"deliverQuantity"}},[n("el-input-number",{attrs:{size:"small",min:0,max:e.inventory.stock,label:"已经到到最大出库数量"},on:{input:e.deliverQuantityChange},model:{value:e.deliverInventory.deliverQuantity,callback:function(t){e.$set(e.deliverInventory,"deliverQuantity",t)},expression:"deliverInventory.deliverQuantity"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"使用税额",prop:"deliverTaxAmount"}},[n("el-input",{attrs:{placeholder:"使用税额",size:"small",readonly:!0},model:{value:e.deliverInventory.deliverTaxAmount,callback:function(t){e.$set(e.deliverInventory,"deliverTaxAmount",t)},expression:"deliverInventory.deliverTaxAmount"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"使用金额",prop:"deliverTotalPrice"}},[n("el-input",{attrs:{placeholder:"使用金额",size:"small",readonly:!0},model:{value:e.deliverInventory.deliverTotalPrice,callback:function(t){e.$set(e.deliverInventory,"deliverTotalPrice",t)},expression:"deliverInventory.deliverTotalPrice"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"使用合计",prop:"deliverTotalPriceTax"}},[n("el-input",{attrs:{placeholder:"使用合计",size:"small",readonly:!0},model:{value:e.deliverInventory.deliverTotalPriceTax,callback:function(t){e.$set(e.deliverInventory,"deliverTotalPriceTax",t)},expression:"deliverInventory.deliverTotalPriceTax"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"剩余数量",prop:"stockResult"}},[n("el-input",{attrs:{placeholder:"剩余数量",size:"small",readonly:!0},model:{value:e.deliverInventory.stockResult,callback:function(t){e.$set(e.deliverInventory,"stockResult",t)},expression:"deliverInventory.stockResult"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"剩余税额",prop:"remainTaxAmount"}},[n("el-input",{attrs:{placeholder:"剩余税额",size:"small",readonly:!0},model:{value:e.inventory.remainTaxAmount,callback:function(t){e.$set(e.inventory,"remainTaxAmount",t)},expression:"inventory.remainTaxAmount"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"剩余金额",prop:"remainTotalPrice"}},[n("el-input",{attrs:{placeholder:"剩余金额",size:"small",readonly:!0},model:{value:e.inventory.remainTotalPrice,callback:function(t){e.$set(e.inventory,"remainTotalPrice",t)},expression:"inventory.remainTotalPrice"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"剩余合计",prop:"remainTotalPriceTax"}},[n("el-input",{attrs:{placeholder:"剩余合计",size:"small",readonly:!0},model:{value:e.inventory.remainTotalPriceTax,callback:function(t){e.$set(e.inventory,"remainTotalPriceTax",t)},expression:"inventory.remainTotalPriceTax"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"操作"}},[n("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.AddInventory}},[e._v("增加到出库")]),e._v(" "),n("el-button",{staticStyle:{"margin-left":"0px"},attrs:{type:"danger",size:"small"},on:{click:e.DeleteInventory}},[e._v("删除所选行")])],1)],1)],1)],1),e._v(" "),n("div",{staticClass:"main-repertory-div"},[n("el-row",{staticClass:"main-repertory text-center"},[n("el-col",{attrs:{span:1}},[n("el-checkbox",{attrs:{indeterminate:e.isIndeterminate},on:{change:e.handleCheckAllChange},model:{value:e.checkAll,callback:function(t){e.checkAll=t},expression:"checkAll"}},[e._v("全选\n        ")])],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:4}},[e._v("\n        商品名称\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        规格\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        数量\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        单位\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        单价\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        不含税单价\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        金额\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        税率\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        税额\n      ")]),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:3}},[e._v("\n        价税合计\n      ")])],1),e._v(" "),n("el-row",{attrs:{span:24}}),e._v(" "),n("el-form",{ref:"modelForm",attrs:{"label-position":"top",model:e.modelForm,rules:e.rules}},[e._l(e.modelForm.inventoryLogs,function(t,i){return n("el-row",{key:t.key,attrs:{gutter:20}},[n("el-col",{attrs:{span:1}},[n("el-form-item",{attrs:{"label-width":"0px"}},[n("el-checkbox",{attrs:{label:i,size:"mini"},on:{change:e.handleCheckedCitiesChange},model:{value:e.options,callback:function(t){e.options=t},expression:"options"}},[e._v("\n              "+e._s(i+1)+"\n            ")])],1)],1),e._v(" "),n("el-col",{attrs:{span:4}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.itemName)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            ["+e._s(t.models)+"]\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.quantity)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.unitName)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.priceTax)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.price)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.totalPrice)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.rates)+"%\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.taxAmount)+"\n          ")])],1),e._v(" "),n("el-col",{attrs:{span:3}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.totalPriceTax)+"\n          ")])],1)],1)}),e._v(" "),n("el-row",{attrs:{gutter:20}},[n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:3}},[n("el-form-item",{staticStyle:{"text-align":"center"},attrs:{label:"收货人"}},[n("el-input",{staticClass:"login-form-input",attrs:{placeholder:"客户名称",size:"small",readonly:!0},model:{value:e.client.cName,callback:function(t){e.$set(e.client,"cName",t)},expression:"client.cName"}},[n("i",{staticClass:"el-icon-search el-input__icon",attrs:{slot:"suffix"},on:{click:function(t){e.openSearchClient()}},slot:"suffix"})])],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:4}},[n("el-form-item",{attrs:{label:"收货电话"}},[n("el-input",{attrs:{size:"small",placeholder:"收货电话"},model:{value:e.client.cPhone,callback:function(t){e.$set(e.client,"cPhone",t)},expression:"client.cPhone"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:5}},[n("el-form-item",{attrs:{label:"收货地址"}},[n("el-select",{attrs:{size:"small",clearable:"",placeholder:"请选择客户收货地址"},model:{value:e.client.cAddress,callback:function(t){e.$set(e.client,"cAddress",t)},expression:"client.cAddress"}},e._l(e.addresses,function(e){return n("el-option",{key:e.id,attrs:{label:e.address,value:e.address}})}))],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"新增地址"}},[n("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.openAddClientAddress}},[e._v("使用新地址")])],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:3}},[n("el-form-item",{attrs:{label:"收货物流"}},[n("el-select",{attrs:{size:"small",clearable:"",placeholder:"请选择"},model:{value:e.modelForm.transport,callback:function(t){e.$set(e.modelForm,"transport",t)},expression:"modelForm.transport"}},e._l(e.transports,function(e){return n("el-option",{key:e.id,attrs:{label:e.logisticsName,value:e.logisticsName}})}))],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:5}},[n("el-form-item",{attrs:{label:"物流单号"}},[n("el-input",{attrs:{size:"small",placeholder:"物流单号"},model:{value:e.modelForm.transportNo,callback:function(t){e.$set(e.modelForm,"transportNo",t)},expression:"modelForm.transportNo"}})],1)],1),e._v(" "),n("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[n("el-form-item",{attrs:{label:"备注"}},[n("el-button",{attrs:{type:"text"},on:{click:e.remarkEdit}},[e._v("点击编辑")])],1)],1)],1),e._v(" "),n("el-row",[n("el-col",{attrs:{span:4,offset:10}},[n("el-button",{attrs:{type:"primary",loading:e.loading,size:"small"},on:{click:function(t){e.handleSave("modelForm")}}},[e._v("商 品 出 库\n          ")])],1)],1)],2)],1),e._v(" "),n("el-dialog",{attrs:{title:"选择库存商品",visible:e.inventoryListDialogVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.inventoryListDialogVisible=t}}},[n("el-form",{attrs:{inline:!0,model:e.inventoryListQo}},[n("el-form-item",{attrs:{label:"商品名称"}},[n("el-input",{attrs:{placeholder:"商品名称"},model:{value:e.inventoryListQo.itemName,callback:function(t){e.$set(e.inventoryListQo,"itemName","string"==typeof t?t.trim():t)},expression:"inventoryListQo.itemName"}})],1),e._v(" "),n("el-form-item",[n("el-button",{attrs:{type:"primary"},on:{click:e.getInventory}},[e._v("查询")])],1)],1),e._v(" "),n("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"el-table-1",attrs:{data:e.inventoryListVo.result,"empty-text":"暂无数据",height:"auto","default-sort":{order:"descending"}},on:{"row-dblclick":e.chooseItem}},[n("el-table-column",{attrs:{sortable:"",type:"index",index:e.indexMethod,label:"序号",width:"50",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"itemName",label:"商品名称",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"models",label:"规格型号",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"stock",label:"现有库存",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"createTime",label:"入库时间",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{label:"操作",align:"center",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[n("el-button",{on:{click:function(n){e.chooseItem(t.row)}}},[e._v("选中\n          ")])]}}])})],1),e._v(" "),n("div",{staticClass:"block paging"},[n("el-pagination",{attrs:{"current-page":e.inventoryListVo.currentPageNo,"page-sizes":[5,10,30,100],"page-size":5,layout:"total, sizes, prev, pager, next, jumper",total:e.inventoryListVo.totalCount},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)],1),e._v(" "),n("el-dialog",{attrs:{title:"增加新的收货地址",visible:e.clientAddAddressVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.clientAddAddressVisible=t}}},[n("el-input",{attrs:{type:"textarea",placeholder:"收货地址"},model:{value:e.clientAddressAddQo.address,callback:function(t){e.$set(e.clientAddressAddQo,"address",t)},expression:"clientAddressAddQo.address"}}),e._v(" "),n("br"),e._v(" "),n("br"),e._v(" "),n("el-button",{attrs:{size:"small"},on:{click:e.AddClientAddress}},[e._v("增加地址")])],1),e._v(" "),n("el-dialog",{attrs:{title:"编辑备注",visible:e.remarkEditDialogVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.remarkEditDialogVisible=t}}},[n("el-input",{attrs:{type:"textarea",placeholder:"备注"},model:{value:e.modelForm.remake,callback:function(t){e.$set(e.modelForm,"remake",t)},expression:"modelForm.remake"}}),e._v(" "),n("br"),e._v(" "),n("br"),e._v(" "),n("el-button",{attrs:{size:"small"},on:{click:function(t){e.remarkEditDialogVisible=!1}}},[e._v("保存备注")])],1),e._v(" "),n("el-dialog",{attrs:{title:"选择客户信息",visible:e.clientListDialogVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.clientListDialogVisible=t}}},[n("el-form",{attrs:{inline:!0,model:e.clientPageQo,rules:e.rules}},[n("el-col",{attrs:{span:7}},[n("el-form-item",{attrs:{label:"客户名称"}},[n("el-input",{attrs:{size:"small",placeholder:"客户名称"},model:{value:e.clientPageQo.cName,callback:function(t){e.$set(e.clientPageQo,"cName",t)},expression:"clientPageQo.cName"}})],1)],1),e._v(" "),n("el-col",{attrs:{span:7}},[n("el-form-item",{attrs:{label:"客户手机号"}},[n("el-input",{attrs:{size:"small",placeholder:"客户手机号"},model:{value:e.clientPageQo.cPhone,callback:function(t){e.$set(e.clientPageQo,"cPhone",t)},expression:"clientPageQo.cPhone"}})],1)],1),e._v(" "),n("el-col",{attrs:{span:6}},[n("el-form-item",{attrs:{label:"级别"}},[n("el-select",{attrs:{clearable:"",placeholder:"请选择客户级别"},model:{value:e.clientPageQo.cLevel,callback:function(t){e.$set(e.clientPageQo,"cLevel",t)},expression:"clientPageQo.cLevel"}},[n("el-option",{attrs:{label:"初级",value:"1"}}),e._v(" "),n("el-option",{attrs:{label:"中级",value:"2"}}),e._v(" "),n("el-option",{attrs:{label:"高级",value:"3"}})],1)],1)],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",[n("el-button",{attrs:{size:"small"},on:{click:e.getClient}},[e._v("查询")])],1)],1),e._v(" "),n("el-col",{attrs:{span:2}},[n("el-form-item",[n("el-button",{attrs:{size:"small"},on:{click:e.addClient}},[e._v("新增客户")])],1)],1)],1),e._v(" "),n("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.clientLoading,expression:"clientLoading"}],staticClass:"el-table-1",attrs:{data:e.clientPageVo.result,"empty-text":"暂无数据",height:"auto","default-sort":{order:"descending"}},on:{"row-dblclick":e.chooseClient}},[n("el-table-column",{attrs:{type:"expand"},scopedSlots:e._u([{key:"default",fn:function(t){return[n("el-form",{staticClass:"demo-table-expand",attrs:{"label-position":"left",inline:""}},[n("el-form-item",{attrs:{label:"客户地址:"}},[e._v("\n              "+e._s(t.row.cAddress)+"\n            ")]),e._v(" "),n("el-form-item",{attrs:{label:"备注:"}},[e._v("\n              "+e._s(t.row.cRemark)+"\n            ")])],1)]}}])}),e._v(" "),n("el-table-column",{attrs:{sortable:"",type:"index",index:e.indexMethod2,label:"序号",width:"50",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cName",label:"客户名称",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cSex",label:"客户性别",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cPhone",label:"客户电话",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cWx",label:"微信号",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cQq",label:"QQ号",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{sortable:"",prop:"cLevel",label:"客户级别",align:"center"}}),e._v(" "),n("el-table-column",{attrs:{label:"操作",align:"center",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[n("el-button",{attrs:{size:"mini"},on:{click:function(n){e.chooseClient(t.row)}}},[e._v("选中\n          ")])]}}])})],1),e._v(" "),n("div",{staticClass:"block paging"},[n("el-pagination",{attrs:{"current-page":e.clientPageVo.currentPageNo,"page-sizes":[4,10,30,100],"page-size":4,layout:"total, sizes, prev, pager, next, jumper",total:e.clientPageVo.totalCount},on:{"size-change":e.handleSizeChangeClient,"current-change":e.handleCurrentChangeClient}})],1)],1)],1)},m=[],p={render:v,staticRenderFns:m},u=p,h=n("VU/8"),g=i,y=h(d,u,!1,g,"data-v-1fde7270",null);t.default=y.exports},CHlY:function(e,t,n){var i=n("kM2E"),l=n("bs6G");i(i.S+i.F*(Number.parseFloat!=l),"Number",{parseFloat:l})},bs6G:function(e,t,n){var i=n("7KvD").parseFloat,l=n("mnVu").trim;e.exports=1/i(n("hyta")+"-0")!=-1/0?function(e){var t=l(String(e),3),n=i(t);return 0===n&&"-"==t.charAt(0)?-0:n}:i},hyta:function(e,t){e.exports="\t\n\v\f\r   ᠎             　\u2028\u2029\ufeff"},mnVu:function(e,t,n){var i=n("kM2E"),l=n("52gC"),a=n("S82l"),r=n("hyta"),o="["+r+"]",s="​",c=RegExp("^"+o+o+"*"),d=RegExp(o+o+"*$"),v=function(e,t,n){var l={},o=a(function(){return!!r[e]()||s[e]()!=s}),c=l[e]=o?t(m):r[e];n&&(l[n]=c),i(i.P+i.F*o,"String",l)},m=v.trim=function(e,t){return e=String(l(e)),1&t&&(e=e.replace(c,"")),2&t&&(e=e.replace(d,"")),e};e.exports=v},quu5:function(e,t,n){n("CHlY"),e.exports=parseFloat},"uO+r":function(e,t,n){t=e.exports=n("FZ+f")(!0),t.push([e.i,"\n.el-table-1[data-v-1fde7270] {\n  height: 55vh;\n}\n.main-repertory[data-v-1fde7270] {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n  height: 35px;\n  line-height: 35px;\n  color: #6c59d8;\n  font-size: 16px;\n}\n.main-repertory-div[data-v-1fde7270] {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n}\n","",{version:3,sources:["C:/vue/kerwin-vue/kerwin-vue/src/components/repertory/InventoryLog.vue"],names:[],mappings:";AACA;EACE,aAAa;CACd;AACD;EACE,8BAA8B;EAC9B,iCAAiC;EACjC,+BAA+B;EAC/B,gCAAgC;EAChC,aAAa;EACb,kBAAkB;EAClB,eAAe;EACf,gBAAgB;CACjB;AACD;EACE,8BAA8B;EAC9B,iCAAiC;EACjC,+BAA+B;EAC/B,gCAAgC;CACjC",file:"InventoryLog.vue",sourcesContent:["\n.el-table-1[data-v-1fde7270] {\n  height: 55vh;\n}\n.main-repertory[data-v-1fde7270] {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n  height: 35px;\n  line-height: 35px;\n  color: #6c59d8;\n  font-size: 16px;\n}\n.main-repertory-div[data-v-1fde7270] {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n}\n"],sourceRoot:""}])}});
//# sourceMappingURL=4.abeb39b9a5f217f9157e.js.map