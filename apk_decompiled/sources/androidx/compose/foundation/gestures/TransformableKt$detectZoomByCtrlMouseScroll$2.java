package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
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
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", l = {272, 284}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends ij0 implements my {
    final /* synthetic */ zg $channel;
    final /* synthetic */ kn $currentContext;
    final /* synthetic */ ScrollConfig $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoomByCtrlMouseScroll$2(kn knVar, ScrollConfig scrollConfig, zg zgVar, hm hmVar) {
        super(hmVar);
        this.$currentContext = knVar;
        this.$scrollConfig = scrollConfig;
        this.$channel = zgVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new TransformableKt$detectZoomByCtrlMouseScroll$2(this.$currentContext, this.$scrollConfig, this.$channel, hmVar);
        transformableKt$detectZoomByCtrlMouseScroll$2.L$0 = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((TransformableKt$detectZoomByCtrlMouseScroll$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        if (r13 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:8:0x0088, B:10:0x008c, B:11:0x0052, B:18:0x0038, B:21:0x0045, B:28:0x0024), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0085 -> B:8:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        long m4526unboximpl;
        int i = this.label;
        vn vnVar = vn.d;
        try {
            if (i == 0) {
                p10.Q(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                if (cq.x(this.$currentContext)) {
                }
            } else if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                m4526unboximpl = ((Offset) obj).m4526unboximpl();
                this.$channel.m(TransformEvent.TransformStarted.INSTANCE);
                this.$channel.m(new TransformEvent.TransformDelta((float) Math.pow(2.0d, Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) / 545.0f), Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, null));
                ScrollConfig scrollConfig = this.$scrollConfig;
                this.L$0 = awaitPointerEventScope;
                this.label = 2;
                obj = TransformableKt.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig, this);
            } else {
                if (i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                Offset offset = (Offset) obj;
                if (offset != null) {
                    m4526unboximpl = offset.m4526unboximpl();
                    this.$channel.m(new TransformEvent.TransformDelta((float) Math.pow(2.0d, Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) / 545.0f), Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, null));
                    ScrollConfig scrollConfig2 = this.$scrollConfig;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 2;
                    obj = TransformableKt.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig2, this);
                } else {
                    this.$channel.m(TransformEvent.TransformStopped.INSTANCE);
                    if (cq.x(this.$currentContext)) {
                        return w01.a;
                    }
                    ScrollConfig scrollConfig3 = this.$scrollConfig;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    obj = TransformableKt.awaitFirstCtrlMouseScroll(awaitPointerEventScope, scrollConfig3, this);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    m4526unboximpl = ((Offset) obj).m4526unboximpl();
                    this.$channel.m(TransformEvent.TransformStarted.INSTANCE);
                    this.$channel.m(new TransformEvent.TransformDelta((float) Math.pow(2.0d, Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) / 545.0f), Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, null));
                    ScrollConfig scrollConfig22 = this.$scrollConfig;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 2;
                    obj = TransformableKt.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig22, this);
                }
            }
        } catch (Throwable th) {
            this.$channel.m(TransformEvent.TransformStopped.INSTANCE);
            throw th;
        }
    }
}
