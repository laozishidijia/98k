Ext.define('student.view.student.Edit', {
    extend: 'Ext.window.Window',
    alias: 'widget.studentEdit',

    title: 'Edit Student',
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
                text: 'Save',
                action: 'save'
            },
            {
                text: 'Cancel',
                scope: this,
                handler: this.close
            }
        ];

        this.callParent(arguments);
    }
});