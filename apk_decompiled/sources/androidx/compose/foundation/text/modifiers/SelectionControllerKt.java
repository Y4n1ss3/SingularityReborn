package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.hm;
import defpackage.iy;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    public static final Modifier makeDefaultSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final iy iyVar) {
        final ?? r0 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;
            private SelectionAdjustment selectionAdjustmentMode;

            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m4532getZeroF1C5BW0();
                this.dragTotalDistance = companion.m4532getZeroF1C5BW0();
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final SelectionAdjustment getSelectionAdjustmentMode() {
                return this.selectionAdjustmentMode;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1171onDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        long m4521plusMKHz9U = Offset.m4521plusMKHz9U(this.dragTotalDistance, j2);
                        this.dragTotalDistance = m4521plusMKHz9U;
                        long m4521plusMKHz9U2 = Offset.m4521plusMKHz9U(this.lastPosition, m4521plusMKHz9U);
                        if (selectionRegistrar2.mo1541notifySelectionUpdatenjBpvok(layoutCoordinates, m4521plusMKHz9U2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                            this.lastPosition = m4521plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1172onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo1542notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j2, this.selectionAdjustmentMode, true);
                    this.lastPosition = j2;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            public final void setDragTotalDistance(long j2) {
                this.dragTotalDistance = j2;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            public final void setSelectionAdjustmentMode(SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1170onDownk4lQ0M(long j2) {
            }
        };
        final ?? r1 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m4532getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1412onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1541notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j2;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1413onExtendk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo1541notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j2;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1414onExtendDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1541notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j2;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo1415onStart9KIMszo(long j2, SelectionAdjustment selectionAdjustment, int i) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) iy.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo1542notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j2, selectionAdjustment, false);
                this.lastPosition = j2;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }
        };
        return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r1, (Object) r0, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1.this, r0, hmVar);
                return awaitSelectionGestures == vn.d ? awaitSelectionGestures : w01.a;
            }
        });
    }
}
