Ext.define('administrator.controller.AdministratorController', {
    extend: 'Ext.app.Controller',
	views:[
		'AdministratorForm'
	],
    init: function() {
        console.log('Initialized Users! This happens before the Application launch function is called');
    	this.control({
    		'viewport > panel':{
    			render:this.onPanelRendered
    		}
    	});
    },
    onPanelRendered:function(){
    	console.log('the panel was rendered');
    }
});