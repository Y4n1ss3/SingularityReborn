package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class d implements Parcelable {
    public final Parcelable d;
    public static final b e = new b();
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    public d(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == e ? null : parcelable;
        } else {
            o.m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    public d() {
        this.d = null;
    }

    public d(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.d = readParcelable == null ? e : readParcelable;
    }
}
