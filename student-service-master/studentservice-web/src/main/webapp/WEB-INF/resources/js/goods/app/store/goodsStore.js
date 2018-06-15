var pageSize = 20;

Ext.define('goods.store.goodsStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.goodsStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'goods.model.goodsModel',
	proxy : {
		url : server_context + '/goods/.json',
		type : 'ajax',
		api : {
			read : server_context + '/goods/.json',
			update : server_context + '/goods/.json'
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