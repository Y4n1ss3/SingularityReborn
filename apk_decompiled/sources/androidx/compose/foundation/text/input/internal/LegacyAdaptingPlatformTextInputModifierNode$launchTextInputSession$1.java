package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 extends us0 implements my {
    final /* synthetic */ my $block;
    int label;
    final /* synthetic */ LegacyAdaptingPlatformTextInputModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = legacyAdaptingPlatformTextInputModifierNode;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this.this$0, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.this$0;
            my myVar = this.$block;
            this.label = 1;
            Object establishTextInputSession = PlatformTextInputModifierNodeKt.establishTextInputSession(legacyAdaptingPlatformTextInputModifierNode, myVar, this);
            vn vnVar = vn.d;
            if (establishTextInputSession == vnVar) {
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
