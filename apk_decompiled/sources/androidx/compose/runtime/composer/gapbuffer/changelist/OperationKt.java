package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import defpackage.iy;
import defpackage.p9;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable attachComposeStackTrace(Throwable th, OperationErrorContext operationErrorContext, SlotWriter slotWriter, GapAnchor gapAnchor) {
        return operationErrorContext == null ? th : ComposeStackTraceKt.attachComposeStackTrace(th, new p9(gapAnchor, slotWriter, operationErrorContext, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeStackTrace attachComposeStackTrace$lambda$0(GapAnchor gapAnchor, SlotWriter slotWriter, OperationErrorContext operationErrorContext) {
        if (gapAnchor != null) {
            slotWriter.seek(gapAnchor);
        }
        List buildTrace$default = ComposeStackTraceBuilderKt.buildTrace$default(slotWriter, null, 0, null, 7, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) yi.w0(buildTrace$default);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> buildStackTrace = operationErrorContext.buildStackTrace(groupOffset);
        if (groupOffset != null && !buildStackTrace.isEmpty()) {
            buildStackTrace = yi.A0(y80.D(ComposeStackTraceFrame.copy$default((ComposeStackTraceFrame) yi.p0(buildStackTrace), 0, null, groupOffset, 3, null)), yi.o0(buildStackTrace, 1));
        }
        return new ComposeStackTrace(yi.A0(buildTrace$default, buildStackTrace), operationErrorContext.getSourceInformationEnabled());
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, GapAnchor gapAnchor, Applier<Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(gapAnchor);
        if (!(slotWriter.getCurrentGroup() < anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        return currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final void withCurrentStackTrace(OperationErrorContext operationErrorContext, SlotWriter slotWriter, GapAnchor gapAnchor, iy iyVar) {
        try {
            iyVar.invoke();
        } catch (Throwable th) {
            throw attachComposeStackTrace(th, operationErrorContext, slotWriter, gapAnchor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperationErrorContext withCurrentStackTrace(final OperationErrorContext operationErrorContext, final SlotWriter slotWriter) {
        return new OperationErrorContext() { // from class: androidx.compose.runtime.composer.gapbuffer.changelist.OperationKt$withCurrentStackTrace$1
            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
                List<ComposeStackTraceFrame> buildStackTrace = OperationErrorContext.this.buildStackTrace(null);
                int parent = slotWriter.getParent();
                if (parent < 0) {
                    return buildStackTrace;
                }
                SlotWriter slotWriter2 = slotWriter;
                return yi.A0(ComposeStackTraceBuilderKt.buildTrace(slotWriter2, num, parent, Integer.valueOf(slotWriter2.parent(parent))), buildStackTrace);
            }

            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public boolean getSourceInformationEnabled() {
                return OperationErrorContext.this.getSourceInformationEnabled();
            }
        };
    }
}
