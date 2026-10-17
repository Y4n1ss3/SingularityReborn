package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l11;
import defpackage.m11;
import defpackage.s1;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s1(2);
    public final m11 d;

    public ParcelImpl(Parcel parcel) {
        this.d = new l11(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new l11(parcel).i(this.d);
    }
}
