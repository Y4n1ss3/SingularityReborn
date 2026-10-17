package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableFloatState extends SnapshotMutableFloatStateImpl implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableFloatState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableFloatState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableFloatState[] newArray(int i) {
            return new ParcelableSnapshotMutableFloatState[i];
        }
    };

    public ParcelableSnapshotMutableFloatState(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(getFloatValue());
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
