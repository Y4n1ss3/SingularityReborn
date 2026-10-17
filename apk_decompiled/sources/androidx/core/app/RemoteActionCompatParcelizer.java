package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.k11;
import defpackage.l11;
import defpackage.m11;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(k11 k11Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        m11 m11Var = remoteActionCompat.a;
        boolean z = true;
        if (k11Var.e(1)) {
            m11Var = k11Var.g();
        }
        remoteActionCompat.a = (IconCompat) m11Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (k11Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((l11) k11Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (k11Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((l11) k11Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) k11Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (k11Var.e(5)) {
            z2 = ((l11) k11Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!k11Var.e(6)) {
            z = z3;
        } else if (((l11) k11Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, k11 k11Var) {
        k11Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        k11Var.h(1);
        k11Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        k11Var.h(2);
        Parcel parcel = ((l11) k11Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        k11Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        k11Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        k11Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        k11Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
