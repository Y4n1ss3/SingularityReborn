package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class xj {
    public final /* synthetic */ vu0 a;

    public /* synthetic */ xj(vu0 vu0Var) {
        this.a = vu0Var;
    }

    public final void a() {
        vu0 vu0Var = this.a;
        Bundle a = vu0Var.h.b.a("android:support:activity-result");
        if (a != null) {
            yj yjVar = vu0Var.n;
            HashMap hashMap = yjVar.b;
            HashMap hashMap2 = yjVar.a;
            Bundle bundle = yjVar.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            yjVar.d = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            bundle.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (hashMap.containsKey(str)) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                hashMap2.put(num2, str2);
                yjVar.b.put(str2, num2);
            }
        }
    }
}
