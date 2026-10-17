package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class o10 implements Parcelable {
    public static final Parcelable.Creator<o10> CREATOR = new s1(1);
    public final IntentSender d;
    public final Intent e;
    public final int f;
    public final int g;

    public o10(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        readParcelable.getClass();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.d = (IntentSender) readParcelable;
        this.e = intent;
        this.f = readInt;
        this.g = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
