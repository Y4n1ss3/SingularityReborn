package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.te0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createFromParcel$lambda$0(Parcel parcel, ClassLoader classLoader, int i) {
        return parcel.readValue(classLoader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = SnapshotStateList$Companion$CREATOR$1.class.getClassLoader();
        }
        return SnapshotStateListKt.SnapshotStateList(parcel.readInt(), new te0(11, parcel, classLoader));
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object>[] newArray(int i) {
        return new SnapshotStateList[i];
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
