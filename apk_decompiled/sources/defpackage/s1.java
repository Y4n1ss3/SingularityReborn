package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new t1(parcel);
            case 1:
                parcel.getClass();
                return new o10(parcel);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t1[i];
            case 1:
                return new o10[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
