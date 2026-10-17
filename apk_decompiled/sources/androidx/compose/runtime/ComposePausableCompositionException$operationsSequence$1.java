package androidx.compose.runtime;

import defpackage.bq;
import defpackage.cd0;
import defpackage.co0;
import defpackage.e10;
import defpackage.hm;
import defpackage.ij0;
import defpackage.j50;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ComposePausableCompositionException$operationsSequence$1 extends ij0 implements my {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, hm hmVar) {
        super(hmVar);
        this.this$0 = composePausableCompositionException;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.this$0, hmVar);
        composePausableCompositionException$operationsSequence$1.L$0 = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((ComposePausableCompositionException$operationsSequence$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        int i;
        int i2;
        int i3;
        int i4;
        e10 e10Var;
        e10 e10Var2;
        String str;
        cd0 cd0Var;
        e10 e10Var3;
        e10 e10Var4;
        e10 e10Var5;
        e10 e10Var6;
        e10 e10Var7;
        e10 e10Var8;
        int i5;
        cd0 cd0Var2;
        int i6;
        e10 e10Var9;
        cd0 cd0Var3;
        cd0 cd0Var4;
        cd0 cd0Var5;
        int i7 = this.label;
        if (i7 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i7 != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
        }
        i4 = this.this$0.lastOperation;
        e10Var = this.this$0.operations;
        if (i3 >= Math.min(i4 + 10, e10Var.b)) {
            return w01.a;
        }
        e10Var2 = this.this$0.operations;
        int i8 = i3 + 1;
        int b = e10Var2.b(i3);
        switch (b) {
            case 0:
                str = "up";
                break;
            case 1:
                cd0Var = this.this$0.instances;
                str = "down " + cd0Var.b(i2);
                i2++;
                break;
            case 2:
                e10Var3 = this.this$0.operations;
                int b2 = e10Var3.b(i8);
                e10Var4 = this.this$0.operations;
                str = "remove " + b2 + ' ' + e10Var4.b(i3 + 2);
                i8 = i3 + 3;
                break;
            case 3:
                e10Var5 = this.this$0.operations;
                int b3 = e10Var5.b(i8);
                e10Var6 = this.this$0.operations;
                int b4 = e10Var6.b(i3 + 2);
                e10Var7 = this.this$0.operations;
                str = "move " + b3 + ' ' + b4 + ' ' + e10Var7.b(i3 + 3);
                i8 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                e10Var8 = this.this$0.operations;
                i5 = i3 + 2;
                int b5 = e10Var8.b(i8);
                cd0Var2 = this.this$0.instances;
                i6 = i2 + 1;
                str = "insertBottomUp " + b5 + ' ' + cd0Var2.b(i2);
                i8 = i5;
                i2 = i6;
                break;
            case 6:
                e10Var9 = this.this$0.operations;
                i5 = i3 + 2;
                int b6 = e10Var9.b(i8);
                cd0Var3 = this.this$0.instances;
                i6 = i2 + 1;
                str = "insertTopDown " + b6 + ' ' + cd0Var3.b(i2);
                i8 = i5;
                i2 = i6;
                break;
            case 7:
                cd0Var4 = this.this$0.instances;
                Object b7 = cd0Var4.b(i2);
                b7.getClass();
                p01.f(2, b7);
                i2 += 2;
                str = "apply " + ((my) b7);
                break;
            case 8:
                StringBuilder sb = new StringBuilder("reuse ");
                cd0Var5 = this.this$0.reused;
                sb.append(cd0Var5.b(i));
                str = sb.toString();
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = j50.h(b, "unknown op: ");
                break;
        }
        this.L$0 = co0Var;
        this.I$0 = i8;
        this.I$1 = i2;
        this.I$2 = i;
        this.label = 1;
        co0Var.a(this, i3 + ": " + str);
        return vn.d;
    }
}
