var pageSize = 20;

Ext.define('learn.store.learnStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.learnStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'learn.model.learnModel',
	proxy : {
		url : server_context + '/learn/.json',
		type : 'ajax',
		api : {
			read : server_context + '/learn/.json',
			update : server_context + '/learn/.json'
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