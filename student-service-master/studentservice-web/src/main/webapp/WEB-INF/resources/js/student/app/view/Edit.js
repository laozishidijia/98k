Ext.define('ssv.view.Edit', {
    extend: 'Ext.window.Window',
    alias: 'widget.studentEdit',
    title: '编辑学生信息',
    layout: 'fit',
    autoShow: true,
    initComponent: function() {
        this.items = [
            {
                xtype: 'form',
                items: [
                    {
                        xtype: 'textfield',
                        name : 'sdept',
                        fieldLabel: 'Departement'
                    },
                    {
                        xtype: 'textfield',
                        name : 'sid',
                        fieldLabel: 'ID_num'
                    },
                    {
                        xtype: 'textfield',
                        name : 'sname',
                        fieldLabel: 'Name'
                    }
                ]
            }
        ];

        this.buttons = [
            {
                text: '保存',
                action: 'save'
            },
            {
                text: '取消',
                scope: this,
                handler: this.close
            }
        ];

        this.callParent(arguments);
    }
});