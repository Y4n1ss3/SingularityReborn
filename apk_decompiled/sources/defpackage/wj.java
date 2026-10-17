package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class wj implements dl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dl0
    public final Bundle a() {
        Bundle DisposableSaveableStateRegistry$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                yj yjVar = ((vu0) obj).n;
                yjVar.getClass();
                HashMap hashMap = yjVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(yjVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) yjVar.g.clone());
                return bundle;
            default:
                DisposableSaveableStateRegistry$lambda$0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0((SaveableStateRegistry) obj);
                return DisposableSaveableStateRegistry$lambda$0;
        }
    }
}
