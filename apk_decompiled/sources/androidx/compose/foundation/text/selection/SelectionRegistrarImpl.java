package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.cj;
import defpackage.dq;
import defpackage.iy;
import defpackage.kl0;
import defpackage.ky;
import defpackage.l60;
import defpackage.ll0;
import defpackage.m60;
import defpackage.mj;
import defpackage.my;
import defpackage.oy;
import defpackage.p01;
import defpackage.qy;
import defpackage.ra0;
import defpackage.w5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final ra0 _selectableMap;
    private final List<Selectable> _selectables;
    private ky afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private ky onPositionChangeCallback;
    private ky onSelectableChangeCallback;
    private qy onSelectionUpdateCallback;
    private iy onSelectionUpdateEndCallback;
    private my onSelectionUpdateSelectAll;
    private oy onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new ll0(20), new kl0(28));

    private SelectionRegistrarImpl(long j) {
        this._selectables = new ArrayList();
        ra0 ra0Var = m60.a;
        this._selectableMap = new ra0();
        this.incrementId = new AtomicLong(j);
        ra0 ra0Var2 = m60.a;
        ra0Var2.getClass();
        this.subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ra0Var2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long Saver$lambda$0(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
        return Long.valueOf(selectionRegistrarImpl.incrementId.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionRegistrarImpl Saver$lambda$1(long j) {
        return new SelectionRegistrarImpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$0(LayoutCoordinates layoutCoordinates, Selectable selectable, Selectable selectable2) {
        Offset.Companion companion;
        long m4532getZeroF1C5BW0;
        long m4532getZeroF1C5BW02;
        long m4532getZeroF1C5BW03;
        long m4532getZeroF1C5BW04;
        LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            companion = Offset.Companion;
            m4532getZeroF1C5BW0 = layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates2, companion.m4532getZeroF1C5BW0());
            float intBitsToFloat = Float.intBitsToFloat((int) (m4532getZeroF1C5BW0 >> 32)) + ((int) (layoutCoordinates2.mo6242getSizeYbymL2g() >> 32));
            m4532getZeroF1C5BW02 = Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (m4532getZeroF1C5BW0 & 4294967295L)) + ((int) (layoutCoordinates2.mo6242getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        } else {
            companion = Offset.Companion;
            m4532getZeroF1C5BW0 = companion.m4532getZeroF1C5BW0();
            m4532getZeroF1C5BW02 = companion.m4532getZeroF1C5BW0();
        }
        if (layoutCoordinates3 != null) {
            m4532getZeroF1C5BW03 = layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates3, companion.m4532getZeroF1C5BW0());
            m4532getZeroF1C5BW04 = Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (m4532getZeroF1C5BW03 >> 32)) + ((int) (layoutCoordinates3.mo6242getSizeYbymL2g() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m4532getZeroF1C5BW03 & 4294967295L)) + ((int) (layoutCoordinates3.mo6242getSizeYbymL2g() & 4294967295L))) & 4294967295L));
        } else {
            m4532getZeroF1C5BW03 = companion.m4532getZeroF1C5BW0();
            m4532getZeroF1C5BW04 = companion.m4532getZeroF1C5BW0();
        }
        long j = m4532getZeroF1C5BW04;
        long j2 = m4532getZeroF1C5BW03;
        return SelectionRegistrarImplKt.m1543inARowzwwh4xc(m4532getZeroF1C5BW0, m4532getZeroF1C5BW02, j2, j) ? p01.i(Float.valueOf(Float.intBitsToFloat((int) (m4532getZeroF1C5BW0 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32)))) : p01.i(Float.valueOf(Float.intBitsToFloat((int) (m4532getZeroF1C5BW0 & 4294967295L))), Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$1(my myVar, Object obj, Object obj2) {
        return ((Number) myVar.invoke(obj, obj2)).intValue();
    }

    public final ky getAfterSelectableUnsubscribe$foundation() {
        return this.afterSelectableUnsubscribe;
    }

    public final ky getOnPositionChangeCallback$foundation() {
        return this.onPositionChangeCallback;
    }

    public final ky getOnSelectableChangeCallback$foundation() {
        return this.onSelectableChangeCallback;
    }

    public final qy getOnSelectionUpdateCallback$foundation() {
        return this.onSelectionUpdateCallback;
    }

    public final iy getOnSelectionUpdateEndCallback$foundation() {
        return this.onSelectionUpdateEndCallback;
    }

    public final my getOnSelectionUpdateSelectAll$foundation() {
        return this.onSelectionUpdateSelectAll;
    }

    public final oy getOnSelectionUpdateStartCallback$foundation() {
        return this.onSelectionUpdateStartCallback;
    }

    public final l60 getSelectableMap$foundation() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation() {
        return this._selectables;
    }

    public final boolean getSorted$foundation() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public l60 getSubselections() {
        return (l60) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j) {
        this.sorted = false;
        ky kyVar = this.onPositionChangeCallback;
        if (kyVar != null) {
            kyVar.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j) {
        ky kyVar = this.onSelectableChangeCallback;
        if (kyVar != null) {
            kyVar.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1541notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2) {
        qy qyVar = this.onSelectionUpdateCallback;
        if (qyVar != null) {
            return ((Boolean) qyVar.invoke(Boolean.valueOf(z2), layoutCoordinates, Offset.m4505boximpl(j), Offset.m4505boximpl(j2), Boolean.valueOf(z), selectionAdjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        iy iyVar = this.onSelectionUpdateEndCallback;
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j, boolean z) {
        my myVar = this.onSelectionUpdateSelectAll;
        if (myVar != null) {
            myVar.invoke(Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1542notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z) {
        oy oyVar = this.onSelectionUpdateStartCallback;
        if (oyVar != null) {
            oyVar.invoke(Boolean.valueOf(z), layoutCoordinates, Offset.m4505boximpl(j), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation(ky kyVar) {
        this.afterSelectableUnsubscribe = kyVar;
    }

    public final void setOnPositionChangeCallback$foundation(ky kyVar) {
        this.onPositionChangeCallback = kyVar;
    }

    public final void setOnSelectableChangeCallback$foundation(ky kyVar) {
        this.onSelectableChangeCallback = kyVar;
    }

    public final void setOnSelectionUpdateCallback$foundation(qy qyVar) {
        this.onSelectionUpdateCallback = qyVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation(iy iyVar) {
        this.onSelectionUpdateEndCallback = iyVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation(my myVar) {
        this.onSelectionUpdateSelectAll = myVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation(oy oyVar) {
        this.onSelectionUpdateStartCallback = oyVar;
    }

    public final void setSorted$foundation(boolean z) {
        this.sorted = z;
    }

    public void setSubselections(l60 l60Var) {
        this.subselections$delegate.setValue(l60Var);
    }

    public final List<Selectable> sort(LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            cj.b0(this._selectables, new mj(new w5(layoutCoordinates, 13), 1));
            this.sorted = true;
        }
        return getSelectables$foundation();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        if (!(selectable.getSelectableId() != 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + selectable.getSelectableId());
        }
        if (this._selectableMap.a(selectable.getSelectableId())) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.h(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        if (this._selectableMap.a(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.g(selectable.getSelectableId());
            ky kyVar = this.afterSelectableUnsubscribe;
            if (kyVar != null) {
                kyVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
