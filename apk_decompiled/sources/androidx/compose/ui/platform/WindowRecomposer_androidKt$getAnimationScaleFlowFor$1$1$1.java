package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import defpackage.bq;
import defpackage.hm;
import defpackage.jw;
import defpackage.my;
import defpackage.nf;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {119, 121}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends us0 implements my {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ zg $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, zg zgVar, Context context, hm hmVar) {
        super(2, hmVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = zgVar;
        this.$applicationContext = context;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, hmVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(jw jwVar, hm hmVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(jwVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r4.emit(r5, r8) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:9:0x0045, B:15:0x0055, B:17:0x005d, B:25:0x002a, B:27:0x003f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jw jwVar;
        nf it;
        jw jwVar2;
        float readAnimationScale;
        Object b;
        int i = this.label;
        vn vnVar = vn.d;
        try {
            if (i == 0) {
                p10.Q(obj);
                jwVar = (jw) this.L$0;
                this.$resolver.registerContentObserver(this.$animationScaleUri, false, this.$contentObserver);
                it = this.$channel.iterator();
                this.L$0 = jwVar;
                this.L$1 = it;
                this.label = 1;
                b = it.b(this);
                if (b != vnVar) {
                }
            } else if (i == 1) {
                it = (nf) this.L$1;
                jwVar2 = (jw) this.L$0;
                p10.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (nf) this.L$1;
                jwVar2 = (jw) this.L$0;
                p10.Q(obj);
                jwVar = jwVar2;
                this.L$0 = jwVar;
                this.L$1 = it;
                this.label = 1;
                b = it.b(this);
                if (b != vnVar) {
                    return vnVar;
                }
                jwVar2 = jwVar;
                obj = b;
                if (((Boolean) obj).booleanValue()) {
                    this.$resolver.unregisterContentObserver(this.$contentObserver);
                    return w01.a;
                }
                it.c();
                readAnimationScale = WindowRecomposer_androidKt.readAnimationScale(this.$applicationContext);
                Float f = new Float(readAnimationScale);
                this.L$0 = jwVar2;
                this.L$1 = it;
                this.label = 2;
            }
        } catch (Throwable th) {
            this.$resolver.unregisterContentObserver(this.$contentObserver);
            throw th;
        }
    }
}
