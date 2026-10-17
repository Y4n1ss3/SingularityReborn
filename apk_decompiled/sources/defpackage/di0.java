package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class di0 implements w40 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ di0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                hl0 hl0Var = (hl0) obj;
                if (q40Var != q40.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                y40Var.getLifecycle().b(this);
                Bundle a = hl0Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    o.f("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, di0.class.getClassLoader()).asSubclass(cl0.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(hl0Var instanceof a21)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + hl0Var).toString());
                                }
                                t60 c = ((dk) ((a21) hl0Var)).c();
                                el0 savedStateRegistry = hl0Var.getSavedStateRegistry();
                                c.getClass();
                                LinkedHashMap linkedHashMap = c.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    w11 w11Var = (w11) linkedHashMap.get(str3);
                                    if (w11Var != null) {
                                        p01.e(w11Var, savedStateRegistry, hl0Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(uo.c("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(uo.d("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                if (q40Var != q40.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                rd0 rd0Var = ((dk) obj).j;
                OnBackInvokedDispatcher a2 = ak.a((dk) y40Var);
                rd0Var.getClass();
                a2.getClass();
                rd0Var.e = a2;
                rd0Var.c(rd0Var.g);
                return;
            case 2:
                new HashMap();
                cz[] czVarArr = (cz[]) obj;
                if (czVarArr.length > 0) {
                    cz czVar = czVarArr[0];
                    throw null;
                }
                if (czVarArr.length <= 0) {
                    return;
                }
                cz czVar2 = czVarArr[0];
                throw null;
            default:
                if (q40Var != q40.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + q40Var).toString());
                }
                y40Var.getLifecycle().b(this);
                al0 al0Var = (al0) obj;
                if (al0Var.b) {
                    return;
                }
                Bundle a3 = al0Var.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
                Bundle bundle = al0Var.c;
                if (bundle != null) {
                    g.putAll(bundle);
                }
                if (a3 != null) {
                    g.putAll(a3);
                }
                al0Var.c = g;
                al0Var.b = true;
                return;
        }
    }
}
