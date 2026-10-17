package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuState {
    public static final int $stable = 0;
    private final MutableState status$delegate;

    public ContextMenuState(Status status) {
        this.status$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(status, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return q10.b(((ContextMenuState) obj).getStatus(), getStatus());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Status getStatus() {
        return (Status) this.status$delegate.getValue();
    }

    public int hashCode() {
        return getStatus().hashCode();
    }

    public final void setStatus(Status status) {
        this.status$delegate.setValue(status);
    }

    public String toString() {
        return "ContextMenuState(status=" + getStatus() + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class Status {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Closed extends Status {
            public static final int $stable = 0;
            public static final Closed INSTANCE = new Closed();

            private Closed() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public /* synthetic */ Status(dq dqVar) {
            this();
        }

        private Status() {
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Open extends Status {
            public static final int $stable = 0;
            private final long offset;

            private Open(long j) {
                super(null);
                this.offset = j;
                if ((j & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Open) {
                    return Offset.m4513equalsimpl0(this.offset, ((Open) obj).offset);
                }
                return false;
            }

            /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
            public final long m352getOffsetF1C5BW0() {
                return this.offset;
            }

            public int hashCode() {
                return Offset.m4518hashCodeimpl(this.offset);
            }

            public String toString() {
                return "Open(offset=" + ((Object) Offset.m4524toStringimpl(this.offset)) + ')';
            }

            public /* synthetic */ Open(long j, dq dqVar) {
                this(j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ContextMenuState(Status status, int i, dq dqVar) {
        this((i & 1) != 0 ? Status.Closed.INSTANCE : status);
    }
}
