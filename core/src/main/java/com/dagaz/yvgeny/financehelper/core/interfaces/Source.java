package com.dagaz.yvgeny.financehelper.core.interfaces;

import com.dagaz.yvgeny.financehelper.core.objects.OperationType;

/**
 * Created by yvgeny on 31/05/16.
 */
public interface Source extends TreeNode{

    OperationType getOperationType();

}
