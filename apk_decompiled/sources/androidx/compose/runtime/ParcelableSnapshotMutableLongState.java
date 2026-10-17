package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableLongState extends SnapshotMutableLongStateImpl implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableLongState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableLongState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableLongState[] newArray(int i) {
            return new ParcelableSnapshotMutableLongState[i];
        }
    };

    public ParcelableSnapshotMutableLongState(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(getLongValue());
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
