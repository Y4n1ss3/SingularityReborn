package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xz0 extends us0 implements my {
    public List d;
    public List e;
    public Iterator f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ List k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz0(List list, ArrayList arrayList, ArrayList arrayList2, hm hmVar) {
        super(2, hmVar);
        this.k = list;
        this.l = arrayList;
        this.m = arrayList2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new xz0(this.k, this.l, this.m, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((xz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0051 -> B:14:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:5:0x0074). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        int i;
        int i2;
        List list2;
        Object obj2;
        int i3 = this.j;
        if (i3 == 0) {
            p10.Q(obj);
            it = this.k.iterator();
            list = this.l;
            i = 0;
            i2 = 0;
            list2 = this.m;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.i;
            int i4 = this.h;
            i2 = this.g;
            it = this.f;
            list2 = this.e;
            list = this.d;
            p10.Q(obj);
            MutableState mutableState = (MutableState) list2.get(i);
            Iterator it2 = ds0.r0((String) obj).iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (ks0.c0(ds0.H0((String) obj2).toString(), "versionName", false)) {
                    break;
                }
            }
            String str = (String) obj2;
            mutableState.setValue(str == null ? ds0.E0(ds0.x0(str, "=", str)).toString() : null);
            i = i4;
            if (it.hasNext()) {
                Object next = it.next();
                i4 = i + 1;
                if (i < 0) {
                    y80.V();
                    throw null;
                }
                yz0 yz0Var = (yz0) next;
                if (((Boolean) ((MutableState) list.get(i)).getValue()).booleanValue()) {
                    zj0 zj0Var = zj0.a;
                    String concat = "pm dump ".concat(yz0Var.b);
                    this.d = list;
                    this.e = list2;
                    this.f = it;
                    this.g = i2;
                    this.h = i4;
                    this.i = i;
                    this.j = 1;
                    obj = zj0.d(concat, this);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    MutableState mutableState2 = (MutableState) list2.get(i);
                    Iterator it22 = ds0.r0((String) obj).iterator();
                    while (true) {
                        if (it22.hasNext()) {
                        }
                    }
                    String str2 = (String) obj2;
                    mutableState2.setValue(str2 == null ? ds0.E0(ds0.x0(str2, "=", str2)).toString() : null);
                }
                i = i4;
                if (it.hasNext()) {
                    return w01.a;
                }
            }
        }
    }
}
