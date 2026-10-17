package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gl0 {
    public final hl0 a;
    public final i2 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final zk0 c = new zk0(6);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public gl0(hl0 hl0Var, i2 i2Var) {
        this.a = hl0Var;
        this.b = i2Var;
    }

    public final void a() {
        hl0 hl0Var = this.a;
        if (((a50) hl0Var.getLifecycle()).d != r40.e) {
            o.f("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                o.f("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            hl0Var.getLifecycle().a(new c1(this, 1));
            this.e = true;
        }
    }
}
