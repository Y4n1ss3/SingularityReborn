package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.kn;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitEachGesture$2 extends ij0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ kn $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(kn knVar, my myVar, hm hmVar) {
        super(hmVar);
        this.$currentContext = knVar;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, hmVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r9 != r5) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:8:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006d -> B:8:0x0025). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        ?? r0 = this.label;
        vn vnVar = vn.d;
        try {
        } catch (CancellationException e) {
            e = e;
            if (cq.x(this.$currentContext)) {
                throw e;
            }
            this.L$0 = r0;
            this.label = 3;
            Object awaitAllPointersUp$default = ForEachGestureKt.awaitAllPointersUp$default(r0, null, this, 1, null);
            awaitPointerEventScope2 = r0;
        }
        if (r0 == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            if (cq.x(this.$currentContext)) {
            }
        } else {
            if (r0 != 1) {
                if (r0 == 2) {
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                } else {
                    if (r0 != 3) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                if (cq.x(this.$currentContext)) {
                    return w01.a;
                }
                try {
                } catch (CancellationException e2) {
                    r0 = awaitPointerEventScope;
                    e = e2;
                    if (cq.x(this.$currentContext)) {
                    }
                }
                my myVar = this.$block;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                if (myVar.invoke(awaitPointerEventScope, this) != vnVar) {
                    r0 = awaitPointerEventScope;
                    this.L$0 = r0;
                    this.label = 2;
                    Object awaitAllPointersUp$default2 = ForEachGestureKt.awaitAllPointersUp$default(r0, null, this, 1, null);
                    awaitPointerEventScope2 = r0;
                }
                return vnVar;
            }
            AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            r0 = awaitPointerEventScope5;
            this.L$0 = r0;
            this.label = 2;
            Object awaitAllPointersUp$default22 = ForEachGestureKt.awaitAllPointersUp$default(r0, null, this, 1, null);
            awaitPointerEventScope2 = r0;
        }
    }
}
