package androidx.compose.ui.modifier;

import defpackage.ac;
import defpackage.er;
import defpackage.p7;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalModifierNodeKt {
    @er
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new SingleLocalMap((ModifierLocal) ac.a0(modifierLocalArr));
        }
        xe0 xe0Var = new xe0(ac.a0(modifierLocalArr), null);
        List W = ac.W(1, modifierLocalArr);
        ArrayList arrayList = new ArrayList(W.size());
        int size = W.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new xe0((ModifierLocal) W.get(i), null));
        }
        xe0[] xe0VarArr = (xe0[]) arrayList.toArray(new xe0[0]);
        return new MultiLocalMap(xe0Var, (xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length));
    }

    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ModifierLocalMap modifierLocalMapOf(xe0 xe0Var) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) xe0Var.d);
        singleLocalMap.mo6391set$ui((ModifierLocal) xe0Var.d, xe0Var.e);
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(xe0 xe0Var, xe0 xe0Var2, xe0... xe0VarArr) {
        p7 p7Var = new p7(2);
        p7Var.b(xe0Var2);
        p7Var.e(xe0VarArr);
        ArrayList arrayList = (ArrayList) p7Var.d;
        return new MultiLocalMap(xe0Var, (xe0[]) arrayList.toArray(new xe0[arrayList.size()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        xe0 xe0Var = new xe0(modifierLocal, null);
        p7 p7Var = new p7(2);
        ArrayList arrayList = (ArrayList) p7Var.d;
        p7Var.b(new xe0(modifierLocal2, null));
        ArrayList arrayList2 = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList2.add(new xe0(modifierLocal3, null));
        }
        p7Var.e(arrayList2.toArray(new xe0[0]));
        return new MultiLocalMap(xe0Var, (xe0[]) arrayList.toArray(new xe0[arrayList.size()]));
    }

    @er
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(xe0... xe0VarArr) {
        int length = xe0VarArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            xe0 xe0Var = (xe0) ac.a0(xe0VarArr);
            xe0[] xe0VarArr2 = (xe0[]) ac.W(1, xe0VarArr).toArray(new xe0[0]);
            return new MultiLocalMap(xe0Var, (xe0[]) Arrays.copyOf(xe0VarArr2, xe0VarArr2.length));
        }
        return new MultiLocalMap((xe0) ac.a0(xe0VarArr), new xe0[0]);
    }
}
