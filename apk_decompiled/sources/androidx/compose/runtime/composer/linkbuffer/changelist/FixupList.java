package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.DebugStringFormattable;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operations;
import defpackage.iy;
import defpackage.my;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FixupList extends DebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(iy iyVar, int i, long j) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), iyVar);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4087setLongimpl(m4078constructorimpl, 1, 2, j);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations m4078constructorimpl2 = Operations.WriteScope.m4078constructorimpl(operations2);
        m4078constructorimpl2.intArgs[m4078constructorimpl2.intArgsSize - m4078constructorimpl2.opCodes[m4078constructorimpl2.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4087setLongimpl(m4078constructorimpl2, 1, 2, j);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void createAndInsertNodeByAnchor(iy iyVar, int i, LinkAnchor linkAnchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixupByAnchor insertNodeFixupByAnchor = Operation.InsertNodeFixupByAnchor.INSTANCE;
        operations.pushOp(insertNodeFixupByAnchor);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), iyVar);
        m4078constructorimpl.intArgs[m4078constructorimpl.intArgsSize - m4078constructorimpl.opCodes[m4078constructorimpl.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(1), linkAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixupByAnchor);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixupByAnchor postInsertNodeFixupByAnchor = Operation.PostInsertNodeFixupByAnchor.INSTANCE;
        operations2.pushOp(postInsertNodeFixupByAnchor);
        Operations m4078constructorimpl2 = Operations.WriteScope.m4078constructorimpl(operations2);
        m4078constructorimpl2.intArgs[m4078constructorimpl2.intArgsSize - m4078constructorimpl2.opCodes[m4078constructorimpl2.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl2, Operation.ObjectParameter.m4053constructorimpl(0), linkAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixupByAnchor);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slotTableEditor, rememberManager, operationErrorContext);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    @Override // androidx.compose.runtime.composer.DebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(str));
        }
        return sb.toString();
    }

    public final <V, T> void updateNode(V v, my myVar) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m4078constructorimpl = Operations.WriteScope.m4078constructorimpl(operations);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, Operation.ObjectParameter.m4053constructorimpl(0), v);
        int m4053constructorimpl = Operation.ObjectParameter.m4053constructorimpl(1);
        myVar.getClass();
        p01.f(2, myVar);
        Operations.WriteScope.m4088setObjectaWHcuVo(m4078constructorimpl, m4053constructorimpl, myVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
