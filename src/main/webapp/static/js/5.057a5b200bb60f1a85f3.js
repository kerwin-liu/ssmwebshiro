webpackJsonp([5],{"+hrm":function(e,t,i){var n=i("WPld");"string"==typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);i("rjj0")("55c43d09",n,!0)},"5dBV":function(e,t,i){e.exports={default:i("quu5"),__esModule:!0}},CHlY:function(e,t,i){var n=i("kM2E"),a=i("bs6G");n(n.S+n.F*(Number.parseFloat!=a),"Number",{parseFloat:a})},WPld:function(e,t,i){t=e.exports=i("FZ+f")(!0),t.push([e.i,"\n.el-table-1 {\n  height: 55vh;\n}\n.kerwin-main-content-title-button {\n  display: inline-block;\n  float: right;\n}\n.main-repertory {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n  height: 35px;\n  line-height: 35px;\n  color: #6c59d8;\n  font-size: 16px;\n}\n.login-form-input .el-input__inner {\n  padding: 0 4px;\n}\n.main-repertory-div {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n}\n\n","",{version:3,sources:["C:/vue/kerwin-vue/kerwin-vue/src/components/repertory/Insert.vue"],names:[],mappings:";AACA;EACE,aAAa;CACd;AACD;EACE,sBAAsB;EACtB,aAAa;CACd;AACD;EACE,8BAA8B;EAC9B,iCAAiC;EACjC,+BAA+B;EAC/B,gCAAgC;EAChC,aAAa;EACb,kBAAkB;EAClB,eAAe;EACf,gBAAgB;CACjB;AACD;EACE,eAAe;CAChB;AACD;EACE,8BAA8B;EAC9B,iCAAiC;EACjC,+BAA+B;EAC/B,gCAAgC;CACjC",file:"Insert.vue",sourcesContent:["\n.el-table-1 {\n  height: 55vh;\n}\n.kerwin-main-content-title-button {\n  display: inline-block;\n  float: right;\n}\n.main-repertory {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n  height: 35px;\n  line-height: 35px;\n  color: #6c59d8;\n  font-size: 16px;\n}\n.login-form-input .el-input__inner {\n  padding: 0 4px;\n}\n.main-repertory-div {\n  border-top: 1px solid #000000;\n  border-bottom: 1px solid #000000;\n  border-left: 1px solid #000000;\n  border-right: 1px solid #000000;\n}\n\n"],sourceRoot:""}])},bs6G:function(e,t,i){var n=i("7KvD").parseFloat,a=i("mnVu").trim;e.exports=1/n(i("hyta")+"-0")!=-1/0?function(e){var t=a(String(e),3),i=n(t);return 0===i&&"-"==t.charAt(0)?-0:i}:n},hyta:function(e,t){e.exports="\t\n\v\f\r   ᠎             　\u2028\u2029\ufeff"},iBq5:function(e,t,i){"use strict";function n(e,t,i){this.$children.forEach(function(a){a.$options.componentName===e?a.$emit.apply(a,[t].concat(i)):n.apply(a,[e,t].concat([i]))})}function a(e){var t=window.getComputedStyle(e),i=t.getPropertyValue("box-sizing"),n=parseFloat(t.getPropertyValue("padding-bottom"))+parseFloat(t.getPropertyValue("padding-top")),a=parseFloat(t.getPropertyValue("border-bottom-width"))+parseFloat(t.getPropertyValue("border-top-width"));return{contextStyle:v.map(function(e){return e+":"+t.getPropertyValue(e)}).join(";"),paddingSize:n,borderSize:a,boxSizing:i}}function o(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:1,i=arguments.length>2&&void 0!==arguments[2]?arguments[2]:null;h||(h=document.createElement("textarea"),document.body.appendChild(h));var n=a(e),o=n.paddingSize,r=n.borderSize,l=n.boxSizing,s=n.contextStyle;h.setAttribute("style",s+";"+g),h.value=e.value||e.placeholder||"";var c=h.scrollHeight,p={};"border-box"===l?c+=r:"content-box"===l&&(c-=o),h.value="";var u=h.scrollHeight-o;if(null!==t){var d=u*t;"border-box"===l&&(d=d+o+r),c=Math.max(d,c),p.minHeight=d+"px"}if(null!==i){var m=u*i;"border-box"===l&&(m=m+o+r),c=Math.min(m,c)}return p.height=c+"px",h.parentNode&&h.parentNode.removeChild(h),h=null,p}function r(e){i("+hrm")}Object.defineProperty(t,"__esModule",{value:!0});var l=i("5dBV"),s=i.n(l),c=i("fuSz"),p=i("fAxu"),u=(i("LOkV"),i("DoGJ")),d=i("kMct"),m={methods:{dispatch:function(e,t,i){for(var n=this.$parent||this.$root,a=n.$options.componentName;n&&(!a||a!==e);)(n=n.$parent)&&(a=n.$options.componentName);n&&n.$emit.apply(n,[t].concat(i))},broadcast:function(e,t,i){n.call(this,e,t,i)}}},f={mounted:function(){return},methods:{getMigratingConfig:function(){return{props:{},events:{}}}}},h=void 0,g="\n  height:0 !important;\n  visibility:hidden !important;\n  overflow:hidden !important;\n  position:absolute !important;\n  z-index:-1000 !important;\n  top:0 !important;\n  right:0 !important\n",v=["letter-spacing","line-height","padding-top","padding-bottom","font-family","font-weight","font-size","text-rendering","text-transform","width","text-indent","padding-left","padding-right","border-width","box-sizing"],x=function(e){for(var t=1,i=arguments.length;t<i;t++){var n=arguments[t]||{};for(var a in n)if(n.hasOwnProperty(a)){var o=n[a];void 0!==o&&(e[a]=o)}}return e},b={name:"ElInput",componentName:"ElInput",mixins:[m,f],inject:{elForm:{default:""},elFormItem:{default:""}},data:function(){return{currentValue:this.value,textareaCalcStyle:{},prefixOffset:null,suffixOffset:null}},props:{value:[String,Number],placeholder:String,size:String,resize:String,name:String,form:String,id:String,maxlength:Number,minlength:Number,readonly:Boolean,autofocus:Boolean,disabled:Boolean,type:{type:String,default:"text"},autosize:{type:[Boolean,Object],default:!1},rows:{type:Number,default:2},autoComplete:{type:String,default:"off"},max:{},min:{},step:{},validateEvent:{type:Boolean,default:!0},suffixIcon:String,prefixIcon:String,label:String},computed:{_elFormItemSize:function(){return(this.elFormItem||{}).elFormItemSize},validateState:function(){return this.elFormItem?this.elFormItem.validateState:""},needStatusIcon:function(){return!!this.elForm&&this.elForm.statusIcon},validateIcon:function(){return{validating:"el-icon-loading",success:"el-icon-circle-check",error:"el-icon-circle-close"}[this.validateState]},textareaStyle:function(){return x({},this.textareaCalcStyle,{resize:this.resize})},inputSize:function(){return this.size||this._elFormItemSize||(this.$ELEMENT||{}).size},isGroup:function(){return this.$slots.prepend||this.$slots.append}},watch:{value:function(e,t){this.setCurrentValue(e)}},methods:{focus:function(){(this.$refs.input||this.$refs.textarea).focus()},getMigratingConfig:function(){return{props:{icon:"icon is removed, use suffix-icon / prefix-icon instead.","on-icon-click":"on-icon-click is removed."},events:{click:"click is removed."}}},handleBlur:function(e){this.$emit("blur",e),this.validateEvent&&this.dispatch("ElFormItem","el.form.blur",[this.currentValue])},inputSelect:function(){(this.$refs.input||this.$refs.textarea).select()},resizeTextarea:function(){if(!this.$isServer){var e=this.autosize;if("textarea"===this.type){if(!e)return void(this.textareaCalcStyle={minHeight:o(this.$refs.textarea).minHeight});var t=e.minRows,i=e.maxRows;this.textareaCalcStyle=o(this.$refs.textarea,t,i)}}},handleFocus:function(e){this.$emit("focus",e)},handleInput:function(e){var t=e.target.value;this.$emit("input",t),this.setCurrentValue(t)},handleChange:function(e){this.$emit("change",e.target.value)},setCurrentValue:function(e){var t=this;e!==this.currentValue&&(this.$nextTick(function(e){t.resizeTextarea()}),this.currentValue=e,this.validateEvent&&this.dispatch("ElFormItem","el.form.change",[e]))},calcIconOffset:function(e){var t={suf:"append",pre:"prepend"},i=t[e];if(this.$slots[i])return{transform:"translateX("+("suf"===e?"-":"")+this.$el.querySelector(".el-input-group__"+i).offsetWidth+"px)"}}},created:function(){this.$on("inputSelect",this.inputSelect)},mounted:function(){this.resizeTextarea(),this.isGroup&&(this.prefixOffset=this.calcIconOffset("pre"),this.suffixOffset=this.calcIconOffset("suf"))}},y=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",{class:["textarea"===e.type?"el-textarea":"el-input",e.inputSize?"el-input--"+e.inputSize:"",{"is-disabled":e.disabled,"el-input-group":e.$slots.prepend||e.$slots.append,"el-input-group--append":e.$slots.append,"el-input-group--prepend":e.$slots.prepend,"el-input--prefix":e.$slots.prefix||e.prefixIcon,"el-input--suffix":e.$slots.suffix||e.suffixIcon}]},["textarea"!==e.type?[e.$slots.prepend?i("div",{staticClass:"el-input-group__prepend",attrs:{tabindex:"0"}},[e._t("prepend")],2):e._e(),e._v(" "),"textarea"!==e.type?i("input",e._b({ref:"input",staticClass:"el-input__inner",attrs:{autocomplete:e.autoComplete,"aria-label":e.label},domProps:{value:e.currentValue},on:{input:e.handleInput,focus:e.handleFocus,blur:e.handleBlur,change:e.handleChange}},"input",e.$props,!1)):e._e(),e._v(" "),e.$slots.prefix||e.prefixIcon?i("span",{staticClass:"el-input__prefix",style:e.prefixOffset},[e._t("prefix"),e._v(" "),e.prefixIcon?i("i",{staticClass:"el-input__icon",class:e.prefixIcon}):e._e()],2):e._e(),e._v(" "),e.$slots.suffix||e.suffixIcon||e.validateState&&e.needStatusIcon?i("span",{staticClass:"el-input__suffix",style:e.suffixOffset},[i("span",{staticClass:"el-input__suffix-inner"},[e._t("suffix"),e._v(" "),e.suffixIcon?i("i",{staticClass:"el-input__icon",class:e.suffixIcon}):e._e()],2),e._v(" "),e.validateState?i("i",{staticClass:"el-input__icon",class:["el-input__validateIcon",e.validateIcon]}):e._e()]):e._e(),e._v(" "),e.$slots.append?i("div",{staticClass:"el-input-group__append"},[e._t("append")],2):e._e()]:i("textarea",e._b({ref:"textarea",staticClass:"el-textarea__inner",style:e.textareaStyle,attrs:{"aria-label":e.label},domProps:{value:e.currentValue},on:{input:e.handleInput,focus:e.handleFocus,blur:e.handleBlur,change:e.handleChange}},"textarea",e.$props,!1))],2)},_=[],C={render:y,staticRenderFns:_},S=C,A=i("VU/8"),I=A(b,S,!1,null,null,null),k=I.exports,P=[0],N={components:{ElInput:k,ElCol:d.a,ElRow:u.a},data:function(){var e=function(e,t,i){if(!p.a.validateQuantity(t))return i(new Error("请填写正确的入库数量"));i()},t=function(e,t,i){if(!p.a.validateMoney(t))return i(new Error("请填写正确的数据"));i()};return{pdfDialogVisible:!1,invoiceItemDialogVisible:!1,inventoriesIndex:null,isIndeterminate:!0,checkAll:!1,invoiceCodeVo:"",invoiceNoVo:"",repertoryOptions:[],modelForm:{pdfId:"",inventories:[{key:Date.now(),readonly:!0,itemId:"",itemName:"",unitName:"",price:0,priceTax:0,rates:"",models:"",quantity:"",taxAmount:0,totalPrice:0,totalPriceTax:0,producedTime:"",invoiceStatus:"",remark:""}]},loading:!1,pdfLading:!1,itemQo:{itemNo:null,itemName:null,models:null,pageIndex:1,pageSize:10},items:[],dialogTableVisible:!1,dialogFormVisible:!1,form:{name:"",region:"",date1:"",date2:"",delivery:!1,type:[],resource:"",desc:""},pdfQo:{invoiceCode:"",invoiceNo:"",pageIndex:1,pageSize:10},pdfs:[],pickerOptions:{disabledDate:function(e){return e.getTime()>Date.now()},shortcuts:[{text:"今天",onClick:function(e){e.$emit("pick",new Date)}},{text:"昨天",onClick:function(e){var t=new Date;t.setTime(t.getTime()-864e5),e.$emit("pick",t)}},{text:"一周前",onClick:function(e){var t=new Date;t.setTime(t.getTime()-6048e5),e.$emit("pick",t)}}]},rules:{itemName:[{required:!0,message:"请选择入库商品",trigger:"change"}],quantity:[{required:!0,message:"请输入数量",trigger:"change"},{validator:e,trigger:"change"}],money:[{validator:t,trigger:"change"}],producedTime:[{required:!0,message:"请输入生产日期"}]}}},methods:{indexMethod:function(e){return this.pdfQo.pageIndex*this.pdfQo.pageSize-this.pdfQo.pageSize+e+1},indexMethod2:function(e){return this.itemQo.pageIndex*this.itemQo.pageSize-this.itemQo.pageSize+e+1},selectPDF:function(){this.pdfLading=!0,this.pdfDialogVisible=!0,this.getPdfs()},openSearchForm:function(e){this.loading=!0,this.inventoriesIndex=e,this.invoiceItemDialogVisible=!0,this.getItems()},getPdfs:function(){var e=this;c.a.get("/pdf/getPages",{params:{invoiceCode:this.pdfQo.invoiceCode,invoiceNo:this.pdfQo.invoiceNo,pageIndex:this.pdfQo.pageIndex,pageSize:this.pdfQo.pageSize}}).then(function(t){var i=t.data;e.pdfs=i,e.pdfLading=!1}).catch(function(){})},getItems:function(){var e=this;c.a.get("/item/getPages",{params:{itemNo:this.itemQo.itemNo,itemName:this.itemQo.itemName,models:this.itemQo.models,pageIndex:this.itemQo.pageIndex,pageSize:this.itemQo.pageSize}}).then(function(t){var i=t.data;e.items=i,e.loading=!1}).catch(function(){})},handleSizeChange:function(e){this.itemQo.pageSize=e,this.getItems()},handleCurrentChange:function(e){this.itemQo.pageIndex=e,this.getItems()},handlePDFSizeChange:function(e){this.pdfQo.pageSize=e,this.getPdfs()},handlePDFCurrentChange:function(e){this.pdfQo.pageIndex=e,this.getPdfs()},chooseItem:function(e){this.modelForm.inventories[this.inventoriesIndex].itemName=e.itemName,this.modelForm.inventories[this.inventoriesIndex].itemId=e.id,this.modelForm.inventories[this.inventoriesIndex].unitName=e.unitName,this.modelForm.inventories[this.inventoriesIndex].rates=e.rates,this.modelForm.inventories[this.inventoriesIndex].models=e.models,isNaN(parseInt(e.rates))||(this.modelForm.inventories[this.inventoriesIndex].readonly=!1),this.invoiceItemDialogVisible=!1},choosePdf:function(e){this.modelForm.pdfId=e.id,this.invoiceCodeVo=e.invoiceCode,this.invoiceNoVo=e.invoiceNo,this.pdfDialogVisible=!1},AddInventory:function(){this.modelForm.inventories.push({key:Date.now(),readonly:!0,itemId:"",itemName:"",quantity:"",price:0,priceTax:0,taxAmount:0,totalPrice:0,totalPriceTax:0,producedTime:"",invoiceStatus:"",remark:""}),P.push(this.modelForm.inventories.length-1)},DeleteInventory:function(){this.repertoryOptions.sort(function(e,t){return e-t});for(var e=this.repertoryOptions.length;e>0;e--)this.modelForm.inventories.splice(this.repertoryOptions[e-1],1);this.repertoryOptions=[],this.isIndeterminate=!1},handleCheckAllChange:function(e){this.repertoryOptions=e?P:[],this.isIndeterminate=!1},handleCheckedCitiesChange:function(){this.checkAll=this.repertoryOptions.length===P.length,this.isIndeterminate=this.repertoryOptions.length>0&&this.repertoryOptions.length<P.length},quantityChange:function(e){p.a.validateQuantity(e.quantity)&&(e.totalPrice=e.quantity*e.price,e.totalPrice=Number(s()(e.totalPrice).toFixed(2)),e.totalPriceTax=e.quantity*e.priceTax,e.totalPriceTax=Number(s()(e.totalPriceTax).toFixed(2)),e.taxAmount=e.totalPriceTax-e.totalPrice,e.taxAmount=Number(s()(e.taxAmount).toFixed(2)))},priceTaxChange:function(e){p.a.validateMoney(e.priceTax)&&(e.price=e.priceTax/(1+e.rates/100),e.price=Number(s()(e.price).toFixed(2)),e.totalPrice=e.quantity*e.price,e.totalPrice=Number(s()(e.totalPrice).toFixed(2)),e.totalPriceTax=e.quantity*e.priceTax,e.totalPriceTax=Number(s()(e.totalPriceTax).toFixed(2)),e.taxAmount=e.totalPriceTax-e.totalPrice,e.taxAmount=Number(s()(e.taxAmount).toFixed(2)))},priceChange:function(e){p.a.validateMoney(e.price)&&(e.priceTax=e.price*(1+e.rates/100),e.priceTax=Number(s()(e.priceTax).toFixed(2)),e.totalPrice=e.quantity*e.price,e.totalPrice=Number(s()(e.totalPrice).toFixed(2)),e.totalPriceTax=e.quantity*e.priceTax,e.totalPriceTax=Number(s()(e.totalPriceTax).toFixed(2)),e.taxAmount=e.totalPriceTax-e.totalPrice,e.taxAmount=Number(s()(e.taxAmount).toFixed(2)))},totalPriceTaxChange:function(e){p.a.validateMoney(e.totalPriceTax)&&(e.priceTax=e.totalPriceTax/e.quantity,e.priceTax=Number(s()(e.priceTax).toFixed(2)),this.priceTaxChange(e))},handleSave:function(e){var t=this;this.$refs[e].validate(function(e){if(!e)return!1;t.loading=!0,c.a.post("/inventory/save",t.modelForm).then(function(e){t.loading=!1,t.$message({message:e.msg,type:"success"}),t.$router.push("/repertory/query")}).catch(function(e){t.loading=!1,t.$message({message:e.msg,type:"error"})})})}},computed:{squantity:function(){return this.modelForm.inventories.filter(function(e){return e.totalPriceTax}).map(function(e){return e.totalPriceTax}).reduce(function(e,t){return parseFloat(t)+e},0)}}},z=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",[i("el-row",[i("el-col",{attrs:{span:8,offset:16}},[i("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.selectPDF}},[e._v("选择发票")]),e._v(" "),i("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.AddInventory}},[e._v("增加一条商品")]),e._v(" "),i("el-button",{staticClass:"kerwin-main-content-title-button",attrs:{type:"danger",size:"small"},on:{click:e.DeleteInventory}},[e._v("删除行")])],1),e._v(" "),i("el-col",{attrs:{span:5}},[e._v("\n      发票代码:"+e._s(e.invoiceCodeVo)+"\n    ")]),e._v(" "),i("el-col",{attrs:{span:5}},[e._v("\n      发票号码:"+e._s(e.invoiceNoVo)+"\n    ")])],1),e._v(" "),i("div",{staticClass:"main-repertory-div"},[i("el-row",{staticClass:"main-repertory text-center",attrs:{span:"10"}},[i("el-col",{attrs:{span:1}},[i("el-checkbox",{attrs:{indeterminate:e.isIndeterminate},on:{change:e.handleCheckAllChange},model:{value:e.checkAll,callback:function(t){e.checkAll=t},expression:"checkAll"}},[e._v("全选\n        ")])],1),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        商品名称\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        规格\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        数量\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:1}},[e._v("\n        单位\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        单价\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        不含税单价\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        金额\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:1}},[e._v("\n        税率\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        税额\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:2}},[e._v("\n        价税合计\n      ")]),e._v(" "),i("el-col",{staticStyle:{"text-align":"center"},attrs:{span:3}},[e._v("\n        生产日期\n      ")])],1),e._v(" "),i("el-row",{attrs:{span:24}}),e._v(" "),i("el-form",{ref:"modelForm",attrs:{model:e.modelForm,rules:e.rules}},[e._l(e.modelForm.inventories,function(t,n){return i("el-row",{key:t.key,attrs:{gutter:20,span:24}},[i("el-col",{attrs:{span:1}},[i("el-form-item",{attrs:{"label-width":"0px"}},[i("el-checkbox",{attrs:{label:n,size:"mini"},on:{change:e.handleCheckedCitiesChange},model:{value:e.repertoryOptions,callback:function(t){e.repertoryOptions=t},expression:"repertoryOptions"}},[e._v("\n              "+e._s(n+1)+"\n            ")])],1)],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{attrs:{"label-width":"0px",prop:"inventories."+n+".itemName",rules:e.rules.itemName}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",placeholder:"请选择入库商品",readonly:!0},model:{value:t.itemName,callback:function(i){e.$set(t,"itemName",e._n("string"==typeof i?i.trim():i))},expression:"inventory.itemName"}},[i("i",{staticClass:"el-icon-search el-input__icon",attrs:{slot:"suffix"},on:{click:function(t){e.openSearchForm(n)}},slot:"suffix"})])],1)],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            ["+e._s(t.models)+"]\n          ")])],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".quantity",rules:e.rules.quantity}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small"},on:{input:function(i){e.quantityChange(t)}},model:{value:t.quantity,callback:function(i){e.$set(t,"quantity","string"==typeof i?i.trim():i)},expression:"inventory.quantity"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:1}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            ("+e._s(t.unitName)+")\n          ")])],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".priceTax",rules:e.rules.money}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",readonly:t.readonly},on:{input:function(i){e.priceTaxChange(t)}},model:{value:t.priceTax,callback:function(i){e.$set(t,"priceTax",e._n("string"==typeof i?i.trim():i))},expression:"inventory.priceTax"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".price",rules:e.rules.money}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",readonly:t.readonly},on:{input:function(i){e.priceChange(t)}},model:{value:t.price,callback:function(i){e.$set(t,"price",e._n("string"==typeof i?i.trim():i))},expression:"inventory.price"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".totalPrice",rules:e.rules.money}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",readonly:!0},model:{value:t.totalPrice,callback:function(i){e.$set(t,"totalPrice",e._n("string"==typeof i?i.trim():i))},expression:"inventory.totalPrice"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:1}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px"}},[e._v("\n            "+e._s(t.rates)+"%\n          ")])],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".taxAmount",rules:e.rules.money}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",readonly:!0},model:{value:t.taxAmount,callback:function(i){e.$set(t,"taxAmount",e._n("string"==typeof i?i.trim():i))},expression:"inventory.taxAmount"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:2}},[i("el-form-item",{staticStyle:{"text-align":"center"},attrs:{"label-width":"0px",prop:"inventories."+n+".totalPriceTax",rules:e.rules.money}},[i("el-input",{staticClass:"login-form-input",attrs:{size:"small",readonly:t.readonly},on:{input:function(i){e.totalPriceTaxChange(t)}},model:{value:t.totalPriceTax,callback:function(i){e.$set(t,"totalPriceTax",e._n("string"==typeof i?i.trim():i))},expression:"inventory.totalPriceTax"}})],1)],1),e._v(" "),i("el-col",{attrs:{span:3}},[i("el-form-item",{attrs:{prop:"inventories."+n+".producedTime",rules:e.rules.producedTime}},[i("el-date-picker",{attrs:{size:"small",align:"right",type:"date",placeholder:"选择日期","picker-options":e.pickerOptions},model:{value:t.producedTime,callback:function(i){e.$set(t,"producedTime",i)},expression:"inventory.producedTime"}})],1)],1)],1)}),e._v(" "),i("el-row",[i("el-col",{attrs:{span:3}},[e._v("总合计金额：")]),e._v(" "),i("el-col",{attrs:{span:2,offset:15}},[e._v("\n          "+e._s(e.squantity)+"元\n        ")])],1),e._v(" "),i("el-row",[i("el-col",{attrs:{span:4,offset:10}},[i("el-button",{attrs:{type:"primary",loading:e.loading,size:"small"},on:{click:function(t){e.handleSave("modelForm")}}},[e._v("保 存 入 库")])],1)],1)],2)],1),e._v(" "),i("el-dialog",{attrs:{title:"选择电子发票",visible:e.pdfDialogVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.pdfDialogVisible=t}}},[i("el-form",{attrs:{inline:!0,model:e.pdfQo}},[i("el-form-item",{attrs:{label:"发票代码"}},[i("el-input",{attrs:{placeholder:"发票代码"},model:{value:e.pdfQo.invoiceCode,callback:function(t){e.$set(e.pdfQo,"invoiceCode",t)},expression:"pdfQo.invoiceCode"}})],1),e._v(" "),i("el-form-item",{attrs:{label:"发票号码"}},[i("el-input",{attrs:{placeholder:"发票号码"},model:{value:e.pdfQo.invoiceNo,callback:function(t){e.$set(e.pdfQo,"invoiceNo",t)},expression:"pdfQo.invoiceNo"}})],1),e._v(" "),i("el-form-item",[i("el-button",{attrs:{type:"primary"},on:{click:e.getPdfs}},[e._v("查询")])],1)],1),e._v(" "),i("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.pdfLading,expression:"pdfLading"}],staticClass:"el-table-1",attrs:{data:e.pdfs.result,"empty-text":"暂无数据",height:"auto"},on:{"row-dblclick":e.choosePdf}},[i("el-table-column",{attrs:{sortable:"",type:"index",index:e.indexMethod,label:"序号",width:"50",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"invoiceCode",label:"发票代码",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"invoiceNo",label:"发票号码",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{label:"操作",align:"center",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[i("el-button",{on:{click:function(i){e.choosePdf(t.row)}}},[e._v("选中\n          ")])]}}])})],1),e._v(" "),i("div",{staticClass:"block paging"},[i("el-pagination",{attrs:{"current-page":e.pdfs.currentPageNo,"page-sizes":[10,20,30,100],"page-size":10,layout:"total, sizes, prev, pager, next, jumper",total:e.pdfs.totalCount},on:{"size-change":e.handlePDFSizeChange,"current-change":e.handlePDFCurrentChange}})],1)],1),e._v(" "),i("el-dialog",{attrs:{title:"选择商品信息",visible:e.invoiceItemDialogVisible,"append-to-body":"",width:"70%"},on:{"update:visible":function(t){e.invoiceItemDialogVisible=t}}},[i("el-form",{attrs:{inline:!0,model:e.itemQo}},[i("el-form-item",{attrs:{label:"商品编号"}},[i("el-input",{attrs:{placeholder:"商品编号"},model:{value:e.itemQo.itemNo,callback:function(t){e.$set(e.itemQo,"itemNo",t)},expression:"itemQo.itemNo"}})],1),e._v(" "),i("el-form-item",{attrs:{label:"商品名称"}},[i("el-input",{attrs:{placeholder:"商品名称"},model:{value:e.itemQo.itemName,callback:function(t){e.$set(e.itemQo,"itemName","string"==typeof t?t.trim():t)},expression:"itemQo.itemName"}})],1),e._v(" "),i("el-form-item",[i("el-button",{attrs:{type:"primary"},on:{click:e.getItems}},[e._v("查询")])],1)],1),e._v(" "),i("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"el-table-1",attrs:{data:e.items.result,"empty-text":"暂无数据",height:"auto","default-sort":{order:"descending"}},on:{"row-dblclick":e.chooseItem}},[i("el-table-column",{attrs:{sortable:"",type:"index",index:e.indexMethod2,label:"序号",width:"50",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"itemNo",label:"商品编号",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"itemName",label:"商品名称",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"unitName",label:"单位名称",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"rates",label:"税率%",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"models",label:"规格型号",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"price",label:"单价",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"warnQuantity",label:"库存警告数量",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{sortable:"",prop:"quantity",label:"现有库存",align:"center"}}),e._v(" "),i("el-table-column",{attrs:{label:"操作",align:"center",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[i("el-button",{on:{click:function(i){e.chooseItem(t.row)}}},[e._v("选中\n          ")])]}}])})],1),e._v(" "),i("div",{staticClass:"block paging"},[i("el-pagination",{attrs:{"current-page":e.items.currentPageNo,"page-sizes":[10,20,30,100],"page-size":10,layout:"total, sizes, prev, pager, next, jumper",total:e.items.totalCount},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)],1)],1)},F=[],T={render:z,staticRenderFns:F},$=T,w=i("VU/8"),E=r,V=w(N,$,!1,E,null,null);t.default=V.exports},mnVu:function(e,t,i){var n=i("kM2E"),a=i("52gC"),o=i("S82l"),r=i("hyta"),l="["+r+"]",s="​",c=RegExp("^"+l+l+"*"),p=RegExp(l+l+"*$"),u=function(e,t,i){var a={},l=o(function(){return!!r[e]()||s[e]()!=s}),c=a[e]=l?t(d):r[e];i&&(a[i]=c),n(n.P+n.F*l,"String",a)},d=u.trim=function(e,t){return e=String(a(e)),1&t&&(e=e.replace(c,"")),2&t&&(e=e.replace(p,"")),e};e.exports=u},quu5:function(e,t,i){i("CHlY"),e.exports=parseFloat}});
//# sourceMappingURL=5.057a5b200bb60f1a85f3.js.map