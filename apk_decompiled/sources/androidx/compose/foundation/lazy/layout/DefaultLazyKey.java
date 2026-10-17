package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dq;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultLazyKey implements Parcelable {
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new Parcelable.Creator<DefaultLazyKey>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            return new DefaultLazyKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    };

    public DefaultLazyKey(int i) {
        this.index = i;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey copy$default(DefaultLazyKey defaultLazyKey, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i);
    }

    public final DefaultLazyKey copy(int i) {
        return new DefaultLazyKey(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public String toString() {
        return fc.e(new StringBuilder("DefaultLazyKey(index="), this.index, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
