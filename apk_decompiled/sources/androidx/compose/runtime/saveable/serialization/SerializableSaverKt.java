package androidx.compose.runtime.saveable.serialization;

import android.os.Bundle;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.a30;
import defpackage.p10;
import defpackage.q10;
import defpackage.r4;
import defpackage.rk0;
import defpackage.te0;
import defpackage.tk0;
import defpackage.uk0;
import defpackage.w50;
import defpackage.xe0;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SerializableSaverKt {
    public static final <Serializable> Saver<Serializable, Bundle> serializableSaver(a30 a30Var, rk0 rk0Var) {
        return SaverKt.Saver(new r4(10, a30Var, rk0Var), new te0(10, a30Var, rk0Var));
    }

    public static Saver serializableSaver$default(rk0 rk0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rk0Var = rk0.b;
        }
        w50 w50Var = rk0Var.a;
        q10.G();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle serializableSaver$lambda$0(a30 a30Var, rk0 rk0Var, SaverScope saverScope, Object obj) {
        a30 a30Var2 = a30Var;
        a30Var2.getClass();
        obj.getClass();
        rk0Var.getClass();
        Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
        new uk0(g, rk0Var).j(a30Var2, obj);
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object serializableSaver$lambda$1(a30 a30Var, rk0 rk0Var, Bundle bundle) {
        a30 a30Var2 = a30Var;
        a30Var2.getClass();
        bundle.getClass();
        rk0Var.getClass();
        return new tk0(bundle, rk0Var).q(a30Var2);
    }

    public static /* synthetic */ Saver serializableSaver$default(a30 a30Var, rk0 rk0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            rk0Var = rk0.b;
        }
        return serializableSaver(a30Var, rk0Var);
    }

    public static final <Serializable> Saver<Serializable, Bundle> serializableSaver(rk0 rk0Var) {
        w50 w50Var = rk0Var.a;
        q10.G();
        throw null;
    }
}
