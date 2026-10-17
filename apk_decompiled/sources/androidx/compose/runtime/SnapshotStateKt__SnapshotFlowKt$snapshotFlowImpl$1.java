package androidx.compose.runtime;

import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.jw;
import defpackage.my;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends us0 implements my {
    final /* synthetic */ iy $block;
    final /* synthetic */ SnapshotFlowManager $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(SnapshotFlowManager snapshotFlowManager, iy iyVar, hm hmVar) {
        super(2, hmVar);
        this.$externalManager = snapshotFlowManager;
        this.$block = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, hmVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // defpackage.my
    public final Object invoke(jw jwVar, hm hmVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create(jwVar, hmVar)).invokeSuspend(w01.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:11:0x0039, B:12:0x007c, B:14:0x006b, B:18:0x0088, B:23:0x001e), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.SnapshotFlowManager, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0086 -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:14:0x006b). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            vn r5 = defpackage.vn.d
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L10
            if (r0 == r2) goto L2b
            if (r0 != r1) goto L25
        L10:
            java.lang.Object r0 = r8.L$3
            java.lang.Object r3 = r8.L$2
            zg r3 = (defpackage.zg) r3
            java.lang.Object r4 = r8.L$1
            androidx.compose.runtime.SnapshotFlowManager r4 = (androidx.compose.runtime.SnapshotFlowManager) r4
            java.lang.Object r6 = r8.L$0
            jw r6 = (defpackage.jw) r6
            defpackage.p10.Q(r9)     // Catch: java.lang.Throwable -> L22
            goto L6b
        L22:
            r9 = move-exception
            goto L9e
        L25:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r8)
            return r3
        L2b:
            java.lang.Object r0 = r8.L$3
            java.lang.Object r3 = r8.L$2
            zg r3 = (defpackage.zg) r3
            java.lang.Object r4 = r8.L$1
            androidx.compose.runtime.SnapshotFlowManager r4 = (androidx.compose.runtime.SnapshotFlowManager) r4
            java.lang.Object r6 = r8.L$0
            jw r6 = (defpackage.jw) r6
            defpackage.p10.Q(r9)     // Catch: java.lang.Throwable -> L22
            goto L7c
        L3d:
            defpackage.p10.Q(r9)
            java.lang.Object r9 = r8.L$0
            r6 = r9
            jw r6 = (defpackage.jw) r6
            androidx.compose.runtime.SnapshotFlowManager r9 = r8.$externalManager
            if (r9 != 0) goto L4e
            androidx.compose.runtime.SnapshotFlowManager r9 = new androidx.compose.runtime.SnapshotFlowManager
            r9.<init>()
        L4e:
            r0 = 6
            of r3 = defpackage.d41.b(r4, r0, r3)
            iy r0 = r8.$block     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r9.runAndWatch$runtime(r3, r0)     // Catch: java.lang.Throwable -> L9b
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r8.L$1 = r9     // Catch: java.lang.Throwable -> L9b
            r8.L$2 = r3     // Catch: java.lang.Throwable -> L9b
            r8.L$3 = r0     // Catch: java.lang.Throwable -> L9b
            r8.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r4 = r6.emit(r0, r8)     // Catch: java.lang.Throwable -> L9b
            if (r4 != r5) goto L6a
            goto L98
        L6a:
            r4 = r9
        L6b:
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L22
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L22
            r8.L$2 = r3     // Catch: java.lang.Throwable -> L22
            r8.L$3 = r0     // Catch: java.lang.Throwable -> L22
            r8.label = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r3.i(r8)     // Catch: java.lang.Throwable -> L22
            if (r9 != r5) goto L7c
            goto L98
        L7c:
            iy r9 = r8.$block     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r4.runAndWatch$runtime(r3, r9)     // Catch: java.lang.Throwable -> L22
            boolean r7 = defpackage.q10.b(r9, r0)     // Catch: java.lang.Throwable -> L22
            if (r7 != 0) goto L6b
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L22
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L22
            r8.L$2 = r3     // Catch: java.lang.Throwable -> L22
            r8.L$3 = r9     // Catch: java.lang.Throwable -> L22
            r8.label = r1     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r6.emit(r9, r8)     // Catch: java.lang.Throwable -> L22
            if (r0 != r5) goto L99
        L98:
            return r5
        L99:
            r0 = r9
            goto L6b
        L9b:
            r0 = move-exception
            r4 = r9
            r9 = r0
        L9e:
            r4.reportSnapshotFlowCancellation$runtime(r3)
            androidx.compose.runtime.SnapshotFlowManager r8 = r8.$externalManager
            if (r8 != 0) goto La8
            r4.dispose()
        La8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
