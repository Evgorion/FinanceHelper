package com.dagaz.yvgeny.financehelper.core.impls;

import com.dagaz.yvgeny.financehelper.core.abstracts.AbstractTreeNode;
import com.dagaz.yvgeny.financehelper.core.interfaces.Source;
import com.dagaz.yvgeny.financehelper.core.interfaces.TreeNode;
import com.dagaz.yvgeny.financehelper.core.objects.OperationType;

import java.util.List;

/**
 * Created by yvgeny on 31/05/16.
 */
public class DefaultSource extends AbstractTreeNode implements Source {

    private OperationType operationType;

    public DefaultSource() {
    }

    public DefaultSource(String name) {
        super(name);
    }

    public DefaultSource(List<TreeNode> childs) {
        super(childs);
    }

    public DefaultSource(String name, long id) {
        super(name, id);
    }

    public DefaultSource(long id, List<TreeNode> childs, TreeNode parent, String name) {
        super(id, childs, parent, name);
    }

    @Override
    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public DefaultSource(String name, long id, OperationType operationType) {
        super(name, id);
        this.operationType = operationType;
    }

    @Override
    public void add(TreeNode child) {
        // TODO применить патерн
        // для дочернего элемента устанавливаем операции родительского элемента
        if(child instanceof DefaultSource){
            ((DefaultSource)child).setOperationType(operationType);
        }

        super.add(child);
    }
}
