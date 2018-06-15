var pageSize = 20;

Ext.define('secondgoods.store.SecondGoodsStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.secondgoodsStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'secondgoods.model.SecondGoodsModel',
	proxy : {
		url : server_context + '/secondgoods/.json',
		type : 'ajax',
		api : {
			read : server_context + '/secondgoods/.json',
			update : server_context + '/secondgoods/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});