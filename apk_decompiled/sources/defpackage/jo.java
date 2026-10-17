package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jo extends us0 implements my {
    public bo d;
    public wq e;
    public xq f;
    public wq g;
    public zn h;
    public wq i;
    public Map j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;

    public static final int e(Map map, zn znVar) {
        k10 k10Var = znVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = k10Var.iterator();
        while (((j10) it).f) {
            Integer num = (Integer) map.get("cpu" + ((d10) it).nextInt());
            if (num != null) {
                arrayList.add(num);
            }
        }
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        double d = 0.0d;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d += ((Number) obj).intValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return (int) (i == 0 ? Double.NaN : d / i);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        jo joVar = new jo(2, hmVar);
        joVar.s = obj;
        return joVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((jo) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r2 == r5) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Type inference failed for: r3v4, types: [wq] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        wq d;
        xq d2;
        xq d3;
        wq d4;
        Object r;
        bo boVar;
        zn znVar;
        Object a;
        wq wqVar;
        int i;
        wq wqVar2;
        wq wqVar3;
        zn znVar2;
        Object a2;
        int i2;
        int i3;
        wq wqVar4;
        int i4;
        bo boVar2;
        wq wqVar5;
        Object a3;
        int i5;
        int i6;
        bo boVar3;
        int i7;
        int i8;
        int i9;
        Map map;
        int e2;
        Object a4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        un unVar = (un) this.s;
        int i16 = this.r;
        int i17 = 1;
        hm hmVar = null;
        vn vnVar = vn.d;
        switch (i16) {
            case 0:
                p10.Q(obj);
                ro roVar = ro.a;
                this.s = unVar;
                this.r = 1;
                e = ro.e(this);
                break;
            case 1:
                p10.Q(obj);
                e = obj;
                bo boVar4 = (bo) e;
                int i18 = 2;
                d = p01.d(unVar, new z9(i18, 14, hmVar));
                xq d5 = p01.d(unVar, new z9(i18, 13, hmVar));
                d2 = p01.d(unVar, new io(boVar4, hmVar, i17));
                d3 = p01.d(unVar, new io(boVar4, hmVar, 0));
                zn c = boVar4.c();
                d4 = c != null ? p01.d(unVar, new y9(c, hmVar, i18)) : null;
                this.s = null;
                this.d = boVar4;
                this.e = d;
                this.f = d2;
                this.g = d3;
                this.h = c;
                this.i = d4;
                this.r = 2;
                r = d5.r(this);
                if (r != vnVar) {
                    boVar = boVar4;
                    znVar = c;
                    int intValue = ((Number) r).intValue();
                    this.s = null;
                    this.d = boVar;
                    this.e = d;
                    this.f = null;
                    this.g = d3;
                    this.h = znVar;
                    this.i = d4;
                    this.k = intValue;
                    this.r = 3;
                    a = d2.a(this);
                    if (a != vnVar) {
                        zn znVar3 = znVar;
                        wqVar = d4;
                        i = intValue;
                        wqVar2 = d3;
                        wqVar3 = d;
                        znVar2 = znVar3;
                        xe0 xe0Var = (xe0) a;
                        int intValue2 = ((Number) xe0Var.d).intValue();
                        int intValue3 = ((Number) xe0Var.e).intValue();
                        this.s = null;
                        this.d = boVar;
                        this.e = wqVar3;
                        this.f = null;
                        this.g = null;
                        this.h = znVar2;
                        this.i = wqVar;
                        this.k = i;
                        this.l = intValue2;
                        this.m = intValue3;
                        this.r = 4;
                        a2 = wqVar2.a(this);
                        if (a2 != vnVar) {
                            i2 = i;
                            i3 = intValue3;
                            wq wqVar6 = wqVar3;
                            wqVar4 = wqVar;
                            i4 = intValue2;
                            boVar2 = boVar;
                            wqVar5 = wqVar6;
                            xe0 xe0Var2 = (xe0) a2;
                            int intValue4 = ((Number) xe0Var2.d).intValue();
                            int intValue5 = ((Number) xe0Var2.e).intValue();
                            this.s = null;
                            this.d = boVar2;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = znVar2;
                            this.i = wqVar4;
                            this.k = i2;
                            this.l = i4;
                            this.m = i3;
                            this.n = intValue4;
                            this.o = intValue5;
                            this.r = 5;
                            a3 = wqVar5.a(this);
                            if (a3 != vnVar) {
                                i5 = i3;
                                i6 = intValue5;
                                boVar3 = boVar2;
                                i7 = intValue4;
                                i8 = i4;
                                i9 = i2;
                                map = (Map) a3;
                                int e3 = e(map, boVar3.b());
                                e2 = e(map, boVar3.a());
                                if (znVar2 != null) {
                                    return new ao(i9, i8, i5, i7, i6, e3, e2, 280);
                                }
                                wqVar4.getClass();
                                this.s = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = znVar2;
                                this.i = null;
                                this.j = map;
                                this.k = i9;
                                this.l = i8;
                                this.m = i5;
                                this.n = i7;
                                this.o = i6;
                                this.p = e3;
                                this.q = e2;
                                this.r = 6;
                                a4 = wqVar4.a(this);
                                if (a4 != vnVar) {
                                    i10 = i9;
                                    i11 = i8;
                                    i12 = i5;
                                    i13 = e3;
                                    i14 = i6;
                                    i15 = i7;
                                    xe0 xe0Var3 = (xe0) a4;
                                    return new ao(i10, i11, i12, ((Number) xe0Var3.d).intValue(), ((Number) xe0Var3.e).intValue(), i15, i14, i13, e(map, znVar2), e2);
                                }
                            }
                        }
                    }
                }
                return vnVar;
            case 2:
                d4 = this.i;
                znVar = this.h;
                ?? r3 = this.g;
                xq xqVar = this.f;
                d = this.e;
                boVar = this.d;
                p10.Q(obj);
                d3 = r3;
                d2 = xqVar;
                r = obj;
                int intValue6 = ((Number) r).intValue();
                this.s = null;
                this.d = boVar;
                this.e = d;
                this.f = null;
                this.g = d3;
                this.h = znVar;
                this.i = d4;
                this.k = intValue6;
                this.r = 3;
                a = d2.a(this);
                if (a != vnVar) {
                }
                return vnVar;
            case 3:
                i = this.k;
                wqVar = this.i;
                zn znVar4 = this.h;
                wqVar2 = this.g;
                wq wqVar7 = this.e;
                boVar = this.d;
                p10.Q(obj);
                wqVar3 = wqVar7;
                znVar2 = znVar4;
                a = obj;
                xe0 xe0Var4 = (xe0) a;
                int intValue22 = ((Number) xe0Var4.d).intValue();
                int intValue32 = ((Number) xe0Var4.e).intValue();
                this.s = null;
                this.d = boVar;
                this.e = wqVar3;
                this.f = null;
                this.g = null;
                this.h = znVar2;
                this.i = wqVar;
                this.k = i;
                this.l = intValue22;
                this.m = intValue32;
                this.r = 4;
                a2 = wqVar2.a(this);
                if (a2 != vnVar) {
                }
                return vnVar;
            case 4:
                i3 = this.m;
                i4 = this.l;
                i2 = this.k;
                wq wqVar8 = this.i;
                znVar2 = this.h;
                wqVar5 = this.e;
                bo boVar5 = this.d;
                p10.Q(obj);
                boVar2 = boVar5;
                wqVar4 = wqVar8;
                a2 = obj;
                xe0 xe0Var22 = (xe0) a2;
                int intValue42 = ((Number) xe0Var22.d).intValue();
                int intValue52 = ((Number) xe0Var22.e).intValue();
                this.s = null;
                this.d = boVar2;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = znVar2;
                this.i = wqVar4;
                this.k = i2;
                this.l = i4;
                this.m = i3;
                this.n = intValue42;
                this.o = intValue52;
                this.r = 5;
                a3 = wqVar5.a(this);
                if (a3 != vnVar) {
                }
                return vnVar;
            case 5:
                int i19 = this.o;
                int i20 = this.n;
                int i21 = this.m;
                int i22 = this.l;
                int i23 = this.k;
                wq wqVar9 = this.i;
                zn znVar5 = this.h;
                bo boVar6 = this.d;
                p10.Q(obj);
                i6 = i19;
                i7 = i20;
                i5 = i21;
                i8 = i22;
                boVar3 = boVar6;
                i9 = i23;
                znVar2 = znVar5;
                wqVar4 = wqVar9;
                a3 = obj;
                map = (Map) a3;
                int e32 = e(map, boVar3.b());
                e2 = e(map, boVar3.a());
                if (znVar2 != null) {
                }
                break;
            case 6:
                e2 = this.q;
                int i24 = this.p;
                int i25 = this.o;
                int i26 = this.n;
                int i27 = this.m;
                int i28 = this.l;
                int i29 = this.k;
                map = this.j;
                zn znVar6 = this.h;
                p10.Q(obj);
                i13 = i24;
                i14 = i25;
                i15 = i26;
                i12 = i27;
                i11 = i28;
                i10 = i29;
                znVar2 = znVar6;
                a4 = obj;
                xe0 xe0Var32 = (xe0) a4;
                return new ao(i10, i11, i12, ((Number) xe0Var32.d).intValue(), ((Number) xe0Var32.e).intValue(), i15, i14, i13, e(map, znVar2), e2);
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
