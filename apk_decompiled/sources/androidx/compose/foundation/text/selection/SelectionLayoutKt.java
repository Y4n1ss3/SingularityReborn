package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import defpackage.fi0;
import defpackage.o;
import defpackage.ri;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m1509getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new SingleSelectionLayout(z2, 1, 1, z ? null : new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7060getStartimpl(j)), TextRange.m7060getStartimpl(j), 1L), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7055getEndimpl(j)), TextRange.m7055getEndimpl(j), 1L), TextRange.m7059getReversedimpl(j)), new SelectableInfo(1L, 1, i, i2, i3, textLayoutResult));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        int i = 1;
        if (selection != null && selectionLayout != null) {
            if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) {
                if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
                    return false;
                }
                if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
                    return false;
                }
                fi0 fi0Var = new fi0();
                fi0Var.d = true;
                selectionLayout.forEachMiddleInfo(new ri(fi0Var, i));
                return fi0Var.d;
            }
            if (selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 isCollapsed$lambda$0(fi0 fi0Var, SelectableInfo selectableInfo) {
        if (selectableInfo.getInputText().length() > 0) {
            fi0Var.d = false;
        }
        return w01.a;
    }

    public static final Direction resolve2dDirection(Direction direction, Direction direction2) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[direction2.ordinal()];
        if (i == 1) {
            return Direction.BEFORE;
        }
        if (i != 2) {
            if (i == 3) {
                return Direction.AFTER;
            }
            o.n();
            return null;
        }
        int i2 = iArr[direction.ordinal()];
        if (i2 == 1) {
            return Direction.BEFORE;
        }
        if (i2 == 2) {
            return Direction.ON;
        }
        if (i2 == 3) {
            return Direction.AFTER;
        }
        o.n();
        return null;
    }
}
