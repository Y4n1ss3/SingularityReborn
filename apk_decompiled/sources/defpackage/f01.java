package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class f01 extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ List e;
    public final /* synthetic */ String f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(String str, List list, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.f = str;
        this.e = list;
        this.g = mutableState;
        this.h = mutableState2;
        this.j = sharedPreferences;
        this.i = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new f01(this.f, this.e, this.g, this.h, (SharedPreferences) this.j, this.i, hmVar);
            default:
                return new f01(this.e, this.f, (String) this.j, this.g, this.h, this.i, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((f01) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((f01) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Integer e0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.j;
        MutableState mutableState = this.i;
        String str = this.f;
        MutableState mutableState2 = this.h;
        MutableState mutableState3 = this.g;
        List<xe0> list = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                mutableState3.setValue(str);
                mutableState2.setValue(list);
                SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                int L = p80.L(zi.a0(list, 10));
                if (L < 16) {
                    L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(L);
                for (xe0 xe0Var : list) {
                    String str2 = (String) xe0Var.d;
                    List list2 = (List) xe0Var.e;
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String string = sharedPreferences.getString("cpu_max_freq_selection_".concat(lowerCase), null);
                    Integer num = (string == null || (e0 = ks0.e0(string)) == null) ? null : new Integer(e0.intValue() / 1000);
                    Integer num2 = (Integer) yi.x0(list2);
                    int intValue = num2 != null ? num2.intValue() : 0;
                    if (num != null) {
                        Integer num3 = list2.contains(new Integer(num.intValue())) ? num : null;
                        if (num3 != null) {
                            intValue = num3.intValue();
                        }
                    }
                    linkedHashMap.put(str2, new Integer(intValue));
                }
                mutableState.setValue(linkedHashMap);
                break;
            default:
                p10.Q(obj);
                if (list.size() >= 2) {
                    mutableState3.setValue(list);
                }
                mutableState2.setValue(str);
                mutableState.setValue((String) obj2);
                break;
        }
        return w01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(List list, String str, String str2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.e = list;
        this.f = str;
        this.j = str2;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
    }
}
