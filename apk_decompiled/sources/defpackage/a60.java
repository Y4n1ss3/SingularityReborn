package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a60 {
    public final b60 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public a60(b60 b60Var) {
        this.a = b60Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a60) {
            return this.a.equals(((a60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
