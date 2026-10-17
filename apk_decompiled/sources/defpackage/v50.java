package defpackage;

import android.content.IntentFilter;
import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v50 {
    public final IntentFilter a;
    public final j01 b;
    public boolean c;
    public boolean d;

    public v50(IntentFilter intentFilter, j01 j01Var) {
        this.a = intentFilter;
        this.b = j01Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Fields.SpotShadowColor);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
