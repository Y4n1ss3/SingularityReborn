package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import defpackage.iy;
import defpackage.my;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(iy iyVar, int i, GapAnchor gapAnchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl, Operation.ObjectParameter.m3992constructorimpl(0), iyVar);
        m4015constructorimpl.intArgs[m4015constructorimpl.intArgsSize - m4015constructorimpl.opCodes[m4015constructorimpl.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl, Operation.ObjectParameter.m3992constructorimpl(1), gapAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations m4015constructorimpl2 = Operations.WriteScope.m4015constructorimpl(operations2);
        m4015constructorimpl2.intArgs[m4015constructorimpl2.intArgsSize - m4015constructorimpl2.opCodes[m4015constructorimpl2.opCodesSize - 1].getInts()] = i;
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl2, Operation.ObjectParameter.m3992constructorimpl(0), gapAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager, operationErrorContext);
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

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationsDebugStringFormattable
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
        Operations m4015constructorimpl = Operations.WriteScope.m4015constructorimpl(operations);
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl, Operation.ObjectParameter.m3992constructorimpl(0), v);
        int m3992constructorimpl = Operation.ObjectParameter.m3992constructorimpl(1);
        myVar.getClass();
        p01.f(2, myVar);
        Operations.WriteScope.m4023setObjectsGr0YRc(m4015constructorimpl, m3992constructorimpl, myVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
