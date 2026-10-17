package defpackage;

import android.R;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wc0 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final int d;
    public final CharSequence e;
    public final PendingIntent f;

    public wc0(PendingIntent pendingIntent) {
        IconCompat a = IconCompat.a(R.drawable.ic_menu_close_clear_cancel);
        Bundle bundle = new Bundle();
        this.c = true;
        this.b = a;
        int i = a.a;
        if ((i == -1 ? ((Icon) a.b).getType() : i) == 2) {
            this.d = a.b();
        }
        this.e = xc0.b("Stop All Tweaks");
        this.f = pendingIntent;
        this.a = bundle;
        this.c = true;
    }
}
