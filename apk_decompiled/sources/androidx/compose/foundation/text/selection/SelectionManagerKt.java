package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import defpackage.iy;
import defpackage.kn0;
import defpackage.ky;
import defpackage.o;
import defpackage.te0;
import defpackage.w01;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1534calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m1536getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m1536getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i != 3) {
            o.n();
            return 0L;
        }
        o.f("SelectionContainer does not support cursor");
        return 0L;
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1535containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    public static final ky contextMenuBuilder(SelectionManager selectionManager, ContextMenuState contextMenuState) {
        return new te0(8, selectionManager, contextMenuState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0(SelectionManager selectionManager, ContextMenuState contextMenuState, ContextMenuScope contextMenuScope) {
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new kn0(selectionManager, 5));
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new kn0(selectionManager, 6));
        w01 w01Var = w01.a;
        y80.E(w01Var, w01Var);
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$0(SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$1(SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return w01.a;
    }

    private static final void contextMenuBuilder$lambda$0$selectionItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt$TextItem$2(iyVar, contextMenuState), 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : y80.E(yi.p0(list), yi.v0(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1536getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        float g;
        Selectable anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation.getLastVisibleOffset()) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        Offset m1522getCurrentDragPosition_m7T9E = selectionManager.m1522getCurrentDragPosition_m7T9E();
        m1522getCurrentDragPosition_m7T9E.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo6243localPositionOfR5De75A(containerLayoutCoordinates, m1522getCurrentDragPosition_m7T9E.m4526unboximpl()) >> 32));
        long mo1484getRangeOfLineContainingjx7JFs = anchorSelectable$foundation.mo1484getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m7054getCollapsedimpl(mo1484getRangeOfLineContainingjx7JFs)) {
            g = anchorSelectable$foundation.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation.getLineLeft(TextRange.m7060getStartimpl(mo1484getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation.getLineRight(TextRange.m7055getEndimpl(mo1484getRangeOfLineContainingjx7JFs) - 1);
            g = y80.g(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (g == -1.0f) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m7780equalsimpl0(j, IntSize.Companion.m7787getZeroYbymL2g()) && Math.abs(intBitsToFloat - g) > ((int) (j >> 32)) / 2) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation.getCenterYForOffset(offset) == -1.0f) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates, Offset.m4508constructorimpl((Float.floatToRawIntBits(g) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    public static final Rect getSelectedRegionRect(List<? extends xe0> list, LayoutCoordinates layoutCoordinates) {
        int i;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float component1 = rect.component1();
        float component2 = rect.component2();
        float component3 = rect.component3();
        float component4 = rect.component4();
        int size = list.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            xe0 xe0Var = list.get(i2);
            Selectable selectable = (Selectable) xe0Var.d;
            Selection selection = (Selection) xe0Var.e;
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = selectable.getLayoutCoordinates()) == null) {
                i = size;
            } else {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float component12 = rect2.component1();
                float component22 = rect2.component2();
                float component32 = rect2.component3();
                float component42 = rect2.component4();
                int length = iArr.length;
                i = size;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3;
                    Rect boundingBox = selectable.getBoundingBox(iArr[i4]);
                    component12 = Math.min(component12, boundingBox.getLeft());
                    component22 = Math.min(component22, boundingBox.getTop());
                    component32 = Math.max(component32, boundingBox.getRight());
                    component42 = Math.max(component42, boundingBox.getBottom());
                    i3 = i4 + 1;
                }
                long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(component12) << 32) | (Float.floatToRawIntBits(component22) & 4294967295L));
                long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(component32) << 32) | (Float.floatToRawIntBits(component42) & 4294967295L));
                long mo6243localPositionOfR5De75A = layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates2, m4508constructorimpl);
                long mo6243localPositionOfR5De75A2 = layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates2, m4508constructorimpl2);
                component1 = Math.min(component1, Float.intBitsToFloat((int) (mo6243localPositionOfR5De75A >> 32)));
                component2 = Math.min(component2, Float.intBitsToFloat((int) (mo6243localPositionOfR5De75A & 4294967295L)));
                component3 = Math.max(component3, Float.intBitsToFloat((int) (mo6243localPositionOfR5De75A2 >> 32)));
                component4 = Math.max(component4, Float.intBitsToFloat((int) (mo6243localPositionOfR5De75A2 & 4294967295L)));
            }
            i2++;
            size = i;
            c = 0;
        }
        return new Rect(component1, component2, component3, component4);
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
        return RectKt.m4554Rect0a9Yr6o(layoutCoordinates.mo6251windowToLocalMKHz9U(boundsInWindow$default.m4551getTopLeftF1C5BW0()), layoutCoordinates.mo6251windowToLocalMKHz9U(boundsInWindow$default.m4545getBottomRightF1C5BW0()));
    }
}
