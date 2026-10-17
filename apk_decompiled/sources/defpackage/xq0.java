package defpackage;

import androidx.compose.ui.graphics.Fields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xq0 extends ij0 implements my {
    public Object d;
    public Iterator e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Iterator l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(int i, int i2, Iterator it, boolean z, boolean z2, hm hmVar) {
        super(hmVar);
        this.j = i;
        this.k = i2;
        this.l = it;
        this.m = z;
        this.n = z2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        xq0 xq0Var = new xq0(this.j, this.k, this.l, this.m, this.n, hmVar);
        xq0Var.i = obj;
        return xq0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((xq0) create((co0) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        tj0 tj0Var;
        ArrayList arrayList;
        int i4;
        int i5;
        Iterator it2;
        int i6;
        tj0 tj0Var2;
        co0 co0Var = (co0) this.i;
        int i7 = this.h;
        boolean z = this.n;
        boolean z2 = this.m;
        int i8 = this.k;
        int i9 = this.j;
        vn vnVar = vn.d;
        if (i7 == 0) {
            p10.Q(obj);
            int i10 = Fields.RotationZ;
            if (i9 <= 1024) {
                i10 = i9;
            }
            i = i8 - i9;
            Iterator it3 = this.l;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                i5 = 0;
                it2 = it3;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    this.i = null;
                    this.d = null;
                    this.e = null;
                    this.f = i4;
                    this.g = i;
                    this.h = 2;
                    co0Var.a(this, arrayList);
                    return vnVar;
                }
            } else {
                tj0 tj0Var3 = new tj0(new Object[i10], 0);
                i2 = i10;
                i3 = i;
                it = it3;
                tj0Var = tj0Var3;
                while (true) {
                    int i11 = tj0Var.e;
                    Object[] objArr = tj0Var.d;
                    if (!it.hasNext()) {
                    }
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.g;
                i2 = this.f;
                it = this.e;
                tj0Var = (tj0) this.d;
                p10.Q(obj);
                tj0Var.a(i8);
                while (true) {
                    int i112 = tj0Var.e;
                    Object[] objArr2 = tj0Var.d;
                    if (!it.hasNext()) {
                        Object next = it.next();
                        if (tj0Var.size() == i112) {
                            o.f("ring buffer is full");
                            return null;
                        }
                        objArr2[(tj0Var.size() + tj0Var.f) % i112] = next;
                        tj0Var.g = tj0Var.size() + 1;
                        if (tj0Var.size() == i112) {
                            if (tj0Var.size() >= i9) {
                                Object arrayList2 = z2 ? tj0Var : new ArrayList(tj0Var);
                                this.i = co0Var;
                                this.d = tj0Var;
                                this.e = it;
                                this.f = i2;
                                this.g = i3;
                                this.h = 3;
                                co0Var.a(this, arrayList2);
                                return vnVar;
                            }
                            int i12 = i112 + (i112 >> 1) + 1;
                            if (i12 > i9) {
                                i12 = i9;
                            }
                            tj0Var = new tj0(tj0Var.f == 0 ? Arrays.copyOf(objArr2, i12) : tj0Var.toArray(new Object[i12]), tj0Var.size());
                        }
                    } else if (z) {
                        i6 = i2;
                        tj0Var2 = tj0Var;
                    }
                }
            } else if (i7 == 4) {
                i3 = this.g;
                i6 = this.f;
                tj0Var2 = (tj0) this.d;
                p10.Q(obj);
                tj0Var2.a(i8);
                if (tj0Var2.size() > i8) {
                    Object arrayList3 = z2 ? tj0Var2 : new ArrayList(tj0Var2);
                    this.i = co0Var;
                    this.d = tj0Var2;
                    this.e = null;
                    this.f = i6;
                    this.g = i3;
                    this.h = 4;
                    co0Var.a(this, arrayList3);
                    return vnVar;
                }
                if (!tj0Var2.isEmpty()) {
                    this.i = null;
                    this.d = null;
                    this.e = null;
                    this.f = i6;
                    this.g = i3;
                    this.h = 5;
                    co0Var.a(this, tj0Var2);
                    return vnVar;
                }
            } else {
                if (i7 != 5) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            p10.Q(obj);
        } else {
            i5 = this.g;
            i4 = this.f;
            it2 = this.e;
            arrayList = (ArrayList) this.d;
            p10.Q(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i9);
            }
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.i = co0Var;
                        this.d = arrayList;
                        this.e = it2;
                        this.f = i4;
                        this.g = i;
                        this.h = 1;
                        co0Var.a(this, arrayList);
                        return vnVar;
                    }
                }
            }
            if (!arrayList.isEmpty() && (z || arrayList.size() == i9)) {
                this.i = null;
                this.d = null;
                this.e = null;
                this.f = i4;
                this.g = i;
                this.h = 2;
                co0Var.a(this, arrayList);
                return vnVar;
            }
        }
        return w01.a;
    }
}
