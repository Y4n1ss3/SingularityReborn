package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.ui.platform.PlatformTextInputSession;
import defpackage.bq;
import defpackage.hm;
import defpackage.jb0;
import defpackage.jw;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.tj;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {GapComposerKt.nodeKey}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends us0 implements my {
    final /* synthetic */ ky $initializeRequest;
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ PlatformTextInputSession $$this$launchTextInputSession;
        final /* synthetic */ ky $initializeRequest;
        final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00151 extends us0 implements my {
            final /* synthetic */ InputMethodManager $inputMethodManager;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManager inputMethodManager, hm hmVar) {
                super(2, hmVar);
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$inputMethodManager = inputMethodManager;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w01 invokeSuspend$lambda$0(long j) {
                return w01.a;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00151(this.this$0, this.$inputMethodManager, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00151) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            
                if (r6.collect(r0, r5) == r4) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
            
                if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r6, r5) == r4) goto L17;
             */
            @Override // defpackage.mc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                jb0 stylusHandwritingTrigger;
                int i = this.label;
                vn vnVar = vn.d;
                if (i == 0) {
                    p10.Q(obj);
                    a aVar = new a(0);
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        o.j();
                        return null;
                    }
                    p10.Q(obj);
                }
                stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                if (stylusHandwritingTrigger == null) {
                    return w01.a;
                }
                final InputMethodManager inputMethodManager = this.$inputMethodManager;
                jw jwVar = new jw() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.2
                    @Override // defpackage.jw
                    public final Object emit(w01 w01Var, hm hmVar) {
                        InputMethodManager.this.startStylusHandwriting();
                        return w01.a;
                    }
                };
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlatformTextInputSession platformTextInputSession, ky kyVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, hm hmVar) {
            super(2, hmVar);
            this.$$this$launchTextInputSession = platformTextInputSession;
            this.$initializeRequest = kyVar;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = legacyPlatformTextInputNode;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    un unVar = (un) this.L$0;
                    InputMethodManager inputMethodManager = (InputMethodManager) LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.$$this$launchTextInputSession.getView());
                    LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(this.$$this$launchTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), inputMethodManager);
                    if (StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
                        p01.t(unVar, null, null, new C00151(this.this$0, inputMethodManager, null), 3);
                    }
                    ky kyVar = this.$initializeRequest;
                    if (kyVar != null) {
                        kyVar.invoke(legacyTextInputMethodRequest);
                    }
                    this.this$0.currentRequest = legacyTextInputMethodRequest;
                    PlatformTextInputSession platformTextInputSession = this.$$this$launchTextInputSession;
                    this.label = 1;
                    Object startInputMethod = platformTextInputSession.startInputMethod(legacyTextInputMethodRequest, this);
                    vn vnVar = vn.d;
                    if (startInputMethod == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                throw new tj();
            } catch (Throwable th) {
                this.this$0.currentRequest = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(ky kyVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, hm hmVar) {
        super(2, hmVar);
        this.$initializeRequest = kyVar;
        this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, hmVar);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // defpackage.my
    public final Object invoke(PlatformTextInputSession platformTextInputSession, hm hmVar) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(platformTextInputSession, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PlatformTextInputSession) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            Object n = p10.n(anonymousClass1, this);
            vn vnVar = vn.d;
            if (n == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
