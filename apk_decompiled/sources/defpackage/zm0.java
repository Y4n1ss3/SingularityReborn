package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zm0 extends d {
    public static final Parcelable.Creator<zm0> CREATOR = new c(1);
    public boolean f;

    public zm0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f + "}";
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f));
    }
}
