package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.dq;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final MutableState<w01> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m939attachToScopeimpl(MutableState<w01> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m940boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m942constructorimpl$default(MutableState mutableState, int i, dq dqVar) {
        if ((i & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(w01.a, SnapshotStateKt.neverEqualPolicy());
        }
        return m941constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m943equalsimpl(MutableState<w01> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && q10.b(mutableState, ((ObservableScopeInvalidator) obj).m948unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m944equalsimpl0(MutableState<w01> mutableState, MutableState<w01> mutableState2) {
        return q10.b(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m945hashCodeimpl(MutableState<w01> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m946invalidateScopeimpl(MutableState<w01> mutableState) {
        mutableState.setValue(w01.a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m947toStringimpl(MutableState<w01> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m943equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m945hashCodeimpl(this.state);
    }

    public String toString() {
        return m947toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m948unboximpl() {
        return this.state;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<w01> m941constructorimpl(MutableState<w01> mutableState) {
        return mutableState;
    }
}
