package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return d.e;
                }
                o.f("superState must be null");
                return null;
            default:
                return new zm0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d[i];
            default:
                return new zm0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return d.e;
                }
                o.f("superState must be null");
                return null;
            default:
                return new zm0(parcel, null);
        }
    }
}
