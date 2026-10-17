package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.ac;
import defpackage.p7;
import defpackage.q10;
import defpackage.q6;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.key = i;
        this.tracked = z;
        this.arity = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(Object[] objArr, int i, ComposableLambdaNImpl composableLambdaNImpl, Composer composer, int i2) {
        Object[] array = ac.l0(objArr, y80.W(0, i)).toArray(new Object[0]);
        Object obj = objArr[i + 1];
        obj.getClass();
        int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj).intValue());
        int length = (objArr.length - i) - 2;
        Object[] objArr2 = new Object[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj2 = objArr[i + 2 + i3];
            obj2.getClass();
            objArr2[i3] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj2).intValue()));
        }
        p7 p7Var = new p7(4);
        ArrayList arrayList = (ArrayList) p7Var.d;
        p7Var.e(array);
        p7Var.b(composer);
        p7Var.b(Integer.valueOf(updateChangedFlags | 1));
        p7Var.e(objArr2);
        composableLambdaNImpl.invoke(arrayList.toArray(new Object[arrayList.size()]));
        return w01.a;
    }

    private final int realParamCount(int i) {
        int i2 = i - 2;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, defpackage.vy
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN
    public Object invoke(Object... objArr) {
        int realParamCount = realParamCount(objArr.length);
        Object obj = objArr[realParamCount];
        obj.getClass();
        Object[] array = ac.l0(objArr, y80.W(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Composer startRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = intValue | (startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(realParamCount) : ComposableLambdaKt.sameBits(realParamCount));
        Object obj3 = this._block;
        obj3.getClass();
        p7 p7Var = new p7(2);
        ArrayList arrayList = (ArrayList) p7Var.d;
        p7Var.e(array);
        p7Var.b(Integer.valueOf(differentBits));
        Object invoke = ((ComposableLambdaN) obj3).invoke(arrayList.toArray(new Object[arrayList.size()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(objArr, realParamCount, this, 5));
        }
        return invoke;
    }

    public final void update(Object obj) {
        if (q10.b(obj, this._block)) {
            return;
        }
        boolean z = this._block == null;
        obj.getClass();
        this._block = (ComposableLambdaN) obj;
        if (z) {
            return;
        }
        trackWrite();
    }
}
