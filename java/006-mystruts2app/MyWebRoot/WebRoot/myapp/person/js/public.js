//是否是正整数
function isPositiveInteger(str){ 
	var regu = /^[0-9]{1,}$/; 
	return regu.test(str); 
}

/* 
用途：检查输入对象的值是否符合整数格式 
输入：str 输入的字符串 
返回：如果通过验证返回true,否则返回false 
*/ 
function isInteger( str ){ 
	var regu = /^[-]{0,1}[0-9]{1,}$/; 
	return regu.test(str); 
}

/* 
用途：检查输入字符串是否是带小数的数字格式,可以是负数 
输入： 
s：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function isDecimal( str ){ 
	if(isInteger(str)) return true; 
	var re = /^[-]{0,1}(\d+)[\.]+(\d+)$/; 
	if (re.test(str)) { 
		if(RegExp.$1==0&&RegExp.$2==0) return false; 
		return true; 
	}else return false; 
}

//正小数
function isPositiveDecimal(str){
	if(isPositiveInteger(str)) return true; 
	var re = /^(\d+)[\.]+(\d+)$/; 
	if (re.test(str)) { 
		if(RegExp.$1==0&&RegExp.$2==0) return false; 
		return true; 
	}else return false; 
}

/* 
用途：检查输入对象的值是否符合E-Mail格式 
输入：str 输入的字符串 
返回：如果通过验证返回true,否则返回false 
*/ 
function isEmail( str ){ 
	var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/; 
	if(myReg.test(str)) return true; 
	return false; 
}

//去除空格
function trim(str) { 
    if (str != null) {
        var i; 
        for (i=0; i<str.length; i++) {
            if (str.charAt(i)!=" ") {
                str=str.substring(i,str.length); 
                break;
            } 
        } 
    
        for (i=str.length-1; i>=0; i--) {
            if (str.charAt(i)!=" ") {
                str=str.substring(0,i+1); 
                break;
            } 
        } 
        
        if (str.charAt(0)==" ") return ""; 
        else return str; 
    }
}

function channelV(action,done,start,range){
	var url=action + "?" + getFormAsString(document.getElementById('formId'));
	url=url.substring(0,url.lastIndexOf("&"));
	url=url + "&done=" + done + "&start=" + start + "&range=" + range;
	url=unescape(url);
	window.location=url;
}

function isEmpty(str){
	str=trim(str);
	if(str.length==0) return true;
	else return false;
}

function goback(){
	window.history.back();
}

//checkbox全选与全不选及以逗号分割取得值
function checkAll(e, itemName){
  var aa = document.getElementsByName(itemName);
  for (var i=0; i<aa.length; i++)
   aa[i].checked = e.checked;
}
function checkItem(e, allName){
  var all = document.getElementsByName(allName)[0];
  if(!e.checked) all.checked = false;
  else{
    var aa = document.getElementsByName(e.name);
    for (var i=0; i<aa.length; i++)
     if(!aa[i].checked) return;
    all.checked = true;
  }
}
function getvalues(name){
    coll=document.getElementsByName(name); 
    var values="";  
    for(var i=0;i<coll.length;i++)   
	if(coll[i].checked) values+=coll[i].value + ","; 
	if(values.length>0) values=values.substring(0,values.length-1);
    return values;
}
function getDeleteAllIds(link,msg){
    var ids=getvalues('mm');
    if(ids.length>0){
	var question=confirm(msg);
	if(question==true) window.location.href=link + ids;
    }
}

function rusure(str){ 	
    question = confirm(str); 	
    if (question !="0") return true;
    else return false;
}

function quit(str){ 	
    question = confirm(str); 	
    if (question !="0"){
	window.opener=null;
	window.close();
    }
}

/*
	selectId 下拉列表id
	totalItemsStr 要生成的项 eg:"aaa;aaa|bbb;bbb|ccc;ccc|ddd;ddd|eee;eee"
	recorderSplitMark 记录分割符号
	valueTextSplit 键值分割符号
*/
function generateSelectItem(selectId,totalItemsStr,recorderSplitMark,valueTextSplit){
	var selectcolumns=document.getElementById(selectId);
	selectcolumns.options.length=0;
	selectcolumns[selectcolumns.length] = new Option("", ""); 
	if(totalItemsStr!="null"){
		recorders=totalItemsStr.split(recorderSplitMark);
		for(var i=0;i<recorders.length;i++){
			recorder=recorders[i].split(valueTextSplit);
			selectcolumns[selectcolumns.length] = new Option(recorder[0], recorder[1]);
		}
	}
}

/*
 * 得到单选按钮的值
 */
function getRadioValue(name){
	var tmp=document.getElementsByName(name);
	var data;
	for (var i=0; i<tmp.length; i++){
 		if (tmp[i].checked){
      		data = tmp[i].value;
      		break;
 		}
	}
	return data;
}

/*
 * 清楚radio选择
 */
function clearRadioValue(name){
	var tmp=document.getElementsByName(name);
	for (var i=0; i<tmp.length; i++){
 		tmp[i].checked=false;
	}
}

/*
 * 初始化下拉列表的当前值
 * selectId 下拉列表id
 * text 当前值
 */
function setSelectValue(selectId,text){
	var selectcolumns=document.getElementById(selectId);
	for(var i=0;i<selectcolumns.options.length;i++){
		if(selectcolumns.options[i].value==text){
			selectcolumns.selectedIndex=i;
			break;
		}
	}
}