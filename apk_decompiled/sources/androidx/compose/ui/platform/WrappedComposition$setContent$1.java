package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.a50;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.r40;
import defpackage.s40;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WrappedComposition$setContent$1 extends f30 implements ky {
    final /* synthetic */ my $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, my myVar) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(WrappedComposition wrappedComposition, s40 s40Var) {
        boolean z;
        z = wrappedComposition.disposed;
        if (z) {
            return;
        }
        wrappedComposition.addedToLifecycle = s40Var;
        s40Var.a(wrappedComposition);
    }

    public final void invoke(ComposeViewContext composeViewContext) {
        boolean z;
        s40 s40Var;
        z = this.this$0.disposed;
        if (z) {
            return;
        }
        final s40 lifecycle = composeViewContext.getLifecycleOwner$ui().getLifecycle();
        this.this$0.lastContent = this.$content;
        s40Var = this.this$0.addedToLifecycle;
        if (s40Var != null) {
            if (((a50) lifecycle).d.compareTo(r40.f) >= 0) {
                this.this$0.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(-1723985096, true, new AnonymousClass2(this.this$0, composeViewContext, this.$content)));
            }
        } else if (q10.b(Looper.myLooper(), composeViewContext.getView$ui().getHandler().getLooper())) {
            this.this$0.addedToLifecycle = lifecycle;
            lifecycle.a(this.this$0);
        } else {
            View view$ui = composeViewContext.getView$ui();
            final WrappedComposition wrappedComposition = this.this$0;
            view$ui.post(new Runnable() { // from class: androidx.compose.ui.platform.b
                @Override // java.lang.Runnable
                public final void run() {
                    WrappedComposition$setContent$1.invoke$lambda$0(WrappedComposition.this, lifecycle);
                }
            });
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ComposeViewContext) obj);
        return w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f30 implements my {
        final /* synthetic */ ComposeViewContext $composeViewContext;
        final /* synthetic */ my $content;
        final /* synthetic */ WrappedComposition this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WrappedComposition wrappedComposition, ComposeViewContext composeViewContext, my myVar) {
            super(2);
            this.this$0 = wrappedComposition;
            this.$composeViewContext = composeViewContext;
            this.$content = myVar;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1723985096, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:126)");
            }
            AndroidComposeView owner = this.this$0.getOwner();
            boolean changedInstance = composer.changedInstance(this.this$0);
            WrappedComposition wrappedComposition = this.this$0;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new WrappedComposition$setContent$1$2$1$1(wrappedComposition, null);
                composer.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(owner, (my) rememberedValue, composer, 0);
            AndroidComposeView owner2 = this.this$0.getOwner();
            boolean changedInstance2 = composer.changedInstance(this.this$0);
            WrappedComposition wrappedComposition2 = this.this$0;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new WrappedComposition$setContent$1$2$2$1(wrappedComposition2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(owner2, (my) rememberedValue2, composer, 0);
            this.$composeViewContext.ProvideCompositionLocals$ui(this.this$0.getOwner(), this.$content, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return w01.a;
        }
    }
}
