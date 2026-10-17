package androidx.compose.runtime.composer.gapbuffer;

import defpackage.fc;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SourceInformationSlotTableGroupIdentity {
    private final int index;
    private final Object parentIdentity;

    public SourceInformationSlotTableGroupIdentity(Object obj, int i) {
        this.parentIdentity = obj;
        this.index = i;
    }

    public static /* synthetic */ SourceInformationSlotTableGroupIdentity copy$default(SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = sourceInformationSlotTableGroupIdentity.parentIdentity;
        }
        if ((i2 & 2) != 0) {
            i = sourceInformationSlotTableGroupIdentity.index;
        }
        return sourceInformationSlotTableGroupIdentity.copy(obj, i);
    }

    public final Object component1() {
        return this.parentIdentity;
    }

    public final int component2() {
        return this.index;
    }

    public final SourceInformationSlotTableGroupIdentity copy(Object obj, int i) {
        return new SourceInformationSlotTableGroupIdentity(obj, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return q10.b(this.parentIdentity, sourceInformationSlotTableGroupIdentity.parentIdentity) && this.index == sourceInformationSlotTableGroupIdentity.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getParentIdentity() {
        return this.parentIdentity;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.parentIdentity.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb.append(this.parentIdentity);
        sb.append(", index=");
        return fc.e(sb, this.index, ')');
    }
}
